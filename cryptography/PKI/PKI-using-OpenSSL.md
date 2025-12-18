# `PKI`: Public Key Infrastructure Using OpenSSL

## Step 1: Create a Certificate Authority (CA)

### Step A: Generate the private key for the CA

    openssl genpkey -algorithm RSA -out ca.key -aes256 -pass pass:yourpassword

Command Breakdown:
- `openssl genpkey -algorithm RSA`: Generates an RSA private key
- `-out ca.key`: Saves the private key to `ca.key`
- `-aes256`: Encrypts the private key with AES-256 encryption
- `-pass pass:yourpassword`: Specifies the password for encrypting the private key

### Step B: Generate the CA Certificate

    openssl req -new -x509 -key ca.key -sha256 -days 365 -out ca.crt -passin pass:yourpassword


Command Breakdown:
- `openssl req -new -x509`: Creates a new certificate and self-signs it as a CA certificate
- `-key ca.key`: Specifies the CA private key 
- `-sha256`: Uses the SHA-256 hash algorithm
- `-days 365`: Sets the certificate’s validity period to 365 days
- `-out ca.crt`: Saves the certificate to `ca.crt`

Next, fill the certificate details, such as Country Name and Common Name when prompted.

## Step 2: Generate a Private Key for the Server

    openssl genpkey -algorithm RSA -out server.key

## Step 3: Create a Certificate Signing Request (CSR) for the Server

    openssl req -new -key server.key -out server.csr

Command Breakdown:
- `-key server.key`: Specifies the server’s private key
- `-out server.csr`: Saves the CSR to `server.csr`
Now, provide the necessary details for the CSR, such as Common Name (usually the server's hostname)

## Step 4: Sign the Server Certificate with the CA

    openssl x509 -req -in server.csr -CA ca.crt -CAkey ca.key -CAcreateserial -out server.crt -days 365 -sha256 -passin pass:yourpassword

Command Breakdown:
- `openssl x509 -req`: Processes the CSR for signing
- `-in server.csr`: Specifies the server CSR file
- `-CA ca.crt`: Specifies the CA certificate
- `-CAkey ca.key`: Specifies the CA private key
- `-CAcreateserial`: Creates a serial number file for the certificate
- `-out server.crt`: Saves the signed certificate to `server.crt`

## Step 5: Verify the Server Certificate

    openssl verify -CAfile ca.crt server.crt

Command Breakdown:
- `openssl verify`: Verifies a certificate
- `-CAfile ca.crt`: Specifies the CA certificate to verify against 
- `server.crt`: Specifies the server’s certificate

If the verification is successful, OpenSSL will provide an output 
    
    server.crt: OK

## Step 6: Simulate a Client-Server Authentication

### Step A: Use the server certificate
Start a simple server using the server key and certificate 

    openssl s_server -cert server.crt -key server.key -accept 8443


### Step B: Connect as a client
From another terminal, connect to the server as a client 

    openssl s_client -connect localhost:8443 -CAfile ca.crt

Inspect the certificate details displayed in the client terminal


# Set Up a Basic Certificate Authority (CA)

Create a directory structure for your CA, which includes directories for the CA's certificates, private keys, and database
```shell
mkdir -p ./demoCA/newcerts ./demoCA/private
touch ./demoCA/index.txt
touch ./demoCA/serial
printf '01\n' > ./demoCA/serial 
chmod 700 ./demoCA/private
chmod 755 ./demoCA/newcerts
```
- `./demoCA/private`: owner has full access; group and others cannot even `cd` into it
- `./demoCA/newcerts`: owner has full access; group/others can list, traverse and read filenames but cannot create/delete entries
- `./demoCA/serial`: file containing the starting serial number for certificates
  - ensure the file contains exactly one hex number and a trailing newline, nothing else

Generate a root private key for the CA
```shell
openssl genpkey -algorithm RSA -out ./demoCA/private/myCAkey.pem -pkeyopt rsa_keygen_bits:2048
```

Create the root certificate (self-signed) for the CA
```shell
openssl req -new -x509 -key ./demoCA/private/myCAkey.pem -out ./demoCA/myCAcert.pem -days 3650
```

Ensure that your CA root certificate (`myCAcert.pem`) is kept secure because it is the foundation of your trust chain. 
The root certificate is used to sign other certificates in the PKI.


# Issue Certificate Using Your Own CA

Create a private key for `user1`
```shell
openssl genpkey -algorithm RSA -out user1_private_key.pem -pkeyopt rsa_keygen_bits:2048
```

Generate a CSR for `user1` using the private key
```shell
openssl req -new -key user1_private_key.pem -out user1_csr.pem
```

Use the root CA that you've created to issue a certificate for `user1`
```shell
openssl ca -config ./openssl.cnf -in user1_csr.pem -out user1_cert.pem -cert ./demoCA/myCAcert.pem -keyfile ./demoCA/private/myCAkey.pem -days 365
```

success output
```text
Using configuration from ./openssl.cnf
Check that the request matches the signature
Signature ok
Certificate Details:
        Serial Number: 1 (0x1)
        Validity
            Not Before: Dec  9 10:09:15 2025 GMT
            Not After : Dec  9 10:09:15 2026 GMT
        Subject:
            countryName               = US
            stateOrProvinceName       = Texas
            organizationName          = Tech Labs
            organizationalUnitName    = Engineering
            commonName                = techlabs.com
Certificate is to be certified until Dec  9 10:09:15 2026 GMT (365 days)
Sign the certificate? [y/n]:y


1 out of 1 certificate requests certified, commit? [y/n]y
Write out database with 1 new entries
Data Base Updated
```