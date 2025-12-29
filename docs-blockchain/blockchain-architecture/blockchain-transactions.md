---
icon: hand-holding-circle-dollar
---

# Blockchain Transactions

## Blockchain Transaction Process

1. Transaction is requested: can arise from any node in the network
   * e.g: Alice wants to send Bob 2 bitcoin
     * Bitcoin blockchain: a distributed database running on thousands of computers globally
2. Transaction request is broadcasted throughout the network; P2P network
3. It gets picked up by various miners (computers known as miners) who are part of that network
4. Each miner picks up the transaction and runs some computation in order to validate transaction
   * miners verify this transaction
     * e.g: check Alice's balance&#x20;
   * then miners compete to place it into a block with other transactions
   * to append a block to the chain of prior blocks, miners solve a math puzzle that requires a lot of computational power to solve&#x20;
     * all this computational power protects the blockchain against hackers&#x20;
   * this transaction becomes a part of the new block created
5. Others in the network check the miner's work
6. Once validated/verified; when a majority of miners in the network approve the block&#x20;
   * the miner who solved the puzzle gets paid in bitcoin
7. New block is added to the blockchain&#x20;
   * e.g: Alice transaction gets added to the blockchain along with the others
8. Transaction is completed
   * e.g: Bob receives 2 bitcoin



#### Role of Miner

* ensures fairness
* keeps the network stable, safe & secure by proving transactions
* use special software for mining — for solving complex mathematical problems (PoW consensus)
* they are **issued newly created/minted coins as reward** along with the transaction fee paid by the sender — a good way to issue new currency and provide incentive for more people to become miners



## **Coinbase Transactions**

> Coinbase Transaction:
>
> **Special transaction that creates new coins as block rewards for miners**

* only occurs as the **first transaction in each mined block**
* it is created by the miner (miners/pools) who successfully mines a block
* have **no inputs** because they generate new coins "out of thin air"&#x20;
* the **outputs** **point to the miner's wallet** (or chosen wallets)



<figure><img src="../.gitbook/assets/regular-vs-coinbase-transactions.svg" alt=""><figcaption><p>Regular vs Coinbase Transactions: based on <a href="https://andersbrownworth.com/blockchain/coinbase">https://andersbrownworth.com/blockchain/coinbase</a></p></figcaption></figure>



## **Regular Transactions**

> **a standard transfer of existing coins(cryptocurrency)/tokens(assets) between two addresses on the blockchain**

* uses previous unspent transaction outputs (**`UTXO`**&#x73;) as inputs and creates new outputs for recipients
* typical transaction we see when sending or receiving cryptocurrency.
* always initiated by users.
* typically incurs network fees, which miners can claim via the coinbase transaction

**Example:** Alice pays Bob 0.5 BTC. The transaction references the UTXOs Alice controls as inputs, and the outputs would be to Bob's wallet (and perhaps change back to Alice)



## **Tokens**

> Tokens:
>
> **blockchain-based digital assets**, usually **implemented as smart contracts** (such as ERC-20 tokens on Ethereum) on top of an existing blockchain

* can represent anything: currencies (like USDT), governance, collectibles, or other assets
* involve interacting with the smart contract that manages the token ledger
* don't involve mining or rewards in their creation (unless it's a mining or staking reward)
* **transactions for tokens** are **executed by calling contract functions**, **not at the base blockchain protocol**
* token creation, transfer, and other functions are defined by programmable rules within the contract

e.g: Transferring `USDT` (a token) requires interacting with the Ethereum (or other chain) smart contract, not native coinbase or typical coin transfer logic





<figure><img src="../.gitbook/assets/tokens.svg" alt="" width="563"><figcaption><p>Tokens: based on <a href="https://andersbrownworth.com/blockchain/tokens">https://andersbrownworth.com/blockchain/tokens</a></p></figcaption></figure>

