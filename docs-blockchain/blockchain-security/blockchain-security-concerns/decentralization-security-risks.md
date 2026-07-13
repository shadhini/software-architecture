---
icon: circle-nodes
---

# Decentralization Security Risks

## Decentralization Security Risks

* no centralized control
  * **decisions** generally **take** **longer**
  * **governance** is more **complicated**
* very new technology
  * new, uneducated users may not understand risks
  * **new attack vectors** still being discovered
  * technology is **evolving quickly**, code written today will likely need to be refactored tomorrow
    * the platforms of today might not be there tomorrow — anyone remember `Lycos`, `GeoCities`, and `Netscape`
    * things like backward compatibility may not be guaranteed on blockchain platforms
* building on blockchain requires a **new way of thinking**
  * "Safe" activities on client-server networks can be catastrophic on peer-to-peer networks
  * problems like **deterministic concurrency** and **phantom queries** can be very difficult for developers to avoid, because these are patterns which present absolutely no problem when implemented in a client-server environment&#x20;



#### ℹ️ <mark style="color:blue;">**Deterministic Concurrency**</mark>

In **standard software development**, _<mark style="color:blue;">**concurrency**</mark>_ means doing multiple things at the same time to speed up performance.&#x20;

e.g: a server might process five user requests simultaneously using multiple CPU threads

* if Thread A finishes slightly before Thread B, it doesn't matter, as long as the server gets the job done

This is called _<mark style="color:blue;">**nondeterministic execution**</mark>_ — the exact order of operations can vary slightly based on CPU timing.

<mark style="color:violet;">**Why it's safe in Client-Server:**</mark>

The **server is the ultimate judge**.&#x20;

Whatever the server decides happened first is what happened first.

<mark style="color:violet;">**Why it's catastrophic on Blockchain:**</mark>

Blockchains require _<mark style="color:blue;">**determinism**</mark>_.&#x20;

If 10,000 nodes execute a smart contract, every single node must get the exact same result down to the last digit. If a developer uses standard concurrent processing where timing is random, Node A might process Transaction 1 first, while Node B processes Transaction 2 first.

Because their outputs don't match, the nodes will disagree, the network will split (fork), and consensus breaks down.&#x20;

**Smart contracts must force execution to be strictly ordered and predictable**, which strips away many of the traditional performance tricks developers rely on.



#### **ℹ️&#x20;**<mark style="color:blue;">**Phantom Queries (and Race Conditions)**</mark>

A <mark style="color:blue;">**phantom query**</mark> (or **phantom read**) happens when a system reads a piece of data, but before it can finish its operation, another process steps in and changes that data.

<mark style="color:violet;">**Why it's safe in Client-Server:**</mark>

Traditional databases handle this using "<mark style="color:blue;">**locks**</mark>."&#x20;

If User A is buying the last concert ticket, the server locks that database row so User B can't touch it until User A is done. The server has total control over the queue.

<mark style="color:violet;">**Why it's catastrophic on Blockchain:**</mark>

On a blockchain, transactions sit in a **public waiting room** called the <mark style="color:blue;">**mempool**</mark> before they are packed into a block. Anyone can see them. This introduces the threat of **front-running** and **Miner Extractable Value (MEV)**.

If a developer writes a smart contract that queries a price from a **decentralized exchange**, an attacker can see that transaction waiting in the mempool. The attacker can pay a higher gas fee to slide their own transaction in front of the user's transaction, changing the price right before the user's contract executes. The user's query returns a <mark style="color:blue;">**"phantom" state**</mark>—the price they thought they were getting no longer exists, resulting in severe financial loss.

