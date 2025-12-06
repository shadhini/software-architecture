---
icon: table-cells-lock
---

# PKI: Public Key Infrastructure

## `PKI`: Public Key Infrastructure

> framework designed to **manage encryption keys & digital certificates**&#x20;
>
> ensure
>
> ✅ secure communication
>
> ✅ authentication of identities

### Mode of Operation

* relies on **`CA`s**: **Certificate Authorities** to issue digital certificates which verifies the identity of users, devices, services&#x20;
  * e.g: when you visit a secure HTTPS website, the site presents a certificate issues by a trusted CA to confirm its legitimacy



### Trust Models

#### Hierarchical Model&#x20;

* a central **`Root CA`** issues certificates to `subordinate CA`s
* `Subordinate CA`s, then distribute certificates to end-users&#x20;
* ensure organized & structured trust management

#### Web of Trust

* a decentralized model where users trust each other directly
* often used in environments like `PGP`

#### Hybrid Model

* combine elements of hierarchical and web od trust models
* offers flexibility and structure&#x20;
* ideal for enterprise environments that need both organization and adaptability









