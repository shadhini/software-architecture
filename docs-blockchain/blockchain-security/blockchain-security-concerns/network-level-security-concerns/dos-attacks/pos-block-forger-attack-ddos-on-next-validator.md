---
icon: square-check
---

# PoS Block Forger Attack — DDoS on Next Validator

## **DDoS on Next Validator**

* On PoS networks, the node which validates the current block is selected by the **protocol** after nodes who wish to participate in consensus lock up some of their funds in a stake
  * this protocol is **public,** knowable and discoverable to everyone
* on Proof of Stake network, a Block Forger Attack can occur if a potential attacker **front run this selection algorithm** to determine the next validator before the network does
* the attacker can then **DDoS the next validator**, causing a timeout &#x20;
  * launching a **denial of service attack** against that node will prevent if from responding in a timely fashion, thus **slowing down the overall network** and making it easier for the attacker to introduce/build a divergent alternate longer version of the ledger
