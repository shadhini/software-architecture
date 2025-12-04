# AES using OpenSSL

## Step 1: Generate an AES Encryption Key
create a 256-bit AES key

    openssl rand -base64 32 > aes_key.txt

Command breakdown:
- `openssl rand`: Generates random data
- `-base64`: Encodes the output in Base64 format 
- `32`: Specifies the key length (32 bytes = 256 bits)
- `> aes_key.txt`: Saves the key to a file


verify the key generation

    cat aes_key.txt

## Step 2: Create a File to Encrypt

    echo "This is a test file for AES encryption." > plaintext.txt

## Step 3: Encrypt the File

    openssl enc -aes-256-cbc -salt -in plaintext.txt -out encrypted_file.bin -pass file:aes_key.txt

Command breakdown:

- `openssl enc`: Performs encryption/decryption
- `-aes-256-cbc`: Specifies AES with a 256-bit key in CBC mode
- `-salt`: Adds a salt to enhance security
- `-in plaintext.txt`: Specifies the input file
- `-out encrypted_file.bin`: Specifies the output file
- `-pass file:aes_key.txt`: Supplies the encryption key from `aes_key.txt`

verify the encrypted file

    cat encrypted_file.bin

output will be unreadable binary data -> hence confirming encryption

## Step 4: Decrypt the File

using the same AES key

    openssl enc -aes-256-cbc -d -in encrypted_file.bin -out decrypted_file.txt -pass file:aes_key.txt

Command breakdown:
- `-d`: Specifies decryption


verify the decrypted file

    cat decrypted_file.txt

# Experiment with Different Key Sizes
Encrypt a file named `plaintext.txt` using AES with the following key sizes: 128-bit, 192-bit, and 256-bit

```shell
openssl rand -base64 32 > aes_key.txt
time openssl enc -aes-128-cbc -salt -in plaintext.txt -out encrypted_file_aes-128-cbc.bin -pass file:aes_key.txt
time openssl enc -aes-192-cbc -salt -in plaintext.txt -out encrypted_file_aes-192-cbc.bin -pass file:aes_key.txt
time openssl enc -aes-256-cbc -salt -in plaintext.txt -out encrypted_file_aes-256-cbc.bin -pass file:aes_key.txt
```

Decrypt the files and verify that the output matches the original plaintext
```shell
time openssl enc -aes-128-cbc -d -in encrypted_file_aes-128-cbc.bin -out decrypted_file_aes-128-cbc.txt -pass file:aes_key.txt
time openssl enc -aes-192-cbc -d -in encrypted_file_aes-192-cbc.bin -out decrypted_file_aes-192-cbc.txt -pass file:aes_key.txt
time openssl enc -aes-256-cbc -d -in encrypted_file_aes-256-cbc.bin -out decrypted_file_aes-256-cbc.txt -pass file:aes_key.txt
```
```shell
sha256sum plaintext.txt decrypted_file_aes-128-cbc.txt
sha256sum plaintext.txt decrypted_file_aes-192-cbc.txt
sha256sum plaintext.txt decrypted_file_aes-256-cbc.txt
```

Compare the time taken for each encryption
```text
encryption process
aes-128-cbc --> 0.01s user 0.01s system 80% cpu 0.022 total
aes-192-cbc --> 0.01s user 0.01s system 81% cpu 0.021 total
aes-256-cbc --> 0.01s user 0.01s system 81% cpu 0.022 total

decryption process
aes-128-cbc --> 0.01s user 0.01s system 51% cpu 0.041 total
aes-192-cbc --> 0.01s user 0.01s system 80% cpu 0.022 total
aes-256-cbc --> 0.01s user 0.01s system 80% cpu 0.021 total
```

# Experiment with Initialization Vectors (IVs)

Generate random IVs
```shell
openssl rand -hex 16 > iv_1.txt
openssl rand -hex 16 > iv_2.txt
openssl rand -hex 16 > iv_3.txt
```

Encrypt the same plaintext file (`plaintext.txt`) for multiple times using the same key with different IVs
```shell
openssl enc -aes-128-cbc -salt -in plaintext.txt -out ciphertext1.enc -iv $(tr -d ' \n\r' < iv_1.txt) -pass file:aes_key.txt
openssl enc -aes-128-cbc -salt -in plaintext.txt -out ciphertext2.enc -iv $(tr -d ' \n\r' < iv_2.txt) -pass file:aes_key.txt
openssl enc -aes-128-cbc -salt -in plaintext.txt -out ciphertext3.enc -iv $(tr -d ' \n\r' < iv_3.txt) -pass file:aes_key.txt
```

Compare the resulting ciphertexts to observe the differences
```shell
diff ciphertext1.enc ciphertext2.enc
diff ciphertext2.enc ciphertext3.enc
diff ciphertext1.enc ciphertext3.enc
```

Decrypt the ciphertexts and verify the plaintext that remains consistent
```shell
openssl enc -aes-128-cbc -d -in ciphertext1.enc -out decrypted1.enc -iv $(tr -d ' \n\r' < iv_1.txt) -pass file:aes_key.txt
openssl enc -aes-128-cbc -d -in ciphertext2.enc -out decrypted2.enc -iv $(tr -d ' \n\r' < iv_2.txt) -pass file:aes_key.txt
openssl enc -aes-128-cbc -d -in ciphertext3.enc -out decrypted3.enc -iv $(tr -d ' \n\r' < iv_3.txt) -pass file:aes_key.txt
```

```shell
sha256sum plaintext.txt decrypted1.enc
sha256sum plaintext.txt decrypted2.enc
sha256sum plaintext.txt decrypted3.enc
```

# About `KDF`: Key Derivation Function

`KDF` derives cryptographic keys from a password or other secret material, 
adding **salt** and a configurable work factor (**iterations**) to slow down brute‑force attacks. 

Examples: `PBKDF2`, `scrypt`, `Argon2`

default KDF -> MD5-based key derivation (`EVP_BytesToKey`)
- weak
- fast against brute-force 

Use
- `-pbkdf2` and/or `-iter` to increase the work factor
  - `-pbkdf2` (PBKDF2 with HMAC and configurable iterations) 
OR
- supply the raw key with `-K/-iv (hex)` to avoid KDF entirely

```shell
# Recommended: PBKDF2 with iterations (stronger)
openssl enc -aes-128-cbc -salt -pbkdf2 -iter 100000 \
  -in plaintext.txt -out ciphertext1.enc \
  -pass file:aes_key.txt \
  -iv $(tr -d ' \n\r' < iv.txt)
  
# Decrypt with PBKDF2
openssl enc -aes-128-cbc -d -pbkdf2 -iter 100000 \
  -in ciphertext1.enc -out decrypted.txt \
  -pass file:aes_key.txt \
  -iv $(tr -d ' \n\r' < iv.txt)
```

```shell
# Alternative: use raw key/iv in hex (no KDF)
# (use this if `aes_key.txt` contains raw key bytes; convert as needed)
openssl enc -aes-128-cbc -in plaintext.txt -out ciphertext_k.bin \
  -K 2f17120f046920b3a79d9ebff80093f6 -iv 2f17120f046920b3a79d9ebff80093f6
```