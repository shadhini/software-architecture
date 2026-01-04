---
icon: cubes
---

# Hyperledger

## Hyperledger

> an **open source global collaborative effort** hosted by **`The Linux Foundation`**
>
> * advances **cross-industry blockchain** technologies&#x20;
> * a consortium of organizations
>
> —  a **framework** to **create, deploy, maintain  blockchain** for business —&#x20;
>
> * designed for enterprise-based blockchain solutions
> * **not** a Blockchain, blockchain platform, a company, or a cryptocurrency
> * a software used to create personalized Blockchain service
> * Hyperledger projects are **permissioned:** only authorized participants can join
>   * enterprises gain control over privacy, data access, and compliance — features less available in public blockchains like Ethereum or Bitcoin

On Hyperledger network, **only parties directly related to the transaction deal are updated on the ledger**

╰┈➤ thus maintaining privacy and confidentiality

╰┈➤ use of the concept of <mark style="background-color:green;">**channel**</mark>



#### Channel

> a virtual blockchain network which sits atop of a physical blockchain network and has its **own access rules**
>
> * they employ their **own mechanism** for **transaction ordering** &#x20;
> * ╰┈➤ thus ensure **scalability**
> * ╰┈➤ permit **effective ordering** along with **separation of data**

e.g: When John and Kat are conducting a transaction, a private channel between them serves as method of interaction.

* thus,  smart contract can be viewed by only these 2 parties&#x20;
* network's endorsement policy verifies their membership with the network to ensure privacy&#x20;





#### Restrictions in public blockchain for enterprise-based solutions&#x20;

*   In public Blockchain, each peer has to execute each and every transaction and run consensus

    algorithm to validate it

    * ╰┈➤ **not scalable**, **not confidential**


* Public blockchains are fully transparent: anything recorded is visible to everyone
  * e.g: a bank’s discounted loans or premium card perks become public if written on-chain
* Risks: customer privacy breaches, increased disputes over visible terms, exposure of competitive strategies/trade secrets
* Consequences: legal/regulatory risk and competitive disadvantage
* Cause: platforms like Ethereum store smart contracts and transaction data on a public ledger
* Quick fixes:&#x20;
  * use **permissioned/private chains**
  * keep **sensitive data off-chain** and store only hashes on-chain
  * apply **cryptographic methods** (e.g., zero-knowledge proofs)



#### Hyperledger Transaction

<mark style="color:$primary;">**Initiate Process**</mark>: John plans to send message to Kat

* we have state in the ledger named as _**message**_, denoting the last message that had been sent&#x20;
* and it is stored as a **key-value pair** in peer of organization
* John submits request to the `node.js` backend from the message dashboard

<mark style="color:$primary;">**App Query**</mark>: Takes this proposal state and sends it to all endorsing peers&#x20;

* the `node.js` SDK client takes this new proposed state and sends a proposal to all the **endorsing peers** of the organization as per the **endorsing policy** defined in the **channel configuration** as well as confining to the **membership services**

<mark style="color:$primary;">**Membership Services**</mark>: Validates Kat’s address

<mark style="color:$primary;">**Hyperledger**</mark>: Invokes the corresponding function described in the <mark style="background-color:green;">**chaincode**</mark>

<mark style="color:$primary;">**Orderer**</mark>: Verifies the message, which finally gets committed to the CouchDB —  thus confirming the transaction

<mark style="color:$primary;">**Process Ends**</mark>: Once the transaction is verified from the consensus cloud, Kat receives the message



#### Modular Architecture

Hyperledger platforms use a <mark style="background-color:green;">**modular approach**</mark>, making components like consensus, smart contracts (chaincode), identity, and storage highly **pluggable**

This allows enterprises to select and customize elements according to their needs, including:

* <mark style="background-color:green;">**Consensus Layer**</mark>**:** Ordering and validating transactions
* <mark style="background-color:green;">**Contract Layer**</mark>**:** Implementing business logic via chaincode/smart contracts
* <mark style="background-color:green;">**Communication Layer**</mark>**:** Secure peer-to-peer messaging between network components
* <mark style="background-color:green;">**Identity Services**</mark>**:** Membership and authorization control
* <mark style="background-color:green;">**API Layer**</mark>**:** Easy integration with external systems
* <mark style="background-color:green;">**Interoperability Module**</mark>**:** Facilitates multi-chain or multi-network operations



#### The Linux Foundation's Hyperledger Umbrella Strategy/Project

{% hint style="info" %}
Linux foundation provides infrastructure, services, events, training and financial resources for creating sustainable open-source ecosystems
{% endhint %}

Hyperledger nurtures a lot of Blockchain frameworks and technologies under the open-source umbrella project

**`Sawtooth Lake | Fabric | Burrow | Iroha | Indy`**



#### Hyperledger Greenhouse

<mark style="color:$primary;">**1. Frameworks (Distributed Ledger Platforms)**</mark>

* **`Hyperledger Fabric`:** modular, permissioned, with support for pluggable consensus protocols
  * blockchain framework contributed by `IBM`
  * utilizes container technology to host smart contracts (chaincode)
  * used extensively in supply chain networks
* **`Hyperledger Sawtooth`:** blockchain platform focuses on simplifying blockchain deployment with a modular architecture
  * used in supply chain networks
  * for building distributed ledger applications and networks
  * application layer and core system separation
  * parallel transaction execution
  * pluggable consensus algorithm
  * private networks with Sawtooth permissioning features
  * Ethereum contract compatible with Seth
  * event system
* **`Hyperledger Iroha`:** designed for mobile/web applications and simple infrastructures
  * simple, client-central blockchain platform hosted by the `Linux Foundation`
  * contributed by `Soramitsu`, `Hitachi` and `NTT Data`
  * written in `C++`
  * incorporates a unique algorithm on chain based Byzantine Fault Tolerant consensus&#x20;
  * provides small set of fast commands & queries covering most common operations for the digital asset and identity management
  * highly secure and portable
* **`Hyperledger Indy`:** specializes in decentralized identity management
  * distributed ledger & utility library&#x20;
  * provides tools, libraries, reusable components to create and use independent digital identities based on blockchains
  * they are inoperable across administrative applications, domains and any other silos
  * used as a decentralized identity database
* **`Hyperledger Besu`:** an Ethereum-compatible client for permissioned networks
  * for broad Ethereum compatibility, mature operator tooling, and enterprise privacy/permissioning features
* **`Hyperledger Burrow`**: used to run Ethereum smart contracts
  * blockchain framework hosted by the `Linux Foundation`
  * contributed by `Monax`, and co sponsored by `Intel`
  * permissioned smart contract application engine partially developed according to the specifications of `EVM`
  * used to run `Ethereum` smart contracts
  * a lightweight, permissioned `EVM` node built for multichain universe that is easy to integrate with Byzantine Fault Tolerant consensus engines (e.g., `Tendermint`) for fast finality in small validator sets
    * permissioned EVM: ensure that the appropriate permissions are granted and the VM is built to Ethereum's specifications
  * `ABI`: Application Binary Interface — contains arguments used in the smart contract&#x20;
  * `ABCI`: Application Blockchain Interface — enables the transactions to be processed in the language you prefer
  * API Gateway

**2. Tools**

help with testing, deployment, monitoring, and integration

* **`Hyperledger Caliper`:** benchmarking tool for measuring blockchain performance
* **`Hyperledger Explorer`:** user-friendly web interface for viewing blockchain metrics
* **`Hyperledger Cello`:** automates blockchain network deployment
* **`Hyperledger Quilt`:** offers interoperability between multiple ledgers
* **`Hyperledger Composer`**: now‑archived, high‑level development framework and toolset for quickly modeling, building, and exposing business networks and APIs on Hyperledger Fabric

**3. Libraries**

reusable software components for developers

* **`Hyperledger Ursa`:** cryptographic library for shared security
* **`Hyperledger Aries`:** protocols for interoperable, secure identity exchange
* **`Hyperledger Transact`:** helps manage transaction logic common to many projects



