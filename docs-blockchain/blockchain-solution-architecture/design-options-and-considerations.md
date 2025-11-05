---
icon: list-ol
---

# Design Options & Considerations

## Design Options

### ﻿﻿Public vs. Private vs. Hybrid Blockchain

✅ need to strike the right balance between private and public blockchains&#x20;

* trade-offs: data privacy, control, access
* public blockchains: expose sensitive data to the public
* private blockchains: limited decentralization

### On-chain solutions vs Off-chain Solutions vs Hybrid Mashups

* off-chain:&#x20;
  * centralized databases — efficient, data that needs constant updates&#x20;
    * coffee shop loyalty program
  * deletable — correct inaccuracies, delete when customer requests
  * data privacy regulations: GDPR
  * sensitive/personal data&#x20;
  * private transactions
  * scalable — bulk/large data
* on-chain:
  * blockchain — trust, transparency, when multiple parties need a shared, immutable source of truth
    * medical histories(healthcare), deed ownerships (real estate) — hybrid models with off-chain storage keep it scalable
    * when shared trust is critical — finance, healthcare, supply chain
  * immutable
  * transparent
  * transaction hashes as proofs of existence
* **on-chain, off-chain hybrid mashups**
  1. `Database —  primary` | `Blockchain —  secondary`
     * data on database; proofs or markers of that data such as cryptographic hashes on blockchain
     * sensitive data on database; transaction hashes or proofs of existence on blockchain
  2. `Blockchain —  primary` | `Database —  secondary`
     * copy data from blockchain to a database for using existing tools for reporting, analysis, dashboarding
     * no need to worry about keeping database copy of the ledger in sync — we have the implicit guarantee that the original source (blockchain) is never going to change

### Guiding Principles

* Feature-Heavy vs Feature-Light
* Security vs Collaboration
* Consistent vs Custom User Experience

### Governance Model

* Consortium Model - Private blockchains
* DAO Model - Public blockchains
* Hybrid Model

{% content-ref url="../governance/blockchain-governance-models.md" %}
[blockchain-governance-models.md](../governance/blockchain-governance-models.md)
{% endcontent-ref %}



## Design Considerations

decide assets, participants, transactions, queries & events of the system

### Mashups

seamless communication between different platforms&#x20;

* public, private & hybrid blockchains — different blockchain platforms
* blockchain and legacy system integration&#x20;
  * legacy: client-server
  * blockchain: peer-to-peer
* **on-chain, off-chain hybrid mashups**



### Balances Required

* decentralization & the need for control and centralized governance&#x20;
  * too much centralization → control by a few entities
  * excessive decentralization → inefficiencies, lack of accountability
* on-chain & off-chain data

{% hint style="success" %}
#### Balancing Act

The adoption of blockchain technology in many sectors required a careful balance between&#x20;

* the benefits of on-chain data for security and immutability and&#x20;
* the practicality of off-chain solutions for scalability

❗Finding the right balance is critical for successful blockchain integration.
{% endhint %}



### Scalability

* measurements to consider
  * transaction throughput
  * transaction latency
* do not fall victim to your own success — The `GovernMental` Attack
* transactions/participants increase — slower transaction speed, higher cost



### Economic Model & Incentive Mechanism

* economic model and incentives — must ensure participation and alignment of stakeholders' interests



## Risk Mitigation

* <mark style="color:$danger;">**Fire-Drill Model**</mark>
  * Have a plan in place for how you're going to deal with issues such as data breaches, attacks, regulation compliance checks, etc.. before they happen



## Deployment

**Go-Live**&#x20;

* do we go live all at once
* do we roll this solution out in phases

