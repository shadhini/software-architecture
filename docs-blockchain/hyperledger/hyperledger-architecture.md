---
icon: pen-ruler
---

# Hyperledger Architecture

## Hyperledger Architecture



#### Hyperledger Blockchain Network Participants

* Blockchain User: Performs B2B transactions
  * can invoke a function from the chaincode in order to send the instructions message to the underlying network, which can then process the transaction
* Certificate Authority: Accesses security certifications in order to determine the parties who have required privileges to be an actor on the network
  * ensures that only certain restricted parties can be part of the business network on Hyperledger
* Traditional Database: Stores access to data
* Traditional Processing Platform: Stores access to logical code written which is used to run the network as per the design
* Blockchain Development Network: Operates the Blockchain network which enables the execution of the smart contract/chaincode as well as various transactions that takes place between the participants which are part of the network
* Blockchain Developer: Develops applications on blockchain using chaincode
  * currently `Hyperledger Fabric` supports `node.js`, `Java`, `Go` languages to write chaincodes
* Regulator: Performs oversight to ensure that the platform is operating without any bias





#### Hyperledger Architecture Components

* Consensus layer
* Smart contract layer
* Communication layer
* Data storage abstraction
* Identity and policy services
* Crypto abstraction
* API
* Interoperation



#### Hyperledger Architecture

<figure><img src="../.gitbook/assets/hyperledger-architecture.svg" alt="" width="563"><figcaption></figcaption></figure>



**Membership Service:**&#x20;

* set of cryptographic materials (certificates) that defines organization by itself
* every peer and orderer needs this type of certificate&#x20;
* this certificate has some common properties by which we decide whether the peer and the orderer belongs to the same organization or not
* a peer which is a part of the same MSP can communicate with each other&#x20;
* a peer from other organizations cannot be allowed to communicate with each other&#x20;



**Blockchain & Transaction Layer:**

* this layer constitutes the core code of the blockchain&#x20;
* comprises of&#x20;
  * consensus algorithm which is required to make the final decision on the state of every transaction
  * distributed ledger & ledger storage which stores the entire history of the transactions and the last known states&#x20;
  * P2P protocol which is used for communication between different nodes on the network



**Chaincode:**

* the logical programming layer which consists of the business logic required to run an operation on hyperledger&#x20;



