---
icon: signature-lock
---

# Signing Transactions

## Signing Transactions

#### **How to stop someone from spending another person's money?**

╰┈➤ Every transaction must be **signed** by the sender’s private key

╰┈➤ The signature can be **verified** by anyone using the sender’s public key and the transaction message

* <mark style="background-color:$info;">decrypt (sign, sender's public key) == hash(message received)</mark>

<figure><img src="../../.gitbook/assets/signing-transactions.svg" alt=""><figcaption></figcaption></figure>



#### **How Transaction Signing Protects the Blockchain**

* If someone tries to change any detail of a transaction (for example, the amount or recipient), the original signature will no longer match
* When miners validate a block:
  * Even if they can update the hash and find a valid nonce after a transaction is altered
  * **They cannot forge a valid signature** without the original sender’s private key
    * since <mark style="background-color:$info;">signature = encrypt (\[hash of original transaction data], sender's private key )</mark>
* This mechanism **ensures only the legitimate owner** (the one who initiated the transaction) **can sign & authorize transactions** from their account

<figure><img src="../../.gitbook/assets/signature-validation-2.svg" alt=""><figcaption></figcaption></figure>



**blockchain of peer A & B before any tampering ...**

<figure><img src="../../.gitbook/assets/signature-validation-stage1.svg" alt=""><figcaption></figcaption></figure>

**after block 2 of peer A being tampered .....**

<figure><img src="../../.gitbook/assets/signature-validation-stage2.svg" alt=""><figcaption></figcaption></figure>



**after the tampered block 2 of peer A is re-mined, while trying to rebuild/re-mine the whole blockchain of peer A with the tampered block ...**

* even if the tampered block of peer A is re-mind finding a new nonce and block hash, the signature of the tampered transaction remains invalid as it cannot be re evaluated as no one else other than the one who initiated this particular transaction has access to his private key&#x20;

<figure><img src="../../.gitbook/assets/signature-validation-stage3.svg" alt=""><figcaption></figcaption></figure>





