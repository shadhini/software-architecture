---
icon: gears
---

# How Open Public Ledger works

## How open public ledger works

> **allows all participants to verify and view transactions**

operation of an open public ledger&#x20;

╰┈➤ relies heavily on cryptographic techniques and consensus algorithms&#x20;



* **Transaction creation**:&#x20;
  * transactions created by users are signed using their private key to ensure authenticity
  * _Example_: Transferring ownership of a digital asset
* **Transaction verification**:&#x20;
  * nodes in the network validate the transactions based on cryptographic principles
  * _Example_: Matching the sender's signature with a public key
* **Consensus mechanism**:&#x20;
  * nodes use a cryptographic consensus algorithm to verify the transaction's validity, preventing double-spending and ensuring network security
* **Adding to the ledger**:&#x20;
  * after consensus is assured, the transaction is recorded in a block, including the cryptographic hash of the previous block, linking the blocks securely
* **Distribution of ledger updates**:&#x20;
  * to reflect new transactions, all nodes update their copies of the ledger to maintain synchronization
    * using cryptographic methods to ensure data integrity



#### Security Implications

* **Pseudonymity**:&#x20;
  * users interact using cryptographic public keys instead of personal identifiers
  * protect their identities while ensuring transaction traceability
* **Data encryption**:&#x20;
  * sensitive data is encrypted before being added to the ledger
  * ensure personal information remains confidential and secure from unauthorized access
* **Consensus-based trust**:&#x20;
  * distribute trust across the network,
  * mitigates risks associated with single points of failure and centralized control



