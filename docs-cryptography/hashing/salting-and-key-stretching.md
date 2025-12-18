---
icon: salt-shaker
---

# Salting & Key Stretching

## Salting

> adds an extra layer of protection by **appending a unique, random string (`salt`)** to each password before it is hashed
>
> * prevent **rainbow table attacks**&#x20;

* makes it nearly impossible for attackers to use **rainbow tables** or other techniques to figure out the original password
* **even for identical passwords, the unique salts create different hashes**
  * even if the passwords of 2 users are identical,  an attacker must target each user's hashed password separately rather than using one cracked hash for multiple accounts

<figure><img src="../.gitbook/assets/salting.svg" alt="" width="563"><figcaption></figcaption></figure>



### Benefits of salting

* thwart **rainbow table attacks** by preventing attackers from relying on pre-computed tables by creating unique hash values for identical passwords
* prevent pattern recognition by generating unique hashes
  * makes it difficult for attackers to penetrate their defences
* force individualized computations by slowing down large-scale attacks



## Key Stretching

> run a system through **multiple rounds of hashing** to strengthen the overall security
>
> * defend against **brute-force** and **dictionary** **attacks**

* process is computationally intensive
* increase the time and resources required to brute-force a password

**Techniques:**&#x20;

KDFs:Key Derivation Functions — `PBKDF2`, `bcrypt`, `scrypt`



**Example: An attacker trying to brute-force a password hashed with a method that applies 4,096 rounds of hashing**

* it only takes a fraction of a second for the system to verify a password
* but it significantly slows down each guess for the attacker

╰┈➤ the additional processing time required for penetrating the password makes large-scale attacks much harder and more resource-intensive





### Benefits of key stretching

stretches the computational workload

* thwart rapid attacks by making each attempt computationally expensive&#x20;
  * hinder attackers who try to brute-force or dictionary attack passwords
* achieve configurable security by allowing algorithms to increase the number of iterations as technology improves
  * helps to maintain security

## Combined use of salting and key stretching

When a user creates an account,&#x20;

* the system generates a unique salt for that password
* then, it applies a key-stretching algorithm with the salt, hashing the password multiple times and generating a unique hash

{% hint style="success" %}
#### When combined, salting and key stretching offer the best defence

highly resistant to both rainbow table and brute-force attacks
{% endhint %}





