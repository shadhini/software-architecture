---
icon: key
---

# Public Key Cryptography & Wallets

## Public Key Cryptography

> **Public Key Cryptography**:
>
> method of encrypting and decrypting data
>
> * a "**`key-pair`**" —  2 cryptographic keys are generated
>   * **public key**: knowable to anyone on the network
>   * corresponding **private key**: should only be known by the user it's granted to&#x20;
> * messages **encrypted** with a **private key**&#x20;
>   * ⟶ can only be **decrypted** using the **corresponding public key**
> * and vice-versa, any message **encrypted** with a **public key**
>   * ⟶ can only be **decrypted** using the **corresponding private key**

#### Story: Sharing secret messages between Bob and Alice

* Bob want to send a message to Alice that only Alice can read.
* Alice need to be able to verify when Alice get the encrypted message, that it actually came from Bob; and not somebody trying to impersonate Bob.
* Once Alice read Bob's encrypted message, Alice want to be able to send Bob an encrypted message back; a message that only Bob can read; a message that Bob can verify that it came from Alice.

process:

1. Bob encrypts (signs) the message with his private key and sends it to Alice.
2. Alice uses Bob’s public key to decrypt the message.
3. If decryption is successful, Alice knows the message really came from Bob (it was signed/encrypted with Bob’s private key).
4. When Alice wants to reply, she encrypts her message using Bob’s public key.
5. Only Bob can decrypt Alice’s message using his private key, ensuring only he can read it.



## Public Key Cryptography on Blockchain & Wallets

{% hint style="info" %}
**Public Key Cryptography**&#x20;

╰┈➤ **prevent** users trying to **impersonate** other users&#x20;

╰┈➤ **while** still doing much to **protect** their **overall** **anonymity**.
{% endhint %}

#### Story: Public Key Cryptography usage on Blockchain

* Bob has 100 Bitcoin in his wallet.
* Alice send a message to the Bitcoin network, impersonating Bob and tries to spend Bob's 100 Bitcoins on something.

╰┈➤ This transaction request will be rejected by the blockchain network. Because

* when the network tries to decrypt the transaction message with Alice's public key, it's not going to be successful as it was signed with Bob's private key.

### Wallet

> **— A container for a user's private key —**&#x20;

currency on a blockchain network&#x20;

* is virtual
* it doesn't need to be stored anywhere

— the only thing in the wallet is the private key —&#x20;







