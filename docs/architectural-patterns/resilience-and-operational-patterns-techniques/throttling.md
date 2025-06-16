---
description: 'Throttling: Performance/Control Pattern; API Management Pattern'
icon: hand-scissors
---

# Throttling

## Throttling

<kbd>Control the Flow</kbd>

> **Limit the number of requests** to a service or API within a specific time window,
>
> to prevent server overload,
>
> using techniques like
>
> * `token buckets` or&#x20;
> * `leaky buckets`.





## Benefits

* protects against abuse&#x20;
* protects against DDoS attacks
* ensure fair resources use
* protects the service from being overwhelmed
* helps maintain service stability and availability



## Implementation

### Frameworks

* `Express.js` with `rate-limiter-flexible`
* `ASP.NET Core` with middleware

### Tips&#x20;

* set limits&#x20;
  * e.g: 100 requests/minute
* handle over limit responses
  * e.g: HTTP 429
* **log** **throttled** requests for analysis
* use `Redis` for **distributed rate limiting**



## Use-cases

* An API limiting free-tier users to 1000 requests/day.



