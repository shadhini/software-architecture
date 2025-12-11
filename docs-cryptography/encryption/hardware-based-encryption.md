---
description: Hardware-based Security
icon: nfc-lock
---

# Hardware-based Encryption

## Hardware-based Encryption

> In high-security environments, **hardware-based encryption offers an additional layer of security** beyond software.

* fingerprint recognition
* facial recognition

#### Comparison of methods

<table><thead><tr><th width="122.0625">Feature</th><th valign="top">TPM</th><th valign="top">HSM</th><th valign="top">Secure Enclave</th></tr></thead><tbody><tr><td>Design</td><td valign="top">built into the motherboard</td><td valign="top">separate hardware device</td><td valign="top">built into the processor</td></tr><tr><td>Primary Use</td><td valign="top"><ul><li>device integrity</li><li>key storage</li></ul></td><td valign="top">high-security operations in enterprises</td><td valign="top">secures traks in mobile devices and electronics</td></tr><tr><td>Usage Context </td><td valign="top">used in personal devices: laptops, desktops</td><td valign="top"><p>used </p><ul><li>by payment processors and</li><li>in the cloud </li></ul></td><td valign="top"><p>found in </p><ul><li>mobile devices and</li><li>consumer electronics</li></ul></td></tr><tr><td>Key Functionality</td><td valign="top"><ul><li>secures hardware  </li><li>stores keys </li></ul></td><td valign="top"><ul><li>manage keys</li><li>performs encryption</li></ul></td><td valign="top"><ul><li>isolate sensitive tasks </li><li>manages keys</li></ul></td></tr><tr><td>Security Role</td><td valign="top"><ul><li>protects device</li><li>prevents access</li></ul></td><td valign="top"><ul><li>secures keys</li><li>cryptographic tasks</li></ul></td><td valign="top"><ul><li>protects sensitive data </li><li>authentication</li></ul></td></tr></tbody></table>



### `TPM`: Trusted Platform Module

> a microcontroller embedded in a device's motherboard&#x20;
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

#### **Applications**

* **Secure boot**
  * ensure the device only boots with trusted software&#x20;
  * block malware&#x20;
  * prevent unauthorized access
* **`FDE`: Full Disk Encryption**
  * securely store encryption keys&#x20;
  * protect data at rest&#x20;
    * e.g: as in  `BitLocker`
* **`DRM`: Digital Rights Management**
  * store keys&#x20;
  * enables secure content distribution&#x20;



### `HSM`: Hardware Security Module

> serves as a standalone device&#x20;
>
> * stores and manages digital encryption keys&#x20;
> * perform cryptographic tasks

* offer higher security and performance than TPMs
* used in high-security industries
  * banking — for secure financial transactions
* typically used in enterprise environments
* provide both physical and logical security&#x20;
* secures sensitive data from unauthorized access
  * built to resist tampering with mechanisms to destroy keys if unauthorized access is attempted

#### **Features:**

* support wide range of cryptographic operations within a secure environment&#x20;
  * key generation, encryption, decryption, digital signing&#x20;
* many HSMs support multi-tenancy
  * allows them to be used by multiple users and applications&#x20;
  * effectively segregate key usage and access

#### **Applications**

* Payment processing&#x20;
  * protects card information &#x20;
  * secures transactions&#x20;
* PKI and CAs
  * manage keys securely for issuing digital certificates&#x20;
* Cloud services
  * manage encryption keys&#x20;
  * protect data&#x20;
  * ensure regulatory compliance&#x20;

### Secure Enclave

> specialized feature found in some processors from `Apple` and `ARM`
>
> creates an **isolated environment for sensitive operations**&#x20;

* a hardware component found in modern mobile devices
* it isolates sensitive data from the main operating system

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

#### Applications

* cryptocurrency wallets&#x20;
  * protect private keys
* enterprise security&#x20;
  * secure access management&#x20;
  * enable user authentication
  * supports key management&#x20;



#### &#x20;
