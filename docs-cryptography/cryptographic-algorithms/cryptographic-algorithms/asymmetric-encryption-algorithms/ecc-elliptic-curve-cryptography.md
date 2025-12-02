---
icon: circle-e
---

# ECC: Elliptic Curve Cryptography

## `ECC`: Elliptic Curve Cryptography

**— the modern & efficient alternative for RSA —**&#x20;

* more recent advancement in asymmetric encryption

### How it works

#### Key Generation Step

* Select an elliptic curve and a base point on that curve
* Choose random number as private key
* Calculate public key by multiplying private key with base point — creating a point on the curve

#### Encryption Step

* Sender generates a temporary key &#x20;
* Using the temporary key, a unique cipher is created from the plaintext
* This _ciphertext_ is further transformed using the recipient's public key
  * so only the intended recipient can decrypt it with their private key

#### Decryption Step

* Recipient uses their private key to decrypt the ciphertext, restoring the original plaintext



### Strengths&#x20;

* provides strong security similar to RSA with smaller/shorter keys
  * less power consumption
  * e.g: 256 bit ECC key provides security similar to a 3072-bit RSA key
* more efficient with limited resources— makes it ideal for devices with limited processing power & battery life
  * due to the mathematical properties of elliptic curves
* lightweight and effective

### Limitations

* &#x20;requires careful setup & complex curve selection
  * requires careful selection of curves and parameters to function securely
* has limited support in legacy systems
  * less compatible than RSA in some environments



### Effective for.. / Practical Applications

* Ideal/efficient for low-power devices — mobile & IoT/embedded devices
  * low power: limited processing power, limited battery life
* Blockchain & cryptocurrency (`Bitcoin`)
  * to secure transactions
  * create digital signatures&#x20;





