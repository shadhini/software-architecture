---
icon: atom
---

# Quantum Computing

## Quantum Computing

> **Quantum Computing**:
>
> leverages principles of <mark style="color:blue;">**quantum mechanics**</mark> (like _<mark style="color:blue;">superposition</mark>_ and _<mark style="color:blue;">entanglement</mark>_) to solve specific mathematical problems&#x20;
>
> <mark style="background-color:red;">**exponentially faster**</mark> than classical supercomputers
>
> * traditional computers process information using binary bits (<kbd>0</kbd> or <kbd>1</kbd>)
> * quantum computers use <mark style="color:blue;">**qubits**</mark>, allowing them to **evaluate vast possibilities simultaneously**

\
Quantum Computing <mark style="background-color:red;">**theoretical poses a significant threat**</mark> to current blockchain cryptography — by its potential to break widely used cryptographic algorithms

✅️ necessitate the development of <mark style="background-color:green;">**quantum-resistant encryption methods**</mark> to maintain the security of blockchain networks<br>

## The 2 Main Threats to Blockchain Security

| **Cryptographic Target**       | **Current Standard**             | **Quantum Threat (Algorithm)**                                | **Impact Level**      |
| ------------------------------ | -------------------------------- | ------------------------------------------------------------- | --------------------- |
| Digital Signatures & Ownership | ECDSA / Ed25519 (Elliptic Curve) | <mark style="background-color:red;">Shor's Algorithm</mark>   | 🔴 Existential Threat |
| Block Hashing & Proof-of-Work  | SHA-256 / Keccak-256             | <mark style="background-color:red;">Grover's Algorithm</mark> | 🟡 Manageable Risk    |

#### **1. Digital Signatures (Shor's Algorithm)**

Blockchains use Elliptic Curve Cryptography (ECDSA) to ensure that only private key holders can spend their assets.

* **The Vulnerability**: A sufficiently powerful quantum computer running <kbd>Shor's algorithm</kbd> can reverse a public key to derive the corresponding private key in minutes or hours.
  * Quantum computers could use `Shor's algorithm` to factor large numbers exponentially faster than classical computers.
* **The Real-World Exposure**: Any blockchain address that exposes its public key on-chain—such as reused Bitcoin addresses or any Ethereum wallet that has sent at least one transaction—can be targeted, allowing an attacker to drain funds.<br>

#### **2. Mining & Data Integrity (Grover's Algorithm)**

Hash functions link blocks together and power Proof-of-Work (PoW) mining.

* **The Vulnerability**: Grover's algorithm provides a quadratic speedup for searching unstructured data. This effectively cuts the cryptographic security of a 256-bit hash down to 128-bit security.
* **The Mitigation**: This does _not_ break hashing outright. Blockchains can easily adjust mining difficulty or upgrade hash output lengths to neutralize this threat.<br>



## How Blockchain Is Adapting (Quantum-Safe Solutions)

The blockchain industry is actively preparing for <kbd><mark style="color:red;">**"Q-Day"**<mark style="color:red;"></kbd> — the theoretical moment a cryptographically relevant quantum computer goes live.<br>

* <mark style="background-color:green;">**Post-Quantum Cryptography (PQC)**</mark>: Upgrading core protocol signatures to NIST-standardized, <mark style="color:green;background-color:green;">**quantum-resistant cryptographic algorithms**</mark> (such as lattice-based cryptography).
* <mark style="background-color:green;">**Zero-Knowledge Proofs (STARKs)**</mark>: Transitioning to hash-based zero-knowledge proofs (like zk-STARKs), which are inherently resilient against Shor's algorithm.
* <mark style="background-color:green;">**Address Hygiene**</mark>: Enforcing non-reusable addresses so public keys remain hidden behind secure hashes until transactions are broadcast.
* **Hybrid Approaches:** combine classical and quantum security measures



## Post-Quantum Cryptography

{% content-ref url="post-quantum-cryptography.md" %}
[post-quantum-cryptography.md](post-quantum-cryptography.md)
{% endcontent-ref %}

***

{% content-ref url="lattice-based-cryptography.md" %}
[lattice-based-cryptography.md](lattice-based-cryptography.md)
{% endcontent-ref %}

{% content-ref url="code-based-cryptography.md" %}
[code-based-cryptography.md](code-based-cryptography.md)
{% endcontent-ref %}

{% content-ref url="mpkc-multivariate-polynomial-cryptography.md" %}
[mpkc-multivariate-polynomial-cryptography.md](mpkc-multivariate-polynomial-cryptography.md)
{% endcontent-ref %}

{% content-ref url="hash-based-cryptography.md" %}
[hash-based-cryptography.md](hash-based-cryptography.md)
{% endcontent-ref %}

{% content-ref url="post-quantum-rsa.md" %}
[post-quantum-rsa.md](post-quantum-rsa.md)
{% endcontent-ref %}

{% content-ref url="qkd-quantum-key-distribution.md" %}
[qkd-quantum-key-distribution.md](qkd-quantum-key-distribution.md)
{% endcontent-ref %}



