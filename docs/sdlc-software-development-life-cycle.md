---
icon: arrows-spin
---

# SDLC: Software Development Life Cycle

## `SDLC`: Software Development Life Cycle&#x20;

> **— Scientific approach to software development —**&#x20;
>
> Systematic process to develop high quality software in predictable timeframe and budget.&#x20;
>
> SDLC minimizes development risks and costs.
>
>
>
> **Goal**: produce software that meets client requirements
>
> **Cycle** of planning, design, development, testing, and deployment that can be implemented as an **iterative approach** to software development.

{% hint style="info" %}
The **original SDLC** was conceives as a traditional **waterfall** methods where the phases are **linear**.
{% endhint %}

### Advantages

1. Improves **efficiency** and **reduce risks**
   * by giving development teams a process to follow rather than using an ad hoc approach&#x20;
2. Team members know **what they should be working on and when**&#x20;
   * since there are discrete phases to the SDLC and each phase is well defined&#x20;
3. Facilitates **communication among stakeholders**; customers, other stakeholders, development team
   * since the SDLC offers an overview of the process, stakeholders know where they fit in to that process
4. Team members know **when** development can **move to the next phase**
   * since each phase is discreet, cross domain teams know when they have completed their tasks
5. Respond to **changing requirements**&#x20;
   * SDLC provides room for **iteration** where at the end of a cycle, the process can circle back to incorporate additional requirements as needed&#x20;
6. **Solve problems early** in the process
   * problems are addressed in a timely fashion and can be addressed in the **design phase** rather than during coding
7. Reduces overlapping **responsibilities**
   * each team member has a well defined role which reduces conflict and overlapping responsibilities



### Phases of the SDLC

**Each phase is `discrete`**: meaning that tasks from a previous phase do not overlap with tasks in the next phase

**`Prototype`**: a small scale preliminary mock-up of the system, or parts of the system used for demonstration purposes and to get the stakeholder feedback and clarify/establish requirements; used to test basic design ideas

<figure><img src=".gitbook/assets/software-architecture_SDLC.svg" alt="" width="375"><figcaption></figcaption></figure>

#### 1. Planning

* **Requirements** are
  * gathered
  * analyzed&#x20;
  * documented&#x20;
  * prioritized&#x20;
* factors to be considered&#x20;
  * **users**
  * overall **purpose** of the solution
  * data **inputs/ outputs**
  * legal and regulatory **compliance**
  * **risk id**entification
  * **QA**: quality assurance requirements
  * allocation of human & financial **resources**&#x20;
  * project **scheduling**
* as part of the planning process,&#x20;
  * **labor & material costs** are **estimated** and **weighed against time constraints**
  * **project teams** are **identified**, and **roles** of each team member are **proposed**
* if stakeholders are struggling to define requirements, often the development team may produce **prototypes** during the planning stage to tease out these requirements
  * Though prototyping usually occurs during the planning stage, prototyping can occur at various phases of the SDLC, whenever requirements need to be reconsidered or clarified as the project develops
* 📋 **`SRS`: Software Requirements Specification**
  * Requirements are documented in the SRS
  * should be understood and approved by all stakeholders
  * developers are also involved at this stage



#### 2. Design&#x20;

* Requirements are gathered from the SRS to **develop the software architecture.**
* @ this stage
  * several team members work together to design the architecture
  * the architecture is reviewed by the stakeholders and team
  * prototypes can be designed&#x20;
* 📋 **Design Document**&#x20;
  * used by developers in the development phase



#### 3. Development

* `design document` is completed
* developers start the coding process&#x20;
* _**project planners**_ use the `design document` to determine and assign coding tasks&#x20;
* requires&#x20;
  * use of _programming tools_
  * different _programming languages_&#x20;
  * _software stacks_
  * may have _standards_ or _guidelines_ that need to be followed



#### 4. Testing

* large projects have dedicated testing teams
* code need to be tested to ensure it is&#x20;
  * stable,
  * secure, and&#x20;
  * meets the requirements outlined in the SRS
* testing can be
  * **manual**,
  * **automated**, or&#x20;
  * a **hybrid** of both
* product **bugs** are&#x20;
  * **reported**,&#x20;
  * **tracked**,&#x20;
  * **fixed** and&#x20;
  * **retested** until the software is stable
* common levels of testing
  * **unit testing**
  * integration testing
  * system testing
  * acceptance testing
* testing platforms
  * Staging platform
  * UAT platform

skills required: testing, debugging&#x20;

#### 5. Deployment

* the application is released into the production environment and made available to users
  * this can also **happen in stages**:&#x20;
    * first it is released onto a **User Acceptance Testing** called **`UAT platform`**   &#x20;
    * once the customer signs off on the functionality, it is released to **production**.

<figure><img src=".gitbook/assets/software-deployment.svg" alt="" width="375"><figcaption></figcaption></figure>

* this approach can be used for making software available on a&#x20;
  * website
  * mobile device app store
  * software distribution server on a corporate network

skills required: shell scripting, containers, CI/CD

#### 6. Maintenance&#x20;

* code has been deployed into a production environment
* feedback is collected from stakeholders
* helps to&#x20;
  * find any **other bugs**&#x20;
  * identify user interface (**UI**) **issues**&#x20;
  * identify other requirements that may not have been listed in the SRS
    * **new and changing requirements**
  * identify **code enhancements**
* if bugs are discovered in this phase that were missing during testing
  * these errors need to be fixed for **high priority issues** or&#x20;
  * incorporated into the requirements as part of a **future software release** and&#x20;
  * the **process can start over again**
* information collected in this phase can be fed into another software development cycle if necessary

skills required: monitoring, troubleshooting

