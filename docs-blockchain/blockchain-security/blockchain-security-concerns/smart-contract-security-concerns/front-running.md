---
icon: bring-front
---

# Front Running

## Front Running

> when someone observes a **pending transaction in the public mempool** and **submits their own transaction with a higher priority (fee)** so it gets included before or around the victim’s transaction,&#x20;
>
> extracting value from the predictable effect of the victim’s action



* incoming transactions are stored on a node's **`mempool`**
  * until they are processed&#x20;
  * **`mempool`** — the temporary memory every blockchain node has; it serves as the queue for incoming transactions
* all nodes should have the same **`mempool`** transactions
* transactions are selected by the protocol according to the gas price they're willing to pay
  * **gas** — the transaction fees paid on mini blockchain networks such as `Ethereum`



#### Story: imagine a blockchain trivia solution

* the protocol on this smart contract randomly select a trivia question and whoever  submits the correct answer first is the winner
* say `B` is an attacker and `B`\`s watching the **`mempool`**&#x20;
* `A` submit the correct answer to the trivia question
* `A` is expecting to win the round
* `B` sees `A` submitting the correct answer to the trivia question
* `B` can also submit a matching answer after `A`, but `B` pay a higher price for gas
* `B`'s transaction will be taken from the **`mempool`** before `A`'s
* `B`'s transaction is processed first and `B` wins the trivia round, even though `A` guessed the correct answer and  `A`'s answer arrived first!



#### Exact Synchronization on Decentralized Networks — Not Possible

{% hint style="warning" %}
#### Exact synchronization is a centralized function !

This is **not possible on decentralized networks**...
{% endhint %}

Imagine `A` and `B` wanna perform a certain activity at exactly the same moment in time.

* 1st step to do that is to synchronize `A`'s watch to `B`'s watch or vice versa
  * in other words, anytime they go to synchronize  their watches, one of them has to be the leader or the authority who determines what the correct time is&#x20;

╰┈➤ **On a leaderless network**, such activities are **impossible**

{% hint style="danger" %}
Avoid using blockchain in scenarios where you requires&#x20;

* **exact timing**,&#x20;
* **perfect coordination** or&#x20;
* **exact synchronization**.
{% endhint %}



## Front-Running Attacks in Real Life

#### `DODO DEX` hack

* an attacker became the victim of two cryptocurrency trading bots as they were trying to steal funds from an exchange known as `DODO DEX`
* this decreased the impact of the hack by having bots front-run the attacker's attempts to exploit smart contract vulnerabilities&#x20;
* owners of both trading bots agreed to return the stolen funds that they had pulled from the hacker— totaled $3.1 million
* Only $700,000 remained stolen by the original attacker



More about the DODO DEX hack

{% embed url="https://www.halborn.com/blog/post/explained-the-dodo-dex-hack-march-2021" %}



