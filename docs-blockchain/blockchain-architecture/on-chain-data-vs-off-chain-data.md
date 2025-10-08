---
icon: link-horizontal-slash
---

# On-Chain Data vs Off-Chain Data

## On/Off Chains & Hybrid Mashups

> Blockchain is most often a **solution component**, **not a solution itself**!

* Blockchain can be used with other technologies such as
  * databases&#x20;



* **Not all data has to live on-chain**
  * **On-chain data can be linked to off-chain data**
    * greater speed and performance of database + benefits of blockchain
    * useful in scenarios where we need to make certain pieces of data go away

#### Example  Scenario: `GDPR's Europeon citizens right to be forgotten`

`GDPR` is often cited as a reason not to use blockchain in scenarios where personal information about users needs to be stored —  as any users' personal information should be permanently deleted upon user request to be compliant with GDPR

╰┈➤ This does not have to be the case&#x20;

╰┈➤ we can use **blockchain, database hybrid mashup**

* "personal information" can be stored on other solution components such as database
* but proofs or markers of that data such as cryptographic hashes (of that data) can live on chain providing **all the data security and integrity benefits in a blockchain**



#### Potential `GDPR` Solution: On/Off Chains Hybrid Mashup

* personal information → lives in a database
* hash of personal information → stored on-chain permanently&#x20;

<figure><img src="../.gitbook/assets/on-chain_off-chain_hybrid-mashup.svg" alt=""><figcaption></figcaption></figure>



Once Alice's personal data is removed from the database....&#x20;

If the regulator has Alice's personal data, then it can recreate the hash and figure out that exact same hash is available on the blockchain, but that it can not be recreated from the data in the database.

╰┈➤ which proves that Alice's personal data has been deleted from the database.





## Hybrid Mashups

{% hint style="success" %}
In a **Hybrid Mashup**...

* **On-chain** solutions handle **transparent, immutable transactions**,&#x20;
* while **Off-chain** solutions deal with **scalable, private transactions**.
{% endhint %}

1. **Database** as **primary**, Blockchain as secondary
   * e.g: [proposed GDPR solution above](on-chain-data-vs-off-chain-data.md#potential-gdpr-solution-on-off-chains-hybrid-mashup)
   * ensures database data has not changed since commitment to database through hashes
   * when database data changes, new hashes added to ledger
2. **Blockchain** as **primary**, database as secondary
   * use existing BI tools for reporting, analysis, dashboarding, etc against ledger data
     * by adding ledger data to existing datalakes
       * you don't have to worry about keeping your database copy of the ledger data in sync
         * since we have the implicit guarantee that the original source (blockchain) is never going to change&#x20;
     * perform ad-hoc queries and index important fields for faster performance



