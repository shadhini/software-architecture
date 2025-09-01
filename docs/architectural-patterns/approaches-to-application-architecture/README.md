---
icon: person-chalkboard
---

# Approaches to Application Architecture

## Component-based Architecture

{% content-ref url="component-based-architecture.md" %}
[component-based-architecture.md](component-based-architecture.md)
{% endcontent-ref %}



## Components vs Services

| Component                                                                                 | Service                                                                                                                                              |
| ----------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
|                                                                                           | has only one unique, always running instance with whom multiple clients communicate                                                                  |
| <p>Examples: </p><ul><li>API</li><li>Controller</li><li>DAO: Data Access Object</li></ul> | <p>Examples: </p><ul><li>checking a customer's credit</li><li>calculating a monthly loan payment</li><li>processing a mortgage application</li></ul> |



## Relationship between Components & Services in Layered Architecture

> **Services** are **made of components**.
>
> And **components consist of objects**.&#x20;

<figure><img src="../../.gitbook/assets/software-architecture-components-n-services-in-layered-architecture.svg" alt="" width="563"><figcaption><p>Application Implementation Layers</p></figcaption></figure>



## `SOA`: Service Oriented Architecture

{% content-ref url="soa-service-oriented-architecture.md" %}
[soa-service-oriented-architecture.md](soa-service-oriented-architecture.md)
{% endcontent-ref %}



## Distributed Systems

{% content-ref url="distributed-systems.md" %}
[distributed-systems.md](distributed-systems.md)
{% endcontent-ref %}



