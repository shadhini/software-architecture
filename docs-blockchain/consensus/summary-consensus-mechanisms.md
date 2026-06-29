---
icon: handshake
---

# Summary: Consensus Mechanisms

## Consensus Mechanisms

Byzantine Generals Problem — **consensus in a trustless environment**

**Aim** of any consensus mechanism — ensure nodes agree on the data’s validity despite potential bad actors



* PoW: Proof of Work
  * **guessing game** — solving a mathematically difficult problem to create next block
* PoS: Proof of Stake
  * **waging**: network select the validator from the nodes that staked coins/tokens
  * **true democracy**: every node participate in next block creation
  * almost **no** concerns around **51% attack**
* Delegated PoS:
  * **representative democracy**: only representatives selected from a voting participate in next block creation
* PoA: Proof of Authority
  * **identified, known validators** approved ahead of time
  * used in **consortium situations** where participants already know each other
    * reduce concerns around scheming and collusion
* Proof of Space
  * Uses the concept of **Rainbow Tables**
  * each node allocates some amount of **space to store answers** for some questions from a larger pool of questions
  * **First node** to demonstrate it has the **answer to a randomly selected question** gets to validate the block
* Proof of Importance&#x20;
  * creating blocks and validating transactions handled by "**important**" **nodes** to the network&#x20;
  * **Importance = number of coins/tokens held + transaction activity + number of coins sent/received**
  * **incentivize** **network use** and **discourage coin hoarding**
* Proof of History
  * **Timestamped events** are periodically recorded on the ledger by the network
  * Any copy of the ledger presented to the network which **lacks** these **known** **timestamps** will be **rejected**
  * Designed to **work with** **other methods** such as PoW and PoS
* PoET: Proof of Elapsed Time
  * protocol select a **random time interval**
  * **first node** to prove **idleness** for that duration will be selected to validate the current block
  * consensus mechanism designed by `Intel` to run on **Intel hardware**
* Participant Consensus (Permissioned Platforms)
  * Validation can occur prior to the transaction being recorded on the block
    * Execute → Validate → Commit
  * "**Endorsement Policy**" approach — block agreement/validation rules are all up to participants sharing the ledger
  *   **Business process** can be **modeled once** (**`Smart Contract`**),&#x20;

      and **customized** **for every participant** in the process (**`Endorsement Policy`**)
* PBFT: Practical Byzantine Fault Tolerance
  * ensures consensus among known nodes with minimal energy use
  * efficient for permissioned blockchains&#x20;





## Designing Consensus Mechanisms

{% hint style="success" %}
#### Consensus isn’t about speed or power—it’s about trust.&#x20;

Solve that, and the rest falls into place.
{% endhint %}

{% hint style="danger" %}
#### Security Concerns (Potential Risks and Attack Vectors) around different Consensus Mechanisms are different.

❗Users moving solutions from one type of network to another should be aware of the potential risks and new attack vectors.



E.g: PoS opens different attack vectors than PoW

* PoS removes concerns around a 51% attack
* but PoS introduce Block Validator/Block Forger attack
{% endhint %}

{% embed url="https://docs.google.com/spreadsheets/d/15WMaeCcfFT1DlLBQ2MkA-0hJk5Ny4_-YNlmToZYj72w/edit?usp=sharing" %}
Consensus Mechanisms: Concerns & Benefits
{% endembed %}



#### Voting System

✅ efficient

✅ more robust against centralization risks&#x20;



* PoS:
  * centralization risk: if a few validators hold too many tokens
* Delegated PoS:&#x20;
  * trends toward centralization
*   PBFT: Practical Byzantine Fault Tolerance

    * ensures consensus among known nodes with minimal energy use
    * perfect for this private, high-trust environment



**Solution: PBFT — Practical Byzantine Fault Tolerance**







