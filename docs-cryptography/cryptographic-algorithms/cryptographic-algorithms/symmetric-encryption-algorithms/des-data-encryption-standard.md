---
icon: circle-d
---

# DES: Data Encryption Standard

## `DES`: Data Encryption Standard

* early symmetric encryption algorithm
* laid the groundwork for future encryption

{% hint style="danger" %}
`DES` is now **outdated** due to security vulnerabilities !
{% endhint %}



### How it works&#x20;

* operates with a **56-bit key** to encrypt data in **64-bit blocks**

<figure><img src="../../../.gitbook/assets/DES.svg" alt="" width="563"><figcaption></figcaption></figure>

**Stage 1: Initial permutation**

* rearranges data bits
  * improves diffusion[^1]&#x20;
  * prepare it for the encryption rounds

**Stage 2: 16 rounds of encryption**

* in each round, data bits undergo **substitution & permutation** — transform the data through mathematical operations&#x20;
  * reinforce security

**Stage 3: Final permutation**

* produces encrypted output — ciphertext
* completes DES encryption



### Vulnerabilities in DES security

* 56-bit key vulnerable to **brute-force** attacks
* inadequate with modern computing power



### Current Relevance

* retired from security-sensitive applications
* replaced by stronger encryption standards



### Limitations

* short key length&#x20;
* 56-bit key breakable within hours&#x20;

╰┈➤ outdated security

╰┈➤replaced by secure algorithms











[^1]: the spreading of something more widely
