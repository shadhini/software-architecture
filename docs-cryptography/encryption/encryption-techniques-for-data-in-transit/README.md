---
description: Transport and Communication Encryption
icon: arrow-down-up-lock
---

# Encryption Techniques for data in transit

## Encryption Techniques for data in transit

> **Transport and Communication Encryption**
>
> &#x20;    — protects data traveling from sender to recipient  —&#x20;
>
> **goals:**
>
> * protect data
> * ensure confidentiality & integrity
> * enable user authentication

**Threats during transmission**

* eavesdropping
* interception
* tampering



### `SSL`/`TLS`

> Secure Sockets Layer & Transport Layer Security protocols (successor of SSL)

* secure browsers
  * the **`HTTPS`** in your browser's address bar encrypts the data sent between your browser and the website
  * protects against interception during transmission
* `SSL` & `TLS` are standalone protocols

<div align="left"><figure><img src="../../.gitbook/assets/HTTPS.svg" alt="" width="100"><figcaption></figcaption></figure></div>

{% content-ref url="tls-transport-layer-security.md" %}
[tls-transport-layer-security.md](tls-transport-layer-security.md)
{% endcontent-ref %}

{% content-ref url="ssl-secure-sockets-layer.md" %}
[ssl-secure-sockets-layer.md](ssl-secure-sockets-layer.md)
{% endcontent-ref %}



### `IPsec`: Internet Protocol Security

* `TLS` does not secure public networks, although it secures web traffic
* `IPsec` ensures data privacy across any public networks&#x20;

{% content-ref url="ipsec-internet-protocol-security.md" %}
[ipsec-internet-protocol-security.md](ipsec-internet-protocol-security.md)
{% endcontent-ref %}



### `VPN`s: Virtual Private Networks

* `IPsec` needs `VPN` to secure data transmission effectively

{% content-ref url="vpns-virtual-private-networks.md" %}
[vpns-virtual-private-networks.md](vpns-virtual-private-networks.md)
{% endcontent-ref %}



### Email Encryption

* ensures only the authorized recipient can access the content of the email
* protect business communications

**`PGP`**`: Pretty Good Privacy` | **`S/MIME`**`: Secure Multipurpose Internet Mail Extensions`&#x20;





## Limitations & Challenges: Transport and Communication Encryption



* **Computational Overhead**
  * encrypting and decrypting data introduces additional computational overhead
  * impacts network performance
    * particularly when handling large volumes of data
* **Managing Encryption Keys**
  * essential to store and transmit encryption keys securely
  * improper handling/transmission of keys → expose system to potential vulnerabilities & attacks
* **Outdated Protocols**
  * not all systems/ legacy applications can support the latest encryption protocols
  * using outdated protocols (e.g: `SSL`) can create security gaps and compromise the system's integrity
* **Improper Configuration**
  * event the most robust encryption protocols can still be vulnerable, if these protocols are not properly configured  or older versions of TLS remain in use&#x20;
  * attacker may exploit inherent flaws to breach security



