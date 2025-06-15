---
description: 'Sharding: Data Management/ Scalability Pattern'
icon: split
---

# Sharding

## Sharding Data Management Pattern

<kbd>Divide and Conquer | Partitioning Techniquw</kbd>

> **Split** a **database** into smaller, manageable pieces (**`shards`**) across multiple servers,
>
> * based on **keys**&#x20;
>   * like user ID or region
>
> Each shard&#x20;
>
> * holds a subset of the data — **horizontal partitioning** —&#x20;
> * and can reside on a separate server.



* This distributes load and boosts performance.
* **Replication** ensures data availability



## Benefits

* distribute load&#x20;
* boosts performance
* improve scalability
* handles massive datasets
  * e.g: billions of users&#x20;
* improves query speed



## Implementation

### Frameworks

* `MonoDB` with **auto-sharding**
* `PostgreSQL` with `Citus` for distributed tables



### Tips

* Choose a **shard key** wisely
  * poor choices can create **hotspots** (one or a few shards receiving a disproportionately large amount of the workload — read, writes or both)
    * e.g: timestamp
* Use **range-based** or **hash-based** sharding&#x20;
* Monitor shard balance with tools&#x20;
  * e.g: `MongoDB Ops Manager`



## Use-cases

* A social media platform sharding user data by country.





