---
icon: link
---

# Certificate chains and Trust Models

## Certificate chains and Trust Models

> A **certificate chain** connects a certificate back to a trusted root CA: Certificate Authority&#x20;
>
> &#x20;        through one or more intermediate certificates,&#x20;
>
> &#x20;        forming a “<kbd>**chain of trust**</kbd>”

* systems validate an end-entity certificate by following the chain to the trusted root, confirming its legitimacy

{% hint style="info" %}
#### This **chain-based structure**&#x20;

╰┈➤ ensures that all certificates in the path align with the trust established by the root CA

╰┈➤ create a secure foundation for digital interactions
{% endhint %}



* **End-Entity certificate:** represents the individual, device, or server
* **Intermediate certificates:**&#x20;
  * signed by the root CA
  * help scale and manage trust within the system
* **Root certificate:**&#x20;
  * trusted anchor in the certificate chain
  * widely recognized by browsers and systems
