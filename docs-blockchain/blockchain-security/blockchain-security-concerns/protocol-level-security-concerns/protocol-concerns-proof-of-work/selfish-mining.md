---
icon: pickaxe
---

# Selfish Mining

## Selfish Mining

{% hint style="info" %}
Primarily affects the **consensus mechanism**.
{% endhint %}

> A consensus-layer strategy where a miner/pool **withholds newly found blocks**,&#x20;
>
> builds a private fork, and selectively publishes it to gain a disproportionate share of rewards.
>
>
>
> selfish mining is often **used in conjunction with 51% attack** to attack a blockchain network&#x20;



* The normal mining process, assumes a miner will immediately validate a block once they're found the correct nonce value — because the first one to guess the right answer going to get financially compensated with a block reward&#x20;
* In selfish mining, a winning miner keeps the correct nonce a secret when they found the winning nonce
* They're going to assume that they found the correct nonce before anybody else&#x20;
* The miner can then begin mining the next block, giving them a head start over the rest of the network
* The selfish miner is then more likely to validate the next block ahead of schedule, and so on ...
* As a result, **a 51% attack can be launched with less than 51% control** of the network's computational power — this is possible as the selfish miner is able to validate blocks further and further ahead of the rest of the chain
* This attack comes with the risk that another mined will find and send out a valid block first...





