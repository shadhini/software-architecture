---
description: Proof of Work Consensus Mechanism
icon: person-digging
---

# Proof of Work

## `PoW`: Proof of Work&#x20;

designed to allow a network of equally privileged peers to come to agreement on the contents of a block

* original group consensus mechanism employed by `Bitcoin`
* use by almost every major **permissionless blockchain** platforms since Bitcoin
  * currently the **most widely-used** group consensus mechanism



> **Proof of Work:**
>
> * works by using **hashes** — data can be encrypted, not decrypted; one way encryption
> * hashes are **non-deterministic** — no way to know what hash will be generated ahead of time looking at input
> * hashes are **unique to their input data** — each input generates its own unique hash value
>
>
>
> **Hash Of ( Block Data + Random Data )**&#x20;
>
> &#x20;          **= Hash that matches pre-determined pattern**
>
> * Random data → "**`Nonce`**"
> * Predetermined pattern → "**Difficulty**"
>   * usually specified number of zeros at beginning of hash

{% hint style="danger" %}
Even the slight change to block data or nonce will change the hash and will break the hash relationship.
{% endhint %}

{% hint style="success" %}
In terms of security, PoW consensus **ensures data integrity**.
{% endhint %}

<figure><img src="../.gitbook/assets/pow_block.svg" alt="" width="375"><figcaption></figcaption></figure>

### How it Works

Block is a grouping or collection of transactions.

* Transactions are recorded on the current block until the protocol decides it's time to mine or validate that block and then move on to the next one.

When it's time for the network to validate the current block,

* all of the nodes/miners on the network are going to **compete** to **guess** a random piece of data, known as the **nonce** such that when we run data of the block combined with that random piece of data (nonce) through a standard cryptographic hash function, it results in a hash that has the required number of leading zeros as per the protocol.
* The **first node** to guess a working nonce will **share** it with the rest of the network for validation.
* The network will **vote** on the **proposed** **nonce**
  * Yes — The proposed nonce works with my block data to produce the desired output&#x20;
    * hash of (proposed nonce + your block data) --> gives leading zeros according to the protocol
    * you have the same data on your block
  * No — The proposed nonce does not generate the desired output  (you have different data on your block)
* If a majority **51%** or more of the network comes up with the same result, then those nodes/miners on the network will **vote in favor** of the proposed nonce.&#x20;
  * The node/miner which guessed that nonce value originally will be **rewarded**.
  * That block reward consists of some **newly minted or generated coins** being placed into the wallet associated with that mining node.
* If the **majority** of the network **votes against** this proposed nonce value,&#x20;
  * i.e. majority of the network has something different recorded on their current block &#x20;
  * the process will start it over with a **new winning guesser** being **selected for evaluation**.

The number of leading zeros that we're looking for in any particular case is known as the **block difficulty**.&#x20;

* This difficulty is **periodically adjusted** up or down over time to compensate with resources either coming online or going offline.



## Downsides of Proof of Work

* Cost
  * PoW networks are expensive to use
    * **gas/transaction fees** required by PoW networks has grown to be fairly significant over time, limiting their overall utility
  * PoW networks are expensive to participate in&#x20;
    * if you want to **mine or perform consensus** activities on a PoW network, that requires very **expensive specialized hardware**; hardware that has a very short production lifespan due to new generations coming and rendering the previous ones technically obsolete
* Environmental Sustainability
  * PoW consensus consumes a LOT of electricity
    * this is an intentional design decision to lower the incentive for any hacker or attacker trying to compromise a PoW network
  * More that Apple + Amazon + Facebook + Microsoft + Google COMBINED!
* Performance
  * Blockchain networks will always perform worse than their centralized counterparts
  * Blockchain is several orders of magnitude slower !
* Scalability
  * can we really continue to scale this way ? — ever decreasing performance

