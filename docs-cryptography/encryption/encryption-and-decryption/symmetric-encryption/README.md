---
icon: scale-balanced
---

# Symmetric Encryption

## Symmetric Encryption

<figure><img src="../../../.gitbook/assets/symmetric-key-encryption.svg" alt="" width="563"><figcaption></figcaption></figure>

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

* Fast and high efficient&#x20;
* Handles large data volumes&#x20;
* Suitable for real-time communication
* Simple key management
* Simplicity

#### Challenges / Weaknesses

* Requires secure key sharing/management  — essential&#x20;
  * since the same key is used to encrypt and decrypt data
* Scaling can be complex
  * as large networks require unique keys for each user pair
  * If an attacker gains access to the shared key, they can decrypt all messages between users

#### Algorithms&#x20;

* **`AES`**: Advanced Encryption Standard
  * current standard in symmetric encryption
  * high security & efficiency
  * supports key lengths of 128, 192, 256 bits
  * official replacement for `DES`
* **`DES`**: Data Encryption Standard
  * original encryption standard
  * now considered insecure due to advancements in computing power
  * **`3DES`** enhances `DES` by applying the encryption process 3 times with different keys
    * slower than `AES`
* **`Blowfish`**
  * an alternative to `AES`
  * fast & efficient&#x20;
  * flexible symmetric cipher with variable key lengths ranging from 32 to 448 bits
    * adaptable to various security needs
* **`RC4`**: Rivest Cipher 4
  * stream cipher that encrypts data one bit or byte at a time
  * Known for simplicity & speed
* **`ChaCha20`**
  * modern stream cipher&#x20;
  * a secure, efficient alternative to `RC4`   &#x20;

<table><thead><tr><th width="91.43359375"></th><th></th></tr></thead><tbody><tr><td><code>AES</code></td><td><ul><li>for robust data protection</li><li>industries: finance, healthcare, government</li></ul></td></tr><tr><td><code>3DES</code></td><td><ul><li><p>where speed is critical</p><ul><li>password hashing</li><li>software and hardware environments</li></ul></li></ul></td></tr><tr><td><code>RC4</code></td><td><ul><li>where processing time is critical, despite vulnerabilities</li><li>not recommended for highly secure applications</li></ul></td></tr><tr><td><code>ChaCha20</code></td><td><ul><li><p>especially effective in mobile &#x26; embedded devices</p><ul><li>where performance &#x26; low latency are essential</li></ul></li></ul></td></tr></tbody></table>





#### Use Case / Applications&#x20;

{% content-ref url="symmetric-encryption-use-case-applications.md" %}
[symmetric-encryption-use-case-applications.md](symmetric-encryption-use-case-applications.md)
{% endcontent-ref %}







