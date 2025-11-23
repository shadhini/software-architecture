---
icon: input-numeric
---

# Integer Overflow / Underflow

## Integer Overflow / Underflow

> **Unsigned integer/numeric variables** (`uint`)&#x20;
>
> * **overflow to zero** and&#x20;
> * **underflow to** their **maximum** value

`Ethereum`

* consider a smart contract with a zero balance
  * force a spend of 1 Ether
  * → zero balance "**rolls back**" to maximum value of 4.3 billion Ether!



## Integer Overflow / Underflow in Real Life

#### `Proof-of-Week-Hands` Coin

* this solution was designed as sort of a lottery or as "**legitimate**" opt-in Ponzi scheme — meaning everybody knew what they were getting into, nobody was being deceived&#x20;
* quickly grew to $1m+ value after launch
* lost $800k in one night due to bad arithmetic
* the problem occurred because project's ERC-20 coin allowed a person to approve another user to transfer tokens on their behalf
  * a hacker opened up a second account to sell coins to, from their first account
  * coins were taken off the second account's balance
  * integer underflow left the second account with an extremely large balance of coins



More about Proof-of-Week-Hands Coin:

{% embed url="https://medium.com/@ebanisadr/how-800k-evaporated-from-the-powh-coin-ponzi-scheme-overnight-1b025c33b530" %}

