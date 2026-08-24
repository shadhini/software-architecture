---
icon: list-tree
---

# Blockless Platforms

## Blockless Platforms

> **Blockless Platforms**:
>
> Store transactions individually or as events, often using a **Directed Acyclic Graph (DAG)** or other structure.
>
> Verifiable execution layers that separate computing from on-chain settlement.

#### Examples of Blockless Platforms

1. **IOTA (Tangle)**
   * Uses a DAG called "Tangle" instead of blocks.
   * Each new transaction confirms previous ones, leading to a web of transactions rather than a chain of blocks.
2. **Nano**
   * Uses a block-lattice structure, where each account has its own blockchain.
   * Transactions are not grouped into blocks but are recorded individually per account.
3. **Radix**
   * Uses a “Cerberus” consensus protocol and a sharded, blockless data structure for scalability.
4. **Hashgraph (Hedera)**
   * Uses a gossip protocol and virtual voting; transactions are not organized in blocks.



#### When to Use

use when building decentralized applications (dApps) or Web3 software that requires&#x20;

* **off-chain scaling**
* **high-speed execution / real-time interactions**
  * remove the latency of on-chain block times
* **complex computational logic**
* **cross-chain compatibility**
* **trustless off-chain exectution**
  * when building decentralized tools like oracles, cron jobs, pluggable indexers, decentralized caching networks
* **app-specific sequencing**
  * when your application needs its own sovereign execution model that controls state evolution independently





