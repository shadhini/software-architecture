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



***



<table><thead><tr><th width="201.24609375">Architectural Style</th><th>Architectural Patterns</th></tr></thead><tbody><tr><td></td><td><strong>— — —</strong> <strong>Core Architectural Styles / Paradigms — — —</strong> </td></tr><tr><td><strong>Monolithic</strong><br>— Architectural Style/ Pattern</td><td><p>— Traditional all-in-one application — </p><p>internally used in </p><ul><li>Layered Architecture</li><li>MVC</li></ul></td></tr><tr><td><p><strong>Client-Server</strong><br>— Architectural Style/ Pattern</p><p>— Network Architecture Model</p></td><td><p>— Request-response model — </p><p>underlying architecture for</p><ul><li>most distributed systems</li><li>web applications (browser — client, web server — server)</li></ul><p>architectural patterns</p><ul><li>microservices — to expose APIs consumed by clients</li><li><p>MVC</p><ul><li>View/Controller — client</li><li>Model — server</li></ul></li></ul><p></p></td></tr><tr><td><strong><code>SOA</code>: Service Oriented Architecture</strong><br>— Architectural Style/ Pattern</td><td><p>predecessor to </p><ul><li>Microservices</li></ul><p>can use </p><ul><li>Event-Driven principles</li><li>Publisher-Subscriber pattern</li></ul></td></tr><tr><td><strong>Microservices</strong><br>— Architectural Pattern/ Style</td><td><p>— Fine-grained &#x26; agile approach to SOA — </p><p>asynchronous communication: </p><ul><li>Event-Driven Architecture</li><li>Publisher Subscriber</li><li>Event Broker</li></ul><p>resilience:</p><ul><li>Circuit Breaker</li></ul><p>api management:</p><ul><li>Throttling</li></ul><p>individual microservices (internal architecture):</p><ul><li>Layered Architecture</li><li>MVC</li></ul><p>data management:</p><ul><li>Sharding</li><li>CQRS</li></ul></td></tr><tr><td><strong>Event-Driven</strong> <br>— Architectural Style/ Pattern<br>— Communication/ Integration Pattern</td><td><p>— Promotes loose coupling &#x26; Asynchronous communication — </p><p>relies on </p><ul><li> Publisher-Subscriber pattern</li></ul><p>often uses</p><ul><li>Event Broker — as backbone</li></ul><p>frequently adopted to achieve loose coupling, scalability, and resilience in</p><ul><li>Microservices</li></ul><p>fits well with </p><ul><li>CQRS</li></ul><p></p></td></tr><tr><td><p><strong>Event Broker</strong><br>— Infrastructure Component</p><p>— Part of Communication/ Integration Patterns</p></td><td><p>enable infrastructure for </p><ul><li>Event-Driven Architecture</li><li>Publisher-Subscriber pattern</li></ul><p>facilitates decoupling  &#x26; asynchronous communication in systems like</p><ul><li>Microservices</li><li>SOA: Service Oriented Architecture</li></ul><p></p></td></tr><tr><td><code>Pub/Sub</code>: <strong>Publisher-Subscriber</strong> <br>— Communication/ Integration Pattern <br>—  Messaging Pattern</td><td><p>component of </p><ul><li>Event-Driven Architecture</li></ul><p>implemented using</p><ul><li>Event Broker</li></ul><p>widely used for asynchronous, decoupled communication in</p><ul><li>Microservices</li></ul><p></p></td></tr><tr><td><strong>Layered (<code>n-tier</code>)</strong><br>— Architectural Pattern</td><td><p>applicable within these applications to structure their internal components</p><ul><li>Monolithic applications</li><li>individual Microservices </li><li>SOA services</li></ul><p>specialized layered pattern for the presentation tier</p><ul><li>MVC</li></ul><p></p></td></tr><tr><td><strong><code>MVC</code>: Model-View-Controller</strong><br>— Architectural Pattern</td><td><p>widely used in web applications</p><ul><li>Client-Server model</li></ul><p>structure the UI layer of </p><ul><li>Monolithic applications</li><li>front-end Microservices</li></ul><p>form of</p><ul><li>Layered Architecture — for the presentation tier</li></ul><p></p></td></tr><tr><td><strong>Pipe-Filter</strong><br>— Architectural Pattern</td><td><p>can be used within</p><ul><li>Microservices for complex data transformation tasks</li></ul><p>well- suited for</p><ul><li>data processing pipelines</li></ul><ul><li>transformations</li><li>stream processing</li><li>to compose a sequence of operations</li></ul><p></p></td></tr><tr><td><p><strong><code>P2P</code></strong>: <strong>Peer-to-Peer</strong><br>— Network Architecture Model</p><p>— Architectural Style/ Pattern</p></td><td><p>— Distributed Decentralized Network Architecture — </p><p>used in</p><ul><li>file sharing systems</li><li>blockchain networks</li></ul><p></p></td></tr><tr><td></td><td><strong>— — — Data Management &#x26; Scalability Strategies — — —</strong> </td></tr><tr><td><strong>Sharding</strong><br>— Data Management/ Scalability Pattern</td><td><p>— Horizontal Splitting — </p><p>commonly used in applications with high data volume to scale databases</p><ul><li>Microservices</li><li>SOA: Service Oriented Architecture</li><li>Monolithic</li></ul><p>used in conjunction with these for each shard</p><ul><li>CQRS</li><li>Master-Slave replication</li></ul><p></p></td></tr><tr><td><p><strong>Master-Slave (<code>Primary-Replica</code> | <code>Leader-Follower</code></strong>)<br>— Data Replication Pattern</p><p>— High Availability/ Scalability Pattern</p></td><td><p>— Database replication technique — </p><p>common for database scalability and resilience in</p><ul><li>Monolithic</li><li>SOA: Service Oriented Architecture</li><li>Microservices</li></ul><p>can be applied to individual shards in a </p><ul><li>Sharding setup</li></ul><p></p></td></tr><tr><td><p><code>CQRS</code>: <strong>Command Query Responsibility Segregation</strong><br>— Architectural Pattern</p><p>— Data Management Pattern</p></td><td><p>often used with</p><ul><li><p>Event-Driven Architecture</p><ul><li>specially with Event Sourcing</li></ul></li></ul><p>can be applied within</p><ul><li>Microservices</li><li>complex parts of a Monolith</li></ul><p>sometimes used with</p><ul><li>Sharding</li></ul><p></p></td></tr><tr><td></td><td><strong>— — — Resilience &#x26; Operational Patterns/Techniques — — —</strong> </td></tr><tr><td><strong>Circuit Breaker</strong><br>— Resilience/ Reliability Pattern</td><td><p>crucial for</p><ul><li>distributed systems</li></ul><p>to prevent cascading failures when a dependent service is unavailable or slow</p><ul><li>microservices</li><li>SOA: service oriented architecture</li></ul></td></tr><tr><td><p><strong>Throttling</strong><br>— Performance/ Control Pattern</p><p>— API Management Pattern</p></td><td><p>essential for APIs exposed via (especially if they are public-facing)</p><ul><li>Microservices</li><li>SOA services</li><li>Monolithic applications</li></ul><p></p></td></tr><tr><td></td><td><strong>— — — Deployment &#x26; Content Delivery — — —</strong> </td></tr><tr><td><p><strong>Static Content Hosting</strong><br>— Deployment/ Operational Pattern</p><p>— Web Architecture Pattern</p></td><td><p>applied to the front-end components </p><ul><li>e.g: View in MVC</li></ul><p>of various architecture</p><ul><li>Monolithic</li><li>Microservices</li><li>SOA: Service Oriented Architecture</li></ul><p></p></td></tr></tbody></table>







* Netflix streaming: microservices
* BitTorrent decentralised file sharing: peer to peer
* Kafka: event diven | publisher-subsriber architecture
* Bitcoin / Ethereum: peer to peer

