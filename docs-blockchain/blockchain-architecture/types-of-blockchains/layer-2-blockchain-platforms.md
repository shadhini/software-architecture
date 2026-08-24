---
icon: '2'
---

# Layer 2 Blockchain Platforms

## Layer 2 Platforms&#x20;

> **Layer 2 Platforms**:
>
> * built on top of Layer 1 platforms
> * aims to solve some of the **usability problems of Layer 1** such as&#x20;
>   * **high expense**
>   * **low performance**&#x20;
>   * **low scalability**
>   * **low transaction speed**
> * generally made up of&#x20;
>   * **`state channels`**:  blockchain ledger + off-chain transactional channel for bulk data
>     * a **private, direct pathway** opened between specific participants
>     * participants lock up funds in main blockchain ledger
>     * conduct transactions back-and-forth off-chain by signing digital tickets&#x20;
>     * submit only the final "receipt" to L1 to close the channel and distribute the funds
>   * **`sidechains`**: mainnet + entirely separate, independent blockchain that runs parallel to the mainnet&#x20;
>     * main chain: state channel&#x20;
>     * side chain: cheaper/more performant blockchain for supporting data, has its own consensus mechanism, own validators and its own security rules
>   * **`rollups`**: main ledger with proof of what happened on side ledger + side ledger (layer 2)
>     * perform transaction execution off the main blockchain
>     * but post compressed transaction data (or proofs) back to the L1 (layer 1 network)

#### Metaphor: with respect to PC

OS ➝ Layer 1

API: programming interface (set of libraries) ➝ Layer 2



### <mark style="color:green;background-color:green;">State Channels</mark>

<mark style="background-color:blue;">**\[The Private Tab]**</mark>

A state channel is a <mark style="color:blue;">**private, direct pathway**</mark> opened between specific participants.&#x20;

* allow for **two-way communication** between a **blockchain ledger** and **off-chain** transactional channels
  * e.g: state channel with a database

Think of it like starting a running tab at a bar.&#x20;

* open the channel by locking funds on the L1
* conduct thousands of transactions back-and-forth off-chain by signing digital tickets&#x20;
* then submit only the final "receipt" to L1 to close the tab and distribute the funds

#### <mark style="background-color:pink;">**The Bar Tab Analogy**</mark>

Imagine you go to a crowded bar. Instead of ordering a drink, waiting for the bartender to run your credit card, and signing a receipt for _every single round_, you open a tab.

_<mark style="color:blue;">1. Opening the Channel (The On-Chain Anchor)</mark>_

You hand the bartender your credit card to open a tab. The bartender runs a pre-authorization for $100.

* Blockchain equivalent: This is the opening transaction. Participants lock up funds on the main blockchain ledger. The public blockchain only sees this single event.

_<mark style="color:blue;">2. Transacting Off-Chain (The Intermediary State)</mark>_

You order a drink. The bartender hands you a slip of paper that says, _"You owe $10."_ You sign it. An hour later, you get a second drink. The bartender tears up the first slip and hands you a new one that says, _"You owe $20."_ You sign that one.

* Blockchain equivalent: These are the off-chain intermediary transactions. The parties transact privately by constantly exchanging updated, cryptographically signed digital receipts. Each new receipt invalidates the previous one. These are kept locally by the users (passed privately between you and the bartender - held in your local wallets), not in a central database.

_<mark style="color:blue;">3. Closing the Channel (The Final Settlement)</mark>_

At the end of the night, you decide to leave. The bartender takes your _final_ signed slip for $45, charges your card, and closes your tab.

* Blockchain equivalent: This is the closing transaction. The blockchain records the final balance sheet. The ledger never knew about the individual drinks you ordered—only that you started with a $100 limit and left with $45 less.

<mark style="color:blue;">**What Happens if Someone Tries to Cheat? (Dispute Resolution)**</mark>

* Suppose you step outside, and the bartender tries to cheat you by submitting an older, ripped-up slip from earlier in the night that says you owe $60 instead of $45.
* Because you have the absolute latest signed slip in your pocket showing the true balance of $45, you can present it to the manager (the blockchain's smart contract). The blockchain looks at the cryptographic signature on your slip, realizes the bartender is trying to pull a fast one, rejects their claim, and settles the funds correctly based on your evidence.

In systems like <kbd>**Bitcoin's Lightning Network**</kbd>, the penalty is even harsher: if the bartender tries to broadcast an old state, the smart contract catches them and gives all the money locked in the tab to you.

#### **Benefits**:

* increase overall transaction speed & volume and lower the cost of transactions
  * ╰┈➤ by storing the bulk of critical data off-chain

#### **Security**:&#x20;

* Cryptographically guaranteed by L1.&#x20;
* If your counterparty tries to cheat you while the channel is open, you can submit the last mutually signed state to the L1, which will mathematically enforce the correct balance.

#### **Best For**:&#x20;

* High-frequency, recurring transactions between a fixed set of participants (like 2-player gaming or streaming payments)

#### **Trade-off**:&#x20;

* Excellent speed and zero fees once open, but highly restrictive.&#x20;
* You can't easily interact with new people or open smart contracts on the fly without opening a brand new channel.

#### **Examples**:&#x20;

<kbd>Bitcoin's Lightning Network</kbd>, <kbd>Raiden Network</kbd>



### <mark style="color:green;background-color:green;">Sidechains</mark>

<mark style="background-color:blue;">**\[The Independent Neighbors]**</mark>

A sidechain is an entirely separate, independent blockchain that runs parallel to the <mark style="color:blue;">**`mainnet`**</mark>.&#x20;

* It has its own consensus mechanism (like Proof of Stake), its own validators, and its own security rules.&#x20;
* Assets are moved between the **`mainnet`** and the **`sidechain`** via a <mark style="color:blue;">**two-way bridge**</mark>.
* **main chain**: main data stored on chain like a state channel
* **side chain**: supporting data stored on another, cheaper and more performant blockchain

**Security**:&#x20;

* Self-secured.&#x20;
* If a sidechain's validator set gets corrupted, colludes, or gets hacked, your funds on that sidechain can be stolen.&#x20;
* Layer 1 (e.g: Ethereum) cannot protect you, as it has no visibility into what happens on the sidechain.

**Best For**:&#x20;

* High-volume, low-value transactions like gaming, microtransactions, or testing new features.

**Trade-off**:&#x20;

* Extremely cheap and fast.
* But significantly less secure than a true Layer 2 rollup.

**Examples**: <kbd>Polygon PoS</kbd>, <kbd>Gnosis Chain</kbd>



### <mark style="color:green;background-color:green;">Rollups</mark>

<mark style="background-color:blue;">**\[The Dependent Layer 2]**</mark>

Rollups perform transaction execution off the main blockchain, but post compressed transaction data (or proofs) back to the L1 (layer 1 network).

* enable transactions outside the layer 1 network, with resulting data stored on the layer 2 ledger
* a way to leave a proof of what happened on the side ledger on the main ledger

**Benefits**:

Increase performance by

* executing transactions on traditional/more centralized setup which is way faster than their decentralized counterparts

Congestion drops, speed goes up, and fees plummet

* as the main chain only has to process and store one compressed proof instead of thousands of individual transactions

**Security**:&#x20;

* Inherited from L1.&#x20;
* If the rollup’s own servers go entirely offline or try to steal your funds, you can use the data posted on the L1 to safely withdraw your assets.&#x20;
* You rely entirely on L1's (e.g: Ethereum's ) massive security pool.

**Best For**:&#x20;

* General-purpose smart contracts, DeFi, and NFTs where maximum security is required.

**Trade-off**:&#x20;

* Slightly more expensive than sidechains because writing data back to L1 still costs a small amount of L1 gas.



#### <mark style="color:$success;">1. Optimistic Rollups</mark>

Optimistic rollups **assume all transactions** in the bundle are **valid** by default and don't submit any proof up front.

* They publish the data to Layer 1 immediately.&#x20;
* However, there is a dispute window (typically 7 days).&#x20;
* During this time, anyone can submit a **"fraud proof"** to prove a transaction was malicious.&#x20;
* If fraud is proven, the bad transactions are rolled back, and the validator who submitted them is penalized.

**Examples**: <kbd>Arbitrum</kbd>, <kbd>Optimism</kbd>, <kbd>Base</kbd>



#### <mark style="color:green;">2. Zero-Knowledge (ZK) Rollups</mark>

ZK-rollups **do not assume honesty**. Instead of waiting for disputes, they use advanced mathematics to prove validity instantly.

* For every batch of transactions, the rollup generates a cryptographic proof called a <kbd>**SNARK**</kbd> or <kbd>**STARK**</kbd> (a validity proof).&#x20;
* It submits this proof directly to Layer 1.&#x20;
* The main chain verifies the math instantly.&#x20;
* Once approved, the transactions are final.&#x20;
* There is no dispute window.

**Examples**: <kbd>zkSync</kbd>, <kbd>Starknet</kbd>, <kbd>Linea</kbd>



### Notabe Layer 2 Blockchains

* Ethereum-based Layer 2 platforms
  * Optimism
  * Arbitrum
  * Polygon
* Bitcoin-based Layer 2 platforms
  * Lightning Network

