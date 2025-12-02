---
icon: scale-unbalanced-flip
---

# Asymmetric Encryption

## Asymmetric Encryption

<figure><img src="../../../.gitbook/assets/asymmetric-encryption.svg" alt=""><figcaption></figcaption></figure>

#### Mode of Operation

* 2 different keys
  * Public key for encryption — shared openly & distributed freely, available to everyone
  * Private key for decryption — should be kept confidential
* each user create a public key  and private key&#x20;
* Encryption: sender encrypts the message with the recipient's public key&#x20;
* Decryption: recipient used their private key to decrypt the message&#x20;

> prerequisites
>
> * recipient(**R**): private key(**R**<sub>**SK**</sub>), public key(**R**<sub>**PK**</sub>)
>
> Encryption:
>
> @sender: `[message]` → f(encrypt, **R**<sub>**PK**</sub>) → `[ciphertext]`
>
> Decryption:
>
> @recipient: `[ciphertext]` → f(decrypt, **R**<sub>**SK**</sub>) → `[message]`

#### Advantages / Strengths

* **Enhanced security:**&#x20;
  * Secure key sharing — eliminates key sharing/exchange/distribution problem
    * private key does not need to be shared
    * public keys are shared openly
* **Integrity and authentication:**&#x20;
  * Support digital signatures & certificates for authentication (verify identities) & data integrity
* **Scalability:**&#x20;
  * scales well for larger networks&#x20;
    * because each entity only needs to secure its private key — more manageable approach than symmetric encryption —  especially as networks grow



#### Limitations / Weaknesses

* **Performance overhead:**
  * computationally intensive & slower than symmetric encryption&#x20;
    * complex mathematical operations&#x20;
    * requires large key sizes for comparable security
* **Key management complexity:**
  * `PKI`: Public-key infrastructure adds layers of complexity
    * require careful management of key pairs and digital certificates
    * increases the administrative and maintenance requirements of the system
*   **Vulnerability to certain attacks:**&#x20;

    * highly secure, but vulnerable to specific threats
      * quantum computing attacks&#x20;
      * man-in-the-middle attacks
    * requires robust algorithms & protocols to mitigate these risks



#### Algorithms

* **`RSA`**: Rivas-Shamir Edelman
  * widely used reliable option for many applications
  * helpful for securing data transmission particularly for web applications

{% content-ref url="../../../cryptographic-algorithms/cryptographic-algorithms/asymmetric-encryption-algorithms/rsa-rivas-shamir-edelman-algorithm.md" %}
[rsa-rivas-shamir-edelman-algorithm.md](../../../cryptographic-algorithms/cryptographic-algorithms/asymmetric-encryption-algorithms/rsa-rivas-shamir-edelman-algorithm.md)
{% endcontent-ref %}

* **`ECC`**: Elliptic Curve Cryptography
  * modern and efficient alternative
  * offers same level of security as `RSA`  with smaller keys&#x20;
  * faster & more efficient in mobile & IoT devices&#x20;

{% content-ref url="../../../cryptographic-algorithms/cryptographic-algorithms/asymmetric-encryption-algorithms/ecc-elliptic-curve-cryptography.md" %}
[ecc-elliptic-curve-cryptography.md](../../../cryptographic-algorithms/cryptographic-algorithms/asymmetric-encryption-algorithms/ecc-elliptic-curve-cryptography.md)
{% endcontent-ref %}



* **`DSA`**: Digital Signature Algorithm
  * used primarily to verify the authenticity of digital documents&#x20;

#### Use Cases / Applications

{% content-ref url="use-cases-applications.md" %}
[use-cases-applications.md](use-cases-applications.md)
{% endcontent-ref %}

&#x20;







