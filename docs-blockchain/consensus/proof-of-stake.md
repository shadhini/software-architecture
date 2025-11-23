---
description: Proof of Stake Group Consensus Mechanism
icon: cards
---

# Proof of Stake

## `PoS`: Proof of Stake

* proposed as an alternative to PoW &#x20;
* designed to address concerns surrounding PoW
* first major departure from PoW
* does not require specialized hardware, almost any device can be a **staking node** (validation node)
  * Even microcomputer devices such as `RaspberryPi`
* has been used by many smaller blockchain networks
  * `Ethereum`

{% hint style="info" %}
In theory, PoS should be just as secure as PoW

* But, this **cannot be said with confidence** **until** PoS has been **used in production** and has a more established track record.
{% endhint %}



> **Proof of Stake:**
>
> involves **locking up funds in a stake**/wager instead of generating random hash function input values — like playing poker
>
> * nodes on the network who wish to participate in consensus activities are required to take some minimum amount of coins out of their wallet and lock them up in a stake



### How it Works

While adding transactions to the current block, protocol tells us when it's time to validate the current block.

* then, **all nodes wishing to participate** in consensus activities will **allocate** minimum amount of their **funds** **to** a "**stake**"
* these funds cannot be used for any other purpose while locked&#x20;

A **validator** from all the node that have put in a stake is **selected** by the network.

* the selection algorithm varies by implementation

The validator gets selected to validate the current block will **hash** the **contents** of their block (all transactions & metadata) to come up with a fixed 32 character hash output and **share** the hash value with the rest of the nodes on the network.

* upon receiving this hash,&#x20;
  * **each node** will hash their current block data and **compare**&#x20;
  * each node will **vote** in support of validator if hashes match, against validator if not

Has the **validator achieved > 51% agreement**?

* Yes — we can go ahead and successfully mine our block and add it to the rest of the chain
  * block reward paid to validator
* No — network select the next validator and process starts all over again, staked funds revoked



