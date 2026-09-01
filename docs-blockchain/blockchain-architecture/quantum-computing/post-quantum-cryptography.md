---
icon: hashtag-lock
---

# Post-Quantum Cryptography

## Post-Quantum Cryptography

> **Quantum-Resistant Cryptographic Algorithms**
>
> **goal**: resist attacks from classical + quantum computers



#### Post-Quantum Cryptographic Families

* <mark style="color:$success;">**Lattice-Based**</mark>: relies on hard lattice vector problems (e.g: <kbd>Kyber</kbd>, <kbd>NTRUEncrypt</kbd>)
* <mark style="color:green;">**Code-Based**</mark>: uses error-correcting codes (e.g: <kbd>McEliece</kbd>)
* <mark style="color:green;">**`MPKC`**</mark><mark style="color:green;">**: Multivariate Polynomial**</mark>: solves complex multivariate polynomial equations (e.g: <kbd>Rainbow signature</kbd> scheme)
* <mark style="color:green;">**Hash-Based**</mark>: uses cryptographic hashes for signatures (e.g: <kbd>XMSS</kbd>)
* <mark style="color:green;">**Post-Quantum RSA**</mark>: employs significantly larger key sizes at the cost of lower efficiency
* <mark style="color:green;">**`QKD`**</mark><mark style="color:green;">**: Quantum Key Distributions**</mark>: a hardware/physical protocol (e.g: <kbd>BB84</kbd>) preventing eavesdropping



#### Selection Criteria of Quantum-resistant Algorithms for Blockchain Applications

{% hint style="success" %}
#### Tradeoffs: Selection of Quantum-resistant Algorithms for blockchain applications&#x20;

Choice =&#x20;

⚖️ balance between: **security ⇄ performance ⇄  readiness of cryptographic** **standards  ⇄** blockchain fit
{% endhint %}

Multiple Post Quantum Cryptographic families&#x20;

&#x20;╰┈➤ different strengths / weaknesses



Quantum-resistant Algorithms have varying levels of&#x20;

* practicality
* efficiency&#x20;
* adoption&#x20;



✅ Continuous research & collaboration required to identify and implement the most suitable quantum-resistant encryption solutions for blockchain networks

