---
description: Participant Consensus Mechanism on Permissioned Blockchain Platforms
icon: people-group
---

# Participant Consensus

## Participant Consensus — Permissioned Platforms

> **Participant Consensus — Permissioned Platforms**:
>
> * Validation can occur prior to the transaction being recorded on the block
>   * Execute → Validate → Commit
> * "**Endorsement Policy**" approach — block agreement/validation rules are all up to participants sharing the ledger



* On permissioned platforms where user identity is known, **validation** can **occur** **prior** **to** the transaction **being recorded on the block**
  * as a result, the **ledger ONLY contains valid transactions**
* Consuming **real-time data poses no risk**
  * with other consensus mechanisms, you risk consuming data that has been recorded but not yet validated
  * this is why participant consensus model is used extensively in **enterprise scenarios** where the consumption of real time data might be a high priority

<table data-header-hidden data-full-width="true"><thead><tr><th width="230.24432373046875" valign="top"></th><th width="83.88134765625" valign="top"></th><th width="40" valign="top"></th><th width="90.7025146484375" valign="top"></th><th width="40" valign="top"></th><th width="90.0418701171875" valign="top"></th></tr></thead><tbody><tr><td valign="top"><strong>permissioned blockchain</strong></td><td valign="top"><mark style="color:$danger;">Execute</mark></td><td valign="top">→</td><td valign="top"><mark style="color:$success;"><strong>Validate</strong></mark></td><td valign="top">→</td><td valign="top">Commit</td></tr><tr><td valign="top"><strong>permission-less blockchain</strong></td><td valign="top"><mark style="color:$danger;">Execute</mark></td><td valign="top">→</td><td valign="top">Commit</td><td valign="top">→</td><td valign="top"><mark style="color:$success;"><strong>Validate</strong></mark></td></tr></tbody></table>



* Participants can define consensus between themselves using an "**Endorsement Policy**" approach
  * participants decide how many and potentially which nodes shared between them must agree in order to have a valid transaction
  * in theory, consensus can be achieved with less than 51% agreement, and denied with greater than 51% agreement
    * <kbd>it's all up to the participants !</kbd>
* If you and I share a ledger on a permissioned blockchain network, we can define what consensus looks like between us as participants gets to make up whatever  rules work best for them.



* much more **flexible** and **configurable** model

> **Business process** can be **modeled once** (**`Smart Contract`**),&#x20;
>
> and **customized** **for every participant** in the process (**`Endorsement Policy`**)

* write a smart contract to model a business process once
* but you define different set of endorsement policy rules for every one you share that contract with&#x20;





