---
icon: file-certificate
---

# Digital Certificates

## Certificate Formats and Structures

main formats: each format is designed for unique roles for web applications, local storage, or secure transfer

* **`PEM`: Privacy-Enhanced Mail:**&#x20;
  * uses Base64 encoding with headers&#x20;
  * often applied in web servers
  * [#pem](digital-certificates.md#pem "mention")
* **`DER`: Distinguished Encoding Rules**:&#x20;
  * uses binary encoding
  * suitable for applications in `Windows` environments & Java applications
  * [#der](digital-certificates.md#der "mention")
* **`PFX/P12`: Personal Information Exchange:**&#x20;
  * an encrypted storage method for certificates and private keys
  * useful for secure storage and transport
  * [#pfx-p12-format-personal-information-exchange-syntax-standard-pkcs-12](digital-certificates.md#pfx-p12-format-personal-information-exchange-syntax-standard-pkcs-12 "mention")
* **`CER`: Certificate:**&#x20;
  * `CER` files contain only the certificate and can be encoded in `PEM` or `DER` formats
  * [#cer-format](digital-certificates.md#cer-format "mention")



### The `X.509` Standard: Foundation of Public Key Infrastructure

> provides a **structured framework for public key certificates**

* most digital certificates follow the `X.509` standard
* developed by the `ITU`: International Telecommunication Union &#x20;
* X.509 supports secure digital communication
  * widely applied in `SSL`/`TLS` protocols, `VPN`s, email encryption



#### **Components & Structure of X.509 certificates**

<table><thead><tr><th width="157.25390625">Field/Component</th><th>Description</th></tr></thead><tbody><tr><td><strong>Version</strong> </td><td><p>indicates the X.509 version used for the certificate</p><ul><li><p>most certificates today use Version 3: X.509v3</p><ul><li>includes support for extensions that allow for additional metadata such as usage restrictions</li></ul></li></ul></td></tr><tr><td><strong>Serial number</strong></td><td><p>each certificate issued by a CA has a unique serial number</p><ul><li>it enables the tracking and management of the certificate within the PKI</li><li>in cases of certificate revocation, the CA can use the serial number to invalidate a compromised certificate quickly</li></ul></td></tr><tr><td><strong>Signature algorithm</strong></td><td><p>cryptographic algorithm used by the CA to sign the certificate </p><ul><li>e.g: <code>SHA-256</code> </li><li>ensures the integrity of the certificate by hashing its data</li><li>if any information within the certificate is altered, the signature will no longer match → alert users/systems about potential tampering</li></ul></td></tr><tr><td><strong>Issuer</strong> </td><td><p>the CA: Certificate Authority responsible for issuing and signing the certificate</p><ul><li>issuer information: CA's name, organization, location</li></ul></td></tr><tr><td><strong>Validity period</strong></td><td><p>the timeframe during which the certificate remains active and usable</p><ul><li>includes “<code>Not Before</code>” and “<code>Not After</code>” dates</li><li>restrict the certificate to a defined period</li><li>reduce risks associated with expired or outdated certificates</li></ul></td></tr><tr><td><strong>Subject</strong> / Subject Information </td><td><p>the entity the certificate represents, to which the certificate is issued </p><ul><li>may include a person, device, domain</li><li>Subject Information: subject's name, organization, domain name,  location</li><li>for SSL/TLS certificates, the subject usually corresponds to the server's domain or IP address</li></ul></td></tr><tr><td><strong>Public Key</strong> / Subject public key information</td><td><p></p><p>public key of the certificate holder / the subject and the associated algorithm</p><ul><li><p>used to enable encrypted communication with others</p><ul><li>allow other parties to encrypt messages</li><li>but only the certificate holder can decrypt them with their private key</li></ul></li><li>associated algorithm: <code>RSA</code> | <code>ECC</code> | ..</li></ul></td></tr><tr><td><strong>Extensions</strong></td><td><p>additional details about the certificate's purpose and intended usage </p><ul><li><p>e.g: usage constraints, other specific attributes</p><ul><li><p><strong>Key usage:</strong> defines the certificate's permitted uses</p><ul><li>e.g: digital signature and encryption</li></ul></li><li><strong><code>EKU</code>: Extended Key Usage:</strong> specifies additional use cases, including client authentication or code signing</li><li><strong>Multi-domain certificates or <code>SAN</code>: Subject Alternative Name:</strong>  the certificate can associate multiple domain or alternative names with the subject</li><li><strong>Basic constraints:</strong> indicates whether the certificate can issue other certificates, designating it as a CA or subordinate certificate</li></ul></li></ul></td></tr></tbody></table>



### Encoding formats: `PEM` and `DER`

Digital certificates can be encoded in different formats: `PEM` | `DER`  — primary encoding formats

#### **PEM**

> use **Base64** encoding format with headers
>
> * allows certificates to be readable by both humans and machines

**Structure:**&#x20;

* PEM certificates are encapsulated between the tags `----BEGIN CERTIFICATE----` and `----END CERTIFICATE----` — marks the start and end of the encoded data
* these tags make PEM-encoded certificates&#x20;
  * easy to identify&#x20;
  * easy to work with in text files

**Usage:**&#x20;

* widely used for SSL/TLS certificates, private keys, certificate chains
* commonly used across Linux systems and web servers&#x20;
  * due to its flexibility and compatibility
* commonly used for server configurations due to its compatibility with various server software

#### **DER**

> binary encoding format&#x20;
>
> * not human-readable &#x20;
> * do not contain encapsulation tags



**Structure:**&#x20;

binary format: files smaller (of compact structure) and more efficient for certain applications

**Usage:**&#x20;

* primarily used in `Windows` environments and `Java` applications
  * due to its compact structure and binary efficiency — enhance performance in these environments



### `PFX`/`P12` format: Personal Information Exchange Syntax Standard (`PKCS#12`)

> based on **`PKCS#12`**: Public-Key Cryptography Standards #12&#x20;
>
> * distinct as it can **store both certificates and private keys together in an encrypted, portable file** format

* supports password protection

**Structure:**&#x20;

* binary-encoded files &#x20;
* often encrypted to enhance security

**Usage:**&#x20;

* ideal for the secure storage and transfer of certificates and keys
* primarily used to transfer certificates and private keys between systems
  * especially in Windows environments
* these files are popular in email systems and applications that require certificate-based authentication

### `CER` format

> CER files may contain **only the certificate**, excluding the private key.

* commonly used for certificate files
* may be encoded in `PEM` or `DER` formats

**Usage:**&#x20;

* widely used for exchanging certificates without including private keys
* On Windows systems
  * &#x20;`.cer` files are often `DER`-encoded
*   On Linux systems,

    * `.cer` files are typically `PEM`-encoded



## Types of certificates based on purpose

* **SSL/TLS certificates:**&#x20;
  * secure HTTP connections&#x20;
  * authenticate server identities
* **Code-signing certificates:**&#x20;
  * verify software integrity
    * ensure the code has not been tampered with&#x20;
    * confirm the publisher’s identity
* **Email certificates (`S/MIME`: Secure/Multipurpose Internet Mail Extensions):**&#x20;
  * authenticate email identities &#x20;
  * enable message encryption
* **Client certificates:**&#x20;
  * authenticate individual users or devices
  * commonly within organizational environments
* **Root and Intermediate Certificates:**&#x20;
  * Root certificates: establish the foundational trust in a PKI
  * Intermediate certificates: delegate signing authority, supporting scalability



## Certificate chains and trust models

> A **certificate chain** connects a certificate back to a trusted root CA: Certificate Authority&#x20;
>
> &#x20;        through one or more intermediate certificates,&#x20;
>
> &#x20;        forming a “<kbd>**chain of trust**</kbd>”

* systems validate an end-entity certificate by following the chain to the trusted root, confirming its legitimacy

{% hint style="info" %}
#### This **chain-based structure**&#x20;

╰┈➤ ensures that all certificates in the path align with the trust established by the root CA

╰┈➤ create a secure foundation for digital interactions
{% endhint %}



* **End-Entity certificate:** represents the individual, device, or server
* **Intermediate certificates:**&#x20;
  * signed by the root CA
  * help scale and manage trust within the system
* **Root certificate:**&#x20;
  * trusted anchor in the certificate chain
  * widely recognized by browsers and systems







