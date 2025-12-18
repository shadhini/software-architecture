---
icon: ballot-check
---

# CRLs: Certificate Revocation Lists

## `CRLs`: Certificate Revocation Lists

> **`CRL`: Certificate Revocation List**
>
> a signed document created by a certificate authority (CA) that **lists the serial numbers of revoked digital certificates** (certificates that have been invalidated before their expiration)
>
> * published by CAs
>
> help users and applications verify whether a certificate remains valid

Certificates may be revoked before their expiration for reasons such as:

* **Private key compromise:** private key is exposed or misused
* **Account termination:** certificate holder's account is closed
* **Identity change:** a new certificate is issued due to updated information



### How CRLs work?

When a client encounters a certificate, it checks the CRL to determine whether it has been revoked

**1. Creation**

* The CA adds the `serial number` of a revoked certificate to the CRL, along with the `revocation date` and `reason`,&#x20;
  * and **digitally signs** the CRL to ensure its authenticity

**2. Distribution**

* The CA publishes CRLs periodically at predefined locations specified in the digital certificates
* Clients can access these locations to check certificate revocation statuses

**3. Validation**

* When a client encounters a certificate, it retrieves the CRL and searches for its serial number
* **If the serial number appears**,&#x20;
  * the client considers the certificate revoked and takes appropriate action, such as blocking access or issuing a warning

### Advantages

**Centralized management**

* provide a single, organized method for tracking revoked certificates
* enable organizations to maintain a clear list of no longer valid certificates

**Historical record**

* CRLs document all revoked certificates, creating a valuable resource for audits and meeting compliance requirements

**Trust establishment**

* by regularly maintaining and publishing CRLs, CAs build trust in their issued certificates
* ensure users can trust certificates' integrity



### Limitations

**Latency issues**

* Large CRLs (from busy CAs with many certificates) → cause delays during downloads and validation → slows certificate checks

**Stale information**

* An outdated CRL → may not show the latest revocations → leads clients to treat a revoked certificate as valid mistakenly

**Network dependency**

* clients need internet access to retrieve CRLs → this dependency creates challenges in offline environments or areas with poor connectivity

**Revocation delay**

* a gap between a certificate's revocation and its addition to the CRL → creates a temporary risk, leavs a window of vulnerability



### Real-world Applications&#x20;

**Secure Web Browsing (`HTTPS`)**

* browsers use CRLs within the HTTPS protocol to check the status of SSL/TLS certificates and ensure safe connections
* Scenari&#x6F;**:**&#x20;
  * Alex attempts to access his online banking account after a data breach compromises the bank's SSL certificate
  * before loading the site, his browser checks the CRL for the certificate's status
  * when the certificate appears on the CRL, the browser warns Alex and blocks access, protecting his sensitive financial information

**Email Security (`S/MIME`)**

* CRLs validate certificates for signing and encrypting emails, helping secure email communications.
* Scenari&#x6F;**:**&#x20;
  * Sarah receives an encrypted email from her colleague, Tom, who recently left the company under suspicious circumstances
  * her email client checks Tom's certificate against the CRL
  * when it finds the certificate revoked, the client warns Sarah about potential risks, shielding her from malicious content

**Code Signing**

* operating systems rely on CRLs to verify code-signing certificates before running software
* Scenari&#x6F;**:**&#x20;
  * Jamie downloads a new productivity app for her computer
  * before installation, the system checks the app's code-signing certificate against the CRL&#x20;
  * finding the certificate revoked, the system blocks the installation, protecting Jamie from potential malware disguised as legitimate software

**Virtual Private Networks (`VPNs`)**

* VPN configurations rely on CRLs to confirm the validity of certificates used for user authentication
* Scenari&#x6F;**:**&#x20;
  * Michael, a recently terminated employee, tries to connect to his company's VPN to access sensitive data
  * the VPN client checks Michael's certificate against the CRL
  * when it finds the certificate revoked, the client denies access, protecting the company's data from unauthorized use

**E-Government Services**

* government agencies use CRLs to ensure the validity of certificates for online services such as tax filing or license renewals
* Scenari&#x6F;**:**&#x20;
  * Lisa attempts to file her taxes online
  * the tax agency's website checks her encryption and authentication certificate against the CRL
  * when the certificate is found revoked, the website displays an error, halting the process until Lisa provides a valid certificate
  * this prevents potential identity theft and secures personal information



