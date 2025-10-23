---
icon: repeat-1
---

# Reentrancy Attack

## Reentrancy Attack

> when a **malicious contract repeatedly calls back into a victim contract** during an external call **before the victim updates its internal state**,&#x20;
>
> causing the victim to perform the same sensitive action (e.g., send funds) multiple times and **drain assets**



* One of the most common Smart Contract attack vectors



* Many platforms, like `Ethereum`, execute code synchronously — step by step
  * One method call will not execute until the previous has completed
* Thus, it's possible to call a function again before the first invocation has completed
  * imagine a `WithdrawFunds()` function in a Smart Contract that is used to return funds to a user
  * calling this function multiple times before the first call has completed will result in the user obtaining their balance several times over



* ‼️ When external contracts are called, **execution is paused on the original contract** while the child executes
  * Poorly/maliciously written child contract could seriously slow down or even bring to a halt the main contract you're calling it from&#x20;



#### A Historical Collection of Reentrancy Attacks

{% hint style="info" %}
#### Reference: A Historical Collection of Reentrancy Attacks

[https://github.com/pcaversaccio/reentrancy-attacks](https://github.com/pcaversaccio/reentrancy-attacks)&#x20;

{% embed url="https://github.com/pcaversaccio/reentrancy-attacks" %}
{% endhint %}



## Reentrancy Attacks in Real Life

#### The `DAO` Attack

* occurred 3 months after the launch of `Ethereum`
* the idea behind the `DAO` project was a decentralized investment service — users could submit coins/Ether to the `DAO` smart contracts, which would then evaluate various investment opportunities and invest the users funds trying to maximize returns&#x20;
* anonymous hacker manages to steal vast majority of the $150M worth of ETH that was sitting in the `DAO's` Smart Contracts by calling reentrancy on unguarded function
* occurred over the course of a few weeks
* significant blow to Ethereum's credibility
* some of the `Ethereum` community members voted to reverse the theft — effectively taking all the money from the thief and putting it back where it rightly belonged
  * but other were very adamant that reversing anything on the blockchain violates one of the core guiding principles of blockchain itself, and were dramatically opposed to such a move&#x20;
  * in the end, the majority of the network; roughly 80% of the node owners decided that the right thing to do was to canceling transaction on the ledger&#x20;
  * a cancelling transaction was entered onto the ledger
    * thus vast majority of these stolen funds were returned to the `DAO`&#x20;
  * not all node owners agreed
    * thus the very first hard fork on the Ethereum ledger created —  **Ether**/**Ether Classic hard fork**
      * this is why to this day, if you look at many cryptocurrency exchanges, you can see `Ether Classic` listed alongside `conventional Ether`
* the `DAO` project was eventually shuttered & shut down&#x20;



More about the `DAO` attack:&#x20;

{% embed url="https://papers.ssrn.com/sol3/papers.cfm?abstract_id=3014782" %}



