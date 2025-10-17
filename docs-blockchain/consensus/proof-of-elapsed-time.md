---
description: 'PoET: Proof of Elapsed Time Consensus Mechanism'
icon: hourglass-half
---

# Proof of Elapsed Time

## `PoET`: Proof of Elapsed Time

> **PoET: Proof of Elapsed Time**
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
* The **first node** on the network who can prove **idleness** ( i.e. demonstrate that it has been sitting idle to peers) for that duration will be the node that gets selected to validate the current block and will be rewarded
  * more energy efficient — sitting around doing nothing consumes far less energy than performing difficult complex calculations



