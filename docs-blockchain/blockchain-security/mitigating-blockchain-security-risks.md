---
icon: shield-check
---

# Mitigating Blockchain Security Risks

## Mitigating Blockchain Security Concerns

{% hint style="success" %}
#### Trust the math, but never stop questioning the people.
{% endhint %}

{% hint style="success" %}
#### **chain isn't breaking — it's evolving**
{% endhint %}



#### Sybil Attacks

* `Consensus mechanisms` like proof of stake, ensures only trusted nodes participate



#### 51% Attack

* `sharding` and `sidechains` reduces the risk of concentrated power



#### Double Spending

* `Consensus` prevent double spending — each **transaction** is **validated** by the network



#### Man-in-the-middle Attacks

* `Encryption` safeguards communication



### Smart Contracts

* Stay **up-to-date** on vulnerabilities and security best practices!
* Motivate hacked could potential break out of the sandboxed environment of smart contract and attack the host
  * be careful where you place your nodes
  * do not use nodes for any other purpose
* Keep your nodes up to date!
  * Be sure to stay current on platform updates and new versions
  * Ensure node update procedures are included in your governance model and it's well documented and every participant is informed about it, agrees and executes it
* Automated security analyzers — to identify and flag potential security vulnerabilities
  * e.g: for `Ethereum` smart contracts



#### Reentrancy Attack

To avoid

* Be careful **calling** **external contracts** !
  * External calls should always **check and update state**
* Whenever possible, make sure that you're only calling contract that you've written or that have come from your organization/your development team
  * by doing so, you can ensure that all the code you are invoking has gone through your QA standards/ review standards/ test & documentation standards/ etc..&#x20;
* Use a `reentrancy guard`&#x20;
  * use a simple Boolean variable to set a value when a critical code is being executed and then to release or flip that bit/flag when critical code execution is done — if someone tries to re-enter or invoke this method a second time, they would see that default Boolean value showing that critical code execution is taking place&#x20;
* Use the **`Checks-Effects-Interactions`** pattern

{% hint style="success" %}
#### Reentrancy Guard

[https://spin.atomicobject.com/reentrancy-guard-smart-contracts/](https://spin.atomicobject.com/reentrancy-guard-smart-contracts/)

{% embed url="https://spin.atomicobject.com/reentrancy-guard-smart-contracts/" %}



[https://medium.com/better-programming/solidity-smart-contract-security-preventing-reentrancy-attacks-fc729339a3ff](https://medium.com/better-programming/solidity-smart-contract-security-preventing-reentrancy-attacks-fc729339a3ff)

{% embed url="https://medium.com/better-programming/solidity-smart-contract-security-preventing-reentrancy-attacks-fc729339a3ff" %}
{% endhint %}



#### Front Running&#x20;

To avoid front-running

* Consider only accepting transactions below a **predetermined** **amount**
  * limit the maximum amount a user can pay for a unit of gas in your solution
* Consider **non-blockchain solution** components — centralized components
  * if you want to synchronize activities or have activities occur on a very exact or precise schedule &#x20;
* Consider implementing a <mark style="color:$danger;">**Commit-Reveal scheme**</mark>
  * proof of an answer is first committed to the ledger and then the answer is revealed later by the user who submitted it&#x20;
  * first transaction from user is a hashed version of their answer — <mark style="color:$success;">**commit**</mark>
  * once first transaction is mined, user can send unencrypted data — <mark style="color:$success;">**reveal**</mark>
  * e.g: commit-revel scheme implemented on trivia solution
    * smart contract pick a trivia question
    * users going to submit hashes of their answers
    * blockchain network will record all of the hashes in the order that they appear
    * after all the hashes have been recorded, users can then be asked to submit their un-hashed/unencrypted answers&#x20;
    * the smart contract could compare each submitted answer to the submitted hash to make sure they match and select the winner



#### Integer Overflow / Underflow

`Ethereum` — avoid overflows/underflows

* use solidity compiler version **0.8 or later** — as of version 0.8 buffer overflows and underflows throe warnings and exceptions



avoid overflows/underflows

* consider using a **safe math library** which exposes basic arithmetic operations which do not underflow / overflow

{% embed url="https://docs.openzeppelin.com/confidential-contracts/api/utils#math" %}



#### Logic Errors — Smart Contracts

* Remember smart contract will be running in a decentralized peer-to-peer network.
* **code reviews** and  **external code audits**
* **bug bounties** on public test networks&#x20;
* Offer free merchandise, service, or rewards for testers who **discover** **vulnerabilities** before you go live
* good, comprehensive test cases
* involve end users in testing and QA activities

{% content-ref url="../blockchain-development/best-practices-smart-contract-development.md" %}
[best-practices-smart-contract-development.md](../blockchain-development/best-practices-smart-contract-development.md)
{% endcontent-ref %}



#### Block Gas Limit Problem & DoS with Block Gas Limit

Avoid the Block Gas Limit Problem

* Monitor gas usage and optimize smart contract functions

{% embed url="https://blog.tenderly.co/how-to-reduce-smart-contract-gas-usage/" %}



* Avoid storing large datasets on-chain
  * consider storing them off-chain somewhere and linking to them from the blockchain ledger&#x20;
* Ensure loops/repetitive code blocks cannot execute beyond a fixed number of repetitions
* Protect against reentrancy



#### Default Visibility Problem

Avoid Visibility Problem

* Mark every function as **private/internal** by **default**
  * require comments on public functions explaining why they must deviate from this default
* Bug bounties — any exposed critical pieces of functionality would hopefully be caught during that bug bounty period before you actually go to a live production environment



#### Timestamp Manipulation

Avoid Timestamp Manipulation

* Do **not use** blockchain **in** scenarios where **exact timing**, **synchronization** or **coordination** is needed&#x20;
  * e.g: the first user to call a contract function after midnight is the winner
* Do **not rely on block timestamps** to be perfectly accurate
  * make sure if you're using any kind of timestamps in a blockchain solution that you're viewing the **time** you get as a **rough estimate** rather than an exact specific time
* Do **not assume** the **order of transactions** on the ledger **is** the **order** in which **they were received** by the network
  * if it's critically important to you that the order of transactions on the ledger is the exact order they were submitted to the network
  * ╰┈➤ make sure that you're following all these **recommendations to avoid timestamp manipulation and front-running**



### Protocol Level

* Make sure you understand the strengths and **weaknesses/vulnerabilities** **of a platform** before building on it&#x20;
* Consider creating a **private test network** instance that you can use to **test upgrades, patches, and new versions** before applying them to production or `Mainnet` nodes

#### PoS Time-bomb

* **limit the maximum block reward** that's payable&#x20;
  * can be **easily** [**circumvented**](#user-content-fn-1)[^1] by just setting up multiple nodes or wallets or accounts&#x20;



### Network Level&#x20;

* consider **bringing** **network security expertise** to your project team — to analyze attack vectors when running blockchain on TCP/IP networks&#x20;

#### Eclipse Attacks

* make sure your **nodes** are **secure** and **malware/virus free**
* can run **anti-virus**, **anti-malware** protection algorithms



#### Replay Attacks

* Replay attacks can be mitigated at the **protocol level** by **forcing** the **inclusion of unique** transaction **data**&#x20;
  * this piece of unique data is often called the **`"block nonce"`** — this is NOT the same as the nonce miners compete to find during validation













[^1]: find a way around an obstacle/problem — often by using cleverness or deceit
