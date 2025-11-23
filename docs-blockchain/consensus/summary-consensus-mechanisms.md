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



## Consensus Mechanisms Concerns & Benefits

{% hint style="danger" %}
#### Security Concerns (Potential Risks and Attack Vectors) around different Consensus Mechanisms are different.

❗Users moving solutions from one type of network to another should be aware of the potential risks and new attack vectors.



E.g: PoS opens different attack vectors than PoW

* PoS removes concerns around a 51% attack
* but PoS introduce Block Validator/Block Forger attack
{% endhint %}

<table><thead><tr><th width="85.5894775390625" valign="top">Consensus Mechanism</th><th valign="top">Attack Vectors &#x26; Vulnerabilities</th><th valign="top">Other concerns</th><th valign="top">Benefits</th></tr></thead><tbody><tr><td valign="top"><p>PoW: </p><p>Proof of Work</p></td><td valign="top"><p>Attack Vectors: </p><ul><li>51% attack</li></ul></td><td valign="top"><ul><li>high energy consumption</li></ul></td><td valign="top"></td></tr><tr><td valign="top"><p>PoS: </p><p>Proof of Stake</p></td><td valign="top"><ul><li><strong>centralization vulnerability</strong>: if a few validator s hold too many tokens</li></ul><p>Attack Vectors:</p><ul><li>Block Validator/Block Forger attack</li></ul></td><td valign="top"><p></p><ul><li>efficiency concerns</li></ul></td><td valign="top"></td></tr><tr><td valign="top">Delegated PoS</td><td valign="top"><ul><li>higher level of <strong>centralization</strong></li></ul></td><td valign="top"><ul><li><strong>scheming</strong> and <strong>collusion</strong> concerns</li></ul></td><td valign="top"><ul><li>more <strong>efficiency &#x26; performance than PoS</strong></li></ul></td></tr><tr><td valign="top">PoA: Proof of Authority</td><td valign="top"><ul><li><strong>fewer attacks</strong> — identity is known</li></ul><ul><li>greater <strong>centralization</strong></li></ul></td><td valign="top"></td><td valign="top"><ul><li>greater <strong>performance</strong></li></ul></td></tr><tr><td valign="top">Proof of Space</td><td valign="top"></td><td valign="top"></td><td valign="top"></td></tr><tr><td valign="top">Proof of Importance</td><td valign="top"></td><td valign="top"></td><td valign="top"><ul><li><strong>incentivize</strong> <strong>network use</strong> and <strong>discourage coin hoarding</strong></li></ul></td></tr><tr><td valign="top">Proof of History</td><td valign="top"></td><td valign="top"></td><td valign="top"></td></tr><tr><td valign="top">PoET: Proof of Elapsed Time</td><td valign="top"><ul><li>greater centralization on Intel</li></ul></td><td valign="top"><ul><li>consensus mechanism designed by <code>Intel</code> to run on <strong>Intel hardware</strong></li></ul></td><td valign="top"><ul><li><strong>lightweight</strong> &#x26; <strong>more energy efficient</strong></li></ul></td></tr><tr><td valign="top">Participant Consensus (Permissioned Platforms)</td><td valign="top"></td><td valign="top"></td><td valign="top"><ul><li>more flexible and configurable</li><li>poses no risk for real-time data consumptions — transactions are added to the ledger after validation</li></ul></td></tr><tr><td valign="top">PBFT: Practical Byzantine Fault Tolerance</td><td valign="top"></td><td valign="top"></td><td valign="top"><ul><li>efficient for permissioned blockchains </li><li>works well when participants are known</li><li>minimal energy use</li></ul></td></tr></tbody></table>





## PoW vs PoS

<table><thead><tr><th valign="top">PoW: Proof of Work</th><th valign="top">PoS: Proof of Stake</th></tr></thead><tbody><tr><td valign="top"><p><strong>guessing game</strong> </p><ul><li>specialized hardware needed</li><li>energy-hungry consensus activity </li></ul></td><td valign="top"><p><strong>wagering</strong> </p><ul><li>no specialized hardware needed</li><li>energy-hungry consensus activity removed — energy efficient</li></ul></td></tr><tr><td valign="top"></td><td valign="top"><p>offers significant performance gains</p><ul><li>PoS networks often increase performance by 10X - 100X </li></ul></td></tr><tr><td valign="top"></td><td valign="top"><p>In theory, PoS should be just as secure as PoW</p><p>But, this <strong>cannot be said with confidence until</strong> PoS has been <strong>used in production</strong> and has a more established track record.</p></td></tr><tr><td valign="top"><p>Attack Vectors: </p><ul><li>51% attack</li></ul></td><td valign="top"><p>Attack Vectors:</p><ul><li>Block Validator/Block Forger attack</li></ul></td></tr></tbody></table>

## PoS vs Delegated PoS

<table><thead><tr><th valign="top">PoS: Proof of Stake</th><th valign="top">Delegated PoS</th></tr></thead><tbody><tr><td valign="top">true democracy </td><td valign="top">representative democracy </td></tr><tr><td valign="top"></td><td valign="top">increased efficiency and performance</td></tr><tr><td valign="top"></td><td valign="top">greater level of centralization</td></tr><tr><td valign="top"></td><td valign="top">concerns around  scheming and collusion are enhanced</td></tr></tbody></table>



## Designing Consensus Mechanisms

{% hint style="success" %}
#### Consensus isn’t about speed or power—it’s about trust.&#x20;

Solve that, and the rest falls into place.
{% endhint %}

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







