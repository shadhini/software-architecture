---
icon: aws
---

# Serverless Computing

## Serverless Computing

> **Serverless Computing**
>
> * a cloud-computing model where you run application code or use managed services without having to provision, manage, or operate the underlying servers
> * the **cloud provider automatically** runs, scales, and manages the infrastructure needed to execute your code
>
>



#### **Key ideas**

* **You don’t manage servers:**&#x20;
  * the cloud provider hides servers, OS patching, capacity planning, and most operational work
* **Event-driven execution:**&#x20;
  * your code runs in response to events&#x20;
    * e.g: HTTP requests, messages, DB changes, scheduled jobs
* **Automatic scaling:**&#x20;
  * the platform scales up and down (often to zero) based on demand
* **Pay-per-use billing:**&#x20;
  * you pay for actual usage rather than for idle capacity
    * e.g: execution time, memory used, number of requests

#### Common serverless components

* <kbd>**FaaS**</kbd> (Functions-as-a-Service):&#x20;
  * e.g: AWS Lambda, Azure Functions, Google Cloud Functions
* <kbd>**BaaS**</kbd> (Backend-as-a-Service):&#x20;
  * e.g., managed databases, authentication, object storage, event queues).
* <kbd>**Containers with serverless behavior**</kbd>:&#x20;
  * managed services that run containers without managing infra&#x20;
  * e.g: Google Cloud Run, AWS Fargate with serverless profiles

