---
icon: scale-balanced
---

# Symmetric Encryption

## Symmetric Encryption

<figure><img src="../../.gitbook/assets/symmetric-key-encryption.svg" alt="" width="563"><figcaption></figcaption></figure>

#### Mode of Operation

* Single key for encryption and decryption
* Encryption: transforms _plaintext_ into _ciphertext_ using a secret key and mathematical functions
* Decryption: reverses encryption with the same key&#x20;

> Encryption:
>
> **`[ plaintext ]` → f(`secret key, mathematical function`) → `[ ciphertext ]`**
>
> Decryption:
>
> **`[ ciphertext ]`→ f(`secret key, mathematical function`) → `[ plaintext ]`**

#### Advantages / Strengths

* Fast and efficient&#x20;
* Handles large data sets&#x20;
* Ideal for disk encryption
* Suitable for real-time communication
* Simple key management

#### Challenges / Weaknesses

* Secure key sharing — essential&#x20;
  * since the same key is used to encrypt and decrypt data

#### Algorithms&#x20;

* **`AES`**: Advanced Encryption Standard
  * high security & efficiency
  * supports key lengths of 123, 192, 256 bits
* **`DES`**: Data Encryption Standard
  * original encryption standard
  * now considered insecure due to advancements in computing power
  * **`3DES`** enhances `DES` by applying the encryption process 3 times
* **`Blowfish`**
  * an alternative to `AES`
  * fast & efficient&#x20;

#### Use Case / Applications&#x20;

* Secure data at rest&#x20;
  * files on hard-drives, databases
  * secure storage, database encryption
* for secure and fast data exchange between endpoints
  * VPNs: Virtual Private Networks &#x20;
  * in controlled environments





