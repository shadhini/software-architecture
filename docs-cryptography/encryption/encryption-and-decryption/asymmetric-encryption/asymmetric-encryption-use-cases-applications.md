---
icon: chart-user
---

# Asymmetric Encryption: Use Cases / Applications

## Use Cases / Applications

{% hint style="success" %}
Particularly useful for **secure communications** & **key exchange**.
{% endhint %}

<table><thead><tr><th width="219.09765625"></th><th>Applications</th></tr></thead><tbody><tr><td>Secure communication: <code>SSL</code> &#x26; <code>TLS</code></td><td><ul><li>establish <strong>secure connections over</strong> the internet/<strong>open networks</strong> (between web servers and clients) to securely share information <strong>without exposing sensitive keys</strong> </li></ul><p>✅ secure, authenticated, &#x26; verified communication<br></p><p>secure online transactions</p><ul><li>e-commerce purchases, bank transfers, other private communications</li></ul></td></tr><tr><td>Digital signatures and certificates</td><td><ul><li>verify the authenticity and integrity of a message/document/software</li></ul><p>✅ message/file truly comes from the claimed sender </p><p>✅ message/file has not been altered </p><p></p><ul><li>where document authenticity is critical</li><li>software distribution, legal contracts </li></ul></td></tr><tr><td>Email encryption systems: <code>PGP</code></td><td><ul><li>protect email content </li></ul><p>✅ only the intended can access the message </p><p></p><ul><li>commonly used by individuals/organizations prioritizing secure communications</li></ul></td></tr><tr><td>Cryptocurrencies and blockchain</td><td><ul><li>allows secure, verifiable, irreversible transactions without relying on centralized authorities</li></ul><p>✅ ensures the validity of transactions  </p><p>✅ maintains the privacy of user identities</p><p></p><ul><li><code>Bitcoin</code>:  use ECC-based asymmetric encryption to create secure transactions</li></ul></td></tr><tr><td>Authentication systems</td><td><ul><li><p>secure logins</p><ul><li>in <code>MFA</code>: multi-factor authentication systems</li><li>in <code>SSO</code>: Single Sign-On  systems</li></ul></li><li><p>modern access control systems</p><ul><li>secure access to company resources, government systems, cloud services</li></ul></li></ul></td></tr></tbody></table>



### **Secure communication: `SSL`** **&** **`TLS`**

#### **How it works:**&#x20;

* When a client (such as a browser) connects to a secure server, the server shares its public key through an SSL/TLS certificate
* The client then uses this public key to encrypt a shared session key, which is used for fast, symmetric encryption of the actual data
* Only the server can decrypt the session key with its private key



### **Digital signatures and certificates**

#### **How it works:**&#x20;

<figure><img src="../../../.gitbook/assets/digital-signatures.svg" alt="" width="375"><figcaption></figcaption></figure>

* A digital signature is created by encrypting a message hash with the sender's private key
* The recipient, using the sender's public key, can verify the signature by decrypting it and matching it with the computed hash of the message



### **Email encryption systems**

#### **`PGP`: Pretty Good Privacy**&#x20;

**How it works:**&#x20;

* PGP encrypts email messages with the recipient's public key
  * ensuring only recipient can decrypt it with their private key
*   PGP can be used to sign emails

    * provide sender verification



### **Cryptocurrencies and blockchain**

#### **How it works:**&#x20;

* A cryptocurrency transaction is signed using the private key of the owner's wallet
* The network nodes then verify the transaction using the associated public key
  * confirm ownership & authenticity



### **Authentication systems**

#### **How it works:**&#x20;

* During login, a user's device or app encrypts a unique piece of data (often called a "**verification request**") using the server's public key
* The server then uses its private key to decrypt this data
  * confirming the identity of the device and establishing a secure, trusted connection





