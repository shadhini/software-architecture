---
icon: '3'
---

# Examples: O(n^2)

## O(n<sup>2</sup>)



```java
public void log(int[] arrayNumbers) {
    
    for (int first: arrayNumbers) { // O(n)
        for (int second: arrayNumbers) { // O(n)
            System.out.print(first + ", " + second);
        }
    }
}
```

Here,

* we have nested loops
* this algorithm runs in `quadratic time`&#x20;

**runtime complexity of this method ➜ O(n) \* O(n) ➜ O(n**<sup>**2**</sup>**)**&#x20;

* algorithms that run in O(n<sup>2</sup>) gets slower than algorithms that run in O(n)&#x20;
  * this depends on the size of the input
  * if you are dealing with an array of 50 items, you won't see a big difference
  * but, as the input grows larger and larger, algorithms that run in O(n<sup>2</sup>) gets slower and slower



```java
public void log(int[] arrayNumbers, int[] arrayStrings) {
    for (String name : arrayStrings) { // O(m)
        System.out.println(name);
    }
    
    for (int first: arrayNumbers) { // O(n)
        for (int second: arrayNumbers) { // O(n)
            System.out.print(first + ", " + second);
        }
    }
}
```

**runtime complexity of this method ➜ O(m + n**<sup>**2**</sup>**) ➜ O(n**<sup>**2**</sup>**)**&#x20;

* a square of a number is always greater than a number itself
* n<sup>2</sup> always grows faster than m&#x20;
* so we can drop m&#x20;



```java
public void log(int[] arrayNumbers) {
    
    for (int first: arrayNumbers) { // O(n)
        for (int second: arrayNumbers) { // O(n)
            for (int third: arrayNumbers) { // O(n)
                System.out.print(first + ", " + second + ", " + third);
            }
        }
    }
}
```

**runtime complexity of this method ➜ O(n**<sup>**3**</sup>**)**&#x20;

* The cost of this algorithm grows way faster than an algorithm with O(n<sup>2</sup>) cost



