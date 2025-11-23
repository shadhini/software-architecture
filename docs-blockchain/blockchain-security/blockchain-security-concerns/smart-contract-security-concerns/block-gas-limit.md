---
icon: gas-pump
---

# Block Gas Limit

## Block Gas Limit Problem

> In order to prevent infinite or very long running loops,
>
> all **blocks** on a particular blockchain network are **limited** by the **maximum amount of gas they're allowed to consume**

* what this gas limit really sets is the maximum amount of work that can occur on any particular block
* if data is stored in large arrays or excessive looping is used in the code, the transaction may become too big to fit on a block

╰┈➤ can be used to launch **Denial of Service attack** against network



## DoS with Block Gas Limit&#x20;

> "**DoS with Block Gas Limit**” is when a function’s **gas usage grows with unbounded state** (like looping over a growing array),&#x20;
>
> so eventually it can’t fit within a single transaction’s gas or a block’s gas budget.&#x20;
>
> The function becomes practically un-callable, locking funds or halting essential logic.



## Block Gas Limit in Real Life

#### The `GovernMental` Attack

* a cryptocurrency lottery project
* users would place a bet that no one users would come and place a bet after them for the next 12 hours
* every subsequent bet became more expensive&#x20;
* in addition to **Block Gas Limit errors**, this smart contract also introduced **Timestamp Dependency errors**
* to join the project, a user was required to send a certain amount of `Ether` to one of the `GovernMental` smart contracts
* due to its viral popularity, the list of users grew so long that it would have required more gas to clear the array in any particular block than the maximum amount allowed for a single transaction
* the solution had to be **taken offline** !
* 2 problems
  1. not considering the gas limit and how that would come in to play when that user list got sufficiently large
  2. being a victim of your own success — didn't anticipate the viral response to their smart contract solution



More about GovernMental attack:

{% embed url="https://blog.csdn.net/omnispace/article/details/79667692" %}





