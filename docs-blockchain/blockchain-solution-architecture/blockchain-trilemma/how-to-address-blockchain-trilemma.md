---
icon: question
---

# How to address Blockchain Trilemma ?

## Layer 1 Solutions&#x20;

> **Make modifications to the blockchain protocol at the layer 1 level**&#x20;
>
> ╰┈➤ outside your influence/control unless you're developing your own blockchain platform or have significant influence over an existing platform



<mark style="color:green;background-color:green;">**increase block size**</mark>

* a larger block size limit allows more data per block
* maintain the same block throughput, but achieve a greater number of transactions in a given amount of time&#x20;



<mark style="color:green;background-color:green;">**decrease block building time**</mark>

* performance can be increased by decreasing the time required to verify a block



<mark style="color:green;background-color:green;">**sharding**</mark>

* divide ledger data into more manageable "**`shards`**"
* on a shared network, a group of validating nodes is only going to store and validate their shard rather than the entire ledger
* each shard processes a portion of transactions independently



<mark style="color:green;background-color:green;">**`SEGWIT`**</mark><mark style="color:green;background-color:green;">**: Segregated Witness**</mark>

* changes how and where data is stored on a block
* helps eliminate the need for signature data attached to each block
* roughly 70% of block data is allocated to cryptographic signatures
* more of the block can be allocated to storing transactions
*   e.g: popular SEGWIT implementations

    * **`Bitcoin Lightning`** component on Bitcoin network



<mark style="color:green;background-color:green;">**Rollups**</mark>

* **`Pessimistic Rollup`**: execute transactions off-chain and only record them to the ledger once consensus has been reached
  * once transactions have been agreed upon, some proof of the transactions such as hash of their result are stored on the blockchain
* **`Optimistic Rollup`**: execute transactions off-chain, record them to the ledger, perform consensus at a later time
  * provide much greater performance than the pessimistic counterpart, although you take some risk
  * you have to have a high degree of confidence that your optimism is well founded
* increase performance by executing transactions on traditional/more centralized setup which is way faster than their decentralized counterparts





## Layer 2 Solutions

> **Transactions from a Layer 1 are off-loaded to a Layer 2 network**



<mark style="color:green;background-color:green;">**Nested Network**</mark>

* one blockchain is "**nested**" inside another
* the **inner network** performs all processing work and smart contract execution, and the result is simply documented on the outside/surrounding network
* e.g: `Ethereum Plasma` used on top of `Ethereum` layer 1 blockchain     &#x20;



<mark style="color:green;background-color:green;">**State Channel**</mark>

* "**bookmark**" transactions are periodically left on a blockchain ledger
* all transactions between the bookmarks (intermediary transactions) are recorded **off-chain** (e.g: in a database)
* if there's ever a disagreement/discrepancy in that off-chain component/data store, we only have to rewind things as far back as our last bookmark transaction the the blockchain ledger&#x20;



<mark style="color:green;background-color:green;">**Sidechain**</mark>

* "**bookmark**" transactions or **zero knowledge proofs** are periodically left on a blockchain ledger
* all transactions between the bookmarks (intermediary transactions) are recorded on **another blockchain/side chain**
* main purpos&#x65;**: fscilitating interoperability**
* e.g: `Bitcoin Lightning`



## Layer 3 Solutions&#x20;

> **Layer 3 platforms attempt to abstract away many of the concerns of the blockchain trilemma**
>
> ╰┈➤ allow you to focus on application / solution development rather than low-level operations that are taking place on the network layer

* still very new !



Layer 3 solutions are somewhat akin to&#x20;

* solutions like `Wix` or `WordPress` in the world of website development
* `C#` compared to `C++`
  * C++: focus on and control low-level details such as memory management
  * C#: low-level details absracted away, focus on application





## Web 2.5

> **Use centralized and decentralized components together**
>
> Mashup between&#x20;
>
> 1. centralized or web 2 technologies and
> 2. decentralized or web 3 technologies



Understand that technology tends towards centralization over time

* cost, convenience, availability of expertise, and economies off scale usually contribute to this drift
  * `HTML` → `Wordpress`
  * `Cold Fusion` → `Shopify`
  * `Internal Database` → `Salesforce.com`



## Benefits Vs Concerns of Possible Solutions

<table><thead><tr><th width="106.11505126953125" valign="top">Solution</th><th valign="top">Benefits</th><th valign="top">Concerns</th></tr></thead><tbody><tr><td valign="top">Sharding</td><td valign="top"><ul><li>decrease the amount of <strong>storage space</strong> nodes on the network have to allocate to ledger storage</li><li>increase <strong>performance</strong> — each shard processes a portion of transactions independently</li></ul></td><td valign="top"><ul><li><p>weaken security — smaller shards are easier to attack</p><ul><li>robust protocols can manage the trade-off</li></ul></li></ul></td></tr><tr><td valign="top">Sidechain</td><td valign="top"><ul><li>side chain handle most of the work, offloading pressure from the main chain — <strong>scalable</strong></li></ul></td><td valign="top"><ul><li><strong>security</strong> — rely on secure bridges</li></ul></td></tr><tr><td valign="top">State channels</td><td valign="top"><ul><li><strong>scalable</strong> — allow off-chain transactions that only update the main chain when final</li></ul></td><td valign="top"><ul><li>require trust between participants</li></ul></td></tr><tr><td valign="top"><strong>Directed Acyclic Graphs</strong></td><td valign="top"><ul><li>promising for high speed, low cost transactions</li></ul></td><td valign="top"><ul><li>experimental</li><li>security is challenging</li></ul></td></tr></tbody></table>
