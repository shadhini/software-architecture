---
icon: square-sliders
---

# Key Management

## Key Management

> Key management: generating, storing, distributing, rotating, revoking encryption keys



## Symmetric Key Management

* computationally efficient
* challenges in key management: secure key distribution and storage

#### Key generation

* **Randomness and strength:**&#x20;
  * _key generation_: using a secure random number generator (`RNG`) — to ensure they are unpredictable and resistant to brute-force attacks
  * _key length_: should be chosen based on the required level of security&#x20;
    * AES: 128-bit, 192-bit, or 256-bit&#x20;
* **`KDFs`: Key derivation functions:**&#x20;
  * when deriving keys from passwords or other input KDFs: `PBKDF2`, `bcrypt`,  `Argon2` — should be used&#x20;
    * enhance security by adding computational overhead and making brute-force attacks more difficult

#### Key distribution

* **Manual key exchange:** in small environments
  * manually via secure physical/digital means&#x20;
    * USB drives, encrypted email
* **Automated key exchange protocols:** in larger/dynamic environments
  * automated key exchange protocols: `Kerberos`, `TLS`&#x20;
    * ensure secure transmission over untrusted networks
    * these protocols often use asymmetric encryption to protect the symmetric keys during exchange

#### Key storage

* **Secure enclaves and HSMs:**&#x20;
  * should be stored in secure hardware environments:&#x20;
    * `HSM`s: Hardware Security Modules  or&#x20;
    * `TPM`s: Trusted Platform Modules&#x20;
* **Encrypted databases:**&#x20;
  * when software-based storage is necessary --> keys should be encrypted using a master key in a separate, secure location

#### Key rotation and expiry

* **Regular rotation:** keys should be rotated periodically&#x20;
  * to minimize the risk of long-term exposure
  * automated systems can facilitate key rotation while ensuring service continuity
* **Key expiry policies:** define a lifecycle policy where keys automatically expire after a predefined period
  * forces the generation and distribution of new keys

#### Key revocation

*   **Immediate response to compromise:**&#x20;

    * if a key is suspected of being compromised, it should be revoked immediately&#x20;
    * all dependent systems should be updated with new keys
    * systems should support key revocation lists (**`KRL`**&#x73;) to track and block compromised keys



## Asymmetric Key Management

* simplifies key distribution&#x20;
* but introduces key authentication and trust management complexities

#### Key generation

* **Secure algorithms:**&#x20;
  * `RSA`: keys typically require longer lengths (2048 bits or higher)
  * `ECC`: provides equivalent security with shorter keys (256-bit ECC)
* **Secure storage of key pairs:**&#x20;
  * Both public and private keys should be securely stored
  * The private key should never be exposed outside secure environments

#### Public key distribution

* **`CA`s: Certificate authorities:**&#x20;
  * Public keys are often distributed using digital certificates issued by `CA`s.&#x20;
  * These certificates validate the public key's authenticity and bind it to an identity.
* **`PKI`: Public key infrastructure:**&#x20;
  * PKI systems manage the issuance, renewal, and revocation of digital certificates — ensure that public keys can be trusted

#### Private key protection

* **Encryption and access control:**&#x20;
  * Private keys must be encrypted and protected with strong access control policies
  * `MFA`: Multi-factor authentication should be used for additional security
* **`HSM`s: Hardware security modules:**&#x20;
  * Private keys can be stored in `HSM`s to provide physical and logical security — ensure keys are never exposed to unauthorized users

#### Key exchange protocols

* **`DH`: Diffie-Hellman:** widely used protocol&#x20;
  * `ECDH`: Elliptic Curve Diffie-Hellman: offers better performance and security
* **Hybrid protocols:**&#x20;
  * In many modern systems, asymmetric key exchange is used to securely share symmetric session keys — combines the strengths of both approaches

#### Key revocation and renewal

* **`CRL`s: Certificate Revocation Lists:**&#x20;
  * CAs maintain CRLs that list revoked certificates — ensure that compromised public keys cannot be trusted
* **`OCSP`: Online Certificate Status Protocol:**&#x20;
  * An alternative to CRLs
  * OCSP provides real-time validation of certificate status —  enhance the revocation process's responsiveness



## ✅ Best practices for key management

* **Comprehensive access control:**&#x20;
  * Limit access to cryptographic keys based on roles and responsibilities
  * Only authorized users and systems should have key access
* **Regular auditing and monitoring:** Conduct audits of key management processes  and monitor key usage to detect unauthorized access or anomalies
* **Backup and recovery procedures:** Maintain secure backups of keys and establish clear recovery procedures to handle accidental loss or corruption
* **Compliance with standards:** Follow industry standards such as `NIST SP 800-57`, `ISO/IEC 27001`, `PCI-DSS` to ensure adherence to best practices in cryptographic key management.
* **Training and awareness:** Educate employees on the importance of key management and provide training on secure handling practices



