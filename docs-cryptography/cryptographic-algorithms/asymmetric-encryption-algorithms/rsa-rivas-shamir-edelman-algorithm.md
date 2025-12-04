---
icon: registered
---

# RSA: Rivas-Shamir Edelman Algorithm

## `RSA`: Rivas-Shamir Edelman Algorithm

> relies on **challenge/difficulty of factoring large prime numbers**

— foundation of public-key cryptography —&#x20;

* earliest asymmetric encryption method
* first widely adopted asymmetric algorithm



### How it works

#### Key Generation Step

* Select 2 large prime numbers&#x20;
* Multiply them to form product that becomes a part of public key — `p`, `q`
* Calculate the totient value — (p-1) x (q-1)
* Using this, a public key is created and a mathematically liked private key is derived



#### Encryption Step

* Sender uses recipient's public key to encrypt _plaintext_, generating _ciphertext_
  * → ensures that only the intended recipient can decrypt the _ciphertext_ using their private key



#### Decryption Step

* Recipient uses private key to decrypt _ciphertext_ back to plaintext



### Strengths

* widely trusted and supported&#x20;
* robust

### Limitations

* requires larger keys (2048+ bits)
  * to ensure adequate security
  * can slow down processing
* if not implemented correctly, it is vulnerable to certain attacks
  * requires careful implementation

### Effective for... / Practical Applications

* encrypting messages&#x20;
* digital signatures for ensuring authenticity & integrity of digital messages/documents&#x20;
* securing data transmission particularly for web applications
* **`SSL`**/**`TLS`** protocols to establish secure connections for web browsing







