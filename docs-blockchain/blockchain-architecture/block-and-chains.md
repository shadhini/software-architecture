---
description: What is a Block & How are Blocks Chained Together ?
icon: cube
---

# Block & Chains

## Story: multiple stenographers recording court proceedings

* multiple stenographers records the testimony of witnesses during a court proceeding
* each stenographer tried to record exactly what the witness said
* every time the stenographers fill up a sheet of paper with testimony they compare them
  * if all sheets are identical → the group knows they're accurate
  * if most (>51%) of the sheets are identical → stenographers in the minority will throw away their sheet and get a copy from the majority
  * if no majority can be reached → they will assume they got it wrong and go back to the witness for clarification&#x20;
* every time a page is agreed upon by the group, the number of words on the current page are added to the current total word count, creating an updated total word count&#x20;
  * then these numbers are added at the bottom of every page: current page word count; total word count
* if a malicious actor change the `total word count` at the end of the page of page 2, and if it has total 10 pages
  * then we can figure out that something has gone wrong from page 2 onwards as there's a mismatch between total counts of page 2 and page 3
  * thus, we can conclude that pages from page 2 onward has been tampered with

| Metaphor                                                                                                                                                                                                  |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <p>each <strong>sheet of paper</strong></p><p>╰┈➤ is a <strong>block</strong> in a blockchain</p>                                                                                                         |
| <p><strong>total word count</strong> from the 1st page to current page at the end of each page </p><p> ╰┈➤ is similar to <strong>mathematical dependency for chaining blocks</strong> in a blockchain</p> |

{% hint style="info" %}
❗this metaphor does not consider risk of changing words itself, instead of word count in a page
{% endhint %}

## What is a Block

> **`Block`:**
>
> grouping of transactions&#x20;
>
> * transaction: information about the assets, and events that happened to them&#x20;
>
> data structure of blockchain

metaphor: sheet of paper

* you can record anything you need&#x20;



#### Blockchain Block Structure

{% hint style="info" %}
Each field in a block of blockchain has a predetermined size which is followed through the blockchain.
{% endhint %}

each block carries

* **transaction data**  — set of transactions
  * List of records: an identification of hashes that were included into the block's Merkle tree
* a hash/<mark style="background-color:green;">**merkle root**</mark> — immutable unless someone has breached the system&#x20;
  *   Merkle root: a hash built from the block's transaction identifiers&#x20;

      [merkle-tree.md](merkle-tree.md "mention")
* **previous block id**: a reference to the previous block —  hash of the previous block&#x20;
* **timestamp** — approximate reasonable time, not exact — used to ensure the chronological order of transactions

<mark style="background-color:$info;">**Header**</mark><mark style="background-color:$info;">: version information, nonce, previous block id, timestamp</mark>

<figure><img src="../.gitbook/assets/block.svg" alt="" width="375"><figcaption></figcaption></figure>



#### Block Identifier

2 types of block identifiers

* <mark style="background-color:green;">**Block Header**</mark>
  * the block header hash serves as the primary identifier (digital fingerprint) of a block in the blockchain
* <mark style="background-color:green;">**Block Height**</mark>
  * represents the **sequential position** or **index** of a block within the blockchain, counting from the very first block (genesis block)
  * the first block — genesis block is of height 0
  * block height is not stored in the block header itself—instead, each node in the network calculates it dynamically by counting blocks from the genesis block



#### **Timestamp of a block**

* blocks include a timestamp supplied by the miner/validator’s local clock, but that timestamp is only treated as an **approximate**, not an absolute, time
* nodes validate timestamps against protocol rules to ensure they are “**reasonable**”&#x20;
* these checks create an allowed time window rather than a single exact instant

{% hint style="warning" %}
In a decentralized network,&#x20;

╰┈➤ there's <mark style="color:$danger;">**no single "source of truth" for time**</mark>

╰┈➤ and **nodes can't perfectly synchronize their clocks**
{% endhint %}





## How are Blocks Chained Together ?

> **`Chaining` Blocks Together:**
>
> Creating a _**mathematical dependency between all the blocks**_,&#x20;
>
> ╰┈➤ so that any small change or alternation made on any block has a _**cascading effect**_ on every block that comes after it in the chain,&#x20;
>
> letting any observer know that something has _**likely been tampered**_ with

> **Chains**:
>
> blocks are organized sequentially to form a "chain", with each block referencing the previous one

{% hint style="success" %}
#### **Blocks** are **linked** together in a **linear sequence**, each containing a hash of the previous block.

transactions are recorded in blocks linked in **chronological order**

each block contains

* hash of its data and
* previous blocks hash

any small modification to block content, change block's hash&#x20;

╰┈➤ break the chain&#x20;

╰┈➤ make tampering obvious
{% endhint %}



<figure><img src="../.gitbook/assets/chain-of-blocks.svg" alt=""><figcaption></figcaption></figure>



