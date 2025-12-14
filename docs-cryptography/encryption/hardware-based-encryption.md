---
description: Hardware-based Security
icon: nfc-lock
---

# Hardware-based Encryption

## Hardware-based Encryption

> In high-security environments, **hardware-based encryption offers an additional layer of security** beyond software.

* fingerprint recognition
* facial recognition

### Comparison of methods

<table><thead><tr><th width="122.0625">Feature</th><th valign="top">TPM</th><th valign="top">HSM</th><th valign="top">Secure Enclave</th></tr></thead><tbody><tr><td>Design</td><td valign="top">built into the motherboard</td><td valign="top">separate hardware device</td><td valign="top">built into the processor</td></tr><tr><td>Primary Use</td><td valign="top"><ul><li>device integrity</li><li>key storage</li></ul></td><td valign="top">high-security operations in enterprises</td><td valign="top">secures tasks in mobile devices and electronics</td></tr><tr><td>Usage Context </td><td valign="top">used in personal devices: laptops, desktops</td><td valign="top"><p>used </p><ul><li>by payment processors and</li><li>in the cloud </li><li>in enterprise environments</li></ul></td><td valign="top"><p>found in </p><ul><li>mobile devices and</li><li>consumer electronics</li></ul></td></tr><tr><td>Key Functionality</td><td valign="top"><ul><li>secures hardware  </li><li>stores keys </li></ul></td><td valign="top"><ul><li>manage keys</li><li>performs encryption</li></ul></td><td valign="top"><ul><li>isolate sensitive tasks </li><li>manages keys</li></ul></td></tr><tr><td>Security Role</td><td valign="top"><ul><li>protects device</li><li>prevents access</li></ul></td><td valign="top"><ul><li>secures keys</li><li>cryptographic tasks</li></ul></td><td valign="top"><ul><li>protects sensitive data </li><li>authentication</li></ul></td></tr><tr><td>Applications</td><td valign="top"><p><strong>Secure boot</strong></p><ul><li>ensure the device only boots with trusted software </li><li>block malware </li><li>prevent unauthorized access</li></ul><p><strong><code>FDE</code>: Full Disk Encryption</strong></p><ul><li>securely store encryption keys </li><li><p>protect data at rest </p><ul><li>e.g: as in  <code>BitLocker</code></li></ul></li></ul><p><strong><code>DRM</code>: Digital Rights Management</strong></p><ul><li>store keys </li><li>enables secure content distribution</li></ul></td><td valign="top"><p><strong>Payment processing</strong> </p><ul><li>protects card information  </li><li>secures transactions </li></ul><p><strong>PKI and CAs</strong></p><ul><li>manage keys securely for issuing digital certificates </li></ul><p><strong>Cloud services</strong></p><ul><li>manage encryption keys </li><li>protect data </li><li>ensure regulatory compliance </li></ul></td><td valign="top"><p><strong>Cryptocurrency Wallets</strong> </p><ul><li>protect private keys</li></ul><p><strong>Enterprise Security</strong> </p><ul><li>secure access management </li><li>enable user authentication</li><li>supports key management </li></ul></td></tr></tbody></table>



### `TPM`: Trusted Platform Module

> a microcontroller (cryptographic co-processor) embedded in a device's motherboard or security chips
>
> * securely stores keys on a devices's motherboard&#x20;

* a hardware component&#x20;
* commonly used to secure processes like `BitLocker` on laptops and desktops&#x20;
* uses cryptographic keys to secure the hardware — ensure devices's security&#x20;

#### **Features**

* more resistant to hacking— being built directly into the motherboard&#x20;
* enable secure key generation&#x20;
* cryptographic keys are created and stored within the TPM — ensure they remain protected
* enhance platform integrity by measuring and recording the system's state
* enable reporting of tampering through remote attestation
  * allows remote party to verify that the device is un-compromised&#x20;





### `HSM`: Hardware Security Module

> serves as a standalone device&#x20;
>
> * stores and manages digital encryption keys&#x20;
> * perform cryptographic tasks

* offer higher security and performance than TPMs
* used in high-security industries
  * banking — for secure financial transactions
  * healthcare, government sectors
* provide both physical and logical security&#x20;
* secures sensitive data from unauthorized access
  * built to resist tampering with mechanisms to destroy keys if unauthorized access is attempted
* standards: `FIPS 140-2`

#### **Features:**

* support wide range of cryptographic operations within a secure environment&#x20;
  * key generation, encryption, decryption, digital signing&#x20;
* many HSMs support multi-tenancy
  * allows them to be used by multiple users and applications&#x20;
  * effectively segregate key usage and access





### Secure Enclave

> specialized feature found in some processors from `Apple` and `ARM`
>
> * `ARM TrustZone`, `Intel SGX (Software Guard Extensions)`
>
> creates an **isolated execution environments within processor** **for sensitive operations**&#x20;

* a hardware component found in modern mobile devices
* it isolates sensitive data from the main operating system
* prevent unauthorized access even from the operating system or other processes on the device

`Apple's Secure Enclave`

* secures biometric data&#x20;
* powers features like `Apple Pay`

#### Features

* isolation: operates separately
  * it runs separately from the main CPU
* secures data&#x20;
  * keep data safe even if the main system is compromised&#x20;
* provides secure key management&#x20;
  * generating and securing cryptographic keys that remain inaccessible even with physical device access
* support secure booting processes&#x20;
  * by verifying the operating system's integrity before allowing it to run&#x20;
* handles user authentication securely&#x20;
  * biometrics&#x20;
  * keep it out of the main system&#x20;





#### &#x20;
