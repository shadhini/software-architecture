---
icon: table-cells-lock
---

# PKI: Public Key Infrastructure

## `PKI`: Public Key Infrastructure

> framework designed to **manage encryption keys & digital certificates** and supports **secure data exchange and identity verification**
>
> **— an invisible layer of trust —**&#x20;

* PKI ensure
  * ✅ secure communication
  * ✅ authentication of identities
* relies on **`Public Key cryptography`**; where each participant has a public key and a private key
  * this key pair enables
    * secure communication though encryption
    * digital signatures&#x20;
    * authentication



### Mode of Operation

**PKI as a Trusted Network**

* manages and verifies identities
* trusted entities called **`CA`**&#x73;: **`Certificate Authorities`** issue digital certificates to confirm/verify  identities of users, devices, services&#x20;

╰┈➤ creates a secure environment, allowing individuals, devices, applications to trust each other during interactions

e.g:&#x20;

* when you visit a secure HTTPS website, the site presents a certificate issues by a trusted CA to confirm its legitimacy



### Core Components of PKI

* Digital Certificates
  * electronic credentials&#x20;
  * confirm an entity's identity &#x20;
  * link to a public key
  * contains essential details like&#x20;
    * owner's identity, public key, validity period
  * ensure reliable authentication
* **`CA`**: Certificate Authority
  * a trusted third party issuing and managing digital certificates
  * verifies identities before issuing a certificate&#x20;
  * safeguards the integrity and authenticity of PKI
* **`RA`**: Registration Authority
  * an intermediary between users and the CA
  * handles initial identity verification
  * ensure applicants are genuine
  * this process allows the CA to focus on issuing certificates &#x20;
* Key pairs&#x20;
  * public & private keys&#x20;
  * public keys: shared openly, used to encrypt data or verify signatures&#x20;
  * private keys: kept confidential, used to decrypt data or create signatures
*   Revocation Protocols: **`CRL`**: Certificate Revocation List  and an **`OCSP`**: Online Certificate Status Protocol

    * `CRL`: lists revoked certificates
    * `OCSP`: provides real-time certificate status check
    * ensure only valid certificates are trusted



### How PKI works: Key principles and processes

**Certificate issuance and distribution**

<figure><img src="../.gitbook/assets/PKI.svg" alt="" width="375"><figcaption></figcaption></figure>

* User (say _Bob_)  requests a certificate&#x20;
* He submits this request to a CA, often though an RA
* After verifying Bob's identity the CA issues a certificate linking his identity to his public key
* Public key is then shares for other to verify

**Encryption and decryption using key pairs**

* Encrypt with public key
  * when _Alice_ want to send a message to _Bob_, she encrypts it using _Bob's_ public key
* Decrypt with private key
  * only _Bob_ can decrypt it with his private key
* Protect data
  * ensure no one else can access the information

**Digital signatures for authentication and integrity**

* Digital signatures verify the sender's identity and data integrity
* Sign with private key
  * when Bob signs a message, he uses his private key
* Verify with public key
  * Alice can verify the signature with Bob's public key
* Ensure authenticity
  * confirm the message is indeed from Bob  and has not been altered&#x20;

**Certificate validation and revocation**

* Ensure certificate trust&#x20;
* Check certificate expiration &#x20;
* Confirm certificate status through `CRL` or `OCSP`&#x20;
  * confirm certificate hasn't been compromised



### Trust Models

#### Hierarchical Model&#x20;

* a central **`Root CA`** issues certificates to `subordinate CA`s
* `Subordinate CA`s, then distribute certificates to end-users&#x20;
* ensure organized & structured trust management

#### Web of Trust

* a decentralized model where users trust each other directly
* trust is established based on endorsements from other users or entities
* often used in environments like `PGP`

#### Hybrid Model

* combine elements of hierarchical and web of trust models
* offers flexibility and structure&#x20;
* ideal for enterprise environments that need both organization and adaptability



### Applications

* Secure web browsing — **`HTTPS`**&#x20;
  * websites uses TLS/SSL certificates issued by certificate authorities to authenticate themselves to users and enable encrypted data exchange&#x20;
* Email security — **`S/MIME`**
  * encrypt email content  — protect the content of emails
  * digitally sign emails — verifies sender's identity
* VPNs
  * authenticate users&#x20;
  * encrypt data over public networks&#x20;
  * create a secure tunnel for data exchange &#x20;
  * secures remote access



### Benefits

enhanced security, trust & scalability

* security
  * provides strong encryption, identity verification
  * ensure data integrity, confidentiality, authenticity
* trust
  * digital certificates from trusted CAs → establish secure digital interactions
* scalability
  * scales well for large organizations
  * manages multiple certificates and identities across uses and devices



### Challenges

* complexity
  * setting up and managing PKI. requires specialized knowledge
  * poses challenges for large setups /implementations
* key management
  * securely handling private keys and certificates is challenging at large scale&#x20;
* cost
  * infrastructure has significant costs&#x20;
    * covering CA services, software, hardware
  * requires ongoing maintenance&#x20;





