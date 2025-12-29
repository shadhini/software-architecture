---
description: 'PoET: Proof of Elapsed Time Consensus Mechanism'
icon: hourglass-half
---

# Proof of Elapsed Time

## `PoET`: Proof of Elapsed Time

> **PoET: Proof of Elapsed Time**
>
> lottery-based consensus algorithm
>
> * protocol select a random time interval
> * **first node** to prove **idleness** for that duration will be selected to validate the current block

* designed as a **lightweight** & **more energy efficient** alternative to Proof of Work



* consensus mechanism designed by `Intel` to run on **Intel hardware**
*   **CPU idleness** is **tracked** in a special **Protected Execution Environment**

    * requires specialized Intel CPU which has it's own trusted execution environment, which is devoted purely to tracking processor idle time&#x20;

    ╰┈➤ <kbd>**To use Proof of Elapsed Time, you need to run Intel hardware on an Intel developed group consensus mechanism**</kbd>

    ╰┈➤ many people find this high level of centralization to be off putting





### How It Works

When it's time for a block to be validated

* the protocol will select a period of time (**random time interval**) between some minimum and maximum amount&#x20;
*   The **first node** on the network who can prove **idleness** ( i.e. demonstrate that it has been sitting idle to peers) for that duration will be the node that gets selected to validate the current block and will be rewarded

    * **more energy efficient** — sitting around doing nothing consumes far less energy than performing difficult complex calculations



1. **Random Wait Time Assignment**: Each participating node requests a random wait time from a trusted execution environment (`TEE`), typically using Intel's Software Guard Extensions (`SGX`)
2. **Waiting Period**: Nodes must wait for their assigned time period. They cannot manipulate or shorten this time due to the secure hardware constraints.
3. **Block Creation**: The node whose timer expires first broadcasts proof that it waited the required time and creates the new block.
4. **Verification**: Other nodes verify the proof and accept the block if valid.



