# RSA with OpenSSL


Generata RSA key pair
```shell
openssl genpkey -algorithm RSA -out private_key.pem -pkeyopt rsa_keygen_bits:2048
openssl rsa -pubout -in private_key.pem -out public_key.pem
```

Create text file with a short message
```shell
cat message.txt
```

Encrypt the file using the RSA public key
```shell
openssl pkeyutl -encrypt -in message.txt -pubin -inkey public_key.pem -out message_encrypted.bin
cat message_encrypted.bin
```

Decrypt the file using the RSA private key and verify its content
```shell
openssl pkeyutl -decrypt -in message_encrypted.bin -inkey private_key.pem -out message_decrypted.bin
cat message_decrypted.bin
```


## Step 1: Generate RSA private key

    openssl genpkey -algorithm RSA -out private_key.pem -pkeyopt rsa_keygen_bits:2048

Command breakdown:
- `openssl genpkey`: Generates a private key using OpenSSL
- `-algorithm RSA`: Specifies RSA as the key generation algorithm
- `-out private_key.pem`: Outputs the private key to a file named `private_key.pem`
- `-pkeyopt rsa_keygen_bits:2048`: Sets the RSA key size to 2048 bits -- a secure and commonly used key length

Result:
- a 2048-bit RSA private key and saves it in the PEM format


## Step 2: Extract public key from private key

    openssl rsa -pubout -in private_key.pem -out public_key.pem

Command breakdown:
- `openssl rsa`: Invokes the RSA utility in OpenSSL to handle RSA key operations
- `-pubout`: Extracts the public key from the given private key
- `-in private_key.pem`: Specifies the input file containing the private key (`private_key.pem`)
- `-out public_key.pem`: Specifies the output file where the extracted public key will be saved (`public_key.pem`)

Result:
- extracts the public key from the provided RSA private key and saves it in PEM format


## Step 3: Create a test file
    
    echo "This is a test file for RSA encryption." > test_file.txt

## Step 4: Encrypt the test file using RSA public key

### Step 4.1: Encrypt the file

    openssl pkeyutl -encrypt -in test_file.txt -pubin -inkey public_key.pem -out test_file_encrypted.bin

Command breakdown:
- `openssl pkeyutl`: Invokes a utility of OpenSSL tool for public key operations (encryption, decryption, signing, verification)
- `encrypt`: Specifies that the input file should be encrypted
- `-in test_file.txt`: Specifies the input file (`test_file.txt`) containing the plaintext data to be encrypted
- `-pubin`: Indicates that the input key is a public key
- `-inkey public_key.pem`: Specifies the public key file (`public_key.pem`) to be used for encryption
- `-out test_file_encrypted.bin`: Defines the output file (`test_file_encrypted.bin`) where the encrypted data will be saved

Result:
- encrypts `test_file.txt` using the public key from `public_key.pem` and saves the encrypted output to `test_file_encrypted.bin`

### Step 4.2: Open and verify if that file is encrypted

    cat test_file_encrypted.bin


Result:
- this command will display the raw, binary content of `test_file_encrypted.bin` in the terminal
- Since the file contains encrypted binary data, the output may include unreadable characters and symbols, making it difficult to interpret visually

## Step 5: Decrypt the test file using RSA private key

### Step 5.1: Decrypt the File

    openssl pkeyutl -decrypt -in test_file_encrypted.bin -inkey private_key.pem -out test_file_decrypted.bin


Command breakdown:
- `openssl pkeyutl`: Invokes a utility of the OpenSSL tool for public key cryptographic operations such as encryption, decryption, signing, and verification
- `-decrypt`: Specifies that the operation is decryption
- `-in test_file_encrypted.bin`: Indicates the input file containing the encrypted data
- `-inkey private_key.pem`: Specifies the private key file used for decryption
- `-out test_file_decrypted.bin`: Specifies the output file where the decrypted content will be saved

Result:
- decrypts the content of `test_file_encrypted.bin` using the private key in `private_key.pem` and outputs the decrypted content into `test_file_decrypted.bin`

### Step 5.2: Open and verify if that file is decrypted

    cat test_file_decrypted.bin

Result:
- outputs the decrypted content of `test_file_decrypted.bin` to the terminal
- allow you to verify that the decryption process was successful and the original message has been restored


# Simulate RSA key length impact on performance

```shell
openssl genpkey -algorithm RSA -out private_key_1024.pem -pkeyopt rsa_keygen_bits:1024  
openssl rsa -pubout -in private_key_1024.pem -out public_key_1024.pem
openssl genpkey -algorithm RSA -out private_key_2048.pem -pkeyopt rsa_keygen_bits:2048  
openssl rsa -pubout -in private_key_2048.pem -out public_key_2048.pem
openssl genpkey -algorithm RSA -out private_key_4096.pem -pkeyopt rsa_keygen_bits:4096  
openssl rsa -pubout -in private_key_4096.pem -out public_key_4096.pem
```

```shell
time openssl pkeyutl -encrypt -in plaintext.txt -pubin -inkey public_key_1024.pem -out encrypted_data_1024.bin  
time openssl pkeyutl -encrypt -in plaintext.txt -pubin -inkey public_key_2048.pem -out encrypted_data_2048.bin
time openssl pkeyutl -encrypt -in plaintext.txt -pubin -inkey public_key_4096.pem -out encrypted_data_4096.bin    
```

```text
1024 --  0.01s user 0.01s system 39% cpu 0.056 total

2048 --  0.01s user 0.00s system 77% cpu 0.017 total
 
4096 --  0.01s user 0.01s system 79% cpu 0.017 total
```

```shell
time openssl pkeyutl -decrypt -in encrypted_data_1024.bin -inkey private_key_1024.pem -out decrypted_data_1024.txt  
time openssl pkeyutl -decrypt -in encrypted_data_2048.bin -inkey private_key_2048.pem -out decrypted_data_2048.txt  
time openssl pkeyutl -decrypt -in encrypted_data_4096.bin -inkey private_key_4096.pem -out decrypted_data_4096.txt  
```

```text
1024 --  0.01s user 0.01s system 48% cpu 0.037 total

2048 --  0.01s user 0.00s system 79% cpu 0.019 total

4096 --  0.02s user 0.00s system 86% cpu 0.025 total
```

