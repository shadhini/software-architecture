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

{% content-ref url="../../../cryptographic-algorithms/symmetric-encryption-algorithms/" %}
[symmetric-encryption-algorithms](../../../cryptographic-algorithms/symmetric-encryption-algorithms/)
{% endcontent-ref %}



#### Use Case / Applications&#x20;

{% content-ref url="symmetric-encryption-use-case-applications.md" %}
[symmetric-encryption-use-case-applications.md](symmetric-encryption-use-case-applications.md)
{% endcontent-ref %}







