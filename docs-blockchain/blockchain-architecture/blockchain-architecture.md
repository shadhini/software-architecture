# ✅ Blockchain Architecture

blockchain — chain of blocks

each block carries

* transaction data&#x20;
* a hash — immutable unless someone has breached the system&#x20;

blockchain — **distributed database**; stored across multiple nodes with each holding a full copy

cryptographic hash —  hash relationship

* core security feature of blockchain&#x20;
* every block contains the hash of the previous block

consensus — referee

layers function together

* application layer — DApps running&#x20;
* data layer — blocks&#x20;
* network layer — P2P network, communication & transaction propagation
* protocol layer

public/private key architecture

smart contracts — automated condition-based transactions



**blockchain application — 3 primary architectural layers**

* top layer — user interface layer
* middle layer — connect user interface to smart contracts&#x20;
* bottom layer — smart contracts running on the blockchain network

╰┈➤ thus changing the smart contract layer will result in needing to do corresponding changes to middle layer and top layer too&#x20;



**Blockchain’s value isn’t in the data it stores—it’s in the trust it builds.**

centralized databases — efficient, data that needs constant updates&#x20;

* coffee shop loyalty program

blockchain — trust, transparency, when multiple parties need a shared, immutable source of truth

* medical histories(healthcare), deed ownerships (real estate) — hybrid models with off-chain storage keep it scalable
* when shared trust is critical — finance, healthcare, supply chain



On-chain solutions — handle transparent, immutable transactions

Off-chain solutions — deal with scalable, private transactions



**on-chain, off-chain hybrid mashups**

1. Database —  primar&#x79;**,** Blockchain —  secondary
   * data on database; proofs or markers of that data such as cryptographic hashes on blockchain
2.  Blockchain —  primary, database —  secondary

    * copy data from blockchain to a database for using existing tools for reporting, analysis, dashboarding
    * no need to worry about keeping database copy of the ledger in sync — we have the implicit guarantee that the original source (blockchain) is never going to change&#x20;



{% hint style="success" %}
#### Balancing Act

The adoption of blockchain technology in many sectors required a careful balance between&#x20;

* the benefits of on-chain data for security and immutability and&#x20;
* the practicality of off-chain solutions for scalability

❗Finding the right balance is critical for successful blockchain integration.
{% endhint %}



{% hint style="success" %}
## Picking the right smart contract language and tools

— the chain chooses the code, not the other way around —&#x20;
{% endhint %}



