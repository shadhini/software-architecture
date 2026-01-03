---
icon: pen-paintbrush
---

# Ethereum Architecture

#### Smart Contracts&#x20;

[smart-contracts.md](smart-contracts.md "mention")



#### Consensus Mechanism

> **Proof of Stake — PoS**

* people/validators lock up some ETH — put their ETH at stake, as a deposit so that they can help **secure the network**
* when you stake ETH, your validator gets chosen to check and add new transactions
* if you do it honestly, you **earn rewards**
* if you **try to cheat, you lose part of your stake**



to attack the network, **an entity needs at least 1/3 of all staked ETH to begin attacking the network**

* more than 1/2 changes which version is considered truth&#x20;
* more than 2/3 would allow finalizing something the rest don't agree with



{% hint style="info" %}
#### The Ethereum network switched from Proof of Work (PoW) to PoS in "The Merge" (September 2022).

* **`Ethash`** is the Proof‑of‑Work algorithm Ethereum used before the Merge (and which other chains such as Ethereum Classic still use)
{% endhint %}



#### `EVM`: Ethereum Virtual Machine

> **`EVM`: Ethereum Virtual Machine**
>
> * an engine which executes translation code
> * Ethereum possesses its own programming language knows as the **`EVM Bytecode`**
> * smart contracts are compiled into EVM bytecode and deployed to Ethereum Blockchain for execution
> * **turing complete** machine
> * uses a set of instructions, called **opcodes**, to execute specific tasks



<figure><img src="../.gitbook/assets/EVM.svg" alt=""><figcaption></figcaption></figure>





#### Ethereum Languages

<table data-header-hidden><thead><tr><th width="118.7421875"></th><th></th></tr></thead><tbody><tr><td><strong><code>Solidity</code></strong></td><td><p>Object oriented high-level language</p><ul><li>Similar to C and JavaScript</li></ul></td></tr><tr><td><strong><code>LLL</code></strong></td><td><p>Low-level Lisp-like Language</p><ul><li>One of the original Ethereum smart contract programming languages </li><li>It's similar to Assembly</li><li>simple and minimalistic language</li><li>serving as a tiny wrapper over coding in EVM directly</li></ul></td></tr><tr><td><strong><code>Vyper</code></strong></td><td><p>Derived from Python</p><ul><li>Contract oriented programming language</li></ul></td></tr><tr><td><strong><code>Serpent</code></strong></td><td><p>An Assembly language that compiles to EVM code that is extended with various high-level features</p><ul><li>Similar to Python</li></ul></td></tr><tr><td><strong><code>Mutan</code></strong></td><td><p>Go-based language</p><ul><li>supports dynamic / higher-level language</li><li>it compiles to native EVM assembler</li><li>however, now <strong>deprecated</strong></li></ul></td></tr><tr><td><strong><code>Julia</code></strong></td><td>Intermediate language for different EVMs</td></tr></tbody></table>





#### Transaction in Ethereum

* refer to a signed data package that is to be sent from EOA to another account on blockchain



#### Ethereum Block contains

* a transaction list
* recent state of the ledger that comprises these transactions



#### State Storage

* The states are assembled into a state tree that is linked to the account and the block
*   The Ethereum includes state roots that store the root hash of the hash tree which represents

    the system state when the block was created



#### How Ethereum stores transactions

| Block 180993                                                                 |
| ---------------------------------------------------------------------------- |
| <kbd>Prev Hash</kbd> \| <kbd>State root</kbd> \| `Tx root` \| `Receipt root` |
| _merkle_ tree roots are to maintain state, transactions and receipts         |

* a hash is generated for each transaction
* pairs are selected and hashes are generated for each pair and so the _merkle_ root is calculated &#x20;

