---
icon: screwdriver-wrench
---

# Ethereum Tools

## Ethereum Tools

#### Geth

> Multipurpose **command line tool that runs an Ethereum node** implemented in Go

* official Go lang implementation of the Ethereum protocol
* commonly used to interact with the Ethereum network

<figure><img src="../../.gitbook/assets/ethereum-geth.svg" alt="" width="375"><figcaption></figcaption></figure>

{% embed url="https://geth.ethereum.org/" %}



#### Ganache CLI

> a **fast** and **customizable** **Blockchain emulator**&#x20;
>
> which **allows to make calls to Blockchain without running the actual Ethereum node**

* transactions are mined instantly&#x20;
* no transaction cost
* accounts can be recycled, reset, and instantiated with a fixed amount of Ether without the need for faucets or mining
* gas price and mining speed can be modified
* &#x20;a convenient GUI gives you an overview of your testchain events&#x20;

{% embed url="https://archive.trufflesuite.com/ganache/" %}

{% embed url="https://github.com/ConsenSys-archive/ganache-ui" %}

{% hint style="info" %}
**`ConsenSys`**, the company that acquired and maintained these projects, decided to sunset **`Ganache`** & **`Truffle Suite`**  and  discontinue their active development and support after a 90-day support period following the announcement in September 2023
{% endhint %}

* **`ConsenSys`** is shifting its development efforts toward newer developer tools and APIs, specifically focusing on MetaMask-related toolings (like **Snaps** and **SDK**), **`Infura`**, and **`Linea`**.
* Truffle and Ganache users are encouraged to move to **`Hardhat`**, **`Foundry`**, **`Remix`**, **`Thirdweb`**, **`OpenZeppelin`**, and other actively maintained ecosystem tools



#### Parity

> The **fastest**, **lightest**, and **most secure** **Ethereum client** that provides the core infrastructure essentials for quick and reliable services
>
> * an Ethereum client that is **integrated directly into your web browser**

* written in `Rust` language
  * offers better reliability, code clarity & performance
* Parity serves as a Ethereum GUI browser
* provides access to a diverse range of Ethereum features including dApps

<figure><img src="../../.gitbook/assets/ethereum-parity.svg" alt="" width="563"><figcaption></figcaption></figure>



#### MetaMask

> **— browser based wallet —**&#x20;
>
> turns Google Chrome into a browser that allows the users to send and receive transactions
>
> and also to fetch data from the Blockchain

* permits you to run Ethereum dapps directly from your browser without the need for running full Ethereum node
* practically, it is unrealistic for everyone to run a node to interact with Ethereum blockchain
* to overcome this, MetaMast has host a number of nodes, so you don't have to

<figure><img src="../../.gitbook/assets/ethereum-metamask.svg" alt="" width="563"><figcaption></figcaption></figure>



#### Mist Wallet

> **End-user interface** for Ethereum that is developed **for** **browsing and using Dapps**
>
> **— an official Ethereum wallet —**&#x20;

* developed and distributed by the team, which is responsible for the management of Ethereum ecosystem
* used by developers who want to create, deploy, and use smart contracts&#x20;
* a full node wallet — you'll have to download the entire Ethereum Blockchain onto your computer



Applications

* Sending and receiving transactions
* Creating multi-signature wallets
* Storing Ether
* Deploying smart contracts



#### Swarm

> a platform which supports **distributed storage** and provides **content distribution services**
>
> **—** acts as a **native base layer** service of the **`Ethereum web3`** **stack —**&#x20;

*   provides sufficient decentralization and redundant storage of Ethereum records to distribute

    Blockchain data as well as Dapp codes
* leverages the underlying Ethereum infrastructure through the use of smart contracts and Ethers  to encourage cooperation among nodes&#x20;
* files are split into pieces and are store in the nodes of the network&#x20;
* an accounting protocol is used by the peers to keep track of these chunks delivered and received and resulting micro payments associated with it &#x20;



#### `IPFS`: InterPlanetary File System

> a **decentralized storage system** that is **not related directly to Ethereum** but **can be integrated with it**

* stores data by use of a `DHT`: Distributed Hash Table
* once we know the hash, we request the peer network who has a copy of the content located at the corresponding hash
* and then, we download the content from the node who has the desired data we need&#x20;
* the data transfer between the nodes in the network uses a mechanism which is similar to the one used in **`BitTorrent`**
* &#x20;provides a versioned file system capable of storing files and tracking versions over time&#x20;
  * it defines how files move across network&#x20;

<table><thead><tr><th width="183.5234375">Attribute</th><th>IPFS</th><th>Swarm</th></tr></thead><tbody><tr><td>Main Goal</td><td>Decentralized file sharing</td><td>Decentralized storage for Web3/Ethereum</td></tr><tr><td>Content Address</td><td>Content hash (CID)</td><td>Content hash &#x26; manifests</td></tr><tr><td>Incentives</td><td>None (native), Filecoin (external)</td><td>Built-in (BZZ token)</td></tr><tr><td>Data Persistence</td><td>Voluntary (pinning)</td><td>Paid, incentivized</td></tr><tr><td>Versioning</td><td>Yes (Merkle DAGs)</td><td>Yes (Feeds/manifests)</td></tr><tr><td>Ethereum Integration</td><td>Basic (oracle bridges possible)</td><td>Tight (native support)</td></tr><tr><td>Use Cases</td><td>Web archiving, hosting, collaboration</td><td>DApp asset storage, blockchain state</td></tr></tbody></table>

#### Whisper

> An **identity-based communication protocol** **for Dapps to interact with each other**

* Dapps that need to publish small amounts of information to each other and have the publication lasts for substantial amount of time prefer using Whisper
  * e.g: a Dapp running a currency exchange may use Whisper to be courting an offer to buy a currency at a pre-agreed price on the exchange platform



Drawbacks in Whisper

* low-level API: only exposed to Dapps and never to users
* low bandwidth: not designed for large data transfers
* uncertain latency
* unreliable for tracing packets
