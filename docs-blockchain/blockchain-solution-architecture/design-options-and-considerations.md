---
icon: list-ol
---

# Design Options & Considerations

## Design Options

<table data-header-hidden><thead><tr><th></th></tr></thead><tbody><tr><td><pre><code>BLOCKCHAIN NETWORK
--------------------
ACCESS LAYER (Public/Private) 
PARTICIPATION (Permissioned/Permissionless) 
GOVERNANCE (DAO/Consortium/Hybrid)
DATA LAYER (On-Chain/Off-Chain)
</code></pre></td></tr><tr><td><p>When evaluating a blockchain:</p><ol><li><strong>Can anyone read the data?</strong> → <code>Public</code>/<code>Private</code></li><li><strong>Can anyone become a validator?</strong> → <code>Permissionless</code>/<code>Permissioned</code></li><li><strong>Who governs it?</strong> → <code>DAO</code>/<code>Consortium</code>/<code>Hybrid</code></li><li><strong>Does it mix public/private elements?</strong> → <code>Hybrid</code></li><li><strong>Where is data stored/processed?</strong> → <code>On-chain</code>/<code>Off-chain</code></li></ol></td></tr></tbody></table>



### Public vs. Private vs. Hybrid Blockchain

✅ need to strike the right balance between private and public blockchains&#x20;

* trade-offs: data privacy, control, access
* public blockchains: expose sensitive data to the public
* private blockchains: limited decentralization



### Permissioned vs Permissionless Blockchains

* permissioned
  * **identity** of users  **known**
  * roles and permissions can be set and enforced
  * group consensus — customizable, configurable
    * participants consensus model
  * not fully decentralized — some centralized parts
* permissionless
  * identities are **pseudo anonymous:** transactions are linked to wallet addresses (not real names), but all actions by that address can be tracked
  * modern platforms allow for zero knowledge proofs to leave data on-chain

### Pure vs Hybrid

* pure:&#x20;
  * store everything on the permanent ledger including smart contracts
    * updates/deletes NOT supported
  * **waterfall** methodologies&#x20;
*   hybrid

    * combine permanent ledgers and databases together
    * smart contracts are usually stored in a traditional database&#x20;
      * updates/deletes are supported
    * **agile/iterative** development cycles



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
  * secure
  * transaction hashes as proofs of existence
* **on-chain, off-chain hybrid mashups**
  1. `Database —  primary` | `Blockchain —  secondary`
     * centralized database: bulk data, sensitive data
     * blockchain:&#x20;
       * proofs/markers/proofs of existence/zero knowledge hash proofs of that data such as transaction hashes, cryptographic hashes
       * use blockchain for other specific specialized transactions, verifications, queries&#x20;
       * can be used to confirm that data hasn't been changed since it's initial commitment&#x20;
  2. `Blockchain —  primary` | `Database —  secondary`
     * copy data from blockchain to a database for using existing tools for reporting, analysis, dashboarding, query analysis cubes&#x20;
     * no need to worry about keeping database copy of the ledger in sync — we have the implicit guarantee that the original source (blockchain) is never going to change

### Layer 0, 1, 2, 3 Platforms

Metaphor: with respect to PC

* network of blockchains ➝ Layer 0
* OS ➝ Layer 1&#x20;
* API ➝ Layer 2
  * **`state channels`**:  blockchain ledger + off-chain transactional channel for bulk data
  * **`sidechains`**: main chain for main data + cheaper, more performant side chain for supporting data
  * **`rollups`**: main ledger with proof of what happened on side ledger + side ledger
* Application Layer (where you are actually building) ➝ Layer 3



### Governance Model

* Consortium Model - Private permissioned blockchains
* DAO Model - Public blockchains
* Hybrid Model

{% content-ref url="../governance/blockchain-governance-models.md" %}
[blockchain-governance-models.md](../governance/blockchain-governance-models.md)
{% endcontent-ref %}

### Guiding Principles

* Feature-Heavy vs Feature-Light
* Security vs Collaboration
* Consistent vs Custom User Experience



## Design Considerations

decide assets, participants, transactions, queries & events of the system

### Mashups

seamless communication between different platforms&#x20;

* public, private, permissioned, permissionless & hybrid blockchains — different blockchain platforms
* blockchain and legacy system integration&#x20;
  * legacy: client-server
  * blockchain: peer-to-peer
* **on-chain, off-chain hybrid mashups**



### Balances Required

* decentralization & the need for control and centralized governance&#x20;
  * too much centralization → control by a few entities
  * excessive decentralization → inefficiencies, lack of accountability

{% hint style="warning" %}
- **Centralized** components always have an **owner/administrator** with more power.
- **Blockchain** components **do not**.
{% endhint %}

* on-chain & off-chain data — transparency & scalability — data security & interoperability
  * right balance between transparency & scalability
  * right balance between data security & interoperability

{% hint style="success" %}
#### Balancing Act

The adoption of blockchain technology in many sectors required a careful balance between&#x20;

* the benefits of on-chain data for security, immutability, transparency and&#x20;
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

