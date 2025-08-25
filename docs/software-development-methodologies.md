---
icon: screwdriver-wrench
---

# Software Development Methodologies

A specific software development approach methodology is commonly used in order to&#x20;

**assist the development team** to&#x20;

* clarify communication among team members &#x20;
* determine how and when the information is shared

## Waterfall

<figure><img src=".gitbook/assets/waterfall-method.svg" alt="" width="375"><figcaption></figcaption></figure>

> **— sequential method of software development —**&#x20;
>
> * the output of one phase is the input for the next phase of the cycle
> * development/work on the next phase start only after the completion of the previous phase&#x20;
> * all planning is done up front
>   * defining requirements
>   * architectural design
> * customer usually does not see the product until it is in the testing phase

{% hint style="info" %}
The **original SDLC** was conceives as a traditional **waterfall** methods where the phases are **linear**.
{% endhint %}

{% hint style="warning" %}
Result in **long intervals**, such as years, **between releases**.

* since the whole process is repeated.
{% endhint %}



## V-shape model&#x20;

<figure><img src=".gitbook/assets/V-shape_model.svg" alt="" width="563"><figcaption></figcaption></figure>

> **— Verification & Validation model —**&#x20;
>
> phases form the shape of a V
>
> * phases going down — the left side of the V → **Verification phase**
>   1. **planning**
>   2. **system design**
>   3. **architecture design**&#x20;
>   4. **module design**
> * the bottom of the V  → **Coding phase**
> * phases going up — the right  side of the V   → **Validation phase**
>   1. **unit testing**
>   2. **integration testing**
>   3. **system testing**&#x20;
>   4. **acceptance testing**
>
> **a sequential model**
>
> Each phase in verification corresponds with a validation phase.
>
> The tests are written during the verification phases on the left and executed during the validation stages on the right.



## Agile

Focuses on a collaborative software development process over multiple short cycles rather than a strictly top-down linear process.

<figure><img src=".gitbook/assets/agile-method.svg" alt="" width="375"><figcaption></figcaption></figure>

> **— an iterative approach to development —**&#x20;
>
> * aligns with the **SDLC**, but each **phase** is **short**
> * teams work in **cycles**, or **sprints**, which are usually **1-4 weeks** long
> * **unit testing** happens **in each sprint** --> minimize the risk of failure
> * **final stage** of the sprint is a **feedback stage**; rather than the “maintenance” stage of\
>   the SDLC
> * @ the end of each sprint&#x20;
>   * a **chunk of working code** is **released** at a meeting called the “**`sprint demo`**”
>   * where stakeholders can see the new functionality and provide feedback
> * after the _sprint demo_
>   * the **entire process is repeated** for every sprint cycle
> * **`MVP`: Minimum Viable Product**
>   * after several sprint cycles, a MVP is developed &#x20;
>   * MVP contains a feature set to validate assumptions about the software
>   * stakeholders can provide feedback on the basic feature set



### 4 core values of Agile development outlined in "`Agile manifesto`"&#x20;

1. Individuals and interactions over processes and tools&#x20;
2. Working software over comprehensive documentation&#x20;
3. Customer collaboration over contract negotiation
4. Responding to change over following a plan



## Traditional SDLC Methods vs Agile Method

| Traditional SDLC methods: Waterfall \| V-shape                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 | Agile method                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| sequential                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     | cyclical; iterative                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| <p>center around the whole product being developed before soliciting customer<br>feedback</p>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  | focuses on quick, short bursts of development.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | most popular method used in modern software development                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
|                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                | <ul><li>rely on ongoing research, planning, and testing during product development</li></ul>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| <p>pros: waterfall method</p><ul><li><p>easy for all team members to understand their roles, responsibilities and follow</p><ul><li>due to <strong>discrete</strong> and well-defined stages,</li></ul></li><li><p>easier than iterative methods to estimate a budget and allocate resources</p><ul><li>as planning is done upfront</li></ul></li></ul><p>pros: V-shape model</p><ul><li>simple and easy to use</li><li>designing test plans during the verification phase saves considerable time during coding and validation phases</li></ul>                                                                                                               | <ul><li><p>pros: agile</p><ul><li><p>new and changing requirements are  handled quickly and easily</p><ul><li>development still goes through the same phases as in traditional SDLC</li><li>since planning is initiated at the beginning of each sprint cycle</li><li>most resources are spent on the building phase</li></ul></li><li><p>Feedback incorporated regularly</p><ul><li>At the end of each cycle, the QA team, stakeholders, and the customer have some piece of working code to test against requirements and are<br>encouraged to provide feedback</li><li><p>recent developments in technologies allow for modular design </p><ul><li>developers can focus on smaller chunks of code that are readily integrated into the larger product</li><li>these small chunks can be released to provide the MVP</li></ul></li></ul></li></ul></li></ul> |
| <p>cons: waterfall</p><ul><li>lacks flexibility</li><li><p>hard to accommodate changing requirements</p><ul><li>since all planning is done upfront </li><li>if a requirement is changed or overlooked that change can be hard to incorporate at a later date</li></ul></li><li><p>long intervals between releases</p><ul><li>since the whole process is repeated</li></ul></li></ul><p>cons: V-shape model</p><ul><li>rigid: even more than waterfall </li><li><p>does not readily accommodate changing requirements</p><ul><li>once an application is in the testing phase, it is extremely difficult to go back and change functionality</li></ul></li></ul> | <p>cons: agile</p><ul><li><p>resource allocation (budgeting and scheduling) is challenging</p><ul><li>upfront planning is difficult </li></ul></li><li>Project scope not clearly defined</li></ul>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |

{% hint style="warning" %}
**Accommodating changing requirements is important.**

**Inevitably**, unforeseen complications happen, or agreed upon functionality shifts from what was initially envisioned.
{% endhint %}

\
.
