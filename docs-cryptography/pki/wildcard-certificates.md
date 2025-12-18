---
icon: asterisk
---

# Wildcard Certificates

## Wildcard Certificates

> secure a domain and its **subdomains**; doesn't cover root domain
>
> uses a **wildcard character**, typically an asterisk (<kbd>**\***</kbd>), in the **`Common Name (CN)`** field to indicate that the certificate applies to all subdomains

when a user connects to a subdomain secured by a wildcard certificate, the web server presents the certificate during the SSL/TLS handshake process



E.g: a wildcard certificate issued for **`*.example.com`**&#x20;

* it would secure: `www.example.com`, `blog.example.com`, `shop.example.com`, `mail.example.com`
* Note: Unless specifically included, it might not secure `example.com` itself — the root domain



#### Advantages&#x20;

* **Cost-effective solution:**&#x20;
  * eliminate the need to purchase a separate certificate for every sub-domain
* **Easy management:**&#x20;
  * managing a single wildcard certificate is easier than handling multiple individual certificates
  * this simplification streamlines the renewal process and reduces administrative overhead
* **Flexibility:**&#x20;
  * provide flexibility for future subdomains
  * a new subdomain automatically falls under the protection of the existing wildcard certificate without needing a new certificate
* **Time-effective solution:**&#x20;
  * the issuance and renewal process is faster when dealing with one certificate than several
  * benefits organizations that frequently add or modify subdomains



#### **Limitations**&#x20;

* **Security risks:**&#x20;
  * wildcard certificate operates on a private key for each domain, which, when compromised, leads to vulnerabilities on all sub-domains
  * the private key needs to be secured at all costs
* **Limited coverage:**&#x20;
  * a wildcard certificate only covers the root domain if explicitly stated
  * organizations must obtain a separate certificate for the root domain
* **Single domain scope:**&#x20;
  * wildcard certificates only secure subdomains of a single domain
  * if a business operates multiple distinct domains, it will require separate wildcard certificates for each domain
* **Trust breach:**&#x20;
  * as wildcard certificates cover multiple subdomains, if one subdomain is untrustworthy, it may reflect poorly on the entire domain



