---
icon: atom
---

# Quantum Computing Threats

## Quantum Computing

#### **Quantum Computing**

* offers remarkable computational capabilities
* has the potential to undermine the security & cryptographic foundations&#x20;



#### **Quantum Computing Threat: Key Aspects**

> **The** [**Looming**](#user-content-fn-1)[^1] **Question: Key Aspects**
>
> * **theoretical implications**
>   * Quantum Computing theoretical poses a significant threat to current blockchain cryptography — by its potential to break widely used cryptographic algorithms
>   * necessitate the development of **quantum-resistant encryption methods** to maintain the security of blockchain networks
> * **timeline & feasibility**
>   * Quantum Computing  could realistically pose a threat to blockchain in approximately 10-15 years as quantum technologies advance
>   * current cryptographic algorithms vulnerable to decryption
> * **preparatory measures:** current research and methods for quantum-resistance in blockchain that aim to secure blockchain networks against potential quantum threats&#x20;
>   * exploration of **quantum-resistant cryptographic algorithms**
>     * **lattice-based cryptography**
>   * **hybrid approaches:** combine classical and quantum security measures&#x20;



#### To ensure the long-term security & viability of blockchain networks in the quantum era...

* transition to quantum-resistant algorithms
* update consensus mechanisms&#x20;
* foster collaboration between quantum computing & blockchain communities&#x20;



## Threats posed by quantum computing to blockchain

Blockchain networks

* cryptographic hash functions —  secure transactions, communications & data&#x20;
  * encryption functions commonly used: RSA
* PKI: public-key cryptography — secure identity management & data integrity (validation)



#### Cryptographic core threats

* Hash functions: collision/preimage breaks → data integrity & authenticity risk
* Public-key cryptography: Shor’s algorithm → RSA/ECC broken
  * Quantum computers could use `Shor's algorithm` to factor large numbers exponentially faster than classical computers
* Digital signatures: forgery risk → identity impersonation&#x20;
* PKI: Public Key Infrastructure collapse: compromised identity management



#### Consensus & network threats

* Mining acceleration: quantum-enabled efficient mining → easier 51% attacks
* 51% attacks: chain reorgs, double-spend, history rewrite
* Consensus disruption: PoW / PoS vulnerabilities → network instability & security concerns



#### Data, privacy & smart contracts

* Encryption compromise: exposure of confidential data, financial transactions, private keys,&#x20;
  * unauthorized access, data breaches
* Data theft: decryption of sensitive on-chain/off-chain data
* Smart-contract privacy: reveal sensitive business logic / private information
  * Quantum computers could break the encryption protecting data within smart contracts
* Oracle manipulation: false external data → incorrect/undesirable contract outcomes
  * Oracles provide external data to smart contract

&#x20;

#### Integrity & long-term validity

* Immutability challenge: potential alteration of historical transactions — rewrite blockchain history
* Long-term data integrity: future quantum replays/rewrites



#### Standards, migration & technical challenges

* Transition to Quantum-resistant algorithm: algorithm migration complexity
* Migration risks: temporary vulnerabilities during switchover, need for consensus among network participants
* Adoption of incompatible quantum-resistant solutions → network fragmentation & compatibility issues
* Inadequate quantum-safe standards: slow standardization/adoption



#### Wider system, economic & legal impacts

* Economic losses: financial damage, crypto value impact, disrupt blockchain-based businesses
* Reduced trust in blockchain: user/public confidence erosion
* Legal/regulatory challenges: liabilities (for data breaches, inadequate security practices), compliance gaps
* Erosion of competitive advantage: vulnerable blockchain solutions



#### Ecosystem & operational risks

* Rapid tech advances: capabilities outpacing defences
* Difficulty detecting/monitoring quantum attacks: fast — rapid execution, hard-to-monitor quantum attacks due to unique properties of quantum attacks
* Supply-chain disruption: tampered provenance / authenticity records
* Smart-contract exploitation: unauthorized access, financial loss, manipulation of contract terms



#### Future landscape

* Rise of quantum-based blockchains: new quantum-resistant competitors and innovation



## Post Quantum Cryptography

⚠️ Quantum threat to classical cryptography&#x20;

* ✅ Use quantum‑resistant algorithms

> **Quantum-Resistant Cryptographic Algorithms**
>
> **goal**: resist attacks from classical + quantum computers



#### Selection Criteria of Quantum-resistant Algorithms for Blockchain Applications

{% hint style="success" %}
#### Tradeoffs: Selection of Quantum-resistant Algorithms for blockchain applications&#x20;

Choice =&#x20;

⚖️ balance between: **security ⇄ performance ⇄  readiness of cryptographic** **standards  ⇄** blockchain fit
{% endhint %}

Multiple Post Quantum Cryptographic families — different strengths/weaknesses



Quantum-resistant Algorithms have varying levels of&#x20;

* practicality
* efficiency&#x20;
* adoption&#x20;



✅ Continuous research & collaboration required to identify and implement the most suitable quantum-resistant encryption solutions for blockchain networks



#### Quantum-Resistant/Post-Quantum Cryptographic Families

* Lattice‑Based
* Code‑Based
* **`MPKC`**: Multivariate Polynomial&#x20;
* Hash‑Based
* Post‑Quantum RSA (variants of RSA)
* Quantum Key Distribution (QKD) — hardware/physics approach



#### Lattice‑Based Cryptography

* Principle: hard lattice problems (e.g., short vector)
  * rely on the mathematical structure of lattices and its properties&#x20;
  * imagine a lattice as a grid of points in space
* High believed quantum resistance
  * high difficulty of solving certain lattice problems even for quantum computers
    * e.g: finding short vectors within the lattice, solving systems of equations
* Examples: `NTRUEncrypt`, `Kyber`
* Intuition / ops:
  * Create lattice parameters (dimensions of the grid, spacing between points)
    * _Alice_ wants to send a message to _Bob_
    * _Alice_ and _Bob_ agree on parameters that define the lattice:  dimensions, spacing&#x20;
  * Encode message → add to lattice point
    * _Alice_ converts her secret message into a mathematical representation: numbers or vectors
    * add this representation to a point in the lattice — creating a new point
  * Transmit lattice point (hard to invert)
    * _Alice_ sends the new lattice point to _Bob_&#x20;
    * even if lattice point is intercepted, it can't be easily reverse-engineered to the orginal message —  mathematically complex relationship between the lattice points
  * Receiver uses private key → map back
    * _Bob_ uses the private key to perform mathematical operations on the lattice point he received
      * "map" the lattice point back to the point that Alice initially added her message to
  * Subtract to extract message
    * _Bob_ subtracts the lattice point he calculated from the original lattice point — reveals the mathematical representation of Alice's message



#### Code-Based Cryptography

* Principle: error‑correcting code hardness
* Believed resistant to quantum attacks
* Example: `McEliece`



#### `MPKC`: Multivariate Polynomial Cryptography&#x20;

* Principle: hard multivariate polynomial equations
* Believed to be hard to solve both classically and quantumly
* Example:&#x20;
  * `Rainbow signature` scheme: cryptographic scheme designed for digital signatures in 2005
* Rainbow Signature Scheme Ops (signature flow):
  * Key generation: private polynomials, public map
    * user generates a pair of keys: a private key, a public key
    * private key : set of polynomial equations and coefficients
  * Signature: apply private key's polynomials to message
    * this generates a set of values used to create the signature
  * Signature Verification: public polynomials → check output matches conditions
    * anyone can verify the authenticity of the signature using the user's public key
    * verifier applies the public key's polynomials to the signature — results in a set of values
      * if these values match certain conditions → the signature is considered valid ✔



#### Hash‑Based Cryptography

* Principle: security from cryptographic hashes
* Used for digital signatures and other cryptographic primitives
* Example: `XMSS`: `Extended Merkle Signature Scheme`
* believed quantum‑resistant — due to the unique structure of their security proofs
  * could not be too

#### Post‑Quantum RSA&#x20;

* variants of **`RSA`**: `Rivest-Shamir-Adleman` encryption
* Approach: larger key sizes for increased resistance against quantum attacks
* Tradeoff: lower efficiency vs other quantum-resistant  alternatives



#### `QKD`: Quantum Key Distribution&#x20;

* Not a classical encryption algorithm — quantum protocol
* Examples: `BB84`, `QDSA`
* Purpose: quantum‑secure key distribution
  * use quantum properties to distribute cryptographic keys securely
* Property: resistant to eavesdropping even by quantum computers















[^1]: an event) seemingly about to happen and regarded as ominous or  worrying
