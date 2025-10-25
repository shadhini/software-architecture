---
icon: line-columns
---

# Eclipse Attack

## Eclipse Attack

> Eclipse the network into 2 different components

* If an attacker eclipse the network into 2 different components, launching a 51% attack might be easier.

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
