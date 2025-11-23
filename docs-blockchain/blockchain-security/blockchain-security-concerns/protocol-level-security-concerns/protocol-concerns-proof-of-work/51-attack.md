---
icon: circle-half-stroke
---

# 51% Attack

## 51% Attack

{% hint style="info" %}
On a **Proof of Work** network, one of the most common attack vectors is **51% attack**.
{% endhint %}

> any attacker who controls the **majority** (at least 51%) of the **computational power / total processing power on the network** is in a position to create an alternate or divergent chain containing or ignoring the transactions that malicious actor desires&#x20;



* most blockchains, when presented with two different ledger versions, will **choose the one with the most amount of work** on it as the correct one
  * imagine that `A` 's an attacker and he goes to `Bitcoin` and say, "hey `Bitcoin`,  I'm a node on the network, and I've got a different version of the ledger, a version of the ledger that shows that a million `Bitcoin` are sitting in Chris's wallet."
  * if `A` present that alternate ledger to `Bitcoin`, it's going to get immediately rejected because it doesn't have all the cryptographic work on it, that the main ledger does
  * the main ledger has been adding cryptographic work all the way back to 2009, whereas `A`'s fake ledger is something he just created a few minutes ago&#x20;
* during a 51% attack, an attacker attempts to gain control over 51% or more of the total processing power of the network
  * this all but guarantees that the node which validates the block is going to be their own&#x20;
  * if `A` owns 51% or more of all the computing power on the network, the overwhelming odds are it's going to be one of `A`'s nodes that get selected to validate the next block
* since the attacker has more power than the rest of the network combined, they can "**outrun**" the network to create a longer chain
  * an attacker can add blocks to a divergent chain faster than the rest of the network and continue to build the main chain&#x20;
  * this means that it's only a matter of time before attacker's alternate or divergent chain is going to contain more work than the real one&#x20;
* this type of attack could be used to perform **double spends**
  * an attacker could spend their fund in a transaction, then devote all of their resources to a divergent chain which does not include the spend
  * when the longer chain is accepted by the network, the spend will disappear leaving the attacker free to "spend" it again
  * An attacker buys something from a seller and receives it. Then, the attacker creates a new version of the blockchain that erases the record of their payment. If the network accepts this new chain, the attacker keeps both the purchased resource and their money, while the seller loses both.

{% hint style="danger" %}
**Attacks at the network level** might help **facilitate attacks like 51% attack**.
{% endhint %}





