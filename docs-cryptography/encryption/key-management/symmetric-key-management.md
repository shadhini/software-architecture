---
icon: scale-balanced
---

# Symmetric Key Management

## Symmetric Key Management

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

* **Immediate response to compromise:**&#x20;
  * if a key is suspected of being compromised, it should be revoked immediately&#x20;
  * all dependent systems should be updated with new keys
  * systems should support key revocation lists (**`KRL`**&#x73;) to track and block compromised keys

