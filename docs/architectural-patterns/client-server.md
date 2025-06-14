---
description: Client-Server Architectural Pattern
icon: right-left
---

# Client-Server

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

<figure><img src="../.gitbook/assets/software-architecture_architectural-pattern_client-server.svg" alt="" width="563"><figcaption></figcaption></figure>



* backbone of web
* power everything from e-commerce sites to social platforms
* **APIs** — enhanse flexibility
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







