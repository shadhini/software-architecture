---
icon: '2'
---

# Blockchain Layers: Layer 2

## Layer 2 Platforms&#x20;

> **Layer 2 Platforms**:
>
> * built on top of Layer 1 platforms
> * aims to solve some of the **usability problems of Layer 1** such as&#x20;
>   * **high expense**
>   * **low performance**&#x20;
> * generally made up of&#x20;
>   * **`state channels`**:  blockchain ledger + off-chain transactional channel for bulk data
>   * **`sidechains`**: main chain for main data + cheaper, more performant side chain for supporting data
>   * **`rollups`**: main ledger with proof of what happened on side ledger + side ledger

#### Metaphor: with respect to PC

OS ➝ Layer 1

API: programming interface (set of libraries) ➝ Layer 2

### State Channels

* allow for **two-way communication** between a **blockchain ledger** and **off-chain** transactional channels
  * e.g: state channel with a database
* increase overall transaction speed & volume and lower the cost of transactions
  * ╰┈➤ by storing the bulk of critical data off-chain



### Sidechains

separate transactional chains that integrate with blockchain

* **main chain**: main data stored on chain like a state channel
* **side chain**: supporting data stored on another, cheaper and more performant blockchain



### Rollups

enable transactions outside the layer 1 network, with resulting data stored on the layer 2 ledger

* a way to leave a proof of what happened on the side ledger on the main ledger



### Notabe Layer 2 Blockchains

* Ethereum-based Layer 2 platforms
  * Optimism
  * Arbitrum
  * Polygon
* Bitcoin-based Layer 2 platforms
  * Lightning Network

