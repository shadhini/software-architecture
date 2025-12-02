---
icon: abacus
---

# φ(n): Euler's Totient Function

## φ(n): Euler's Totient Function

> **φ(n) = number of integers k with `1 ≤ k ≤ n` and `gcd(k, n) = 1`**
>
> number of positive integers less than `n` that are relatively prime to n (i.e the greatest common divisor of k & n is 1)

#### Examples:

φ(5):

* numbers less than 5: 1, 2, 3, 4
* relatively prime numbers
  * 1 --> gcd(1,5) = 1  ✔
  * 2 --> gcd(2,5) = 1 ✔
  * 3 --> gcd(3,5) = 1 ✔
  * 4 --> gcd(4,5) = 1 ✔

φ(8):

* numbers less than 8: 1, 2, 3, 4, 5, 6, 7
* relatively prime numbers
  * 1 --> gcd(1,8) = 1  ✔
  * 2 --> gcd(2,8) = 2 ✘
  * 3 --> gcd(3,8) = 1 ✔
  * 4 --> gcd(4,8) = 4 ✘
  * 5 --> gcd(5,8) = 1 ✔
  * 6 --> gcd(6,8) = 2 ✘
  * 7 --> gcd(7,8) = 1 ✔

#### Key facts:

|                                                                                                                                     |                                                                                                                 |
| ----------------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| φ(1) = 1                                                                                                                            |                                                                                                                 |
| n is prime                                                                                                                          | φ(n) = (n-1)                                                                                                    |
| <p>n = p x q<br><code>p</code> and <code>q</code> are primes</p>                                                                    | φ(n) = (p-1)x(q-1)                                                                                              |
| <p>n = a x b<br>either <code>a</code> or <code>b</code> is composite<br>or both <code>a</code> and <code>b</code> are composite</p> | <p>φ(n) = n x (1 -  1/p1) x (1 - 1/p2) x ....<br>where <code>p1</code>, <code>p2</code> are distinct primes</p> |

Example:

φ(1000)&#x20;

* 1000 = 2<sup>3</sup>x5<sup>3</sup>
* distinct primes = 2 and 5
* φ(1000) = 1000 x (1 - ½ ) x (1 - ⅕ ) = 1000 x ½ x ⅘ = 400

