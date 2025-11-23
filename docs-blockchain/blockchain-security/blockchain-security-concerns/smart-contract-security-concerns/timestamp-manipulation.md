---
icon: alarm-plus
---

# Timestamp Manipulation

## Timestamp Manipulation

> attack where a malicious actor **deliberately tampers with the timestamps of blocks**&#x20;
>
> to gain an unfair advantage or disrupt the normal functioning of the blockchain



* **`exact synchronization/exact timekeeping` cannot take place** on a decentralized/ peer-to-peer network
  * synchronization is a function of centralization
  * "**current time**" is based on the timestamp of the block most recently mined&#x20;
* nodes on the network will accept transactions within a **pre-defined time span**
  * every node on the network will accept a transaction timestamped some number of seconds in the future, and transaction timestamped some number of seconds in the past from what they believe the current time to be&#x20;
* a malicious miner can submit blocks with a timestamp earlier than the timestamp of the last mined block
  * a miner can affect which transactions show up on a block, and when&#x20;



## Timestamp Manipulation in Real Life



#### `EtherLotto` Hack

* blockchain based lottery game where users are meant to send money/coins/tokens to the smart contract function `Play()`
* the contract relied on the block timestamp to mark when this function was called by a user
* a formula is applied to the recorded timestamp
  * if the result is zero --> the user wins the lotto
* an attacker capable of manipulating block timestamps can submit a transaction which will result in zero after the formula has been applied&#x20;
  * the attacker can guarantee that they will win the lottery



More on `EtherLotto` Hack:

{% embed url="https://etherscan.io/address/0xa11e4ed59dc94e69612f3111942626ed513cb172#code" %}





