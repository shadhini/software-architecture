---
icon: bow-arrow
---

# Long-Range Attack

## Long-Range Attack

> called as "**stake bleeding**" — the attacker is slowing down the main chain by not validating blocks when selected and at the same time, trying to build a longer divergent alternate chain

* in most blockchain platforms, if presented with 2 different versions of the ledger, the longer one with the most amount of work on it will always be accepted&#x20;
* an attacker starts building an alternate chain
* when selected by the real/main chain to validate a block, that attacking node will simply do nothing, resulting in a timeout
* at the same time, that attacker is building/growing their "alternate" chain&#x20;
* this is called as "**stake bleeding**" — the attacker is slowing down the main chain by not validating blocks when selected and at the same time, trying to build a longer divergence
* eventually, the alternate chain will replace the main chain
  * if `A` has a spend that exists on the main chain, but not in the alternate chain, when that alternate chain gets accepted, `A` is going to get his money back — **double spend**&#x20;





