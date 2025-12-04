---
icon: scale-balanced
---

# Symmetric Encryption Algorithms

## Symmetric Encryption Algorithms



#### **`AES`**: Advanced Encryption Standard

* current standard in symmetric encryption
* high security & efficiency
* supports key lengths of 128, 192, 256 bits
* official replacement for `DES`

{% content-ref url="aes-advanced-encryption-standard.md" %}
[aes-advanced-encryption-standard.md](aes-advanced-encryption-standard.md)
{% endcontent-ref %}

#### **`DES`**: Data Encryption Standard

* original encryption standard
* now considered insecure due to advancements in computing power
* **`3DES`** enhances `DES` by applying the encryption process 3 times with different keys
  * slower than `AES`

{% content-ref url="../../symmetric-encryption-algorithms/des-data-encryption-standard.md" %}
[des-data-encryption-standard.md](../../symmetric-encryption-algorithms/des-data-encryption-standard.md)
{% endcontent-ref %}

#### **`Blowfish`**

* an alternative to `AES`
* fast & efficient&#x20;
* flexible symmetric cipher with variable key lengths ranging from 32 to 448 bits
  * adaptable to various security needs

#### **`RC4`**: Rivest Cipher 4

* stream cipher that encrypts data one bit or byte at a time
* Known for simplicity & speed

#### **`ChaCha20`**

* modern stream cipher&#x20;
* a secure, efficient alternative to `RC4`   &#x20;



#### Comparison of DES & AES

<figure><img src="../../../.gitbook/assets/AES-vs-DES-encryption-workflow.svg" alt="" width="563"><figcaption><p>DES vs AES Encryption Workflows</p></figcaption></figure>

<table><thead><tr><th width="141.19921875">Feature</th><th width="268.359375">DES</th><th>AES</th></tr></thead><tbody><tr><td>Key size</td><td>56 bits</td><td>128, 192, 256 bits — flexible security levels</td></tr><tr><td>Block size </td><td>64 bits</td><td>128 bits</td></tr><tr><td>Security</td><td>vulnerable to brute-force attacks </td><td>considered very secure</td></tr><tr><td>Rounds</td><td>16</td><td>10, 12, 14 (depending on key size)</td></tr><tr><td>Current usage</td><td>mostly retired</td><td>widely used across industries</td></tr></tbody></table>



## Applications of Symmetric Encryption Algorithms

<table><thead><tr><th width="262.3203125">Symmetric Encryption Algorithm</th><th>Applications</th></tr></thead><tbody><tr><td><code>AES</code></td><td><ul><li><p>for robust data protection</p><ul><li>encrypts data in secure storage solutions — hard drives, cloud storage</li></ul></li><li>high speed applications</li><li><p>Internet protocols</p><ul><li>secures <strong><code>SSL</code>/<code>TLS</code> and <code>VPN</code> traffic</strong></li></ul></li><li><p>Mobile and IoT Devices </p><ul><li>optimize performance of AES supports secure data transmission in resource-constrained environments</li></ul></li><li>industries: finance, healthcare, government</li></ul></td></tr><tr><td><code>DES</code></td><td>— retired — </td></tr><tr><td><code>3DES</code></td><td><ul><li><p>where speed is critical</p><ul><li>password hashing</li><li>software and hardware environments</li></ul></li></ul></td></tr><tr><td><code>RC4</code></td><td><ul><li>where processing time is critical, despite vulnerabilities</li><li>not recommended for highly secure applications</li></ul></td></tr><tr><td><code>ChaCha20</code></td><td><ul><li><p>especially effective in mobile &#x26; embedded devices</p><ul><li>where performance &#x26; low latency are essential</li></ul></li></ul></td></tr></tbody></table>

