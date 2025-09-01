---
description: 'P2P: Peer-to-Peer Network Architecture Model; Architectural Style/Pattern'
icon: chart-network
---

# P2P: Peer-to-Peer

## `P2P`: Peer-to-Peer Architecture

<kbd>Distributed Network Architecture | Decentralized</kbd>

> **Nodes** (peers — participants) **communicate directly** without a central server,
>
> **sharing** **resources** or **computation** like&#x20;
>
> * files&#x20;
> * processing power
> * disk storage
> * network bandwidth
>
>
>
> Each peer can act as **both** a **client** and a **server**.&#x20;
>
> Peers both supply & consume the resources.

* Decentralized
* Requires **peer discovery**&#x20;
  * e.g: `DHT`
* Requires `NAT` **traversal** for **connectivity**

<figure><img src="../.gitbook/assets/software-architecture_architectural-pattern_P2P.svg" alt="" width="375"><figcaption><p>P2P</p></figcaption></figure>

## Benefits

* decentralized — no single point of failure
* fault-tolerant
* scalable for distributed systems



## Implementation

### Frameworks

* `libp2p` — used in IPFS
* `WebRTC` for P2P video



### Tips

* use **encryption** for security
* test with **multiple nodes**



## Use-cases

* `BitTorrent` for file sharing.&#x20;
* Blockchain networks like `Ethereum`, `Bitcoin`.
* Real-time communication platforms — instant messaging
* Collaboration&#x20;
* High performance computing



