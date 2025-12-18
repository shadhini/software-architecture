---
icon: atom
---

# Quantum-Safe Encryption

## Quantum Threat

{% hint style="danger" %}
Every encrypted message you send today, could be decoded by quantum computers tomorrow.
{% endhint %}

> **Quantum computers**&#x20;
>
> * solve complex problems faster than traditional methods can handle
> * exposes vulnerabilities in current encryption



<table><thead><tr><th width="220.24609375">Encryption type</th><th>Quantum threat</th></tr></thead><tbody><tr><td><p><strong>Symmetric encryption</strong></p><p><code>AES</code>, <code>DES</code>, <code>Triple DES</code></p></td><td><strong><code>Grover's algorithm</code></strong> halves key strength, weakening security</td></tr><tr><td><p><strong>Asymmetric encryption</strong></p><p><code>RSA</code>, <code>ECC</code>, <code>Diffie-Hellman</code></p></td><td><strong><code>Shor's algorithm</code></strong> breaks encryption by solving mathematical problems efficiently</td></tr></tbody></table>

<table><thead><tr><th width="281.41796875">Cryptographic technique</th><th>Quantum threat</th></tr></thead><tbody><tr><td><p><strong>Digital signatures</strong> </p><p><code>RSA</code> based signatures,  <code>DSA</code>, <code>ECDSA</code>  </p></td><td>relies on asymmetric encryption → susceptible to quantum attacks</td></tr><tr><td><p><strong>Key exchange protocols</strong></p><p><code>Diffie-Hellman</code>, <code>ECDH</code></p></td><td>relies on algorithms that quantum computers can break → exposes sensitive communication </td></tr></tbody></table>



## Quantum-Safe Encryption&#x20;

aka <kbd>**Post-Quantum Cryptography**</kbd>

* uses advanced algorithms to resist quantum attacks



### Methods

<mark style="color:$primary;">**Lattice-based cryptography**</mark>

* solves complex mathematical problems like the **learning with errors problem**&#x20;
* make it highly resistant to quantum attacks — provides strong security
* supports efficient **encryption** and **digital signatures**&#x20;

<mark style="color:$primary;">**Hash-based cryptography**</mark>

* uses secure **hash functions** to generate digital signatures&#x20;
* simple and robust
* limited to **signing** and **verification** tasks&#x20;

<mark style="color:$primary;">**Code-based cryptography**</mark>

* relies on **decoding error-correcting codes**&#x20;
* algorithms like Michaelis have proven secure over time&#x20;
* remain **strong candidates** for post-quantum applications

<mark style="color:$primary;">**Multivariate polynomial cryptography**</mark>

* addresses symptoms of **multivariate quadratic equations**&#x20;
* resists quantum attacks effectively
  * this approach is **nearly impossible** for quantum computers **to solve** efficiently&#x20;
* supports **digital signatures** and **specialized applications**

<mark style="color:$primary;">**Isogeny-based cryptography**</mark>

* stands out for its **compact key sizes**&#x20;
* relying on the difficulty of **finding isogenies between elliptic curves**&#x20;
* suitable for **applications with limited bandwidth**&#x20;



### Adoption and Standardization

* **`NIST`: National Institute of Standards and Technology**
  * working on standardizing quantum-safe algorithms
* organizations implement **hybrid approaches** to ensure smooth transition
  * these methods combine classical encryption with quantum-safe algorithms  to balance current needs with future security



### Advantages

* **long term security**
  * provides lasting protection for sensitive data&#x20;
  * ensure that your data remains safe even as technology evolves
* **quantum decryption prevention**
  * prevents quantum computers from breaking today's encryption
  * protects stored or shared information
* **enhances trust and confidence in digital systems**
  * assure uses that their data and transactions are secure against emerging threats



### Applications

* secure communications
* data storage and archival&#x20;
* blockchain and cryptocurrencies
* IoT: Internet of things



### Challenges

* performance overhead
  * demand higher computational resources (processing power and other resources)
* compatibility
  * existing systems and protocols often require significant updates or replacements to support quantum-safe encryption
* adoption costs
  * involves substantial financial investment
    * transitioning to new algorithms



