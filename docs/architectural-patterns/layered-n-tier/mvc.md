---
description: 'MVC: Model View Controller Architectural Pattern'
icon: swatchbook
---

# MVC

## `MVC`: Model-View-Controller  Architecture

> Separate&#x20;
>
> * data: `Model`,
> * presentation: `View`, and
> * logic: `Controller`
>
> for clean, maintainable web apps.

<kbd>primarily for UI applications</kbd>

<figure><img src="../../.gitbook/assets/software-architecture_architectural-pattern_MVC.svg" alt="" width="563"><figcaption></figcaption></figure>

* **Controllers**&#x20;
  * handle HTTP requests
  * handle user input, interacts with the Model, and selects a View to display
* **Models**
  * mange data and rules
    * e.g: ORM: Object Relational Mapping
  * might interact with backend services
* **Views**
  * render HTML or JSON
  * render data from the Model into a user interface&#x20;



## Benefits

* streamlines development, debugging & UI updates

&#x20;

## Implementation

### Frameworks

* `Ruby on Rails`
* `Spring MVC (Java)`
* `Django (Python)` with **MTV** variation

### Tips

* use **ORM**: Object Relational Mapping
  * `ActiveRecord` in `Rails`
* **cache views** for performance



## Use-cases

* A blog platform with a model for posts, a view for the frontend, and a controller for CRUD operations.



