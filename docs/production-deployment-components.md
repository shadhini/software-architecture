---
icon: diamonds-4
---

# Production Deployment Components

## Production Deployment Components

### n-tier architecture&#x20;

<figure><img src=".gitbook/assets/production-deployment-components_n-tier.svg" alt=""><figcaption></figcaption></figure>

**web load balancer**: distribute incoming traffic to several web servers

**app load balancer / proxy server**: routes traffic to different application servers

**high availability DB replica**: used to ensure reliability

#### Firewall

> **— security device that monitors traffic between networks —**&#x20;

* **monitors traffic** between an interior and an exterior network&#x20;
* **permits or blocks** requested **data** based on a set of security rules
* acts as a barrier between networks&#x20;
  * to block viruses and hackers from accessing the internal network

#### Load Balancers

> **purpose:**
>
> **distribute** network **traffic efficiently** amongst multiple servers called **server farm** on a network
>
> * located between the clients & the servers

Functions

* prevents server traffic overload&#x20;
* determines which servers are capable of fulfilling those requirements in a manner that **maximizes server capabilities and responsiveness**
* ensures no one server is overworked&#x20;
* manage concurrent requests fast and reliably



#### Web and Application Servers

* **Servers**:&#x20;
  * machines that provide services, resources, data or applications to a client
  * store, process, & manage network data, devices & systems
* **Web Servers**:
  * deliver web pages & content such as files, images, and videos to the client
  * primarily response to HTTP requests from a browser/client
* **App Servers**:
  * runs the apps (business logic) and provides the app to the client or the web sever, rather than app running on their own machine
  * stores code that determines how data can be created, stored, and changed&#x20;
    * transaction results
    * what data is written to and retrieved from a database



#### Proxy Server

> — an **intermediate server** that sits between two tiers & handles requests between those tiers —&#x20;

can be used for

* load balancing
* system optimization
* caching
* as a firewall
* obscuring the source of a request
* encrypting messages
* scanning for malware
* .... more

can improve

* efiiciency
* privacy
* security



#### Databases & Database Servers

* controlled by **`DBMS`**: Database Management System
  * DBMS connects Database to users or other programs

