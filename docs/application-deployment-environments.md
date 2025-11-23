---
icon: plane-departure
---

# Application Deployment Environments

## Application Environments

> — combination of the hardware and software resources required to run an application —&#x20;

include

* application **code** / binary **executables**
* **software** stack — **modules** & **libraries** it depends on,  third party **applications**, **middleware**, **OS**
* **networking** components & **infrastructure**
* physical or virtual **hardware** — **compute** (computing/processing resources), **memory** & **storage**



## Environment Types based on Apps' Stage in its Lifecycle

### Pre-production Environments

> **platforms that the application resides on in various forms as it gets prepared for production** &#x20;

1. **`Development`** Environment: project is being actively coded
   * in many cases, it may just be the developer's workstation
2. **`QA: Quality Assurance` / `Testing`** Environment: QA team tests the application's components
3. **`Staging`** Environment: Replicates production environment but not meant for general users



### Production Environment

> **— environment intended for general use —**&#x20;
>
> intended for all users

includes

* entire solution stack ++
  * both hardware & software&#x20;

must consider/take into account

* application **load**&#x20;
  * thousands/millions of people at the same time for enterprise-level applications
* other **non-functional requirements**
  * security, reliability, scalability

more complex than pre-production environments



## Deploying Application Environments

### On-premises Deployment

> **— system & infrastructure reside in-house —**&#x20;
>
> within the organization's physical location
>
> often behind a **firewall**: firewall prevent unauthorized access to or from a private network

* offers greater control of the application & data in use by that application
* the organization is responsible for everything
  * system, hardware, related infrastructure, maintenance required
* usually more expensive when compare to cloud deployment

### Cloud Deployment

3 types of cloud deployment models

1. **`Public`**:
   * shared cloud infrastructure over internet
   * hardware is owned by the cloud provider&#x20;
     * this hardware is shared with other organizations too
   * public cloud provides: `AWS: Amazon Web Services`, `Microsoft Azure`, `Google Cloud Platform`, `IBM Cloud`
   * most common&#x20;
     * due to its **scalability** and **cost**
2. **`Private`**:
   * cloud infrastructure is provisioned for exclusive use by a single organization
   * software system&#x20;
     * can be run on-premises
     * or the infrastructure could be owned, managed, and operated by a service provider
   * private cloud service providers: `AWS`
   * advantages:&#x20;
     * increased security
     * allows for more flexibility — as it can be fully customized
3. **`Hybrid`**: mix of both public & private clouds working together seamlessly
   * some infrastructure provided over the internet & some provisioned by a single organization
   * potentially optimizes the advantages of both public & private cloud models
     * with regard to cost, security, scalability, flexibility

