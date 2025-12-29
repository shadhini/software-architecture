---
icon: list-tree
---

# Merkle Tree

## `Merkle` Tree

> **Merkle Tree**:
>
> organize large datasets in a hierarchical hash-based structure for efficient data verification within a block

* compress transactions into a single hash (deterministic) — **`Merkle root`**&#x20;
  * by hashing transactions in pairs and then hashing those hashes until a single hash; the **merkle root**, is formed&#x20;
* enables fast validation&#x20;
  * as Merkle root allows users to verify a transaction without downloading the entire block
* less memory and bandwidth required



aka <kbd>**Binary Hash Tree**</kbd>



e.g: `Bitcoin`

* Merkle trees let lightweight clients validate transactions without downloading the full blockchain
  * by validating the hash one can verify that, that particular transaction hasn't been tampered with.. there is no need to verify the actual data
* ensure efficiency and decentralization

