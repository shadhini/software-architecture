---
icon: person-military-rifle
---

# Byzantine General's Problem

## Byzantine General's Problem

— **Thought experiment** first posed in 1982 —&#x20;

* mathematical problem

### The Problem: Byzantine General's Problem

> Imagine 2 empires fighting a war against each other
>
> * one empire has been surrounded and defending a walled city
> * the other empire has surrounded their enemy with armies, each army is led by a General
> * the balance of power is nearly even
>   * if the attacking empire can coordinate all their armies to attack at once, they will overwhelm the defenders and win the war
>   * if the attacking empire cannot perfectly coordinate an attack, they will fail to capture the city and loose the war&#x20;
>     * even if one General fails to attack at the specified time, the attack will fail
> * the Generals need to plan and coordinate an attack
>   * they can only communicate via disguised messengers passing through the enemy city
> * with every message, a General is wondering...
>   * can I trust this message ?
>   * has this message been intercepted?&#x20;
>   * has this message been changed?
>   * can I trust the other Generals ? there's no guarantee that all of their peers are not necessarily in cahoots with the enemy
> * How can any General have confidence in the messages they receive ?



### Nature of the Solution: Byzantine Fault Tolerant (BFT)

> **Any solution has to be fault tolerant ...**
>
> * some actors may be malicious&#x20;
> * some actors may not be online/available
> * some actors may be working with bad data/status
>
> ╰┈➤ Any solution to this problem must be "**Byzantine Fault Tolerant (BFT)**"
>
> ✔ can handle some malicious actors
>
> ✔ can handle some unavailable/offline actors
>
> ✔ can handle some actors working with bad data/status



### Ways to solve the Byzantine General's Problem



1. <kbd>Disproportionate computing resources</kbd>
   * one empire could use encryption/decryption schemes too complex for their enemy to crack
2. <kbd>Consensus by voting and election</kbd>
   * e.g: **`RTXTP`**: **Ripple Transaction Protocol**
3.  <kbd>Byzantine Fault Tolerant (BFT) Consensus</kbd>



## Byzantine Fault Tolerant (BFT) Consensus

{% hint style="info" %}
**All blockchain consensus mechanisms are BFT.**
{% endhint %}

* In a BFT solution, some number of bad/malicious nodes can be tolerated
* All blockchain consensus mechanisms can tolerate a limited number of bad actors
  * This amount can never exceed **33%** (one third) of the total network — this is the theoretical maximum — some consensus mechanisms have much lower thresholds

&#x20;
