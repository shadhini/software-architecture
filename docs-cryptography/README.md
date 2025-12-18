---
icon: binary-lock
---

# Cryptography

## Cryptography

> art and science of securing information by converting it into an unreadable format for unauthorized users

#### Purpose

Ancient Cryptography: keep messages secret

Modern cryptography objectives: **`CIA+N`**

### Core Principles: **`CIA+N`**

#### **Confidentiality**:&#x20;

> **ensure only the intended recipient can read the data**

* unauthorized users cannot access private information during transmission & at rest

**Techniques:**

* encryption — symmetric: **`AES`**, asymmetric: **`RSA`**
* **`SSL`/`TLS`**: Secure Sockets Layer/Transport Layer Security
  * for secure sessions
* **`S/MIME`**: Secure/Multipurpose Internet Mail Extensions
  * a standard for signing and encrypting email using public‑key cryptography and X.509 certificates
* **`PGP`**: Pretty Good Privacy / **`OpenPGP`**:
  * &#x20;a standard for encrypting and signing data (commonly email and files) using public‑key (asymmetric) cryptography

**Use cases:**

*   &#x20;secure email communication, sensitive medical data protection



#### **Integrity**:&#x20;

> **guarantee that the data remains unaltered and authentic**

* maintain data accuracy, consistency, & trustworthiness throughout its lifecycle — from creation to destination

**Techniques:**

* **Hashing and checksums**
  * algorithms: **`SHA-256`**
  * generate unique hashes — fingerprints for data
    * even slight change in the data drastically alter the hash value
    * integrity can be verified by comparing hash values

**Use cases:**

* verifying files, documents, transaction details
* software distribution — ensure that downloaded files have not been tampered with&#x20;



#### **Authentication**:&#x20;

> **verify/confirm the identities of entities involved in communication/transaction**

* verify whether they are really who they claim to be
* prevent impersonate attacks & unauthorized access

**Techniques:**

* **`MFA`**: Multi-Factor Authentication
  * **`2FA`**: two-factor authentication&#x20;
  * require multiple forms of evidence before granting access
    * passwords, biometrics, and one-time codes
  * provide an additional layer of security
* **`PKI`**: Public Key Infrastructure
  * relies on digital certificates issued by trusted authorities to verify the identity of users and devices
  * **`SSL`/`TLS`**: Secure Sockets Layer/Transport Layer Security certificates
    * used in websites to establish secure connections
    * which browsers authenticate to confirm the website's legitimacy
* **`OAuth`**: &#x20;
* Digital Certificates — X.509 certificates

**Use cases:**

* Two-factor or multi-factor authentication



#### **Non-repudiation**:&#x20;

> **prevent parties from denying their involvement/actions**

* ensure accountability & traceability in digital interactions

**Techniques:**

* **Digital signatures** created using cryptographic algorithms
  * uniquely associate data with the signer's private key
  * digital signature made with a private key can later be verified using the corresponding public key
  * any modification to the data after signing would render the signature invalid
  * providing proof of authorship, ensure authenticity & integrity, confirm the origin of the data

**Use-cases:**

* legal contracts, financial, and transactional environments where evidence of actions is crucial



## Applications/Use cases of Cryptography

* Secure communications
  * `WhatsApp`, `Signal`:&#x20;
    * use end-to-end encryption&#x20;
      * to ensure that only the sender and recipient can read the messages&#x20;
      * to prevent unauthorized access

<table><thead><tr><th width="135.39453125" valign="top">Application</th><th width="146.79296875" valign="top">Cryptographic Principles</th><th valign="top">Impact</th></tr></thead><tbody><tr><td valign="top"><strong>Securing online banking</strong></td><td valign="top">Confidentiality</td><td valign="top"><ul><li><strong><code>SSL/TLS</code></strong> encryption for secure sessions  </li><li><code>AES</code> encryption for stored data </li></ul><p>→ protect customer accounts and transaction information from unauthorized access</p></td></tr><tr><td valign="top"></td><td valign="top">Integrity</td><td valign="top"><ul><li><strong>Hashing</strong> and <strong>checksums</strong> verify the accuracy of transaction records</li></ul><p>→ ensure that no tampering occurs during data transfer</p></td></tr><tr><td valign="top"></td><td valign="top">Authentication</td><td valign="top"><ul><li><strong><code>MFA</code></strong>: Multi-factor authentication and <strong>biometric verification</strong> prevent unauthorized access to accounts </li></ul><p>→ ensure that only legitimate users can initiate transactions</p></td></tr><tr><td valign="top"></td><td valign="top">Non-repudiation</td><td valign="top"><ul><li><strong>Digital signatures</strong> provide proof that a transaction was initiated by the account holder</li></ul><p>→ make it impossible to deny involvement in the transaction</p></td></tr><tr><td valign="top"><strong>E-commerce platforms</strong></td><td valign="top">Confidentiality</td><td valign="top"><ul><li><strong><code>SSL/TLS</code></strong> encryption —  to secure payment details</li><li>data-at-rest <strong>encryption</strong> — protects sensitive customer information</li></ul></td></tr><tr><td valign="top"></td><td valign="top">Integrity</td><td valign="top"><ul><li><strong>Hash functions</strong> are applied to verify the consistency of order details and payment information</li></ul><p>→ ensuring no unauthorized modifications occur</p></td></tr><tr><td valign="top"></td><td valign="top">Authentication</td><td valign="top"><ul><li><strong><code>OAuth</code></strong> and <strong><code>2FA</code></strong>: two-factor authentication provide secure login methods</li></ul><p>→ protect against identity theft and fraud</p></td></tr><tr><td valign="top"></td><td valign="top">Non-repudiation</td><td valign="top"><ul><li><strong>Digital receipts</strong> and <strong>transaction confirmations,</strong> <strong>signed by both parties</strong></li></ul><p>→ ensure accountability  </p><p>→ prevent denial of orders or payments</p></td></tr><tr><td valign="top"><strong>Email security</strong></td><td valign="top">Confidentiality</td><td valign="top"><ul><li><strong><code>S/MIME</code></strong> and <strong><code>PGP</code></strong> encryption keep email content private and accessible only to intended recipients</li></ul><p>→ protect sensitive information from unauthorized access</p></td></tr><tr><td valign="top"></td><td valign="top">Integrity</td><td valign="top"><ul><li><strong>Hash functions</strong> and <strong>digital signatures</strong> verify that email content remains intact and unaltered during transmission</li></ul><p>→ alert recipients if tampering occurs</p></td></tr><tr><td valign="top"></td><td valign="top">Authentication</td><td valign="top"><ul><li><strong>Digital certificates</strong> authenticate the sender's identity</li></ul><p>→ prevent email spoofing, phishing attacks  </p><p>→ ensure the email is from a legitimate source</p></td></tr><tr><td valign="top"></td><td valign="top">Non-repudiation</td><td valign="top"><ul><li><strong>Digital signatures</strong> verify the sender's identity</li></ul><p>→ ensure accountability  </p><p>→ prevent denial of sending the email</p><p>→ particularly for legal or contractual communications</p></td></tr></tbody></table>

## Challenges & Solutions

* Quantum computers
  * powerful processing capabilities
  * Solution: Quantum-resistant algorithms
* Secure key management&#x20;
  * across large organizations&#x20;
  * Solution: Implementing cryptographic key sharing and management protocols&#x20;
* Data privacy regulations and compliance
  * mandate strong encryption practices
  * Solution: Organizations need to adapt encryption strategy&#x20;
    * to comply with these regulations &#x20;
    * to ensure that personal information remains secure



## ✅ Best Practices

* Regularly updating cryptographic algorithms & protocols&#x20;
  * to the latest secure standards
* Using complex and long encryption keys
* Encrypting data at rest and in transit
  * data @rest — protecting stored data (on disks, databases, backups, object storage)
    * stolen storage media&#x20;
  * data in transit — protecting data while it moves between systems (over networks, between services, or during backups/transfers)
    * eavesdroppers&#x20;
    * man-in-the-middle attackers
* Conducting frequent security audits&#x20;
  * to identify vulnerabilities in encryption practices

.



