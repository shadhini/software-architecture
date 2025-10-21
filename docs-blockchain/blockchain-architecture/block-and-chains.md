---
description: What is a Block & How are Blocks Chained Together ?
icon: cube
---

# Block & Chains

## Story: multiple stenographers recording court proceedings

* multiple stenographers records the testimony of witnesses during a court proceeding
* each stenographer tried to record exactly what the witness said
* every time the stenographers fill up a sheet of paper with testimony they compare them
  * if all sheets are identical → the group knows they're accurate
  * if most (>51%) of the sheets are identical → stenographers in the minority will throw away their sheet and get a copy from the majority
  * if no majority can be reached → they will assume they got it wrong and go back to the witness for clarification&#x20;
* every time a page is agreed upon by the group, the number of words on the current page are added to the current total word count, creating an updated total word count&#x20;
  * then these numbers are added at the bottom of every page: current page word count; total word count
* if a malicious actor change the `total word count` at the end of the page of page 2, and if it has total 10 pages
  * then we can figure out that something has gone wrong from page 2 onwards as there's a mismatch between total counts of page 2 and page 3
  * thus, we can conclude that pages from page 2 onward has been tampered with

| Metaphor                                                                                                                                                                                                  |
| --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| <p>each <strong>sheet of paper</strong></p><p>╰┈➤ is a <strong>block</strong> in a blockchain</p>                                                                                                         |
| <p><strong>total word count</strong> from the 1st page to current page at the end of each page </p><p> ╰┈➤ is similar to <strong>mathematical dependency for chaining blocks</strong> in a blockchain</p> |

{% hint style="info" %}
❗this metaphor does not consider risk of changing words itself, instead of word count in a page
{% endhint %}

## What is a Block

> **`Block`:**
>
> grouping of transactions&#x20;
>
> * transaction: information about the assets, and events that happened to them&#x20;
>
> data structure of blockchain

metaphor: sheet of paper

* you can record anything you need&#x20;



## How are Blocks Chained Together ?

> **`Chaining` Blocks Together:**
>
> Creating a _**mathematical dependency between all the blocks**_,&#x20;
>
> ╰┈➤ so that any change or alternation made on any block has a _**cascading effect**_ on every block that comes after it in the chain,&#x20;
>
> letting any observer know that something has _**likely been tampered**_ with

> **Chains**:
>
> blocks are organized sequentially to form a "chain", with each block referencing the previous one



* Blocks are linked together in a linear sequence, each containing a hash of the previoud block.

&#x20;

