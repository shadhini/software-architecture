---
icon: square-d
---

# DH: Diffie-Hellman Key Exchange Protocol

## `DH`: Diffie-Hellman Key Exchange Protocol

> establishes shared secret over an insecure channel
>
> * avoid direct exchange of secret key

* developed in the 1970s by `Diffie` and `Hellman`



### How DH key exchange protocol creates a secure, shared secret key between 2 parties

<figure><img src="../../.gitbook/assets/DH-key-exchange-protocol.svg" alt="" width="563"><figcaption></figcaption></figure>

**Step 1: Public values**

* both parties agree on 2 public values — `a prime number` & `a base`
* share these values openly&#x20;

**Step 2: Private selection**

* each party selects a private number
* keep it confidential

**Step 3: Exchange of public information**

* each party computes a value using their private number and the public values
* send this calculated value to the other party

**Step 4: Shared secret generation**

* each party combines the other party's received value with their private number to calculate the shared secret key
* this shared secret key enables them to encrypt any further communication securely&#x20;



### Limitations

* **man-in-the-middle attack:** risk of impersonation
  * attacker could intercept the public values exchanged and impersonate of of the parties

<figure><img src="../../.gitbook/assets/DH-man-in-the-middle.svg" alt="" width="375"><figcaption></figcaption></figure>

* **computational intensity:** high processing power



