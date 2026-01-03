---
icon: window-frame-open
---

# Ethereum Frameworks

## Types of Ethereum Frameworks



#### Web3.js

> set of libraries which permit one to interact with a remote or local Ethereum node
>
> * the key connection between Ethereum network and Dapp that allows to compile, deploy, and interact with smart contracts

* can be done with the use of HTTP or RPC connection
* it gives us a way to build a website or client that can talk to the Ethereum blockchain



**Traditional Development**

* website talks to APIs using `JSON` or `jQuery` to make `AJAX` calls&#x20;

**Blockchain Development**

* website talks to blockchain using `Web3`, using **`JSON-RPC`** which is similar to making a remote procedure call
* `JSON-RPC` is used to make a request to a particular node in the Ethereum network — which is like an API call
* thus, if we want to talk to a smart contract or read an account, we do it through `Web3`



<figure><img src="../../.gitbook/assets/ethereum-web3-js.svg" alt="" width="563"><figcaption></figcaption></figure>

solc: Solidity Compiler



#### Eth.js

> A highly **optimized**, **lightweight** **JS utility** for Ethereum based on web.js
>
> * all the unnecessary characters are removed from the source code, and the code is reduced to 160 KB





