---
icon: hand-holding-circle-dollar
---

# Blockchain Transactions

## Blockchain Transaction Process



1. **Transaction Initiation & Broadcasting**
   * Action: A user (Alice) creates and signs a transaction (e.g., sending 2 BTC to Bob).
   * Mechanism: The request is broadcasted to the Peer-to-Peer (P2P) network.
     * The request can arise from any node in the network.
2. **Mempool Aggregation & Validation**
   * Action: Nodes/Miners receive the transaction and validate it against network rules (e.g., verifying Alice has sufficient balance and a valid digital signature).
   * Mechanism: Validated transactions wait in a local pool (Mempool). Miners select a batch of these transactions to form a candidate block.
3. **Consensus & Mining (The Puzzle)**
   * Action: Miners compete to find a cryptographic solution (Proof of Work) for their candidate block.
   * Mechanism: This requires immense computational power, securing the network against tampering by making history incredibly expensive to rewrite.
4. **Block Broadcasting & Network Verification**
   * Action: The winning miner solves the puzzle and immediately broadcasts their new block to the network.
   * Mechanism: Other nodes quickly verify the miner's solution and the block's transactions. No heavy computation is needed for this check.
5. **Block Addition & Block Reward**
   * Action: Once the majority of the network reaches consensus (validates the block), the block is permanently appended to the ledger.
   * Mechanism: The winning miner is rewarded with newly minted cryptocurrency (Block Reward) and transaction fees.
6. **Transaction Settlement**
   * Action: The block is finalized.
   * Result: The transaction is complete; Alice's balance decreases, and Bob receives the 2 BTC.



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
* typical transaction we see when sending or receiving cryptocurrency
* always initiated by users
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

