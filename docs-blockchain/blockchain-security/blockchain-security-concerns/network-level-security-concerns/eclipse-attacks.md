---
icon: line-columns
---

# Eclipse Attacks

## Eclipse Attack

> Eclipse the network into 2 different components



**On a peer-to-peer network**,&#x20;

* each node connects to a small number of other nodes
* a node is only "**aware**" of a small part of the larger overall network
* a fully connected network would be highly inefficient and nearly impossible to scale

An **eclipse attack isolates a node/small group of nodes** from the rest of network

* each of these partitioned components of the network thinks that the other part of the network went offline and they're still keeping the main/real ledger up-to-date
* once an attacker has broken a network up into a large component and a small component, a spend can be recorded in the isolated node/the smaller group of nodes which will disappear when the attack ends because the larger unseparated majority of the network has been keeping the ledger with the most work on it
* isolating powerful nodes or node clusters is effective for **manipulating difficulty levels**
  * this also makes **51% attacks** more feasible
* nodes are often isolated via **malware**
  * make sure your nodes are **secure** and **malware/virus free** !

#### Example: `Eclipse attack` used to double-spend with less than 51% control on a PoW network&#x20;

* take a network of 100 mining nodes and split it 60/40 via network-level attack
  * each "split" assumes the rest of the network went offline

attack version 1

* perform a 51% attack on the 60 nodes split by only having control of 31 nodes

**╰┈➤ perform a 51% attack by controlling only 31% of the network**&#x20;

attack version 2

* once the attacker has taken control of 60% of the ledger, attacker can do things like **double spends**&#x20;
* perform a spend on the 40% ledger
  * the 60% ledger will still show unspent funds in the target wallet
* end the network attack
  * when the ledger rejoins, the 60% version will be the "correct" one
  * the spend will be removed from the ledger&#x20;



