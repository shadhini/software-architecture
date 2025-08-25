---
icon: list
---

# Requirements Gathering

## Software Requirements

1. Functional
2. External & User Interface (UI)
3. System Features
4. Nonfunctional



## Requirement Gathering

> **Requirement Gathering:**
>
> six-step process of&#x20;
>
> * defining a problem to be solved and&#x20;
> * documenting how to go about solving that problem



### 6 - step process of Requirement Gathering

{% hint style="success" %}
Eliciting, Documenting, and Requirement Confirmation are usually completed **iteratively**.
{% endhint %}

#### 1. Identifying stakeholders

* Generally, the **stakeholders** work for the organization that requests the development of the software product.
* **Key personnel** from the organization may include&#x20;
  * decision-makers
  * end-users
  * system administrators
  * engineering personnel
  * marketing personnel
  * sales personnel
  * customer support personnel
* ✅  good to have **a representative from every group** that the product affects

#### 2. Establishing goals and objectives

* **Goals**: broad, long-term achievable outcomes
  * can include customer outcomes and business goals
  * should be **clearly defined**
* **Objectives**: actionable and measurable actions that achieve the stated goals
  * more specific than goals
  * should be **identified**

#### 3. Eliciting requirements from the stakeholders

* can be accomplished through&#x20;
  * surveys
  * questionnaires&#x20;
  * interviews

#### 4. Documenting the requirements

* documented requirements: should be easily understood by stakeholders and the project team

#### 5. Analyzing and confirming the requirements

* analyzed to ensure&#x20;
  * consistency
  * clarity&#x20;
  * completeness
* after analysis, the requirements should be shared with and approved by the stakeholders

#### 6. Prioritizing requirements

* helpful labels
  * “`must-have`”&#x20;
  * “`highly desired`” &#x20;
  * “`nice to have`”
* If possible, order the requirements within these categories

&#x20;

## Documents that result from Requirements Gathering process

### `SRS`: Software Requirements Specification

> **`SRS`: Software Requirements Specification**
>
> * captures the **functionalities** that the software should perform &#x20;
> * establishes **benchmarks** or **service levels** for its **performance**
>
> may include&#x20;
>
> * set of **use cases** that describe the business needs
> * **user flows** that the software must implement

* the most common document

#### Parts of the SRS

* part 1
  * **purpose statement**: the intended use of the SRS
    * **audience**
      * who will have access to the SRS &#x20;
      * how they should use it
    * **scope**
      * benefits of the software
      * goals&#x20;
      * objectives
* part 2
  * **constraints**
    * how the product must operate under given **conditions** that may limit options in the design phase&#x20;
      * such as
        * confirmation to standards&#x20;
        * hardware limitations
  * **assumptions** &#x20;
    * things like
      * required operating system&#x20;
      * hardware that is needed&#x20;
  * **dependencies**: dependencies on other software products
* part 3 - Requirements
  * **Functional** requirements: functionalities of the software
  * **External Interface** requirements: behavior of the software in relation to external entities&#x20;
    * external entities such as&#x20;
      * users &#x20;
      * interactions with other hardware or software
  * **System Features**:  required features for the system to function
    * a subset of functional requirements
  * **Non-functional** requirements:&#x20;
    * performance
    * safety
    * security&#x20;
    * quality standards

### `URS`: User Requirements Specification

> **`URS`: User Requirements Specification**
>
> describe&#x20;
>
> * the business need&#x20;
> * expectations of the end-users from the software system
>
> written as “**user stories**” or “**use cases**” that answer
>
> 1. **Who** is the user?&#x20;
> 2. **What** is the function that needs to be performed? &#x20;
> 3. **Why** does the user want this functionality?

{% hint style="success" %}
**UAT - User acceptance testing** determines if these requirements in URS have been met.
{% endhint %}

{% hint style="info" %}
Often,  URS and SRS are combined into a **single SRS document.**&#x20;

The SRS details the **expectations of the software system**.&#x20;

The **URS is a subset of the SRS**.
{% endhint %}

### `SysRS`: System Requirements Specification

> **`SysRS`: System Requirements Specification**
>
> clearly outlines the requirements of an entire system&#x20;
>
> * expectations of the **hardware needed** for the system&#x20;
> * in addition to software requirements
>
> contains&#x20;
>
> * system capabilities
> * interfaces&#x20;
> * user characteristics
> * policy requirements
> * regulation requirements
> * personnel requirements
> * performance requirements
> * security requirements&#x20;
> * system acceptance criteria
> * hardware expectations

{% hint style="info" %}
The System Requirement Specification is often **used interchangeably** with Software Requirement Specification.&#x20;

But the **SysRS is broader in scope than the SRS**.

Many software projects develop an **SRS rather than a SysRS**.
{% endhint %}



