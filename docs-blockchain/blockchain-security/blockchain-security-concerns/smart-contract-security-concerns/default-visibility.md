---
icon: eye
---

# Default Visibility

## Default Visibility Problem

> On most blockchains, **smart contract functions are public by default**

* developers can **scope** Smart Contract **functions** according to the visibility they are intended to have
  * functions can be marked as **private/internal** — only accessible to other functions in the same smart contract
  * functions can be marked **public/external** — accessible to anyone or anything on the network, including other smart contracts
* On most blockchains, **`public`** is **the default visibility**!
  * if you don't keep this in mind, this can expose some critical functions that you really don't want to or don't intend to&#x20;



## Default Visibility Problem in Real Life

#### `Parity Multi-Signature Wallet` hack

* Parity Multi-Signature Wallet was a type of blockchain wallet that allowed for multi-signature transactions — transaction that have to gain the approval of more than one user or wallet before they execute&#x20;
* occurred as a result of developers **leaving** **two functions public** which should have been private
* attacker called these functions to steal ownership of the contract funds  — unlocking administrative functions to them &#x20;
* attacker was able to steal $31M worth of Ether!
* one of the biggest and most expensive attacks in the history of blockchain



More on Parity MultiSig Wallet hack:

{% embed url="https://haseebq.com/a-hacker-stole-31m-of-ether/" %}





