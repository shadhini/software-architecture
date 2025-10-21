---
icon: comment-check
---

# Development Recommendations

## Development Recommendations

✅ Develop something **non-mission critical first** when developing a blockchain solution

* this way, you can work out any kinks/errors in your development process, your environment setup, your tooling, or your DevOps processes when it comes time to release your solution&#x20;
* having all of these processes tested in place before you start work of major importance can pay significant dividends&#x20;



‼️ Many blockchain platforms make the smart contract development process feel very similar to client-server development process — **double edged sword**

* ✅ helps developers **get up to speed** lot quicker
* ‼️ this abstraction can cause us to fall into a **mental trap** — to forget that you are **not developing code that's going to run on a client-server** platform, but your code is going to be executed everywhere on the network
  * smart contract is not going to execute on one server and then share the results with the network

{% hint style="warning" %}
**Every single nod**e on the network is going to&#x20;

* **execute the smart contract code independently** and&#x20;
* attempt to come to consensus on the results.
{% endhint %}



