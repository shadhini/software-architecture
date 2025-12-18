---
icon: house-signal
---

# OCSP: Online Certificate Status Protocol

## `OCSP`: Online Certificate Status Protocol

> **enable real-time verification of digital certificates**
>
> * allows users to check whether a certificate is valid or revoked by the CA: certificate authority that issued it



### How OCSP works

<figure><img src="../.gitbook/assets/OCSP.svg" alt="" width="563"><figcaption></figcaption></figure>

* When a client, such as a web browser, encounters a digital certificate during a secure connection
  1. client receives the SSL/TLS certificate from the server
  2. client sends an OCSP request to **OCSP responder**; **typically operated by the issuing CA**
  3. the OCSP responder verifies the certificate status
     * good | revoked | unknown
  4. the OCSP sends a signed response to the client&#x20;
     * which includes status, validity period, a digital signature to ensure authenticity
  5. based on the OCSP response, the client determines the next step
     * certificate is valid → secure connection proceeds
     * certificate is revoked → connection is terminated&#x20;



### Advantages

* **real-time status checking**
  * before establishing secure connections
  * ensures timely revocation information
    * critical requirement in financial transactions
* **reduced latency**
  * faster status checks by querying the status of a specific certificate&#x20;
    * reduces connection delays
  * CRLs require downloading large lists of revoked certificates&#x20;
* **less bandwidth consumption**
  * OCSL only transmits the status of a specific certificate rather than a full list of revoked certificates
  * more efficient for online applications —  specially in high-traffic environments
*   **scalability**

    * designed to handle a high volume of requests&#x20;
    * ideal for environments with multiple users and devices&#x20;



### Challenges

* **availability and reliability**
  * risks of OCSP responder unavailability
  * if responder is down or unreachable → may lead to  connection failures
* **privacy concerns**
  * OCSP requests can expose browsing activities to the OCSP responder
  * implementations such as **`OCSP stapling`** mitigate this by allowing servers to include responses in the SSL/TLS handshake&#x20;
* **performance bottlenecks**
  * in high-traffic environments, OCSP responders can be overloaded
  * causes latencies or response failures&#x20;
  * **`load balancing`**, **scaling solutions** → essential for maintaining performance





