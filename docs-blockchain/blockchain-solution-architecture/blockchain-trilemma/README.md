---
description: Trade Offs to make when choosing Blockchain Platforms
icon: diagram-venn
---

# Blockchain Trilemma

## Blockchain Trilemma

#### 3 basic characteristics of a hypothetical "`perfect`"/"`ideal`" blockchain platform...



1. **Secure**
   * provide top-notch levels of security&#x20;
   * ensures **recorded data cannot possibly be tampered with**
2. **Decentralized**
   * highly-decentralized
   * ensures that **no coalition** of individuals or interest groups **can obtain a disproportionately high degree of control over** the network or the ledger
3. **Scalable**
   * able to **easily and indefinitely scale up** to as large a size as needed&#x20;
   * **performance** should **not suffer** as the network grows



#### Blockchain Trilemma

<mark style="color:$danger;">In  the real world, you can only have</mark> <mark style="color:$danger;"></mark><mark style="color:$danger;">**2 out of 3**</mark> <mark style="color:$danger;"></mark><mark style="color:$danger;">"</mark><mark style="color:$danger;">**perfect**</mark><mark style="color:$danger;">" blockchain attributes ...</mark>

Real world is a world of compromises...



1. **Secure and Decentralized**&#x20;
   * if your users are okay with slower performance → consider this option
   * e.g: `Bitcoin`, `Ethereum`
2. **Secure and Scalable**
   * if your users are okay placing trust in centralized authorities → consider this option
   * e.g: `Hyperledger`, `Ripple`, `EOS`, `Stellar`
3. **Scalable and Decentralized**
   * if the real-world implications of a data attack are minimal or if data is not sensitive enough that any kind of attack or breach doesn't causes much concern  → consider this option
   * e.g: blockless platforms such as `Nano`, `IoTA`





## How to address Blockchain Trilemma ?

{% hint style="success" %}
Right balance between scalability, security & decentralization depended on&#x20;

the specific goals and use cases of the blockchain network in question
{% endhint %}

{% content-ref url="how-to-address-blockchain-trilemma.md" %}
[how-to-address-blockchain-trilemma.md](how-to-address-blockchain-trilemma.md)
{% endcontent-ref %}





## Example Use Case

{% hint style="success" %}
#### Solving trilemma

isn't about making it easy — it's about making it possible
{% endhint %}

#### Gaming Platform

✅ handle millions of players without sacrificing decentralization or security

network has to process thousands of transactions per  second

but not at the expense of decentralization — cannot have a few validators controlling everything



Possible solutions

* Sharding
  * ⊕ each shard processes a portion of transactions independently
  * ⊖ smaller shards are easier to attack --> weaken security
    * can be managed with robust protocols
* Sidechains
  * ⊕  side chain handle most of the work, offloading pressure from the main chain
  * ⊖ rely on secure bridges
* State channels
  * ⊕  allow off-chain transactions that only update the main chain when final
  * ⊖ require trust between participants
* Directed Acyclic Graphs
  * ⊖ experimental
  * ⊕  promising for high speed, low cost transactions
  * ⊖ security is challenging



**Solution**:&#x20;

* Sharded main chain with&#x20;
  * State channels for real-time transactions&#x20;
  * Sidechains for heavy data processing

