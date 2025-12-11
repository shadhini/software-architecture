---
icon: building-flag
---

# CAs: Certificate Authorities

## `CA`s: Certificate Authorities

> a trusted organization responsible for verifying the identities of websites, individuals, organizations before issuing digital certificates
>
> * issues digital certificates as proof of trust
> * confirms the authenticity of each certificate holder to ensure safe online interactions

* Secure padlock = A CA protecting your data
* analogue: digital passport office &#x20;

**Digital Certificate includes**

* holder's public key
* identifying details
* CA's digital signature: authenticates the certificate&#x20;
  * validating the CA's signature lets users confirm the online entity's integrity and legitimacy



### How `CA`s Operate

Issuing Digital Certificates

* Step 1: Identity verification
  * verifies requester's identity
  * `DV`: Domain Validation
    * confirms domain ownership
  * `OV`: Organization Validation & `EV`: Extended Validation
    * reviews legal documents or
    * perform background checks
* Step 2: Certificate issuance
  * certificate includes
    * requester's public key
    * identity details
    * CA's digital signature&#x20;
  * this certificate allows secure, encrypted communication
    * assure users that they are interacting with a verified entity
* Step 3: Certificate revocation
  * revokes compromised certificates
    * e.g: if a private key is exposed
  * adds revoked certificates to a `CRL`: Certificate revocation List or
  * flags revoked certificates with `OCSP`: Online Certificate Status Protocol for real-time validation



### Types of Certificates issued by CAs

* **`DV`: Domain Validation Certificates**
  * simplest to obtain
  * verify only domain ownership
  * provide basic encryption
  * suitable for personal blogs or small websites
* **`OV`: Organization Validation Certificates**
  * verify organization credentials&#x20;
  * ideal for e-commerce websites to build customer trust
* **`EV`: Extended Validation Certificates**
  * provide the highest level of trust&#x20;
  * requires rigorous review of the organization's legal and operational status&#x20;
  * websites with EV certificates may display a green address bar or the organization's name, signalling enhanced legitimacy
* **Wildcard Certificates**
  * cover all subdomains under a main domain
  * simplify certificate management
  * e.g: a wildcard certificate for _`*.example.com`_; where _`*`_ represents any subdomain will secure _`blog.example.com`_, _`shop.example.com`_, and others under that domain&#x20;
* **Multi-domain or SAN: Subject Alternative Name certificates**
  * secure multiple domains with a single certificate&#x20;
  * ideal for organizations managing multiple domains



### Risks and Challenges in CAs and Trust Models

* **Root CA compromise**
  * one of the most serious risks
  * when attackers compromise a root CA, they can issue fraudulent certificates&#x20;
  * puts all issued certificates at risk
  * these incidents undermine trust in the entire certificate system
* **Certificate mis-issuance**
  * happens when a CA mistakenly issues certificates to unverified entities&#x20;
  * this erodes user trust&#x20;
  * can lead browsers to distrust the CA → impacts websites that rely on its certificates&#x20;
* **Revocation and expiration management**&#x20;
  * requires constant & frequent updates to CRLS and OCSP
    * CRLs and OCSP lists must stay updated to prevent expired or revoked certificates from being misused
  * delays or failures in updates expose systems to security risks&#x20;
* **Privacy concerns**
  * concerns about potential government oversight of CA's&#x20;
    * that could lead to unauthorized access to secure communications
    * specially in jurisdictions with limited privacy protections
* **Trust anchor distribution**
  * difficulty in global distribution
    * users need the CA's root certificate installed on their devices as a trust anchor&#x20;
    * distributing these trust anchors globally is critical for security
  * demands consistent updates to stay current&#x20;
    * to keep trust anchors current &#x20;





