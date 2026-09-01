---
icon: integral
---

# MPKC: Multivariate Polynomial Cryptography

## `MPKC`: Multivariate Polynomial Cryptography&#x20;



<mark style="color:violet;background-color:pink;">**Principle: hard multivariate polynomial equations**</mark>

* Believed to be hard to solve both classically and quantumly



<mark style="background-color:blue;">**Example**</mark>:&#x20;

* `Rainbow signature` scheme: cryptographic scheme designed for digital signatures in 2005



#### <mark style="background-color:pink;">Rainbow Signature Scheme</mark> Ops (signature flow):

* **Key generation**<mark style="color:blue;">**: private polynomials, public map**</mark>
  * user generates a pair of keys: a private key, a public key
  * <mark style="color:blue;">private key</mark> : <mark style="color:blue;">set of polynomial equations and coefficients</mark>
* **Signature**: <mark style="color:blue;">**apply private key's polynomials to message**</mark>
  * this generates a set of values used to create the signature
* **Signature Verification**: <mark style="color:blue;">**public polynomials → check output matches conditions**</mark>
  * anyone can verify the authenticity of the signature using the user's public key
  * verifier applies the public key's polynomials to the signature — results in a set of values
    * <mark style="background-color:green;">**if these values match certain conditions → the signature is considered valid ✔**</mark>



