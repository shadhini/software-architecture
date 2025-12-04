---
icon: binary-lock
---

# Encryption & Decryption

## Encryption & Decryption

<figure><img src="../../.gitbook/assets/encryption_decryption.svg" alt=""><figcaption></figcaption></figure>

### Encryption

> transforms readable information into  an unreadable format&#x20;
>
> **`[ plain text ]` → `[ ciphertext ]`**
>
> ╰┈➤
>
> * make information inaccessible for those not authorized to access it
>   * even if someone intercepts the message, they won't be able to decipher the content without knowing the secret key



### Decryption&#x20;

> converts encrypted data into original readable format using a specific key or algorithm
>
> **`[ ciphertext ]` → `[ plain text ]`**





## Different Types of Encryption



#### Symmetric Encryption

{% content-ref url="symmetric-encryption/" %}
[symmetric-encryption](symmetric-encryption/)
{% endcontent-ref %}

#### Asymmetric Encryption

{% content-ref url="asymmetric-encryption/" %}
[asymmetric-encryption](asymmetric-encryption/)
{% endcontent-ref %}

#### Comparison: Symmetric Vs Asymmetric Cryptography

<table><thead><tr><th width="165.171875" valign="top">Aspect</th><th valign="top">Symmetric Cryptography</th><th valign="top">Asymmetric Cryptography</th></tr></thead><tbody><tr><td valign="top">Key requirement</td><td valign="top"><p>single shared key </p><ul><li>requires careful management of the shared key to stay secure</li></ul></td><td valign="top"><p>pair of keys (public &#x26; private) </p><ul><li>avoid key compromise</li></ul></td></tr><tr><td valign="top">Encryption speed</td><td valign="top">fast &#x26; efficient</td><td valign="top">slow</td></tr><tr><td valign="top">Ideal use cases</td><td valign="top"><ul><li>bulk encryption</li><li>real-time data</li></ul></td><td valign="top"><ul><li>key exchange</li><li>digital signatures</li></ul></td></tr><tr><td valign="top">Key distribution</td><td valign="top">requires secure sharing</td><td valign="top">public keys can be freely distributed</td></tr></tbody></table>



