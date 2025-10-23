---
icon: file-lock
---

# Smart Contract Security Concerns

## Smart Contract Vulnerabilities

* Smart Contract code is **sandboxed** — Smart Contracts can potentially "**break out**" of their execution environment and **gain access to the host**
  * smart contracts have being designed to run in a sandbox environment in the node it is hosted&#x20;
  * in theory it's impossible to break out of this sandbox environment and do any damage outside of it
  * often times, there's significant difference between theory and reality&#x20;
  * clever attackers in the past have figured out how to escape from this code execution sandbox
* Smart Contract **permanence** (the state or quality of lasting or remaining unchanged indefinitely) on pure platforms can give **extra information to** potential **attackers**
  * because old releases of smart contract code never go away&#x20;
  * an attacker on a pure blockchain platform gets to see how you're evolving your code with every new release
  * you're giving a potential attacker a very good insight into which parts of your code you're actively paying attention to and working on and which parts may have slipped off your radar
  * this is why agile/iterative development on a pure blockchain platform can become problematic over time &#x20;
* Development of Smart Contracts requires **learning** **new** tools, environments, dev-ops processes, and potentially development languages&#x20;
  * **risk** of **getting something wrong** is greater
* Smart Contracts are **new**
  * **Best practices**, design patterns, and anti-patterns to avoid are **still** **being** **formulated**
  * new **attack vectors** are **still being discovered**



## Smart Contract Attack Vectors

#### Reentrancy Attack

{% content-ref url="reentrancy-attack.md" %}
[reentrancy-attack.md](reentrancy-attack.md)
{% endcontent-ref %}

#### Front Running

{% content-ref url="front-running.md" %}
[front-running.md](front-running.md)
{% endcontent-ref %}

#### Integer Overflow / Underflow

{% content-ref url="integer-overflow-underflow.md" %}
[integer-overflow-underflow.md](integer-overflow-underflow.md)
{% endcontent-ref %}

#### Logic Errors

{% content-ref url="logic-errors.md" %}
[logic-errors.md](logic-errors.md)
{% endcontent-ref %}

#### Block Gas Limit&#x20;

{% content-ref url="block-gas-limit.md" %}
[block-gas-limit.md](block-gas-limit.md)
{% endcontent-ref %}

#### Problem of Default Visibility

{% content-ref url="default-visibility.md" %}
[default-visibility.md](default-visibility.md)
{% endcontent-ref %}

#### Timestamp Manipulation

{% content-ref url="timestamp-manipulation.md" %}
[timestamp-manipulation.md](timestamp-manipulation.md)
{% endcontent-ref %}



