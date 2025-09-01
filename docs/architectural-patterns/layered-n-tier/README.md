---
description: Layered (n-tier) Architectural Pattern
icon: layer-group
---

# Layered (n-tier)

## Layered Architecture | n-tier Architecture

> Organize the app into horizontal **layers**:
>
> * Presentation — UI
> * Application/Business Logic
> * Data Access
> * Infrastructure (sometimes)
>
> each with **distinct/specific** **responsibilities**.
>
>
>
> **Communication** typically occurs **only between adjacent layers**,&#x20;
>
> * promoting **separation of concerns**.

<figure><img src="../../.gitbook/assets/software-architecture_architectural-pattern_layered.svg" alt="" width="563"><figcaption></figcaption></figure>



* **`2 tier`**: clients & server
* **`3 tier`**: presentation, application & data



## Benefits

* enhances maintainability
* enhances testing&#x20;
* enhances team collaboration



## Implementation

### Frameworks

* `ASP.NET Core` with a layered structure
* `Laravel (PHP)` with MVC layers

### Tips

* Use **interfaces** between layers to **decouple** data access
  * e.g: Repository pattern
* Document layer **boundaries**&#x20;
* Use **dependency injection**





## Use-cases

* A banking app with a&#x20;
  * UI layer,
  * loan calculation logic, ad
  * database access.
* Web apps — 3-tier
  * web server → UI
  * application server → process user inputs
  * database server → handles data management



