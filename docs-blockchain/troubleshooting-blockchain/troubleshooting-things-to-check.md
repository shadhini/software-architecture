---
icon: clipboard-list-check
---

# Troubleshooting: Things to Check

#### mysterious interruptions on blockchain network — check list

✔ encryption failure&#x20;

✔ **problem isn't central ?**

* blockchain — **distributed database**; stored across multiple nodes with each holding a full copy
* bad data storage on a single node can't cause problems — blockchain isn't just about data
  * but depending on the blockchain’s consensus mechanism and architecture&#x20;

✔ look at logs&#x20;

✔ issue in the foundational architecture

* not a flaw — but systemic problem

✔ consensus mechanism is flagging anything ?&#x20;

* consensus mechanism isn't flagging anything — issue isn't a violation of rules

✔ check layers — layers function together

* application layer — DApps running perfectly ?
* data layer — intact  ?
* network layer — communication & transaction propagation failing ?

✔  network layer diagnostics&#x20;

* connections between nodes are lagging — subtle issue  at the network layer

✔ public/private key architecture

* if there's a vulnerability, it's here

✔ cryptographic hash relationships (within the blocks) tampering&#x20;

* every block contains the hash of the previous block
* 🚩tampering with hash — entire chain collapses
* ✔ cross-reference chains — to ensure integrity

✔ smart contracts — automated condition-based transactions

* one bad actor can bring everything down
* when an issue arises, you can patch the contract, isolate the DApp and strengthen the topology of the network&#x20;











