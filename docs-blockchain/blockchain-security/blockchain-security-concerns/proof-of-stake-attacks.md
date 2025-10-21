---
icon: hand-holding-dollar
---

# Proof of Stake Attacks

## Proof of Stake Attacks

### **PoS Block Forger Attack**

> vulnerabilities or malicious behaviors that a validator (aka "block forger"/ "staker") could exploit in PoS blockchains
>
> * when a validator abuses its role in proposing/attesting blocks—e.g., by creating conflicting blocks, withholding blocks, or censoring—to gain extra rewards, enable double-spends, or disrupt consensus

#### Common PoS Block Forger Attacks

1. **Long-Range Attack**:
   * In a naively implemented PoS, an attacker who controls a small amount of stake at the genesis block can retroactively create a competing chain by forging blocks. Over time, they build up a long alternative blockchain that can confuse other nodes about which chain is "real." This is especially problematic if validators go offline for long periods, making it hard to recover and confirm the legitimate chain.
2. **Selfish Block Forging and Reorgs**:
   * Attackers may attempt to reorganize blocks (reorgs) for personal gain. This can involve "double-spending" attacks, where an attacker excludes certain transactions or creates two conflicting versions of the chain. A malicious reorg can either censor transactions or attempt value extraction via transaction manipulation (front-running/back-running).
3. **Double Finality or Finality Delay Attacks**:
   * An attacker could try to create two forks that finalize at the same time (called double finality). Alternatively, they might try to prevent the chain from reaching finality, disrupting trust in the system and possibly profiting if they hold strategic positions (e.g., betting against the chain).
4. **Key Compromise Attacks**:
   * If a validator's private key is stolen (e.g., through hacking), an attacker could forge malicious blocks and potentially get the validator's funds slashed (as punishment). Unlike PoW miners, PoS validators must keep more funds online and accessible, which increases the exposure risk.
5. **Nothing-at-Stake Attack**:
   * Since forging blocks is almost free in PoS, validators could sign multiple competing chains. This undermines consensus security because there's no significant resource cost for supporting many forks.



## Consensus Centralization

* Networks using `Proof of Stake` or `Delegated Proof of Stake` can become centralized
* A small number of validators could wield disproportionate control over the network and its ledger



### XX% Attack

* Attackers who can **control a significant portion of the network's "scarce" resource** can affect what gets recorded to the ledger&#x20;
  * staking funds in PoS
* depending on how Proof of Stake network is configured, it may take more than 51%&#x20;
* Smaller networks are generally more susceptible to these types of attacks&#x20;





