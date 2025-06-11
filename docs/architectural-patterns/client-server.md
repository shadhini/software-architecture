---
description: Client-Server Architectural Pattern
icon: right-left
---

# Client Server

## Client Server Architecture

*   A **server** processes requests from

    * e.g: web server like `Apache`/`Nginx`

    **clients**&#x20;

    * e.g: browsers, mobile apps

    using a **request-response** model.
* backbone of web
* power everything from e-commerce sites to social platforms
* **APIs** — enhanse flexibility
  * `REST` for CRUD operations
  * <kbd>GraphQL</kbd> for tailored data fetching
* **Security** — relies on&#x20;
  * **HTTPS**  and
  * **authentication**
    * e.g: `OAuth2`
  *



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







