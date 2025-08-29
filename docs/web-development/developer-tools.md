---
description: Application Development Tools
icon: screwdriver-wrench
---

# Developer Tools

## Code Editors & IDEs: Integrated Development Environments

> **Code Editors**
>
> — for code editing —&#x20;

> **IDEs: Integrated Development Environments**
>
> — to integrate, build, compile, debug, and manage code —&#x20;

#### Good IDEs:&#x20;

* support multiple languages &#x20;
* integrate with management and storage tools like Git and GitHub
* useful features
  * customer extensions
  * themes&#x20;

#### Code Editors & IDEs

* Sublime Text
* Atom
* Vim
* VS Code
* Visual Studio&#x20;
* Eclipse
* NetBeans
* IntelliJ IDEA
* PyCharm



### Code Editer / IDE Extensions

#### Linters

* to detect programmatic and stylistic errors&#x20;





## Version Control

* keep track of
  * what changes were made
  * when they were made
  * who made them&#x20;
* resolves change conflicts
* provides a way to revert to an older version
* code repository is recommended
  * as version controlling is generally tied to the storage system used

#### Version Control Tools

source code storage & management

* **`Git`**
* **`GitHub`**



## Libraries

> **— collections of reusable code —**&#x20;
>
> * standard programs
> * subroutines&#x20;

* multiple code libraries can be integrate into a project
* allows you to call functions of the library as and when required
* solve specific problems or add specific features
  * e.g: navigational feature: carousel

#### Libraries

* **`jQuery`**: JavaScript library that simplifies DOM manipulation; changing the structure, content, or style of a web page by interacting with the Document Object Model
  * used by both `AngularJS` & `ReactJS`
  * saves development time &#x20;
* **`Email-validator`**: checks if email address is correctly constructed and valid
* **`Apache Commons Proper`**: repository of reusable Java components





## Frameworks

> **— provides a standard way to build and deploy applications —**&#x20;

* acts as a skeleton you can extend by adding your own code
* ✅️ should be determined and used from the beginning
  * ❌ new frameworks can't be incorporated into an existing project&#x20;
* dictates the architecture of the app
  * controls the program flow
  * determines which subroutines and methods will be called when&#x20;
  * define the workflow that you must follow
* framework calls on your code
  * rather than you calling on the framework
* allows you less control than libraries
* provide good standardization
* help you create efficient code



#### Frameworks

* **`AngularJS`**: JavaScript-based framework for dynamic web applications
* **`Vue.js`**: JavaScript framework focused on the user interface
* **`Django`**: framework that uses Python for web development



## Libraries vs Frameworks & Inversion of Control

**Libraries**: allows you to call functions of the library as and when required

**Frameworks**: define the workflow that you must follow

<figure><img src="../.gitbook/assets/libraries-vs-frameworks.svg" alt="" width="563"><figcaption></figcaption></figure>

### Inversion of Control

> **Inversion of Control**
>
> Sense of the **framework** and its predefined workflow, controlling the development process.

* **Inversion of Control**&#x20;
  * makes the framework extensible&#x20;
  * allows you to create standardized apps
  * takes away a lot of the tedious configuration work
  * you can focus on the code for your app
* frameworks that have lot of control → **opinionated**&#x20;
  * have opinions on how their workflow should be used&#x20;
  * remove a lot of the decisions you would otherwise have to make about how code is written
    * how code is written
    * the location of files
    * file names
* **Frameworks** often include their **own libraries**&#x20;



## CI/CD: Continuous Integration & Continuous Delivery/Deployment

> **— practices of continuous integration with**&#x20;
>
> &#x20;                 **either continuous delivery or continuous deployment —**&#x20;

* a **best practice** for **`DevOps`** Teams
* enables developers to deliver frequent changes reliably
* implemented through a **build-automation server**

#### **`CI`**: Continuous Integration:

* ensures that all code components work together smoothly
* **CI build environment** enables you to integrate newly developed code frequently&#x20;
  * at least every day, if not every hour
* automatically builds and tests code

#### **`CD`**: Continuous Delivery

* begins where CI ends
* deploys all the code changes in a build to a testing or staging environment&#x20;



## Build Tools

> **— transform source code into binaries for installation —**&#x20;

* organize source code
* set compile flags
* manage dependencies
* 📌 important in environments with many inter-connected projects and multiple developers
  * in these environments, **automation is the key** to keep everything running smoothly
* Build automation automate tasks like
  * downloading dependencies
  * compiling source code into binary code
  * packaging that binary code
  * running tests&#x20;
  * deployment to production systems
* you can initiate a build from the command line or from an IDE



### Categories of Build Tools

1. **`Build-automation utilities`**
   * generate build artifacts like executables, by compiling and linking source code
2. **`Build-automation servers`**
   * execute build-automation utilities on a scheduled or triggered basis



### Build Tools

* **`Webpack`**: module bundler for JavaScript
* **`Babel`**: JavaScript compiler
* **`Web Assembly`**: binary instruction format that runs in your browser



## Packages

> **— all necessary files of an app is bundled together into a package —**&#x20;
>
> * makes apps easy to install&#x20;

**archive files that contain**&#x20;

* **app files**
* **instructions for installation**
* **metadata**
  * their own metadata:&#x20;
    * package description
    * package version
    * dependencies like
      * other packages that need to be installed beforehand
  * metadata developer choose



## Package Managers

> **— distribute packages —**&#x20;
>
> find, install, maintain & uninstall software packages at the user's request

package managers

* coordinate with file archivers to **extract package archives**
* **verify** **checksums** and **digital certificates** to ensure the integrity and authenticity of the package
* locate, download, install, or update existing **software from a software repository**
* **manage dependencies** to ensure a package is installed with all packages it requires



### Package Managers by Platform

#### On Linux

* **`DPKG`**: Debian Package Management System
* **`RPM`**: Red Hat Package Manager

#### On Windows

* **`Chocolatey`**

#### On Android&#x20;

* **`Package Manager`**

#### On MacOS

* **`Homebrew`**
* **`MacPorts`**



### Cloud Application Package Managers

#### Node.js / JavaScript

* **`npm`**

#### Java

* **`Gradle`**
* **`Maven`**

#### Ruby

* **`RubyGems`**

#### Python

* **`Pip`**
* **`Conda`**



## Cloud application developer's workbench&#x20;

* version control
* libraries
* frameworks
* CI/CD
* Build Tools
* Packages
* Package Managers



