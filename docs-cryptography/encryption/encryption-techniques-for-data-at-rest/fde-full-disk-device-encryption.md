---
icon: laptop-binary
---

# FDE: Full Disk/Device Encryption

## `FDE`: Full Disk/Device Encryption&#x20;

> **encrypts entire devices: hard drives, laptops, desktops**

* protect data if a device is lost
* particularly beneficial for portable devices: laptops&#x20;
* requires authentication via decryption key before access

`Windows BitLocker` | `macOS FileVault`&#x20;

### Model of Operation

<figure><img src="../../.gitbook/assets/full-disk-encryption.svg" alt="" width="375"><figcaption></figcaption></figure>



* encrypts every section of the device
  * all data including the operating system, system files, applications, user data
* when the system boots, it prompts the user for a password/encryption key
  * without this key, the data i the device is inaccessible
* data is decrypted and encrypted **during read and write operations** when the device is being used&#x20;



### Strengths

* offers comprehensive protection for devices
* provides robust security across the board
* once authenticated, users experience seamless data access — highly user-friendly
* safeguards data in case of loss



### Limitations

* presents a single point of failure
  * if the encryption key is lost, all data on the disk becomes permanently inaccessible
* real-time encryption and decryption during read and write operations can cause slight performance degradation







