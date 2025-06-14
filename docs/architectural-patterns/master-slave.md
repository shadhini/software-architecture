---
description: Master-Slave Architectural Pattern
icon: network-wired
---

# Master-Slave

## Master-Slave Database Architecture

<kbd>One Leader, Many Helpers</kbd>

> A **master** database handles **writes**,
>
> * while **slave** databases **replicate data for reads**,
> * balancing load in **read-heavy apps**.

<figure><img src="../.gitbook/assets/software-architecture_architectural-pattern_master-slave.svg" alt="" width="563"><figcaption></figcaption></figure>



* **Asynchronous** **replication** introduces **lag**
* **Synchronous replication** endures **consistency** but impacts write performance



## Benefits

* scales read performance&#x20;
* provides failover options



## Implementation

### Frameworks

* `MySQL` with **master-slave** replication
* `PostgreSQL` with **streaming** replication

### Tips

* configure read-only slaves&#x20;
* monitor replication lag with tools like `Percona Monitoring`



## Use-cases

* ✨📌 Ideal for **read-heavy apps**.
* A news site with heavy read traffic and occasional article updates.



#### Master Slave Example Architecture

<figure><img src="../.gitbook/assets/software-architecture_master-slave_example_leader-follower.svg" alt=""><figcaption><p>Leader-Follower</p></figcaption></figure>



