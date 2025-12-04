---
icon: magnifying-glass-chart
---

# Cryptanalysis

## Cryptanalysis

> study and practice of analyzing and breaking cryptographic algorithms
>
> * **`cryptographers`** — work to secure data
> * **`cryptanalysts`** — seek to find weaknesses in these defences
>   * rigorously test algorithms against potential attacks
>   * improve encryption techniques by exposing flaws and vulnerabilities
>   * make secure communication systems more robust against attacks
>   *

{% hint style="info" %}
#### Breaking the **`Enigma`** **machine** **code** used by Germany during World War II

— one of the most famous achievements in cryptanalysis —&#x20;

* enabled the Allies to decode intercepted Enigma messages and gain a vital strategic advantage
* British cryptanalysts, including Alan Turing
{% endhint %}

{% hint style="info" %}
#### **Linear and differential cryptanalysis**

Mathematical methods to exploit statistical patterns in block ciphers
{% endhint %}



### Cryptanalytic Attacks

> **specifically designed to exploit weaknesses in cryptographic systems**



#### **Brute-force attacks**&#x20;

> involve systematically **attempting every possible key** until finding the correct one

* computationally intensive &#x20;
* impractical for strong encryption algorithms with large key sizes
  * `AES`: Advanced Encryption Standard &#x20;
  * brute-forcing 128-bit or 256-bit keys would take billions of years with modern encryption
* but, a feasible threat for weaker or shorter keys
  * a 4-digit PIN could be cracked by trying all combinations from 0000 to 9999

**Prevent brute-force attacks**

make guessing keys unfeasible

* using large key sizes &#x20;
* implementing measures like&#x20;
  * rate limits &#x20;
  * account lockouts after multiple failed attempts&#x20;



#### **Ciphertext-only attacks**&#x20;

> occur when the attacker only accesses the encrypted data (ciphertext) and&#x20;
>
> &#x20;   tries to **infer the encryption key or original message by analyzing patterns**

* works well against older or weaker ciphers with predictable patterns
* challenging with modern encryption algorithms

Example:

* a hacker intercepting encrypted emails may notice recurring patterns in greetings and use them to guess phrases



**Protect against Ciphertext-only attacks**

make it harder for attackers to detect patterns

* modern algorithms like **`AES`** — randomize ciphertext output&#x20;
* adding initialization vectors (`IV`s) — ensures that the same plaintext never produces identical ciphertext



#### **Known-plaintext attacks**&#x20;

> **using a piece of known plaintext and its corresponding ciphertext to deduce the key**
>
> happen when an attacker has **access to both plaintext and** its **corresponding ciphertext**
>
> ╰┈➤ allow them to **analyze** **how** specific **phrases are transformed** by the encryption algorithm
>
> ╰┈➤ this knowledge —  make it easier to deduce the key or decrypt other messages

Example:

* During WWII, cryptanalysts leveraged known-plaintext attacks by matching intercepted German messages with known phrases to reverse-engineer the encryption

**Mitigate Known-plaintext attacks**

limit patterns — making it harder for attackers to analyze and break the encryption

* frequent key rotation
* adding random padding to the plaintext&#x20;
* using stronger encryption algorithms&#x20;



#### **Chosen-plaintext attacks**&#x20;

> occur when attackers **access specific plaintext inputs** and **observe** their corresponding **ciphertext outputs**
>
> ╰┈➤ provide insight into the encryption algorithm

* especially relevant in cases where attackers can inject data they control, allowing them to analyze patterns in encrypted outputs
  * e.g:
    * in certain web applications,

**Prevent Chosen-plaintext attacks**

limit attackers' ability to influence plaintext inputs&#x20;

* using encryption modes like **`AES-GCM`** — add randomness to each encryption



#### **Side-channel attacks**&#x20;

> bypass the encryption algorithm and instead gather indirect data from a cryptosystem
>
> &#x20;   such as
>
> * timing
> * power consumption
> * electromagnetic emissions
>
> to deduce sensitive information like encryption keys

Example:

* timing differences in RSA decryption operations could reveal information about private keys

**Prevent side-channel attacks**&#x20;

safeguarding sensitive information from indirect observation

* randomizing processing times
* adding noise to power consumption&#x20;
* employing secure hardware to make such data harder to detect and analyze



#### **Frequency analysis**&#x20;

> **identifying patterns in ciphertext to infer plaintext**
>
> occurs when attackers analyze the frequency of letters or symbols in ciphertext to guess commonly used letters

Example:

* If an attacker intercepts a simple `Caesar cipher`, they may identify high-frequency letters in the ciphertext and map them to common letters like "E" or "T" — helps to break the code

**Make frequency analysis ineffective**

randomize output to prevent frequency analysis

* Modern encryption methods&#x20;
  * **`AES`** — operate on data blocks rather than individual letters



#### **Replay attacks**

> **intercepting** and **retransmitting** encrypted data to fool the system



#### Man-in-the-middle attacks

> intercepting and potentially altering communication between two parties



#### Cryptanalytic time-memory trade-off attacks

> reducing the computation time of brute-force attacks by using precomputed tables of possible keys





#### &#x20;
