---
icon: palette
---

# Architectural Styles & Patterns

> **Architectural Style**:
>
> overall philosophy/category for the system's design&#x20;
>
> * general idea of how things should be organized
> * provides the "**what**" and "**why**" at a high level

> **Architectural Patterns**:
>
> Time-tested blueprints that offer proven, reusable solutions to recurring design challenges
>
> * an  implementation of an architectural style or part of it
> * you can use several architectural patterns when building a system that adheres to a particular architectural style
> * provides the "**how**" for specific problems



* Netflix streaming: microservices
* BitTorrent decentralised file sharing: peer to peer



<table><thead><tr><th width="201.24609375">Architectural Style</th><th>Architectural Patterns</th></tr></thead><tbody><tr><td><strong>Microservices</strong><br>— Architectural Pattern/ Style</td><td><p>asynchronous communication: </p><ul><li>Event-Driven Architecture</li><li>Publisher Subscriber</li><li>Event Broker</li></ul><p>resilience:</p><ul><li>Circuit Breaker</li></ul><p>api management:</p><ul><li>Throttling</li></ul><p>individual microservices (internal architecture):</p><ul><li>Layered Architecture</li><li>MVC</li></ul><p>data management:</p><ul><li>Sharding</li><li>CQRS</li></ul></td></tr><tr><td><p><strong>Client-Server</strong><br>— Architectural Style/ Pattern</p><p>— Network Architecture Model</p></td><td><p>underlying architecture for</p><ul><li>most distributed systems</li><li>web applications (browser — client, web server — server)</li></ul><p>architectural patterns</p><ul><li>microservices — to expose APIs consumed by clients</li><li><p>MVC</p><ul><li>View/Controller — client</li><li>Model — server</li></ul></li></ul><p></p></td></tr><tr><td><strong>Circuit Breaker</strong><br>— Resilience/ Reliability Pattern</td><td><p>crucial for</p><ul><li>distributed systems</li></ul><p>to prevent cascading failures when a dependednt service is unavailable or slow</p><ul><li>microservices</li><li>SOA: service oriented architecture</li></ul></td></tr><tr><td><code>Pub/Sub</code>: <strong>Publisher-Subscriber</strong> <br>— Communication/ Integration Pattern <br>—  Messaging Pattern</td><td><p>component of </p><ul><li>Event-Driven Architecture</li></ul><p>implemented using</p><ul><li>Event Broker</li></ul><p>widely used for asynchronous, decoupled communication in</p><ul><li>Microservices</li></ul><p></p></td></tr><tr><td><strong>Event-Driven</strong> <br>— Architectural Style/ Pattern<br>— Communication/ Integration Pattern</td><td><p>relies on </p><ul><li> Publisher-Subscriber pattern</li></ul><p>often uses</p><ul><li>Event Broker — as backbone</li></ul><p>frequently adopted to achieve loose coupling, scalability, and resilience in</p><ul><li>Microservices</li></ul><p>fits well with </p><ul><li>CQRS</li></ul><p></p></td></tr><tr><td><p><strong>Event Broker</strong><br>— Infrastructure Component</p><p>— Part of Communication/ Integration Patterns</p></td><td><p>enable infrastructure for </p><ul><li>Event-Driven Architecture</li><li>Publisher-Subscriber pattern</li></ul><p>facilitates decoupling  &#x26; asynchronous communication in systems like</p><ul><li>Microservices</li><li>SOA: Service Oriented Architecture</li></ul><p></p></td></tr><tr><td></td><td></td></tr></tbody></table>

