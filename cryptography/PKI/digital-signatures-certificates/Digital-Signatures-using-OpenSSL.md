# Digital Signatures and Digital Certificates using OpenSSL

Generate a Private Key

    openssl genpkey -algorithm RSA -out private_key.pem -pkeyopt rsa_keygen_bits:2048

- `-pkeyopt rsa_keygen_bits:2048`: Generates a 2048-bit key for strong encryption

Generate a Certificate Signing Request (CSR) using the private key

    openssl req -new -key private_key.pem -out certificate.csr

- Prompt:
  - Country Name (2 letter code): `US`
  - State or Province Name: `California`
  - Locality Name: `San Francisco`
  - Organization Name: Example Corp`
  - Organizational Unit Name: `IT`
  - Common Name: `www.example.com`
  - Email Address: `admin@example.com`

Generate a Self-Signed Certificate

    openssl x509 -req -in certificate.csr -signkey private_key.pem -out certificate.crt -days 365

- `-signkey private_key.pem`: Uses the private key to sign the certificate

Verify the Certificate

    openssl x509 -in certificate.crt -text -noout

- `-text`: Displays the certificate in a human-readable format
- `-noout`: Suppresses output of the raw certificate

Verify the Certificate Chain
- this step is more relevant for CA-signed certificates
- but, you can simulate verification with the self-signed certificate


    openssl verify -CAfile certificate.crt certificate.crt

- `-CAfile certificate.crt`: specifies the certificate as its own CA (self-signed)

- Expected output:

      certificate.crt: OK

## Simulate Expiry and Renewal

To simulate the expired certificate, use a shorter -days value

    openssl x509 -req -in certificate.csr -signkey private_key.pem -out expired_certificate.crt -days 1


Renew the expired certificate by reissuing it with an updated -days value

    openssl x509 -req -in certificate.csr -signkey private_key.pem -out renewed_certificate.crt -days 365


## Export the Certificate in Different Formats

Convert to DER format

    openssl x509 -in certificate.crt -outform DER -out certificate.der

Convert to PKCS#12 format: combine the private key and certificate into a PKCS#12 bundle

    openssl pkcs12 -export -inkey private_key.pem -in certificate.crt -out certificate.p12

## Certificate Revocation Using a Certificate Revocation List (CRL)
- simulate revoking a client certificate using a CRL and validate its status


Set up the certificate authority (CA)

```shell
mkdir -p ./ca/{certs,crl,newcerts,private}
touch ./ca/index.txt
echo 1000 > ca/serial
echo 1000 > ca/crlnumber
chmod 644 ca/index.txt ca/serial ca/crlnumber
```
- `index.txt`, `serial`, `crlnumber` file should be readable and writable by user

Create the OpenSSL configuration file
- `openssl.cnf` 

```shell
nano ./ca/openssl.cnf
```

- Content of openssl.cnf:

    ```text
    [ ca ]
    default_ca = CA_default
  
    [ CA_default ]
    dir = ./ca
    database = $dir/index.txt
    serial = $dir/serial
    new_certs_dir = $dir/newcerts
    certificate = $dir/certs/ca.crt
    private_key = $dir/private/ca.key
    default_md = sha256
    default_days = 365
    policy = policy_any
    crlnumber = $dir/crlnumber
    crl_dir = $dir/crl
    default_crl_days = 30
    crl_extensions = crl_ext
  
    [ policy_any ]
    commonName = supplied
    stateOrProvinceName = optional
    countryName = optional
  
    [ crl_ext ]
    authorityKeyIdentifier = keyid:always
    ```

Generate the CA key 

```shell
openssl genrsa -out ca/private/ca.key 2048
```

Generate the self-signed CA certificate

```shell
openssl req -new -x509 -key ca/private/ca.key -out ca/certs/ca.crt -days 365 -subj "/CN=MyTestCA"
```

Generate the client's private key

```shell
openssl genrsa -out client.key 2048
```

Generate the certificate signing request (CSR)

```shell
openssl req -new -key client.key -out client.csr -subj "/CN=ClientCertificate"
```

Sign the CSR with the CA:

```shell
openssl ca -config ca/openssl.cnf -in client.csr -out client.crt -batch
```

Revoke the client certificate

```shell
openssl ca -config ./ca/openssl.cnf -revoke client.crt
```

Generate the CRL file
- Ensure the `crlnumber` file exists; create and initialize it manually if it doesn't already exist
  - required by OpenSSL to track CRL versions
  - can be initialized to any number
  - OpenSSL will increment it for each new CRL generated
  - make sure the crlnumber directive is correctly configured in the `openssl.cnf` file


```shell
openssl ca -config ./ca/openssl.cnf -gencrl -out ./ca/crl/crl.pem
```

Verify the revoked certificate against the CRL

```shell
openssl verify -crl_check -CAfile ca/certs/ca.crt -CRLfile ca/crl/crl.pem client.crt
```

- output:

      client.crt: certificate revoked

Inspect the CRL

```shell
openssl crl -in ca/crl/crl.pem -text -noout
```

