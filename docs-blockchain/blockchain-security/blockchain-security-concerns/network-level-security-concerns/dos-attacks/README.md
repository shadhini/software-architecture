---
description: Denial of Service Attacks
icon: bells
---

# DoS Attacks

## `DoS`: Denial of Service Attacks

#### Transaction Flooding

> A Denial of Service attack can be launched by flooding the network with a large volume of transactions
>
> ╰┈➤ **Transaction Flooding**
>
> * squeeze out some legitimate transactions
> * drive up the gas price&#x20;

* most blockchains have **pre-defined maximum capacity**
  * blocks are created at specific regular intervals — they are only allowed to grow to a predefined maximum size
  * network has a certain data throughput — it can only process a certain amount of transactions in a given time interval
* if `A` is able to flood the network with a bunch of invalid/superfluous transactions, `A` is very likely going to be able to **squeeze out** some of the **legitimate transactions** from showing up on the ledger&#x20;
* if nothing else, `A` will **drive up the gas price** for any users who want to get their transaction included on the ledger quickly



#### Artificial Difficulty Manipulation

> DoS Attacks can be used to **manipulate the block difficulty** on **`PoW`** networks&#x20;

* The difficulty on a PoW network is determined and set at predefined intervals based on the computational resources of the network
  * difficulty — e.g: number of leading zeros that we're looking for when we combine the hash of any block data with a nonce value&#x20;
* An attacker could add resources to the network until the difficulty is increased to compensate for that, and then remove them
  * adding resources
    * adding a bunch of new mining nodes
    * setting up a bot form of miners and putting them onto a blockchain network&#x20;
  * this would result in a difficulty that's too high for the resources currently available to the network, slowing the network down until the next difficulty calculation is done and adjustment is made
  * if the network is running slower than it's intended to, it makes it easier for an attacker to start building a divergent chain which ultimately becomes longer and accepted by the network&#x20;



#### PoS Block Forger Attack — DDoS on Next Validator

{% content-ref url="pos-block-forger-attack-ddos-on-next-validator.md" %}
[pos-block-forger-attack-ddos-on-next-validator.md](pos-block-forger-attack-ddos-on-next-validator.md)
{% endcontent-ref %}



#### DDoS against Centralized Components — Permissioned Blockchains

{% content-ref url="ddos-against-centralized-components.md" %}
[ddos-against-centralized-components.md](ddos-against-centralized-components.md)
{% endcontent-ref %}

