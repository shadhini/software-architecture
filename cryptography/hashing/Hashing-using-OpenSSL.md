# Hashing using OpenSSL

## Hash a String 
using MD5 and SHA-256 algorithms

### `MD5` Hash:

    echo -n Hello, OpenSSL! | openssl dgst -md5


Command breakdown:
- `echo -n Hello, OpenSSL!`: Prints the string without adding a trailing newline
- `|`: Pipes the output of echo into the OpenSSL command
- `openssl dgst -md5`: Generates the MD5 hash of the input

### `SHA-256` Hash:

    echo -n Hello, OpenSSL! | openssl dgst -sha256

Command breakdown:
- `openssl dgst -sha256`: Generates the SHA-256 hash of the input data

## Hash a File 
Create a test file
    
    echo "This is a test file for hashing." > testfile.txt


Compute MD5 hash of the file

    openssl dgst -md5 testfile.txt

Compute SHA-256 hash of the file

    openssl dgst -sha256 testfile.txt

Try other algorithms

    openssl dgst -sha1 testfile.txt
    openssl dgst -sha512 testfile.txt

OUTPUT

```text
MD5(testfile.txt)= 8c3d35666cc87c9f8425e6310b9df6ec
SHA256(testfile.txt)= 29654de14b0ff48706e60a181fe7ebfa41b825c53fda8ffecfbee7bcd46ef59f
SHA1(testfile.txt)= 5e2dbe3c4eac01e22e466736b0fe9ce3481a92bd
SHA512(testfile.txt)= 230f572ef7bff80308864f38bedd920fd3b9cae0a43d0f3e4242cdad388ec967b1a4dfa5c5c3fcd89598861907c6cac7ad10c69f1311ced691e1bd252e10f198
```

## Verify File Integrity

- testfile.txt: original content
- testfile2.txt: copy of testfile.txt with no modification
- testfile3.txt: copy of testfile.txt with an appended line

```shell
openssl dgst -sha256 testfile.txt
openssl dgst -sha256 testfile2.txt
openssl dgst -sha256 testfile3.txt
```
OUTPUT

```text
via 💎 v3.1.3 
❯ openssl dgst -sha256 testfile.txt
SHA256(testfile.txt)= 29654de14b0ff48706e60a181fe7ebfa41b825c53fda8ffecfbee7bcd46ef59f

via 💎 v3.1.3 
❯ openssl dgst -sha256 testfile2.txt
SHA256(testfile2.txt)= 29654de14b0ff48706e60a181fe7ebfa41b825c53fda8ffecfbee7bcd46ef59f

via 💎 v3.1.3 
❯ openssl dgst -sha256 testfile3.txt
SHA256(testfile3.txt)= 2894e565f9626481da9b746d8eb94c6dcb61b751c89eb39a071f6119f8f85547
```

## Generate `HMAC`: Hash-Based Message Authentication Code

---
`HMAC`: keyed cryptographic construct that provides both integrity and authenticity for a message
- it uses a cryptographic hash function together with a secret key
- a plain hash without a key only provides a checksum/integrity (and not strong authenticity)

---

Create a secret key

    echo "supersecretkey" > secret.key

Generate HMAC

    openssl dgst -sha256 -hmac "supersecretkey" testfile.txt

Command breakdown:
- `openssl dgst -sha256`: Computes the SHA-256 hash
- `-hmac "supersecretkey"`: Uses the specified key to compute the HMAC
- `testfile.txt`: Input file to hash with HMAC


