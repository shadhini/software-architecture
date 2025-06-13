---
description: 'Sharding: Database Architecture'
icon: split
---

# Sharding

## Sharding Database Architecture

<kbd>Divide and Conquer</kbd>

* **Split** a **database** into smaller, manageable pieces (**`shards`**) across multiple servers,
  * based on **keys**&#x20;
    * like user ID or region
* This distributes load and boosts performance.
* **Replication** ensures data availability



## Benefits

* distribute load&#x20;
* boosts performance
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





