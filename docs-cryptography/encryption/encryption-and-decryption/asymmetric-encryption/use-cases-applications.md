---
icon: chart-user
---

# Use Cases / Applications

## Use Cases / Applications

{% hint style="success" %}
Particularly useful for secure communications & key exchange.
{% endhint %}

### **Secure communication: `SSL`** **&** **`TLS`**

> Secure Sockets Layer & Transport Layer Security protocols (successor of SSL)

* relies on asymmetric cryptography to ensure that data transmitted over the internet — between web servers and clients — remains private & secure
  *   establish **secure connections over** the internet/**open networks** to securely share information **without exposing sensitive keys**&#x20;

      ✅ secure, authenticated, and verified communication

#### **How it works:**&#x20;



* When a client (such as a browser) connects to a secure server, the server shares its public key through an SSL/TLS certificate
* The client then uses this public key to encrypt a shared session key, which is used for fast, symmetric encryption of the actual data
* Only the server can decrypt the session key with its private key

#### **Applications:**&#x20;

* enables secure online transactions
  * e-commerce purchases, bank transfers, other private communications



### **Digital signatures and certificates**

* use asymmetric encryption to verify the authenticity and integrity of a message/document/software
  * ensure that a message/file truly comes from the claimed sender and has not been altered

#### **How it works:**&#x20;

<figure><img src="../../../.gitbook/assets/digital-signatures.svg" alt="" width="375"><figcaption></figcaption></figure>

* A digital signature is created by encrypting a message hash with the sender's private key
* The recipient, using the sender's public key, can verify the signature by decrypting it and matching it with the computed hash of the message

#### **Applications:**&#x20;

* widely used in&#x20;
  * software distribution, legal contracts, other scenarios where document authenticity is critical



### **Email encryption systems**

#### **`PGP`: Pretty Good Privacy**&#x20;

* use asymmetric key encryption to protect email content ensuring that only the intended can access the message

**How it works:**&#x20;

* PGP encrypts email messages with the recipient's public key
  * ensuring only recipient can decrypt it with their private key
* PGP can be used to sign emails
  * provide sender verification



**Applications:**&#x20;

PGP&#x20;

* enhances privacy for sensitive communications
  * commonly used by individuals/organizations prioritizing secure communications



### **Cryptocurrencies and blockchain**

In blockchain systems, asymmetric encryption&#x20;

* ensures the validity of transactions &#x20;
* maintains the privacy of user identities

`Bitcoin`:  use ECC-based asymmetric encryption to create secure transactions

#### **How it works:**&#x20;

* A cryptocurrency transaction is signed using the private key of the owner's wallet
* The network nodes then verify the transaction using the associated public key
  * confirm ownership & authenticity

#### **Applications:**&#x20;

* in blockchain applications&#x20;
  * allows secure, verifiable, irreversible transactions without relying on centralized authorities



### **Authentication systems**

use asymmetric encryption for&#x20;

*   secure logins

    * in `MFA`: multi-factor authentication
    * in `SSO`: Single Sign-On&#x20;

    systems

#### **How it works:**&#x20;

* During login, a user's device or app encrypts a unique piece of data (often called a "**verification request**") using the server's public key
* The server then uses its private key to decrypt this data
  * confirming the identity of the device and establishing a secure, trusted connection

#### **Applications:**&#x20;

* modern access control systems
  * secure access to company resources, government systems, cloud services

