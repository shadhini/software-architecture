---
description: >-
  Permissioned vs Permissionless (participation control) | Public vs Private
  (access control) | On-chain vs Off-chain | Governance Model | Layer 0,1,2,3 |
  Blockless
icon: sitemap
---

# Types of Blockchains

## **Access Control: Public vs Private**&#x20;

> describes **who can READ/VIEW** the blockchain data

| Public Blockchain                                           | Private Blockchain                                                                  |
| ----------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| Anyone can view transaction data                            | Only authorized participants can view data                                          |
| Transparent and auditable by anyone                         | Restricted visibility                                                               |
| Examples: `Bitcoin`, `Ethereum (mainnet)`, `Dash`, `Factom` | Examples: `Enterprise blockchains`, `Internal networks`, `MultiChain`, `Blockstack` |



## **Participation Control: Permissionless vs Permissioned**

> describes **who can WRITE/VALIDATE** transactions.

{% hint style="info" %}
**Permissions are built on top of identities**. Thus, identity is a prerequisite for permissions.

➝ without knowing an identity, we cannot enforce what one can/cannot do&#x20;
{% endhint %}

{% hint style="success" %}
You can build **permissioned solutions on permissionless blockchains**.

➝ just requires more design & development effort
{% endhint %}

<table><thead><tr><th valign="top">Permissioned Blockchains </th><th valign="top">Permissionless Blockchains</th></tr></thead><tbody><tr><td valign="top">only pre-approved entities can validate transactions</td><td valign="top">anyone can join the network and participate in consensus</td></tr><tr><td valign="top">requires authorization to be a validator</td><td valign="top">open participation as validator/miner</td></tr><tr><td valign="top">Examples: <code>Hyperledger Fabric</code>, <code>R3 Corda</code></td><td valign="top">Examples: <code>Bitcoin</code>, <code>Ethereum</code></td></tr><tr><td valign="top">the <strong>identity</strong> of users on the network is <strong>known</strong></td><td valign="top"><p>the <strong>identity</strong> of network participants is <strong>not</strong> <strong>known</strong>/not easily known </p><ul><li>identity is usually tracked dow to the individual wallet or account level</li><li>but the owner/group of owners behind any individual wallet or account is largely anonymous</li></ul><p><strong>pseudo anonymous:</strong> transactions are linked to wallet addresses (not real names), but all actions by that address can be tracked</p></td></tr><tr><td valign="top"><strong>roles</strong> and <strong>permissions</strong> can be set and enforced</td><td valign="top">roles and permissioning possible, but requires <strong>more design &#x26; development effort</strong></td></tr><tr><td valign="top"><p><strong>group</strong> <strong>consensus</strong> tends to be more <strong>customizable</strong>, <strong>configurable</strong> </p><ul><li>may of these platforms implement <strong>participants consensus model</strong></li></ul></td><td valign="top"><p>modern platforms allow for <strong>zero knowledge proofs</strong> to leave data <strong>on-chain</strong> </p><p>➝ which can be used to verify private/secured data</p></td></tr><tr><td valign="top"><p>not fully centralized; but not fully decentralized </p><ul><li>usually involves some centralized components/resources</li></ul></td><td valign="top"></td></tr></tbody></table>

## **Public vs Private & Permissionless vs Permissioned**

#### **The Four Main Combinations**

| Type                       | Example                | Use Case                 |
| -------------------------- | ---------------------- | ------------------------ |
| **Public Permissionless**  | Bitcoin, Ethereum      | Cryptocurrency, DeFi     |
| **Public Permissioned**    | Some consortium chains | Industry transparency    |
| **Private Permissionless** | Rare in practice       | Limited scenarios        |
| **Private Permissioned**   | Hyperledger Fabric     | Enterprise, supply chain |

#### **Hybrid Blockchain**

> A **hybrid blockchain** combines elements of both public permissionless and private permissioned  blockchains.

<table><thead><tr><th width="144.2109375">Feature</th><th>Description</th></tr></thead><tbody><tr><td><strong>Structure</strong></td><td><strong>Private permissioned</strong> core + <strong>Public permissionless</strong> interface</td></tr><tr><td><strong>Use Case</strong></td><td>Organizations want privacy but need public verification</td></tr><tr><td><strong>Example</strong></td><td><code>Dragonchain</code>, <code>XinFin</code></td></tr><tr><td><strong>How it works</strong></td><td>Private transactions internally, selective data published publicly</td></tr></tbody></table>



## **Governance Model:** **Consortium /** DAO / Hybrid

> **WHO CONTROLS** the network (overlaps with permissioned)

{% hint style="info" %}
**Key Point**: Consortium blockchains are usually **private and permissioned**, but governed by multiple entities rather than one
{% endhint %}

{% content-ref url="../../governance/blockchain-governance-models.md" %}
[blockchain-governance-models.md](../../governance/blockchain-governance-models.md)
{% endcontent-ref %}





## **Data Location: On-Chain vs Off-Chain**

> describes **WHERE data and computation occur**

{% content-ref url="../on-chain-data-vs-off-chain-data.md" %}
[on-chain-data-vs-off-chain-data.md](../on-chain-data-vs-off-chain-data.md)
{% endcontent-ref %}

<table><thead><tr><th valign="top">Pure platforms</th><th valign="top">Hybrid platforms</th></tr></thead><tbody><tr><td valign="top"><strong>store everything on the permanent ledger</strong> </td><td valign="top"><strong>combine permanent ledgers and databases together</strong></td></tr><tr><td valign="top"><p><strong>smart contracts</strong> are also stored on the <strong>permanent ledger</strong> </p><ul><li>updates/deletes NOT supported</li></ul></td><td valign="top"><p><strong>smart contracts</strong> are usually stored in a <strong>traditional database</strong> </p><ul><li>updates/deletes are supported</li></ul></td></tr><tr><td valign="top"><p><strong>waterfall</strong> methodologies are often adopted </p><ul><li>agile/iterative development can be difficult or dangerous in many cases </li></ul></td><td valign="top"><strong>agile/iterative</strong> development cycles are often used </td></tr></tbody></table>







## Layer 0, Layer 1, Layer 2 & Layer 3 Blockchains

{% content-ref url="layer-0-blockchain-platforms.md" %}
[layer-0-blockchain-platforms.md](layer-0-blockchain-platforms.md)
{% endcontent-ref %}

{% content-ref url="layer-1-blockchain-platforms.md" %}
[layer-1-blockchain-platforms.md](layer-1-blockchain-platforms.md)
{% endcontent-ref %}

{% content-ref url="layer-2-blockchain-platforms.md" %}
[layer-2-blockchain-platforms.md](layer-2-blockchain-platforms.md)
{% endcontent-ref %}

{% content-ref url="layer-3-blockchain-platforms.md" %}
[layer-3-blockchain-platforms.md](layer-3-blockchain-platforms.md)
{% endcontent-ref %}





## Blockless Platforms

{% content-ref url="blockless-platforms.md" %}
[blockless-platforms.md](blockless-platforms.md)
{% endcontent-ref %}



