---
icon: pen-ruler
---

# Solution Design & Architecture

## Solution Design & Architecture

> **— a blueprint for the project's functionality, ensuring alignment with objectives —**&#x20;
>
> A detailed description of how the blockchain system will work
>
> * architecture
> * key features&#x20;
> * functionality



### Content

#### Platform Selection Criteria and Concerns

* detailed information regarding the blockchain platform(s) the proposed solution will be built on&#x20;
  * reasoning (thought process)  & justification for why certain platforms have been selected over others
* Is it envisioned that the solution would ever move to a new platform?
  * ﻿﻿If so, under what circumstances? How would it be moved?



#### Network Considerations

* ﻿﻿What type of network will this solution run on — `public(over internet), private, hybrid`
* ﻿﻿Will any `LOB`: line of business systems, external legacy systems or resources behind a firewall or on a private network be integrated into the solution?
  * ﻿﻿If so, what security and access concerns will need to be addressed to access resources and the solutions to function as intended?
  * If not, can you get them publicly?



#### Solution Design

* detail the architecture of the proposed solution



For a blockchain solution, each of the following areas should be discussed in detail

* ﻿﻿**Assets**
  * What are the important things/assets that this solution will keep track of?
  * Will the solution keep track of each asset over its entire life, or just a smaller portion of it?
  * ﻿﻿brief explanation of  why each asset is important and belongs in the proposed solution
* ﻿﻿**Participants**
  * ﻿﻿Who are the actors that will interact with each of the assets listed above
    * Think about the different "**types**" or "**categories**" of users you expect
* **Transactions**
  * ﻿﻿How do `Assets` and `Participants` interact?
    * ﻿﻿Transaction:&#x20;
      * usually the result of a `Participant` doing something to an\
        `Asset`
      * ﻿﻿can also involve `Assets` affecting other `Assets` — not as common
      * less commonly involve `Participant` interacting with another `Participant`
      * usually result in the updating of one or more of the underlying properties of an asset
* **Queries**: to what queries the blockchain solution going to provide answers to
  * ﻿﻿What questions should our solution be able to answer?
    * questions from&#x20;
      * end users
      * internal stakeholders
  * ﻿﻿What questions will integrated systems need answers to?
    * questions from any connected legacy or line of business systems&#x20;
  * ﻿﻿What pieces of information are needed from the ledger in order to make solution work?
* **Events**
  * What events will affect our assets?
    * `Events`: usually unforeseen or unpredictable occurrences that result in a change to one or more of the underlying properties of an asset
    * e.g: if we're enrolling users in our solution, we may have users time to time who want to delete their account or become inactive — unpredictable — we need to have a way to handle this type or events & that should be documented
* ....&#x20;





## Method to Define/Identify `Assets`, `Participants`, and `Transactions`

On a whiteboard,&#x20;

* list all important **assets** along the **left-hand side**&#x20;
  * be sure to include **important or relevant properties** for each asset as well
* list all **participants** along the **right-hand** **side**
  * Be sure to include **important or relevant properties** for each participant
* draw a **line** connecting each **participant** **to** each **asset**
  * For each line, ask yourself **if a valid relationship** exists
    * If so, you've found a <mark style="color:$success;">**transaction**</mark>!
* any **orphaned assets or participants** should be **removed** from your design

{% hint style="info" %}
Whiteboard method to brainstorm assets, participants & transactions provide **means to involve non technical stakeholder** at early stages of solution design.
{% endhint %}



#### Example: Auto manufacturer is looking at using blockchain to keep track of their  assets

Auto manufacturer: Ford Motor Company

<figure><img src="../../.gitbook/assets/identify-assets-participants-transactions.svg" alt=""><figcaption></figcaption></figure>



**✅ Sanity Checks**

* 1️⃣ Try and read from right to left — see whether you can form a valid sentence ?





