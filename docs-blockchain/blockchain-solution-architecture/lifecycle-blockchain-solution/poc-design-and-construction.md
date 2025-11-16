---
icon: pen-ruler
---

# PoC Design and Construction

## PoC Design and Construction

> Creating a prototype or PoC or trial version of the blockchain solution to validate its
>
> * feasibility,
> * functionality, and&#x20;
> * alignment with the project's goals and requirements

The PoC is constructed to demonstrate that the blockchain technology can indeed address the identified problem and provide the expected benefits.



**focus of Blockchain PoC: functionality**

* essential features and functionality
* employing the chosen consensus mechanism
* network topology
* smart contract programming
* NOT marketing strategy



**PoC Design and Construction phase**&#x20;

* testing ground for the technical aspects of the project to assess the&#x20;
  * performance
  * scalability&#x20;
  * security of the blockchain system&#x20;
* provides an opportunity to troubleshoot any challenges that may arise during implementation



**Successful completion of this phase**&#x20;

* provides tangible evidence that the proposed blockchain solution can effectively address the identified problem



### Good PoC

> **PoC**:
>
> Proof of Concept

{% hint style="success" %}
#### A good PoC is just like a movie set...

**ONLY** build enough to tell a convincing story

* You are NOT building anything that will go in your production release!
{% endhint %}



{% hint style="success" %}
`HINT`: **Write your script before you build your set...**
{% endhint %}

* Who is the intended audience?
* What take-away impressions do you want the audience to have?
* What does this PoC have to demonstrate to be considered a success?
* What are the intended next steps for anyone seeing / using / testing this PoC?



**If you decide to build the real thing, the PoC gets thrown away...**

* ﻿﻿Your PoC should be used as a model for an MVP, but nothing more
* ﻿﻿Plan on throwing all your PoC code away!
  * Set this expectation with your other project stakeholders as well



### Definition and alignment by stakeholders on PoC boundaries

* ﻿﻿What will this PoC do? — often time only simulating functions/features that we would otherwise fully implement in a production release
  * ﻿﻿What will it actually do?
  * ﻿﻿What will it pretend to do? — simulate
* ﻿﻿What will this PoC NOT do?



### Cross-Organizational Technical Development&#x20;

{% hint style="info" %}
**Cross-Organizational** technical development projects are rare!
{% endhint %}

* ﻿﻿This is new and largely uncharted territory
* The answers, best practices, and industry standards do not exist yet&#x20;
*   You will likely make mistakes and face setbacks along the way

    * Plan for this: include extra time on your schedule to deal with these learning curves that you will inevitably encounter&#x20;
    * ﻿﻿Manage stakeholder expectations properly!



﻿﻿**It is worth it???**

* ﻿﻿Risk:
  * We will spent a lot of money and time
  * We will not develop anything useful
  * We will educate our competition
* Reward:
  * We can gain significant competitive advantages
  * We will be viewed as cutting-edge and forward looking
  * We will learn the skills that will inevitably be needed for successful delivery in the coming years and decades



### How is time spent on a blockchain project?

{% hint style="warning" %}
#### There is a LOT more planning that goes into a blockchain / web3 project!&#x20;

Make sure to include this time in your project plan!
{% endhint %}

<table><thead><tr><th valign="top">Traditional Technical Project</th><th valign="top">Blockchain / Web 3.0 project</th></tr></thead><tbody><tr><td valign="top"><strong><code>20%</code></strong> up-front requirements gathering and planning &#x26; solution documenting</td><td valign="top"><strong><code>80%</code></strong> up-front requirements gathering and planning &#x26; solution documenting</td></tr><tr><td valign="top">﻿﻿<strong><code>80%</code></strong> development and technical work</td><td valign="top">﻿﻿<strong><code>20%</code></strong> development and technical work</td></tr></tbody></table>

### Technical Considerations

* ﻿﻿**Available** skillsets vs **required** **skillsets**
  * Will the work be performed **in-house**, **outsourced**, or a **combination**?
  * What are the **responsibilities** and **deliverables** of each **vendor** / participant?
* Technical Training or Education required?
* ﻿﻿How will architects and developers be supported?
* ﻿﻿Are we involving Operations at this phase?
  * <mark style="background-color:$warning;">**This should be a dev/ops project, not a dev project!**</mark>



### Project Management Considerations

* ﻿How will new releases be demoed / trialed?
* How will feedback be collected?
* ﻿﻿How will feedback be integrated into the Product Backlog?
  * What defines feedback that will NOT be integrated in the backlog?
* ﻿﻿How will sprints be defined from the Product Backlog?
  * Sprint duration?
  * Skillsets per sprint?
* ﻿﻿How will sprints be managed?
  * ﻿﻿Post-Mortem process?
    * often in agile/iterative development, we complete a sprint and immediately move on to the next block of work without stopping to look at what we've just done and gauge our relative success or failure
    * at the end of each sprint consider having a good, bad and ugly meeting&#x20;
      * simply sit down with the development team and review the last sprint&#x20;
      * ask yourselves,&#x20;
        * what are the **good** things — what are the things that work that we want to do more of in the future
        * what are the **bad** things that happened during this sprint — what are the thing that didn't work that we want to make sure we're not carrying into the future&#x20;
        * the **ugly** — what are the things that worked, but they weren't necessarily ideal, they were ugly, they were hacks — in the future, we might want to try and find a better way to achieve that particular outcome
* ﻿﻿What is the official Change Management process?
  * ﻿﻿Are all team members up to speed?
  * defining change management is a classic **fire drill concern**
*   ﻿﻿Have we reached PoC Exit Criteria?

    * ﻿﻿how many iterations are we going to go through, before we make that go-no-go decision
      * when to make decision to either&#x20;
        * throw away this PoC and move on to the next one&#x20;
        * to promote this PoC to an MVP
    * Should Exit Criteria be revisited?
    * ❗ do not get stuck in a loop of PoC development cycles&#x20;





### Fire Drill Concerns:

{% hint style="warning" %}
Consider the things you KNOW are going to come up ahead of time!
{% endhint %}



* If using a **pure blockchain** platform, how will **new releases** be managed?
  * How are old releases dealt with?
* ﻿﻿If using a **permissioned** platform, how will the **security of other network participants be evaluated** and potentially **adjusted**?
  * ﻿﻿A chain is only as strong as its weakest link...
* ﻿﻿How will **user access** be granted, audited, promoted, demoted, revoked, and reinstated?
  * Do **all** solution **participants** **agree** on the processes behind these activities?
* ﻿﻿How will **attacks** against the system be **handled**?
* How will **end users** be **supported**?
  * Training and education, tech support, etc



### Other Considerations

\
**Budgeting**

* How are costs distributed in a cross-organizational effort?

**Change Management**

* How will change requests be handled?
* How will changes be integrated into the product backlog?

**Development**

* Will this be a **`one-off effort`** or an **`iterative`** one?

**DevOps**

* Is your devops process healthy?
* What about your other network members?
* How will new versions / releases be managed?
* How will outages and offline periods be scheduled and managed cross-organizationally?

**Security**

* ﻿﻿Information Security
* ﻿﻿Controlling & Auditing Access

**Project and Program Management**

* How will the overall project be managed?&#x20;
* **`Centralized`** or **`decentralized`** management?

**Resourcing and Scheduling**

* ﻿﻿Do we have all the skills we need?
* ﻿﻿What about our business network partners?
* How will skillset acquisition be handled across the business network?

**Post Go-Live Management and Support**

* Where will help and support come from?
* Will this be provided by organization?&#x20;
* Will there be a centralized help & support resource?



### PoC Team Composition

2 approaches for building a team:

1. ﻿﻿**`Build it and they will come`** approach
   * — build the solution, and then the stakeholders will come —&#x20;
   * we try and imagine what the ideal solution looks like
   * we go off and build it on our own
   * then we show it off to the rest of our business network, hoping that once the network gets to see what we're envisioning, they'll want to come join us and be a part of further solution activities
2. **`Build alignment right up front`** approach
   * — a group effort right from the start —&#x20;
   * we go and we get alignment with all of our stakeholders across our business network on what we want to build and&#x20;
   * then only after we've obtained that alignment does construction actually begin



* ﻿﻿Would you prefer to move fast initially and gain buy-in[^1] later?
* ﻿﻿...or is it more important to get buy-in up-front?



**Both approaches takes about same time; only difference is which part goes fast;**&#x20;

* development cycle or stakeholder alignment
* initial development slow vs initial development fast&#x20;
  * **`Build it and they will come`**: at the begining fast
* stakeholder alignment fast vs stakeholder alignment slow
  * **`Build alignment right up front`**: at the beginning slow, during backend development fast







[^1]: agreement, support, or commitment from a group of people—often stakeholders, team members, or leadership
