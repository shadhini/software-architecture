---
icon: grid-5
---

# Lattice‑Based Cryptography

## Lattice‑Based Cryptography

<mark style="color:violet;background-color:pink;">**Principle**</mark><mark style="color:violet;background-color:pink;">:</mark> <mark style="color:violet;background-color:pink;"></mark><mark style="color:violet;background-color:pink;">**hard lattice problems**</mark> (e.g., short vector)

* rely on the mathematical structure of lattices and its properties&#x20;
* imagine a lattice as a grid of points in space



<mark style="background-color:green;">**High believed quantum resistance**</mark>

* high difficulty of solving certain lattice problems even for quantum computers
  * e.g: finding short vectors within the lattice, solving systems of equations



<mark style="background-color:blue;">**Examples**</mark>: `NTRUEncrypt`, `Kyber`



#### Intuition / ops:

* Create <mark style="color:blue;">**lattice parameters**</mark> (dimensions of the grid, spacing between points)
  * _Alice_ wants to send a message to _Bob_
  * _Alice_ and _Bob_ <mark style="color:blue;">agree on parameters that define the lattice</mark>:  dimensions, spacing&#x20;
* <mark style="color:blue;">**Encode message → add to lattice point**</mark>
  * _Alice_ converts her secret message into a mathematical representation: numbers or vectors
  * add this representation to a point in the lattice — <mark style="color:blue;">creating a new point</mark>
* <mark style="color:blue;">**Transmit lattice point**</mark> (hard to invert)
  * _Alice_ sends the new lattice point to _Bob_&#x20;
  * even if lattice point is intercepted, it <mark style="background-color:green;">**can't be easily reverse-engineered**</mark> to the original message —  mathematically complex relationship between the lattice points
* <mark style="color:blue;">**Receiver uses private key → map back**</mark>
  * _Bob_ uses the private key to perform mathematical operations on the lattice point he received
    * "map" the lattice point <mark style="color:blue;">back to the point that Alice initially added</mark> her message to
* <mark style="color:blue;">**Subtract to extract message**</mark>
  * _Bob_ <mark style="color:blue;">subtracts</mark> the lattice point he calculated <mark style="color:blue;">from the original lattice point</mark> — reveals the mathematical representation of Alice's message

