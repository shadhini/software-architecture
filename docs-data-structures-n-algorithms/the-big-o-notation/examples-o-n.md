---
icon: '2'
---

# Examples: O(n)

## O(n)



```java
public  void log(int[] arrayNumbers) {
    for (int i=0; i < arrayNumbers.length; i++) {
        System.out.println(arrayNumbers[i]);
    }
}
```

Here,

* we are iterating over the elements of the array
* size of the input matters to the cost&#x20;
  * single item in array -> this method will have 1 print operation
  * million items in array -> this method will have 1M print operations
* cost of this algorithm grows linearly and in direct relation to the size of the input

**runtime complexity of this method ➜ O(n) ; n represents the size of the input**



```javascript
public  void log(int[] arrayNumbers) {
    System.out.println("a"); // -----A --> O(1)
    for (int i=0; i < arrayNumbers.length; i++) { // O(n)
        System.out.println(arrayNumbers[i]);
    }
    System.out.println("a"); // -----B --> O(1)
}
```

Here,

* single operations @ line A & B runs in constant time -> O(1) time complexity&#x20;

runtime complexity of this method ➜ O(1 + n  + 1)&#x20;

if the array has 1M inputs and if it iterates over every input, then adding 2 extra operations doesn't really have a significant impact on the cost of the algorithm.

╰┈➤ compared to O(n); addition of O(1) is negligible

╰┈➤ cost of algorithm still increases linearly

Therefore,

**runtime complexity of this method ➜ O(n) ; n represents the size of the input**



```java
public  void log(int[] arrayNumbers) {
    for (int i=0; i < arrayNumbers.length; i++) { // O(n)
        System.out.println(arrayNumbers[i]);
    }
    for (int number : arrayNumbers) { // O(n)
        System.out.println(number);
    }
}
```

Here,

* we have 2 for loops that iterate over the elements of the array one after another

**runtime complexity of this method ➜ O(n + n ) ➜ O(2n) ➜ O(n)**&#x20;

* Here, n or 2n, still represents a linear growth
* so we can drop the constant multiplier (i.e. 2) as what we need is an approximation of the cost of the algorithm compared to it's input size



```java
public  void log(int[] arrayNumbers, int[] arrayStrings) {
    for (int i=0; i < arrayNumbers.length; i++) { // O(n)
        System.out.println(arrayNumbers[i]);
    }
    for (String name : arrayStrings) { // O(m)
        System.out.println(name);
    }
}
```

Here,&#x20;

* we have 2 loops that iterate over different arrays of different sizes

**runtime complexity of this method ➜ O(n + m) ➜ O(n)**&#x20;

