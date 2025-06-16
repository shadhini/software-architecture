---
description: Event Driven Architectural Style/Pattern; Communication/Integration Pattern
icon: calendar-days
---

# Event-Driven

## Event-Driven Architectural Style

<kbd>React in Real-Time | Loose coupling | Asynchronous Communication</kbd>

> Systems respond to **events**&#x20;
>
> * e.g: a user signup&#x20;
>
> using **message queues** or **streams**,
>
> enabling **asynchronous processing**.
>
>
>
> Promotes
>
> * **loose coupling**
> * **asynchronous communication**



* **Events** trigger **microservices**



## Benefits

* Improves responsiveness
* decouples components
* supports real-time features



## Implementation

### Frameworks

* `Node.js` with `Apache Kafka`
* `Spring Cloud Stream` with `RabbitMQ`



### Tips

* use `dead-letter queues` for failed messages
* ensure `idempotency` to handle **duplicate events**
* monitor **queue depth**



## Use-cases

* X's real-time notifications when a user posts.



### Example Producer-Consumer Architecture

<figure><img src="../../.gitbook/assets/software-architecture_event-driven_example.svg" alt=""><figcaption></figcaption></figure>

* `Streams` are channels for conveying events
* `Producers` may **write** to **multiple** streams
* `Consumers` may **read** from **multiple** streams
* Producers and consumers may **overlap**, being pars of the **same application**





