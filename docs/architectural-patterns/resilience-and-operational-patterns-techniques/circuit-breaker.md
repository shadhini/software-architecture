---
description: Circuit Breaker Resilience/Reliability Pattern
icon: plug-circle-xmark
---

# Circuit Breaker

## Circuit Breaker Pattern

<kbd>Fail Gracefully</kbd>

> Circuit Breaker pattern&#x20;
>
> * detects failures and&#x20;
> * prevents cascading failures&#x20;
> * by **halting requests to a failing service** (an operation that's likely to fail)
>
> like&#x20;
>
> * an **electrical circuit breaker trips to avoid overload**



* **Monitors** **failure rates** (e.g: 50% of calls fail )
  * and open the circuit to **fail fast** or **retry later**.
* Support states&#x20;
  * `Closed` — normal operation
  * `Open` — block all subsequent requests (without attempting the remote call)
  * `Half-Open` — test recovery (test whether the remote service is available again)



## Benefits

* prevents cascading failures
* enhances system stability
* reduces downtime
* improves user experience during outages&#x20;



## Implementation

### Frameworks

* `Hystrix (Java)` with **fallback methods**
* `Resilience4j (Java/Spring)` with customizable thresholds



### Tips

* Pair with **monitoring** — to track metrics like error rates
* Set **failure thresholds**&#x20;
  * e.g: 5 failures in 10 seconds
* Define **fallback logic**&#x20;
  * e.g: show a retry message



## Use-cases

* An e-commerce site where a payment gateway failure doesn't crash the entire checkout process.







