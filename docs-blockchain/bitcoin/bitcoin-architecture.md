---
icon: pen-ruler
---

# Bitcoin Architecture

## Bitcoin Architecture

uses SHA-256 algorithm

`Merkle trees` let lightweight clients validate transactions without downloading the full blockchain

╰┈➤ ensure efficiency and decentralization

#### Blockchain

Define rule: a **signed block's** **block hash starts with 4-0's (4 zeroes) always**

<mark style="background-color:green;">**Mining**</mark>: Finding a nonce (a number) such that the signed hash of data starts with 4-zeroes

* <mark style="background-color:$info;">Hash of ( block data + nonce ) = Hash starts with 4-zeroes</mark>

<figure><img src="../.gitbook/assets/bitcoin-blockchain.svg" alt=""><figcaption><p>A blockchain @ random peer: based on <a href="https://andersbrownworth.com/blockchain/blockchain">https://andersbrownworth.com/blockchain/blockchain</a></p></figcaption></figure>

Note: every participant/peer in the blockchain network has copy of this blockchain



#### Public/Private keys and signing transactions

[#signing-transactions](../blockchain-architecture/public-key-cryptography-and-wallets/#signing-transactions "mention")









