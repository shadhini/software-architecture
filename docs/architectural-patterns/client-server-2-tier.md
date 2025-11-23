---
description: Client-Server Architectural Style/Pattern; Network Architectural Model
icon: right-left
---

# Client-Server / 2-tier

## Client Server Architecture

> A **server** processes requests&#x20;
>
> * e.g: web server like `Apache`/`Nginx`
>
> from **clients**&#x20;
>
> * e.g: browsers, mobile apps
>
> using a **request-response** model.
>
>
>
> **Server** **hosts, delivers & manages** most of the resources & services delivered to the **client**.
>
> * Usually have **multiple clients** connected to server component over a **network connection**.



<figure><img src="../.gitbook/assets/software-architecture_architectural-pattern_client-server.svg" alt="" width="563"><figcaption></figcaption></figure>



* backbone of web
  * browser — client
  * web server — server
* power everything from e-commerce sites to social platforms
* **APIs** — enhance flexibility
  * `REST` for CRUD operations
  * <kbd>GraphQL</kbd> for tailored data fetching
* **Security** — relies on&#x20;
  * **HTTPS**  and
  * **authentication**
    * e.g: `OAuth2`



## Benefits

* centralized control simplifies management
* **statelessness** (HTTP) — ensures scalability



## Implementation

### Frameworks

* `Django (Python)` with a `PostgreSQL` backend
* `Express.js (Node.js)` for real-time apps



### Tips

* **load balancers** for high traffic
  * `NGINX`
* cache responses with `Redis`



## Use-cases

* A news website where the server delivers articles to mobile and web clients
* Messaging apps
  * client initiate a request to send a text message through a server &#x20;
  * the server responds by sending that message to another different client&#x20;
* Database clients connecting with database servers







