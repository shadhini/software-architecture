---
description: Master-Slave Data Replication Pattern; High Availability/Scalability Pattern
icon: network-wired
---

# Master-Slave

## Master-Slave Database Architecture

<kbd>One Leader, Many Helpers | Data Replication Model</kbd>

> A **master/primary/leader** database handles all **writes**,
>
> * while **slave/replica/follower** databases **replicate data for reads**,
> * balancing load in **read-heavy apps**.

<figure><img src="../../.gitbook/assets/software-architecture_architectural-pattern_master-slave.svg" alt="" width="563"><figcaption></figcaption></figure>



* **Asynchronous** **replication** introduces **lag**
* **Synchronous replication** endures **consistency** but impacts write performance



## Benefits

replicas/followers/slaves

* scales read performance/capacity
* provides failover options
  * provide high availability (failover if the primary fails)



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

<figure><img src="../../.gitbook/assets/software-architecture_master-slave_example_leader-follower.svg" alt=""><figcaption><p>Leader-Follower</p></figcaption></figure>



