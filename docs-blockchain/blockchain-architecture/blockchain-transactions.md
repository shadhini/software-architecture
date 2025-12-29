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







