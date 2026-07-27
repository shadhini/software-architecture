---
icon: question
---

# How to address Blockchain Trilemma ?

## Layer 1 Solutions&#x20;

> **Make modifications to the blockchain protocol at the layer 1 level**&#x20;
>
> ╰┈➤ outside your influence/control unless you're developing your own blockchain platform or have significant influence over an existing platform



#### <mark style="color:green;background-color:green;">**increase block size**</mark>

* a larger block size limit allows more data per block
* maintain the same block throughput, but achieve a greater number of transactions in a given amount of time&#x20;



#### <mark style="color:green;background-color:green;">**decrease block building time**</mark>

* performance can be increased by decreasing the time required to verify a block



#### <mark style="color:green;background-color:green;">**sharding**</mark>

* divide ledger data into more manageable "**`shards`**"
* on a shared network, a group of validating nodes is only going to store and validate their shard rather than the entire ledger
* each shard processes a portion of transactions independently



#### <mark style="color:green;background-color:green;">**`SEGWIT`**</mark><mark style="color:green;background-color:green;">**: Segregated Witness**</mark>

a **major upgrade to the Bitcoin** blockchain that was implemented in 2017&#x20;

&#x20;    as a **soft fork** (meaning that it is backward compatible with older versions of bitcoin software and allows the network to upgrade smoothly without splitting the blockchain)

&#x20;    that **changed how transaction data is stored in Bitcoin blocks**



**Before `SegWit`,**&#x20;

transaction data and signature data were bundled together in the same block structure



**The Bitcoin Problem (Before `SegWit`) - Data Congestion**

* _<mark style="color:blue;">Strict Limits</mark>_: Bitcoin blocks have a strict data storage limit of 1 Megabyte.
* _<mark style="color:blue;">Bulky Signatures</mark>_: Digital signatures are large and took up 60% to 70% of that limited space.
* _<mark style="color:blue;">The Result</mark>_: Blocks filled up quickly, causing network congestion, slow processing times, and high transaction fees.



**After `SegWit`,**&#x20;

these 2 components; transaction data and signature data  are separated.

> **Segregated Witness**<mark style="color:green;">**:**</mark> separates signature data from transaction data&#x20;
>
> * <mark style="color:blue;">**Segregate**</mark>: To separate.
> * <mark style="color:blue;">**Witness**</mark>: The digital signature (the "proof" or witness that you actually own the funds and authorized the transaction)
>
> ➜ the transaction data remains in the main block&#x20;
>
> ➜ signature data is moved to a separate witness structure outside the base/main transaction block
>
> ✔ By stripping out the heavy signature data, the main block can hold up to **4 times more transactions**.



**Key Benefits**

* ⚡ Lower Fees, Increased Capacity & Faster Times: More transactions fit into every block, reducing competition and lowering costs for users.
* 🛡️ Enhanced Security: It fixed a bug known as "<mark style="background-color:$danger;">**Transaction Malleability**</mark>," preventing bad actors from altering transaction IDs before they are finalized by excluding witness data from transaction ID calculation, making transaction ID's immutable.
* 🚀 Enabled Layer-2 Scaling: Fixing the transaction ID bug laid the essential groundwork for the **Lightning Network**, allowing instant, near-free microtransactions.





## Layer 2 Solutions

> **Transactions from a Layer 1 are off-loaded to a Layer 2 network**



#### <mark style="color:green;background-color:green;">**Nested Network**</mark>

* one blockchain is "**nested**" inside another
* the **inner network** performs all processing work and smart contract execution, and the result is simply documented on the outside/surrounding network
* e.g: `Ethereum Plasma` used on top of `Ethereum` layer 1 blockchain     &#x20;



#### <mark style="color:green;background-color:green;">**State Channel**</mark>

[#state-channels](../../blockchain-architecture/types-of-blockchains/layer-2-blockchain-platforms.md#state-channels "mention")



#### <mark style="color:green;background-color:green;">**Sidechain**</mark>

[#sidechains](../../blockchain-architecture/types-of-blockchains/layer-2-blockchain-platforms.md#sidechains "mention")



#### <mark style="color:green;background-color:green;">**Rollups**</mark>

[#rollups](../../blockchain-architecture/types-of-blockchains/layer-2-blockchain-platforms.md#rollups "mention")

* **`Pessimistic Rollup`**: execute transactions off-chain and only record them to the ledger once consensus has been reached
  * once transactions have been agreed upon, some proof of the transactions such as hash of their result are stored on the blockchain
* **`Optimistic Rollup`**: execute transactions off-chain, record them to the ledger, perform consensus at a later time
  * provide much greater performance than the pessimistic counterpart, although you take some risk
  * you have to have a high degree of confidence that your optimism is well founded
* increase performance by executing transactions on traditional/more centralized setup which is way faster than their decentralized counterparts



## Layer 3 Solutions&#x20;

> **Layer 3 platforms attempt to abstract away many of the concerns of the blockchain trilemma**
>
> ╰┈➤ allow you to focus on application / solution development rather than low-level operations that are taking place on the network layer

* still very new !



Layer 3 solutions are somewhat akin to&#x20;

* solutions like `Wix` or `WordPress` in the world of website development
* `C#` compared to `C++`
  * C++: focus on and control low-level details such as memory management
  * C#: low-level details are abstracted away, focus on application



## Web 2.5

> **Use centralized and decentralized components together**
>
> Mashup between&#x20;
>
> 1. centralized or web 2 technologies and
> 2. decentralized or web 3 technologies



Understand that technology tends towards centralization over time

* cost, convenience, availability of expertise, and economies of scale usually contribute to this drift
  * `HTML` → `Wordpress`
  * `Cold Fusion` → `Shopify`
  * `Internal Database` → `Salesforce.com`



## Benefits Vs Concerns of Possible Solutions

{% embed url="https://docs.google.com/spreadsheets/d/1cknx0c78jO9FgJ2Km_lK2bcNQjxcSYUGRv0CbOIEnFs/edit?usp=sharing" %}

