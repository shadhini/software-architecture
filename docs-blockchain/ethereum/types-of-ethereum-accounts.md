---
icon: list-tree
---

# Types of Ethereum Accounts

## Types of Ethereum Accounts



#### `EOA`: Externally Owned Accounts

> **EOA**:
>
> an account controlled by a private key that has the ability to send Ethers and messages from it



**Properties**

* it has an Ether balance
* it can send transactions
* it is controlled by private keys
* it has no associated code



#### Smart Contract Accounts

**Properties**

* it has an Ether balance
* it has an associated code
* it's code execution is triggered by transactions or messages received from other contracts&#x20;
* when executed, it performs operations of arbitrary complexity

[smart-contracts.md](smart-contracts.md "mention")



#### EOA vs Smart Contract&#x20;

Ethereum’s world state stores for every account: `nonce`, `balance`, `storageRoot`, `codeHash`

* CodeHash: Keccak‑256 hash (fingerprint) of an account’s runtime bytecode
* storageRoot: a fingerprint (hash) that represents everything stored inside an account’s storage “box”
  * 256-bit hash of the root node of the merkle tree that encodes the stored contents of the account encoded into the tree as "a mapping from the keccak 256-bit hash of the 256-bit integer keys to the RLP encoded 256-bit integer values"
  * this tree encodes the hash of the stored contents of this account&#x20;
  * this is empty by default

| Externally Owned Account - normal user account                                              | Smart Contract Account                                                                                                                                                                                                                                  |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| owned by a private key                                                                      | owned by code                                                                                                                                                                                                                                           |
| **Nonce**: number of transactions sent from the account address                             | **Nonce**: number of contracts created by the account                                                                                                                                                                                                   |
| **Balance**: amount of wei owned by the address                                             | **Balance**: amount of wei owned by the address                                                                                                                                                                                                         |
| **CodeHash**: hash of the empty string                                                      | <p><strong>CodeHash</strong>: Hash of the EVM code of an account, this is the code that gets executed if this address receives a message call</p><ul><li><strong>immutable</strong>: thus, it cannot be changed once the construction is done</li></ul> |
| **StorageRoot**: the storage box is empty —  so same fixed “empty” fingerprint for all EOAs | **StorageRoot**: changes when the contract writes or clears storage                                                                                                                                                                                     |

