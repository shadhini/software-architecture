---
icon: pickaxe
---

# Mining in Bitcoin Blockchain

## Bitcoin Mining Process

{% hint style="info" %}
**Bitcoins** are **created** by the process of mining.
{% endhint %}



#### 1. Autonomous check of every transaction

miners verify each transaction against a checklist of instructions

* Each Bitcoin node that gets the transaction will initially verify the transaction
* Every node confirms each transaction against a long agenda of criteria



#### 2. Independent aggregation of transactions into new blocks

*   Each node fabricates a pool of valid, however, unconfirmed transactions known as the

    `transaction pool`, `memory pool` or **`mempool`**
* Unlike other nodes, miner node will then aggregate these transactions into a **`candidate block`**



**Candidate block creation process @miner**

*   Miner node is listening for transactions trying to mine a new block and also listening for blocks

    discovered by other nodes
* As miner node is mining, it receives block (say _273816_) through the Bitcoin network
  * The arrival of this block signifies the end of the competition for the block
* While miner node was searching for a solution to block _273816_, it was also collecting transactions\
  in preparation for the next block _273817_&#x20;
* By now it has collected a few hundred transactions in the memory pool
* Upon receiving block _273816_ and validating it, miner node will also check all the transactions in the memory pool and remove any that were included in block _273816_
* Whatever transactions remain in the memory pool are **unconfirmed** and are waiting to be recorded in a new block
* Miner node immediately constructs a **candidate for block** _273817_
  * This block is called a candidate block because it is **not yet a valid block**, as it does **not**\
    **contain a valid proof of work**
* The block becomes valid only if the miner succeeds in finding a solution to the proof of work\
  algorithm

**Solving mining puzzle @miner**

* Miner nodes start solving the mining puzzle
*   Mining node constructs the block header using the following fields: version, Merkle root,

    previous block hash, difficulty target, nonce
*   The goal is now to find a value for the nonce that results in a block header hash that is less

    than the difficulty target
* The miner who solves the puzzle the fastest, generates the block&#x20;
* Immediately, the mining node transmits the block to al its peers&#x20;
* They receive, validate and then propagate the new block

<figure><img src="../.gitbook/assets/chain-of-blocks.svg" alt=""><figcaption></figcaption></figure>

<figure><img src="../.gitbook/assets/bitcoin-mining.svg" alt=""><figcaption></figcaption></figure>

**Rewarding miners**

* Since miners use their valuable resources to validate the block, they are given a **monetary award**
* Successful miner is rewarded with **newly created Bitcoins**
  * Electricity + Computational Work = Monetary Reward





#### 3. Independent confirmation of new blocks by each node

— verify and confirm new block is valid —&#x20;

once a miner announces a new block to the network,

* In Bitcoin’s consensus mechanism, each new block is validated independently by every node on the network which ensures that only valid blocks are propagated on the network
* Nodes validate the block by checking it against a long list of criteria that must be met



#### 4. Independent selection by every node of the chain with most cumulative computation

— assembling blocks as part of the blockchain —&#x20;

**Assembling and selecting chains of blocks:**

* once a node validates the block, it assembles the chain by connecting the block in the existing Blockchain
* this step adds the blocks to the blockchain —  thus confirming all transactions which were a part of the block
* as a reward, the **miner who mined this block received newly mined Bitcoins**

**Bitcoins are assembled in the longest chain**

*   By choosing the greatest difficulty chain, all nodes in the long run accomplish a wide

    consensus
*   Brief errors between chains are settled in the long run as more proof of work is included —&#x20;

    broadening one of the conceivable chains
*   Mining nodes vote with their mining power by picking which chain to extend by mining the

    next block
* The longest chain used to assemble Bitcoins — the <mark style="background-color:green;">**main chain**</mark>
* Other chains created in the process of attaching new blocks to the blockchain —  <mark style="background-color:green;">**secondary chains**</mark>
* Block added to a secondary chain which never made it to the main chain — an <mark style="background-color:green;">**orphan block**</mark>



