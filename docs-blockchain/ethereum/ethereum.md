---
icon: ethereum
---

# Ethereum

## Ethereum

> — an **open**, **public**, **decentralized** **blockchain** **network** and **open-source** **software development platform**  —&#x20;
>
> * powered by the cryptocurrency **ether** (`ETH`)
> * built on `Bitcoin` that let you send and receive digital cash (without a bank) with **open-source programs** called **smart contracts**

home to thousands of&#x20;

* cryptocurrencies &#x20;
* **DeFi**: dapps for decentralized finance
* **NFTs**: non-fungible tokens
* governance tokens
* dapps for gaming &#x20;
* dapps for decentralized social media &#x20;
* dapps for art and collectibles
* **stablecoins**

{% hint style="success" %}
Collectively, this **ecosystem** is called "**web3**", representing the third phase of the **internet centered around ownership**.
{% endhint %}

key areas of innovation:

* **Currency issuance**
* **DAO**: Decentralized Autonomous Organizations
* **Smart contracts**

features:

* corporate friendly
* ability to process transactions fast
* possibility of creating new **assets** on Ethereum blockchain that can be used as currency or representation of an asset, virtual share, proof of memebership or anything
* secured
* uncensored
* community support



#### Smart Contracts&#x20;

* let anyone create their own digital assets and decentralized applications (dapps) that run 24/7, globally
* available to anyone with an internet connection



#### Stablecoins

* type of cryptocurrency designed to maintain a stable value relative to a specific asset or a basket of assets
* unlike traditional cryptocurrencies like Bitcoin or Ethereum, which can experience significant price volatility, `stablecoins` aim to offer price stability by being pegged to assets such as:
  * Fiat currencies (e.g., US Dollar, Euro, Yen)
  * Commodities (e.g., gold)
  * Other cryptocurrencies



#### Ethereum Network <a href="#network" id="network"></a>

> **a global digital infrastructure that anyone can use** but nobody can abuse
>
> * made up of **thousands of independent computers** around the world called nodes run by regular people
> * nodes work together to provide financial services and digital applications to anyone, anywhere



#### Ethereum Mainnet

> The **Ethereum network millions use every day**, where real assets are exchanged and real apps live.&#x20;

* “**Mainnet**” helps to distinguish it from&#x20;
  * Ethereum layer 2 networks, and&#x20;
  * test networks (testnets) which developers use to try out new features before going live.



#### Ethereum Network Fees (aka Gas Fees) <a href="#network-fees" id="network-fees"></a>

> **Every transaction** on Ethereum costs a small fee called a **gas fee**.

Gas Fee

* a part of it is **paid to the validator** who adds your transaction to a “block” of transactions
* another part gets **“burned”, removing it from the supply**



**A transaction fee need to be paid for every transaction** regardless of whether that transaction succeeds or fails&#x20;

* deploying smart contracts on Ethereum network
* transferring coins/assets&#x20;



**when the network is busy, fees go up** — when things are quieter, fees go down

╰┈➤ helps balance supply and demand&#x20;



**fees vary depending on what you're doing** — The more complex the transaction the more gas it costs



Total cost of a transaction =  <mark style="background-color:green;">**Gas Limit**</mark> \* <mark style="background-color:green;">**Gas Price**</mark>

* **Gas Limit**: maximum amount of units of gas is willing to spend on a single transaction
  * this avoids situations where there is an error somewhere in the contract, and you end up spending very high amount of gas
* the **units of gas required** for a transaction is defined by the amount of code executed on the blockchain
  * if enough gas to cover computational resource usage on the network is not supplied with the transaction, the transaction will fail due to **insufficient gas** (**out of gas error**)



<mark style="color:$success;">**Importance of Gas Fee**</mark>

✅ Keeps Ethereum **sybil-resistant** by preventing malicious actors from overwhelming the network with fraudulent activities

✅ Because computation costs gas, **spamming** Ethereum with expensive transactions, either accidentally and maliciously, is **financially disincentivized**.

✅ A **hard-limit** on the amount of computation that can be done at any one time prevents Ethereum from being overwhelmed, helping to ensure the **network is always accessible**.







#### Ether (ETH): Units, Wrappers, and Common Variants

<table data-header-hidden><thead><tr><th width="162.0078125"></th><th width="105.0859375"></th><th width="253.34765625"></th></tr></thead><tbody><tr><td>1 <strong>wei</strong></td><td></td><td>the smallest unit</td></tr><tr><td>1 <strong>kwei</strong> (babbage)</td><td>10^3 wei</td><td></td></tr><tr><td>1 <strong>mwei</strong> (lovelace)</td><td>10^6 wei</td><td></td></tr><tr><td>1 <strong>gwei</strong> (shannon)</td><td>10^9 wei </td><td>commonly used for gas prices</td></tr><tr><td>1 <strong>szabo</strong></td><td>10^12 wei</td><td></td></tr><tr><td>1 <strong>finney</strong></td><td>10^15 wei</td><td></td></tr><tr><td>1 <strong>ether</strong> (<strong>ETH</strong>)</td><td>10^18 wei</td><td></td></tr></tbody></table>



#### Consensus Mechanism

> **Proof of Stake — PoS**

* people/validators lock up some ETH — put their ETH at stake, as a deposit so that they can help **secure the network**
* when you stake ETH, your validator gets chosen to check and add new transactions
* if you do it honestly, you **earn rewards**
* if you **try to cheat, you lose part of your stake**



to attack the network, **an entity needs at least 1/3 of all staked ETH to begin attacking the network**

* more than 1/2 changes which version is considered truth&#x20;
* more than 2/3 would allow finalizing something the rest don't agree with



#### `EVM`: Ethereum Virtual Machine

> **`EVM`: Ethereum Virtual Machine**
>
> * an engine which executes translation code
> * Ethereum possesses its own programming language knows as the **`EVM Bytecode`**
> * smart contracts are compiled into EVM bytecode and deployed to Ethereum Blockchain for execution
> * **turing complete** machine
> * uses a set of instructions, called **opcodes**, to execute specific tasks



<figure><img src="../.gitbook/assets/EVM.svg" alt=""><figcaption></figcaption></figure>





#### Ethereum Languages

<table data-header-hidden><thead><tr><th width="118.7421875"></th><th></th></tr></thead><tbody><tr><td><strong><code>Solidity</code></strong></td><td><p>Object oriented high-level language</p><ul><li>Similar to C and JavaScript</li></ul></td></tr><tr><td><strong><code>LLL</code></strong></td><td><p>Low-level Lisp-like Language</p><ul><li>One of the original Ethereum smart contract programming languages </li><li>It's similar to Assembly</li><li>simple and minimalistic language</li><li>serving as a tiny wrapper over coding in EVM directly</li></ul></td></tr><tr><td><strong><code>Vyper</code></strong></td><td><p>Derived from Python</p><ul><li>Contract oriented programming language</li></ul></td></tr><tr><td><strong><code>Serpent</code></strong></td><td><p>An Assembly language that compiles to EVM code that is extended with various high-level features</p><ul><li>Similar to Python</li></ul></td></tr><tr><td><strong><code>Mutan</code></strong></td><td><p>Go-based language</p><ul><li>supports dynamic / higher-level language</li><li>it compiles to native EVM assembler</li><li>however, now <strong>deprecated</strong></li></ul></td></tr><tr><td><strong><code>Julia</code></strong></td><td>Intermediate language for different EVMs</td></tr></tbody></table>







