---
icon: list-ol
---

# Cryptographic Algorithms

## Cryptographic Algorithms

> virtual locks that
>
> * secure information
> * prevent unauthorized access
> * transform plaintext into ciphertext through encryption
> * verify the authenticity and integrity of data using hashing and digital signatures

{% hint style="success" %}
#### Cryptographic Algorithm Classification by Functionality

Data protection → Encryption algorithms

Data integrity → Hash functions

Authentication → Digital signature

Secure Key Sharing → Key Exchange Protocols
{% endhint %}

**Cryptographic algorithm classification by their Mathematical Foundations**

* Classical cryptography
  * Simple foundations: relies on simpler methods&#x20;
  * no longer used for modern encryption
  * e.g: Caesar cipher

{% content-ref url="caesar-cipher.md" %}
[caesar-cipher.md](caesar-cipher.md)
{% endcontent-ref %}

* Modern cryptography
  * rely on complex mathematical problems
  * offer robust encryption
* Quantum cryptography
  * uses principles from quantum mechanics to secure data
  * **`QKD`**: quantum key distribution
    * can detect eavesdropping attempts



### Encryption Algorithms

> **`[ plaintext ]` → f(`encryption algorithm`) → `[ ciphertext ]`**&#x20;
>
> &#x20;    _ciphertext_ can only be decrypted with a key accessible to authorized users

**Types of Encryption Algorithms**

1. Symmetric encryption

{% content-ref url="../../encryption/encryption-and-decryption/symmetric-encryption.md" %}
[symmetric-encryption.md](../../encryption/encryption-and-decryption/symmetric-encryption.md)
{% endcontent-ref %}



2. Asymmetric encryption

{% content-ref url="../../encryption/encryption-and-decryption/asymmetric-encryption/" %}
[asymmetric-encryption](../../encryption/encryption-and-decryption/asymmetric-encryption/)
{% endcontent-ref %}



### Hashing Algorithms

> **`[ plaintext ]` → f(`hashing function`) → `[ hashed text ]`**&#x20;
>
> * create fixed-length value or hash from variable-length input data
> * used ti verify if the data has been altered

* designed to prevent collisions
* even small changes in input **→** drastically change the hash&#x20;



* ensure/verify data integrity
* securely store passwords&#x20;
* create digital signatures



### `MAC`s: Message authentication codes&#x20;

> verify the integrity & authenticity of a message&#x20;
>
> &#x20;    **by combining a secret key with the message**
>
> * both parties must share the key

* secure than hash functions alone
* commonly used in secure communication protocols



### Digital Signatures

> Use asymmetric cryptography — to verify the authenticity & integrity of messages/documents
>
> * the sender signs the data with their private key
> * the recipient verifies it using the sender's public key

<figure><img src="../../.gitbook/assets/digital-signatures.svg" alt="" width="375"><figcaption></figcaption></figure>

* ensures proof of origin
* guarantees the integrity of the data
* provides non-repudiation: sender cannot deny having sent the message



### Key Exchange Protocols

> **enable secure key sharing**
>
> * secure sharing of secret keys over insecure/untrusted channels

* prevent interception of keys&#x20;
* enhanced security
  * ensure that both parties can establish a shared key without directly transmitting it etablishing a secure communication link

Examples:

* `Diffie-Hellman` &#x20;
* **`ECDH`**: `Elliptic Curve Diffie-Hellman`&#x20;







