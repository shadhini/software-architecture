---
description: What is blockchain ?
icon: hive
---

# Blockchain

## Blockchain

> **Blockchain**
>
> 1. A blockchain is a **network protocol** which creates and manages a **decentralized ledger**.
> 2. Ledger copies are kept in-sync via **group consensus**.
> 3. Almost all blockchain networks are capable of running **Smart Contracts**.

#### Network Protocol

* **protocol**: set of rules for specific circumstances
  * can be applied to any context/environment — small/large, private/public networks
    * e.g: both private and public networks use HTTP/HTTPS to serve up content to anyone who requests it
* **network protocol**: set of rules implemented on a standard TCP/IP computer network of any size or scope
  * rules govern how network participants should behave
  * <kbd>blockchain can run on different networks</kbd>&#x20;
    * public networks (the internet) or private ones | small/large networks
      * blockchain over internet , private blockchain network&#x20;



#### Decentralized Ledger

* **ledger**: keeps track of events that happen to the things we care about (assets)
  * contain any type of data: financial data, stats, transactions, weather & climate data ....
  * **`a log`**
* **decentralized ledger**:&#x20;
  * ledger with more than one copy; exists in more than 1 location; all copies must be maintained for data integrity
    * enhances security — data must be altered in more than one place to change the truth
    * it's not enough for any hacker/ attacker to simply go, compromise/change/alter one of those copies&#x20;
  * <kbd>in a blockchain network, every computer/server/miner on the network is keeping their own copy of the ledger</kbd>&#x20;
  * **`a contract`**
    * all the parties involved must sign & then all the parties keep a copy of the signed contract&#x20;
    * by everyone keeping copies it ensures that one party cannot change the terms of the contract on their own — maintains integrity&#x20;



#### Group Consensus

* a way of deciding which copy of the ledger is the correct one as multiple copies are available
* means of "**`majority rules`**" — 51% agreement&#x20;
  * the ledger copy that  the majority of participants agree on, is the one that is assumed to be the correct version — true copy
  * everyone will then sync their ledgers to that copy&#x20;
* <kbd>In blockchain network, group consensus is a process used to compare different versions of the ledger and to decide which version is the correct one.</kbd>
  * majority rules determines whcih version the minority will sync to
  * if no agreement can be made (less than 51%), the block is discarded and the network will try building it again

{% hint style="info" %}
Consensus Mechanisms:

* Proof of Work
* Proof of Stake
{% endhint %}

#### Smart Contracts

* self-executing: **code** that is invoked when an event occurs which affects an asset we're tracking
* code **stored on a blockchain** that are **automatically executed** when predetermined terms and conditions are met
  * terms directly written into code
*   **`a class / object definition`**



&#x20;



## Example: a blockchain solution for managing chain-of-custody for avocados

* go to grocery store and scan the QR code of the avocado with a mobile app, and you can see the origin & chain-of-custody of the avocado at your hand&#x20;
  * farmer → importer → distributor → retailer
* can be used by shoppers in grocery stores to ensure the avocados they're buying are produced under fair labor standards
* the solution notifies you (user) when your retailer has just received another shipment&#x20;
  * code (send notification) to be executed when an event (retail store delivery) occurs that affect our asset (avocados)
  * this code lives in a smart contract





