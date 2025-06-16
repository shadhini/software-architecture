---
description: 'P2P: Peer-to-Peer Network Architecture Model; Architectural Style/Pattern'
icon: chart-network
---

# P2P: Peer-to-Peer

## `P2P`: Peer-to-Peer Architecture

<kbd>Distributed Network Architecture</kbd>

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
> Each peer can act as both a client and a server.



* Decentralized
* Requires **peer discovery**&#x20;
  * e.g: `DHT`
* Requires `NAT` **traversal** for **connectivity**



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
* Real-time commuication platforms.

