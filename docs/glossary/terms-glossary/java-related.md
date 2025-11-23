---
icon: java
---

# Java Related

<table><thead><tr><th width="152.94921875" valign="top">Term</th><th>Definition</th></tr></thead><tbody><tr><td valign="top"><strong><code>POJO</code></strong>s</td><td><p><strong><code>Plain Old Java Object</code></strong>:</p><ul><li>simple Java object </li><li>isn’t bound to any special framework, container, or API</li><li>typically contains fields, constructors, and plain methods (often getters/setters) and does not implement framework-specific interfaces or extend framework base classes</li></ul><p></p><p>Common characteristics</p><ul><li>Often used as data carriers (models, DTOs) and for business logic when appropriate</li></ul></td></tr><tr><td valign="top"><strong>JavaBean</strong></td><td><ul><li><p>a stricter convention </p><ul><li>public no-arg constructor, Serializable often, getter/setter naming</li></ul></li><li>every JavaBean is typically a POJO, but not every POJO is a JavaBean</li></ul></td></tr><tr><td valign="top"><strong><code>JDBC</code></strong></td><td><p><strong><code>Java Database Connectivity</code></strong>:</p><ul><li>a standard low‑level Java API for connecting to and interacting with relational databases from Java applications directly with SQL</li></ul></td></tr><tr><td valign="top"><strong><code>JPA</code></strong></td><td><p><strong><code>Java Persistence API</code></strong>:</p><ul><li>Java specification for <code>ORM</code>: object-relational mapping and for managing persistent data in Java applications</li><li>defines the interfaces, annotations, and behavior for mapping Java objects (entities) to relational database tables and for performing CRUD and query operations</li><li>hides most raw SQL and JDBC plumbing</li></ul></td></tr><tr><td valign="top"><strong><code>JMS</code></strong></td><td><p><strong><code>Java Message Service</code></strong>:</p><ul><li>a Java API (specification) for sending, receiving and processing messages between Java applications or components via a message broker — enabling asynchronous, decoupled communication</li></ul></td></tr><tr><td valign="top"></td><td><p></p><p><br></p></td></tr></tbody></table>

#### `JPA` vs `JDBC`

**`JDBC`**: a low‑level Java API for talking directly to a relational database with SQL

**`JPA`**: higher‑level specification (an ORM) that maps Java objects (entities) to database tables and hides most raw SQL and JDBC plumbing

