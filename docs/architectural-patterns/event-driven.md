---
description: Event Driven Architectural Paradigm/Style
icon: calendar-days
---

# Event-Driven

## Event-Driven Architectural Style

<kbd>React in Real-Time</kbd>

> Systems respond to **events**&#x20;
>
> * e.g: a user signup&#x20;
>
> using **message queues** or **streams**,
>
> enabling **asynchronous processing**.



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



