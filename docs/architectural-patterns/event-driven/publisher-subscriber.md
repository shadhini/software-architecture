---
description: Publisher Subscriber Communication/Integration Pattern; Messaging Pattern
icon: bell
---

# Publisher-Subscriber

## Publisher-Subscriber Architecture

> **Publishers** send messages&#x20;
>
> * e.g: a new post&#x20;
>
> to a **broker**, which delivers them&#x20;
>
> to **subscribers**
>
> * e.g: followers



* Publishers categorize messages into topics/channels without knowing subscribers, if anym there are.&#x20;
* Subscribers express interest in one or more topics and receive only messages of interest, without direct knowledge of the publishers.&#x20;
* **Durability** --> ensures message **persistence**



## Benefits

* decouples producers and consumers
* enable scalability&#x20;
* enable fault tolerance



## Implementation

### Frameworks

* `Apache Kafka` for high-throughput streams
  * `Kafka` — uses **topics** and **partitions** for scalability
* `RabbitMQ` for reliable messaging
  * `RabbitMQ` — offers **exchanges** (`direct`, `fanout`) for routing



### Tips

* Use **durable queues** in `RabbitMQ` and **replicate** `Kafka` **topics** across brokers



## Use-cases

* ✨📌 Ideal for **real-time updates** and **event-driven systems**.
* X's real-time tweet notifications to followers



### Kafka

#### Kafka Architecture

<figure><img src="../../.gitbook/assets/software-architecture_kafka-architecture.svg" alt="" width="563"><figcaption></figcaption></figure>







