---
icon: globe-wifi
---

# Bitcoin Nodes and Network

## Bitcoin Network

p2p network

* Bitcoin is an **ad-hoc network** with **random topology**
* The protocol runs on **`TCP 8333`**
  * `TCP 8333`: the default port used by Bitcoin clients to connect to other Bitcoin nodes
* All the nodes are treated equally in Bitcoin network
* New nodes can join the network anytime, and the nonresponsive nodes are removed after 3 hours

### Bitcoin Network Node

Nodes in the Bitcoin network may take on different roles depending on the functionality they support



A <kbd>full Bitcoin node</kbd> is a collection of four functions:

1. **Wallet**: usually part of the full node, specially in desktop Bitcoin client&#x20;
2. **Miner**:&#x20;
   * some mining nodes are also full nodes maintaining the full copy of the blockchain;&#x20;
   * others are light-weight nodes participating in **pool mining** and depending on pool server to maintain a full node
3. **Full blockchain**:&#x20;
   * full nodes maintain a complete and up-to-date copy of a Blockchain
   * can authoritatively and autonomously verify any transaction without external reference
4. **Network routing node**: all nodes include the routing function to participate in the network



### Types of Bitcoin Nodes

<table><thead><tr><th width="192.17578125">Type of Bitcoin Node</th><th width="251.75">Contains</th><th>Notes</th></tr></thead><tbody><tr><td>Reference Client (Bitcoin Core)</td><td><p><mark style="background-color:$info;">Wallet</mark> + <mark style="background-color:$info;">Miner</mark> + </p><p><mark style="background-color:$info;">Network Routing Node</mark> + </p><p><mark style="background-color:$info;">Full Blockchain database</mark></p></td><td></td></tr><tr><td>Full Blockchain Node</td><td><p><mark style="background-color:$info;">Network Routing Node</mark> + </p><p><mark style="background-color:$info;">Full Blockchain database</mark></p></td><td></td></tr><tr><td>Solo Miner </td><td><p><mark style="background-color:$info;">Mining functio</mark>n + </p><p><mark style="background-color:$info;">Network Routing Node</mark> + </p><p><mark style="background-color:$info;">Full Blockchain database</mark></p></td><td></td></tr><tr><td>Lightweight (SPV) Wallet</td><td><p><mark style="background-color:$info;">Wallet</mark> +</p><p><mark style="background-color:$info;">Network Routing Node</mark> </p></td><td></td></tr><tr><td>Pool Protocol Servers</td><td><mark style="background-color:$info;">Pool Server</mark> / <mark style="background-color:$info;">Stratum Server</mark></td><td>gateway routers connecting the Bitcoin p2p network to nodes running other protocols such as <strong>pool mining</strong> or <strong>Stratum nodes</strong></td></tr><tr><td>Mining Nodes</td><td><p><mark style="background-color:$info;">Mining function</mark> + <mark style="background-color:$info;">Stratum Server</mark> / </p><p><mark style="background-color:$info;">Mining function</mark> + <mark style="background-color:$info;">Pool Server</mark></p></td><td></td></tr><tr><td>Lightweight (SPV) Stratum Wallet</td><td><mark style="background-color:$info;">Wallet</mark> + <mark style="background-color:$info;">Stratum Server</mark> </td><td>a wallet &#x26; a network node on the Stratum protocol</td></tr></tbody></table>



## Joining Bitcoin Network

> **Seed Nodes**:&#x20;
>
> — special nodes in the Bitcoin network which have the **list of addresses** —&#x20;
>
> **purpose**: to be used by nodes that are joining the network for the first time to get a list of other nodes which they can connect to&#x20;

* **uptime** of seed node is generally **high** and it has connections to several other nodes



> **DNS seeders:**
>
> — responsible for providing a list of seed nodes —&#x20;
>
>

* as a **contingency** **Bitcoin core** also has some **hard coded fallback seed nodes** which are used in situations when the DNS seeders are not available&#x20;



#### Process

* Joining nodes ask for the list of addresses from the seed node
* In response to the node’s request to join the network, the seed node sends them the address list
* The joining node picks up an address from the list and joins the network
* The newly joined nodes then get the most recent Blockchain from its peers



{% hint style="info" %}
#### Nodes do not directly connect to seed nodes as a normal node would

&#x20;instead&#x20;

* nodes connect
* then request the IP addresses of the other nodes in the network and&#x20;
* disconnect
{% endhint %}



