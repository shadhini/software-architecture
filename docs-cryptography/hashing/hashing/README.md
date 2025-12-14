---
icon: hashtag
---

# Hashing

## Hashing

> **one-way process**
>
> input data (text, files) is transformed into **fixed-length** strings&#x20;
>
> uses a **mathematical** **hash** **function**
>
> hash value is unique to the input — serves as a **unique identifier**
>
> * &#x20;even small change in the input create entirely different hashes

<figure><img src="../../.gitbook/assets/hashing.svg" alt="" width="563"><figcaption></figcaption></figure>



**Example Use Case: setting passwords in platforms**

* platform doesn't store the actual password&#x20;
* passwords are hashed and stored
* when password is entered again, the hashed password is compared with the stored hash to verify the password

**This process can be used to**&#x20;

* ensure data integrity
* secure password storage&#x20;
* enable reliable verification



### Hashing Algorithms

> turn plaintext to **unique, fixed-length** string of characters; **fingerprint**&#x20;
>
> &#x20;     called **hash**

#### `MD5`: Message Digest Algorithm 5

{% content-ref url="md5-message-digest-algorithm-5.md" %}
[md5-message-digest-algorithm-5.md](md5-message-digest-algorithm-5.md)
{% endcontent-ref %}

#### SHA Family Algorithms

{% content-ref url="sha-family-algorithms.md" %}
[sha-family-algorithms.md](sha-family-algorithms.md)
{% endcontent-ref %}



### Applications

* Data integrity
  * verifies data integrity during transmission by comparing hash values before and after transfer
* Digital signatures
  * hashing ensures authenticity by encrypting hashed data with a private key
* Password storage&#x20;
  * compares user input hashes with stored hashes&#x20;
* Blockchain
  * hashing (e.g: SHA-256) links blocks securely and maintains the integrity of cryptocurrency transactions
* File verification
  * matching downloaded file hashes with published ones&#x20;
  * helps detect tampering



