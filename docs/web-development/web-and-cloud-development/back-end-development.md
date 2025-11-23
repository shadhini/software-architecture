---
icon: send-backward
---

# Back-End Development

## Back-End Development&#x20;

* deals with the sever before the code and data are sent to the client
* handles&#x20;
  * logic and functionality&#x20;
  * authentication processes&#x20;

## Back-End Developers

* creates & manages resources needed to respond to client requests
*   tasks

    * enable server infrastructure (back-end) to process requests
      * process input: login information, product searches, payment information
    * supply data
      * request database for correct data
    * provide other services securely
      * restricted access
        * provide access based on user's log in status
        * manage, authenticate and authorize user account
      * secure payments&#x20;
        * secure data handling of sensitive information&#x20;
        * secure storage of sensitive information
    * understand web app development language
    * create and maintain the server side routing


* work with
  * relational databases
  * NoSQL databases
  * collaborate with database administrators in bigger projects



## Back-End Technologies

### APIs, Routing, and Endpoints

* **`API`**: a code that works with data
  * usually use JSON or XML
  * have set rules and structure
  * provide a mechanism for software to access resources from the back-end
* **`Route`**: a path to a website or page
  * take user input and show results based on the input
* **`Endpoint`**: can be an API or Route



#### Request Routing Process

* Different client requests require different services from the backend server.
  * data request&#x20;
  * accept input from a user filling out a form
  * securing sensitive information input
* When a request from front-end arrives at back-end,&#x20;
  * it is **routed** to the correct back-end service.
* If the back-end has as **endpoint** defined for the request by using **routing**,
  * the request will be addresses and replied to.
* If the **endpoint is missing**,
  * the server returns a `404` error

### Back-End Languages & Frameworks

#### JavaScript & JavaScript Frameworks

* **`JavaScript`**: most popular
  * was originally designed to run in web browsers adding extra interactivity and dynamic content to web pages
  * new releases added server-side functionality
  * **`ES6`** **Features**:  sixth version of the ECMAScript language specification, and it's a major update to JavaScript released in 2015
    * code looks cleaner, beautiful & easier to read
    * arrow functions
    * `...` operator



* **`Node.js`**
  * open source server side platform for server side scripting
  * built on Google Chrome JavaScript Engine
  * uses **asynchronous single-threaded** architecture
    * allows it to server very large number of concurrent connections
  * huge collection of free & reusable **Node.js** module libraries
    * **`axios`**: for making requests to web services
      * correct headers&#x20;
      * callback functions and/or promises to handle responses that come back
    * npm packages when working with databases
* **`Express.js`**
  * web application server framework
  * **not suitable for** large scale applications
    * the business logic often resides on the server **preventing the reuse of some services** like batch operations
  * scales applications quickly
  * supported with Google V8 JavaScript engine
    * gives higher performance without any lag or error in processing
  * offers caching features
  * pages loads faster

#### Python & Python Frameworks

* **`Python`**: popular
  * flexible & easy to learn
  * open-source
  * wide functionality: can be used for everything



* **`Django`**
  * &#x20;web framework
  * open-source&#x20;
  * commonly used for&#x20;
    * large-scale, fast-changing web applications
*   **`Flask`**



#### Ruby & Ruby Frameworks

* **`Ruby`**:  programming language
* **`Ruby on Rails`**: server-side web application framework
  * great with **`JSON`** or **`XML`** for data transfer&#x20;



#### Java & Java Frameworks

* **`Spring`**: Java based framework
  * old and still remains popular





### Databases

* **`SQL`**: Structured Query Language
* **`ORM`**: **Object-Relational Mapping** tools
  * to connect to the database and retrieve the correct data
  * hide some of the complexity of querying databases

<figure><img src="../../.gitbook/assets/ORM.svg" alt="" width="375"><figcaption></figcaption></figure>

* **`MySQL`**: relational database
* **`MongoDB`**: database great for unstructured data
  * doesn't provide the same level of functionality as a relational database

