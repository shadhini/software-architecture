---
icon: file-certificate
---

# Digital Certificates

## Digital Certificates

> electronic documents used to **prove ownership of a public key**
>
> acts as a <kbd>virtual ID card</kbd>

**Key Components of a Digital Certificate**

* owner's identity
* public key
* signature of a trusted third party; CA: Certificate Authority signature

<figure><img src="../../.gitbook/assets/digital-certificates.svg" alt="" width="563"><figcaption></figcaption></figure>



#### How digital certificates work

* Step 1: Key pair generation
  * generates public and private key pair
  * public key is shared&#x20;
  * private key remains confidential
* Step 2: CSR: Certificate Signing Request
  * entity creates a CSR&#x20;
  * CSR includes the public key and identity information&#x20;
  * CSR is sent to a CA for signing
* Step 3: Verification by the CA
  * CA verifies the requester's identity using domain validation or organizational checks
* Step 4: Issuance of certificate
  * once verified, the CA issues the digital certificate
  * sign it with CA's private key
  * sends it to the requester
* Step 5: Secure communication
  * the digital certificate is used for secure communication
  * e.g:
    * HTTPS connections: allow the other party to verify the entity's identity and public key using the CA's public key

#### Certificate Formats and Structures

{% content-ref url="certificate-formats-and-structures.md" %}
[certificate-formats-and-structures.md](certificate-formats-and-structures.md)
{% endcontent-ref %}



#### Types of certificates based on purpose

{% content-ref url="types-of-certificates-based-on-purpose.md" %}
[types-of-certificates-based-on-purpose.md](types-of-certificates-based-on-purpose.md)
{% endcontent-ref %}



#### Certificate chains and Trust Models

{% content-ref url="certificate-chains-and-trust-models.md" %}
[certificate-chains-and-trust-models.md](certificate-chains-and-trust-models.md)
{% endcontent-ref %}



#### Self-signed Certificates vs Third-party Certificates

{% content-ref url="self-signed-certificates-vs-third-party-certificates.md" %}
[self-signed-certificates-vs-third-party-certificates.md](self-signed-certificates-vs-third-party-certificates.md)
{% endcontent-ref %}



#### Importance

**Authentication**

* verifies user and device identities during online transactions
* e.g: a bank's website uses a certificate to confirm its authenticity and protect against phishing attacks

**Data Integrity**

* using digital signatures, certificates confirm that transmitted data remains unchanged
* ensures reliability in software downloads

**Confidentiality**

* enables encrypted communication
* ensure that sensitive information, such as credit card details, are inaccessible to unauthorized parties during transmission

**Non-repudiation**

* provides proof of the origin and integrity of a message &#x20;
* prevent senders from denial of their involvement in a transaction



#### Real World Applications

**Secure Web Browsing — `HTTPS`**

* establishes HTTPS connections
* authenticate website via digital certificates
* encrypts data transmission; between users and servers

_Example: An online shopper; Sarah needs to enter her credit card details_

* browser validates the digital certificate of the e-commerce site&#x20;
* if the certificate is valid, it confirms the site's authenticity &#x20;
* establishes a secure connection
  * encrypting Sarah's sensitive information

**Email Security — `S/MIME` protocol**

* sign and encrypt emails&#x20;
* ensure authenticity and confidentiality

_Example: Mark; a lawyer, sends confidential legal documents to a client_

* Mark signs the email to verify authenticity
* encryption ensures that only the intended recipient can access the email's content
  * protect sensitive information

