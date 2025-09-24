---
icon: person-sledding
---

# Blockchain Features

## Blockchain Features

* **distributed/decentralized database | distributed ledger technology**
  * ledger with more than one copy; exists in more than 1 location; all copies must be maintained for data integrity
  * data must be altered in more than one place to change the truth
  * it's not enough for any hacker/ attacker to simply go, compromise/change/alter one of those copies
  * **no central authority** — provide security, transparency and trust without relying on traditional intermediaries such as banks/third parties
* **smart contracts**
  * automate processes/transactions & reduce the need for intermediaries or manual intervention
    * automatically trigger the next step when predefined conditions are met&#x20;
* **Public Key Cryptography**: method used to secure transactions & data on the blockchain
  * **prevent** users trying to **impersonate** other users **while** still doing much to **protect** their **overall** **anonymity**.
* blockchain structure: **linked blocks with cryptographic hashes**
  * every block connected/linked to previous block by cryptographic hash of the previous blocks content
  * altering one block would require changing all subsequent blocks&#x20;
* **group consensus**
  * block is accepted if majority (51%) of the participants agrees on it according to the consensus mechanism

### Permanence / Immutability

> **Everything on a blockchain ledger is permanent !**
>
> ❗**on chain data — can never be deleted**

**immutable records**

* no one can tamper with transaction once it's been recorded
* if there's an error in transaction record → a new transaction must be added to reverse the error
  * both transactions are then visible
* updates / deletions — recorded as new ledger entries

#### ✅ Good for

* creating detailed and dependable audit trails

#### ❗ Poses issues for

* data retention
* regulatory compliance
  * even if a customer asks to delete or update existing data, it cannot be done
  * only thing we can do on a blockchain is adding a new entry saying from this timestamp onwards this data is&#x20;
    * updated to new value (for update scenario)&#x20;
    * or deprecated (for delete scenario)

