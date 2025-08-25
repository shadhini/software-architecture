---
icon: vial-circle-check
---

# Testing

## Software Testing

> **Software Testing**
>
> process of verifying that the software matches established requirements and is free of bugs
>
> **purpose**: identify errors, gaps, or missing requirements &#x20;
>
> Integrate quality checks throughout SDLC

{% hint style="info" %}
Software testing can often be **automated** or **done manually**.
{% endhint %}

#### Properly tested software ensures&#x20;

* reliability,
* security,&#x20;
* performance, and&#x20;
* efficiency





## Test Cases

> — written to verify the functionality of a software application and ensure requirements have been satisfied —&#x20;
>
> * can be written in different stages of the SDLC
> * vary depending on the type of test or the method used to develop the software; Agile or waterfall

A test case contains:&#x20;

* steps
* inputs
* data&#x20;
* the expected corresponding outputs

✅️ should always be written after requirements are finalized



## Types of Testing&#x20;

### 1. `Functional Testing`

* involves **black box testing**: method of testing without looking at source code or internal structure
* only concerned with **inputs** and corresponding **outputs** of the System Under Test (`SUT`)
* test functional requirements
* purpose: ensure usability and accessibility
* makes sure that when **user errors** or **input edge cases** do occur,&#x20;
  * ╰┈➤ the software handles those exceptions seamlessly by displaying appropriate error messages

### 2. `Non-functional Testing`&#x20;

* testing the application for attributes like&#x20;
  * performance
  * security
  * scalability&#x20;
  * availability
* checks to see if the SUTs non-functional behavior is performing properly
  * How does the application behave **under stress**?&#x20;
  * What happens **when many users log in at the same time**?&#x20;
  * Are the **instructions** in documents and user manuals **consistent** **with** the application’s **behavior**?&#x20;
  * Does the application behave similarly under **different operating systems**?&#x20;
  * How does the application handle **disaster recovery**?&#x20;
  * And **how secure** is the application?

### 3. `Regression Testing` | `Maintenance Testing`

* confirms changes (e.g: bug fix) don't break application
* should occur when there has been a change in requirements or when defects have been fixed
* to conduct regression testing, all or some of the test cases should be selected&#x20;
* Regression test case selection and prioritization can be challenging and can depend on several factors
  * chose test cases that&#x20;
    * have frequent defects 
    * contain frequently used functionality
    * contain features with recent changes
    * are complex test cases
    * are edge cases&#x20;
    * are randomly successful or failed



## Levels of Testing&#x20;

Unit ➜ Integration ➜ System ➜ Acceptance

### **1. `Unit Testing`**

* performed by the developer/engineer during development phase of SDLC
* tests the smallest component of code that can be isolated from the rest of the system
* refers to tests that verify the functionality of a specific section of code, usually at the function level
* **aim**:  eliminate construction errors before code is integrated with other modules
* **intended to**:&#x20;
  * increase the quality of the resulting software&#x20;
  * increase the efficiency of the overall development process



### **2. `Integration Testing`**

* occurs once the components/modules are integrated into the larger product
* **aim**:&#x20;
  * identify errors when two or more smaller, independent code modules are combined
  * uncovers deficiencies in communication with a new module in conjunction with other existing modules, databases, or external hardware
    * situations where bugs develop due to differing programming logic between modules
    * poor exception handling can cause problems when modules are integrated together
* type of **black-box testing**



### **3. `System Testing`**&#x20;

* take place after the larger product is deemed completed, after integration testing
* validates the system as a fully completed software product
* **aim**: evaluate the system's compliance with its specified requirements (SRS)
* both functional and non-functional
* done in a **staging environment**, which should be similar to the production environment



### **4. `UAT: User Acceptance Testing`** — `beta testing`

* done by the customer or the stakeholders during the maintenance stage of the SDLC
* formal testing with respect to user needs, requirements, and business processes
* **aim**: determines whether a system satisfies the needs of the&#x20;
  * users
  * customers&#x20;
  * other stakeholders









