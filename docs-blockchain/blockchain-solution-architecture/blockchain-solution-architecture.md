# 🌹 Blockchain Solution Architecture

## Blockchain Architecture

blockchain — chain of blocks

each block carries

* transaction data&#x20;
* a hash — immutable unless someone has breached the system&#x20;

blockchain — **distributed database**; stored across multiple nodes with each holding a full copy

cryptographic hash —  hash relationship

* core security feature of blockchain&#x20;
* every block contains the hash of the previous block

consensus — referee

layers function together

* application layer — DApps running&#x20;
* data layer — blocks&#x20;
* network layer — P2P network, communication & transaction propagation
* protocol layer

public/private key architecture

* private keys — ensures transaction integrity

smart contracts — automated condition-based transactions



{% hint style="warning" %}
benefits of blockchain; data integrity, security, fault tolerance, failover, redundancy

**come at the expense of speed, performance, and efficiency**
{% endhint %}



**blockchain application — 3 primary architectural layers**

* top layer — user interface layer
* middle layer — connect user interface to smart contracts&#x20;
* bottom layer — smart contracts running on the blockchain network

╰┈➤ thus changing the smart contract layer will result in needing to do corresponding changes to middle layer and top layer too&#x20;



## Designing Blockchain Systems

{% hint style="success" %}
**Blockchain’s value isn’t in the data it stores—it’s in the trust it builds.**
{% endhint %}

centralized databases — efficient, data that needs constant updates&#x20;

* coffee shop loyalty program

blockchain — trust, transparency, when multiple parties need a shared, immutable source of truth

* medical histories(healthcare), deed ownerships (real estate) — hybrid models with off-chain storage keep it scalable
* when shared trust is critical — finance, healthcare, supply chain



✅ Governances requires vigilance

{% content-ref url="../consensus/summary-consensus-mechanisms.md" %}
[summary-consensus-mechanisms.md](../consensus/summary-consensus-mechanisms.md)
{% endcontent-ref %}





## On-chain solutions, Off-chain Solutions & Hybrid Machups

On-chain solutions — handle transparent, immutable transactions

Off-chain solutions — deal with scalable, private transactions



**on-chain, off-chain hybrid mashups**

1. Database —  primar&#x79;**,** Blockchain —  secondary
   * data on database; proofs or markers of that data such as cryptographic hashes on blockchain
2.  Blockchain —  primary, database —  secondary

    * copy data from blockchain to a database for using existing tools for reporting, analysis, dashboarding
    * no need to worry about keeping database copy of the ledger in sync — we have the implicit guarantee that the original source (blockchain) is never going to change&#x20;



{% hint style="success" %}
#### Balancing Act

The adoption of blockchain technology in many sectors required a careful balance between&#x20;

* the benefits of on-chain data for security and immutability and&#x20;
* the practicality of off-chain solutions for scalability

❗Finding the right balance is critical for successful blockchain integration.
{% endhint %}



## Blockchain Development

{% hint style="success" %}
## Picking the right smart contract language and tools

— the chain chooses the code, not the other way around —&#x20;
{% endhint %}

{% content-ref url="../blockchain-development/development-recommendations.md" %}
[development-recommendations.md](../blockchain-development/development-recommendations.md)
{% endcontent-ref %}





## Security Concerns

{% hint style="success" %}
#### Security Goals: Integrity, Availability, Anonymity

**Prioritize integrity, availability, or anonymity?**

Cannot have it all&#x20;
{% endhint %}

✅ Secure Networks — standard TCP/IP computer network &#x20;

* DDoS — Transaction Flooding
  * squeeze out some legitimate transactions
  * drive up the gas price
  * manipulate the block difficulty on `PoW` networks&#x20;
  * DDoS on Next Block Validator
  * DDoS against Centralized Components — Permissioned Blockchains
    * MSP in Hyperledger
* Eclipse Attacks — isolate node/group of nodes
  * manipulating difficulty levels
  * 51% attacks
  * double-spend with less than 51% control on a `PoW` network
* Replay Attacks — resubmit signed transactions
* Sybil Attacks — fake nodes

✅ Secure Blockchain Protocol

* PoW
  * 51% attack&#x20;
    * double spends
  * selfish mining — withholds newly found blocks
    * used in conjunction with 51% attack — double spends
  * physical attacks — power cuts
    * 51% attacks — double spends
* PoS
  * XX% attack — depends on PoS network configurations
    * double-spends&#x20;
    * `[theory]` protected against by the theory of supply and demand
  * long-range attack — stake bleeding; do nothing on main chain; do not validate blocks when selected
    * double spend — by mining longer divergent chain
  * PoS time-bomb — rich gets richer; higher stake — higher reward
    * higher control over time
    * limiting maximum block reward — easily circumvented
    * slows down the network
  * consensus centralization
  * PoS block forger attacks&#x20;
    * long-range attack
    * block timestamp manipulation

✅ Secure Middle Layer

✅ Secure Smart Contracts

* attacker breaking out of sandboxed environment of smart contract and attacking the host
* smart contract permanence — attackers gain extra information for potential attacks
* reentrancy — re enter functions before first execution completes and drain funds
* front running — submits transactions with a higher priority (fee) while stealing other's answers&#x20;
* integer overflow / underflow — Unsigned integer/numeric variables&#x20;
  * overflow to zero&#x20;
  * underflow to their maximum value
* logic errors
* block gas limit problem — limit on the maximum amount of gas a block allowed to consume
  * larger arrays,  excessive looping&#x20;
  * supports DDoS attacks
* default visibility — smart contract functions are public by default
* timestamp manipulation — deliberately tampers with the timestamps of blocks

✅ secure other solution artifacts&#x20;

* user interface

✅ Secure Client / Client Environment



❗ Private Key Management&#x20;

* non-negotiable

❗ Decentralization Security risks

❗ Privacy violation & Regulatory challenges

❗ Scalability issues & Security

❗ Solution Governance

❗ Quantum Computing



{% hint style="success" %}
A blockchain system should be **harden against every known attack vector**.
{% endhint %}

{% hint style="success" %}
#### In blockchain, **trust isn’t given—it’s earned**.&#x20;

And every layer has to pull its weight.
{% endhint %}

{% content-ref url="../blockchain-security/mitigating-blockchain-security-risks.md" %}
[mitigating-blockchain-security-risks.md](../blockchain-security/mitigating-blockchain-security-risks.md)
{% endcontent-ref %}



