---
icon: signature-lock
---

# Digital Signatures

## Digital Signatures

> a cryptographic method for confirming the authenticity and integrity of digital documents or messages&#x20;
>
> **a digital signature**&#x20;
>
> * certifies that the data is accurate to the best of their knowledge&#x20;
> * link signatory identity directly to the document&#x20;
> * relies on asymmetric cryptography&#x20;

* document hash acts as fingerprint for document
  * even a tiny change to the document would result in completely different hash
* since the signature created using sender's private key which is only accessible to the sender itself, it guarantees that the signature is authentic



[#digital-signatures-and-certificates](../encryption/encryption-and-decryption/asymmetric-encryption/asymmetric-encryption-use-cases-applications.md#digital-signatures-and-certificates "mention")

<figure><img src="../.gitbook/assets/digital-signatures.svg" alt="" width="563"><figcaption></figcaption></figure>



#### Role of Digital Signatures

* enable secure & reliable communication
* confirm data **integrity** by guaranteeing that information remains unchanged in transit
  * ensure that the document hasn't been tampered
  * any tampering alters the documents unique hash, causing verification to fail
* **authenticate** the sender's identity
  * so, recipients can trust the documents' origin
  * ensure that document truly originates from the sender
* offer **non-repudiation**
  * sender cannot deny signing the document
  * only the sender can access the private key needed to create the signature
* provides a layer of accountability



#### Applications

* E-commerce
  * protect data: financial information, personal data
  * ensure accurate and unaltered transaction details
* Legal documents
  * secure, legally binding signatures on contracts & agreements&#x20;
  * prevent tampering&#x20;
* Corporate organizations
  * authenticate emails&#x20;
  * verify sender identity and message integrity
* Software development
  * confirm the source of software updates
  * protect users from downloading maliicious files
* Government and healthcare
  * safeguard sensitive data: personal records, confidential communications



#### Challenges

* Key management
  * compromising private key — jeopardize security of all associated signatures&#x20;
* Trust in CAs
  * udermne trust in system —  if their security is breached&#x20;
* Varying regulations
  * challenges for global operations



