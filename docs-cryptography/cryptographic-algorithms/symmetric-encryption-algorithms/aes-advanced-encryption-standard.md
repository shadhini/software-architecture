---
icon: circle-a
---

# AES: Advanced Encryption Standard

## `AES`: Advanced Encryption Standard

> a **block cipher** that processes data in **128-bit blocks**&#x20;

{% hint style="success" %}
Serves as the **global primary symmetric encryption standard**.
{% endhint %}

* proves strong security & efficiency&#x20;



### How it works

* processes 128-bit data blocks
* supports 3 key sizes: 128-bit | 192-bit | 256-bit

{% hint style="warning" %}
**Different initialization vectors (IVs)** results in **different ciphertexts**&#x20;

with same plaintext, same encryption algorithm, same encryption key.
{% endhint %}

<figure><img src="../../.gitbook/assets/AES.svg" alt="" width="563"><figcaption></figcaption></figure>

**Stage 1: Key expansion**

* generates multiple round keys from the original encryption key
* provide a unique key for each encryption round

**Stage 2: Rounds of encryption**

* depending on the key size, AES performs 10/12/14 rounds

<table><thead><tr><th width="182.4921875">R: number of rounds </th><th width="148.6484375">Cipher Key Size</th></tr></thead><tbody><tr><td>10</td><td>128</td></tr><tr><td>12</td><td>192</td></tr><tr><td>14</td><td>256</td></tr></tbody></table>

* Each round includes several steps
  * **`SubBytes`**: substitute each byte using a lookup table
  * **`ShiftRows`**: shift rows to increase diffusion
  * **`MixColumns`**: scramble columns through matrix multiplication
  * **`AddRoundKey`**: XORs the round key with the data block

**Stage 3: Final round**

* completes encryption
* skip the `MixColumns` step, but apply all other operations
* produces ciphertext



### Security of AES

* highly secure with sufficient key lengths
  * no known practical attacks when used with sufficient key lengths&#x20;
* resistant to attacks — due to complex substitutions & permutations&#x20;



### Benefits of AES

* provides robust protection&#x20;
* ensures reliability for secure applications&#x20;
* supports flexible key sizes: 128-bit | 192-bit | 256-bit
  * each key size allows different levels of security to meet diverse application needs
* optimized for speed and efficiency
* handles large volumes of data efficiently&#x20;





















