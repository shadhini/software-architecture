---
icon: brackets-curly
---

# Logic Errors

## Logic Errors

> most common biggest mistakes in software development — not related to blockchain

* simple logic errors
* simple typos
* simple errors&#x20;
* omission



#### Main Reason

* developers forget they're developing code on a peer-to-peer platform and assume they are working with client-server platforms instead

{% hint style="warning" %}
Many activities that would be **safe** or considered **best practices in a client-server**&#x20;

* can cause **enormous problems** if implemented **in** a **decentralized** or **peer-to-peer** environment
{% endhint %}



## Logic Errors in Real Life

#### The `Hegic` Attack

* The Hegic Attack occurred in 2020 on a blockchain knows as the `Hegic Blockchain`
* `Hegic` Blockchain —  a platform that allows users to insure against price volatility in cryptocurrency markets
* `The Hegic Defi Protocol` — aimed to simplify the work with options as a financial instrument&#x20;
  * it had optional smart contracts that any user could sell and earn bonuses automatically
* Jan 2020 —  developer Molly Wintermute announced work on the protocol
* Feb 2020 — a technical description of the project was posted and a website was launched&#x20;
* March 2020 — the first users began testing `Hegic`&#x20;
* April 2020 —  Wintermute ordered a `Hegic` code audit and the protocol was verified
* 23 April 2020 — `Hegic` was launched&#x20;
* the very next day Wintermute was forced to restart the protocol because of a simple typo in the code
* **A minor typo**
  * developer accidentally called the `OptionIDs` function, instead of using `Option`**`s`**`IDs` function that unlocks liquidity and expired contracts — omitting the `s` between `Option` and `IDs`&#x20;
  * the error led to a failure that prevented contracts from being executed, which led to the funds of those contracts being blocked forever
* this caused user assets to be blocked — meaning no liquidity was available for these expired smart contracts until the protocol was restarted
* the single typo cost `Hegic` $48,000 to refund the users who had already been affected



