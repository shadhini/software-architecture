---
icon: '1'
---

# Examples: O(1)

## O(1)



```java
public  void log(int[] arrayNumbers) {
    // O(1)
    System.out.println(arrayNumbers[0]);
}
```

This,

* has a single operation
* takes a constant amount of time to run&#x20;
* the size of the input doesn't matter; as this method access only the element at index 1, it will always run in constant time

**runtime complexity of this method ➜ O(1)**



```java
public  void log(int[] arrayNumbers) {
    // O(1)
    System.out.println(arrayNumbers[0]);
    System.out.println(arrayNumbers[0]);
}
```

Here,

* we have 2 operations
* both operations run in constant time
* even if we have 1M lines of `System.out.println(arrayNumbers[0])` operation, the program runs in constant time
  * it doesn't change with the input size

**runtime complexity of this method ➜ O(1)**



