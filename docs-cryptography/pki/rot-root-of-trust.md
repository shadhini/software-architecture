---
icon: handshake
---

# RoT: Root of Trust

## `RoT`: Root of Trust

> a **security framework** that creates a **chain of trust** using trusted core components that allow a system to validate and authenticate other parts of the system
>
> * consists of hardware / software that creates a secure environment — keep data confidential, authentic, integral
>
> **purpose**: act as a secure anchor for trust decisions in a system
>
> * helps verify the integrity of software and hardware &#x20;
> * establishes trust between system components

crucial in&#x20;

* secure boot processes
* `HSMs`: hardware security modules &#x20;
* digital certificates



### Components of the RoT

3 main components

1. <mark style="color:$primary;">**`RTM`**</mark><mark style="color:$primary;">**: Root of Trust for Measurement**</mark>
   * checks the system's integrity during **boot**
   * ensures the system hasn't been tampered with by comparing the hashes of critical components (BIOS or firmware), with trusted values
   * _Example_**:**&#x20;
     * RTM measures the firmware during secure boot and logs the results
     * If any component's hash doesn't match the expected value, the system stops the boot process to block potential threats
2. <mark style="color:$primary;">**`RTS`**</mark><mark style="color:$primary;">**: Root of Trust for Storage**</mark>&#x20;
   * securely stores cryptographic keys, certificates, other sensitive data
   * protects keys used for encryption and authentication from unauthorized access
   * _Example_**:**&#x20;
     * A `TPM`: Trusted Platform Module acts as an RTS, securely storing private keys for digital signatures
     * When a digital certificate is used, the system verifies the signature using the public key, knowing the private key is safe in the TPM
3. <mark style="color:$primary;">**`RTR`**</mark><mark style="color:$primary;">**: Root of Trust for Reporting**</mark>&#x20;
   * reports the integrity and trustworthiness of system components to other entities
   * ensures transparency and accountability in the system's security
   * **Example:**&#x20;
     * In a cloud environment, RTR generates a report on the integrity of a virtual machine (`VM`) and its components
     * this report is sent to the cloud provider to validate the system's security
     * create a trusting relationship between the client and the provider



### Establishing a chain of trust

RoT sets the foundation for a chain of trust that extends to other components within the system

Each component relies on RoT to function securely, with trust extending through processes like secure boot

#### **Process**

* The secure boot starts with RTM measuring the initial firmware
* Trust is passed to the next component if the measurement matches the expected hash
* Each component, like the `bootloader` and `operating system`, is measured and validated, extending the trust from the RoT

#### _Example_: a smartphone with a secure boot process

* RTM measures and verifies the smartphone's firmware
* If it matches, the `bootloader` is checked, and the process continues until the `operating system` loads
* If any component fails the check, the device won't boot, stopping potential malware

**Scenario:** A user buys a new smartphone

* The secure boot process checks each component's integrity during the first boot
* It ensures the device is free from malware
* The device won't boot if tampered with, protecting the user's data and privacy



### Real-world applications of RoT



**1. Secure boot in operating systems**

* Modern operating systems (`Windows`, `Linux`) use RoT for secure boot to stop unauthorized code from running —  protects against **rootkits** and **malware**
* _Example_**:**&#x20;
  * A business uses `Windows` machines with secure boot
  * If an employee tries to install unauthorized software, secure boot blocks it, keeping the system safe
* _Scenario_**:**&#x20;
  * A government agency uses secure computer boot to prevent unauthorized software&#x20;
    * ensure only approved programs run &#x20;
    * protect sensitive data



**2. `TPM`: Trusted Platform Module**&#x20;

* `TPM` is a hardware component that provides RoT for secure storage and key management
* It is used in PCs, servers, IoT devices to ensure platform integrity and protect sensitive data
* _Example_**:**&#x20;
  * On a `Windows` PC with `BitLocker` encryption, `TPM` checks the system's integrity and the keys to unlock the drive
  * It ensures that the data remains safe only if the system is secure
* _Scenario_**:**&#x20;
  * A corporate laptop with TPM protects sensitive client data
  * If the laptop is stolen, the encryption keys in the TPM keep the data locked and inaccessible without the right authentication



**3. IoT Security**

* Secures communication and firmware updates for IoT devices
  * manufacturers build secure elements into their devices&#x20;
* _Example_**:**&#x20;
  * Smart home devices use RoT to check the integrity and authenticity of firmware updates before applying them
* _Scenario_**:**&#x20;
  * A smart thermostat uses RoT to verify that firmware updates are from the manufacturer
  * If a hacker tries to push a malicious update, the thermostat rejects it, keeping it secure and functional



