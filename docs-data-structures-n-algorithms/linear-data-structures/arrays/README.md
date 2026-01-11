---
icon: layer-group
---

# Arrays

## Arrays

> **Array**: data structure used to store list of items
>
> * **items** gets **stored sequentially in memory**
> * arrays are **`static`**; when we allocate them, we should specify their size & this size cannot be changed later on
>
> Runtime Complexities
>
> * LookUp ➜ O(1)
> * Insert ➜ O(n)
> * Delete
>   * Best Case: Removing last element ➜ O(1)
>   * Worst Case: Removing first element ➜ O(n)



#### Example: Integer array

* an integer takes 4 bytes of memory

<kbd>memory address  : | 100 | 104 | 108 | 112 | 116 |</kbd>

<kbd>array elements  : | 10  | 20  | 30  | 40  | 50  |</kbd>



### Lookup by Index

looking up an element in an array by it's index is **super fast**&#x20;

* as items are stored sequentially in the memory
* when the index is given, it'll calculate & figure out where in the memory is that element stored

**runtime complexity** ➜ **O(1)**



### Limitations & Insertion

In Java, and many other languages, arrays are `static`; when we allocate them, we should specify their size & this size cannot be changed later on&#x20;

* So, we need to know ahead of time that how many items we are going to store in an array
* If you don't know, you have to make a guess
  * guess is too large -> **waste of memory**; there will be cells that are never filled
  * guess is too small ->&#x20;
    * array gets filled quickly;&#x20;
    * to add another item we have to resize the array
      * we should allocate larger array&#x20;
      * then copy all elements of the existing array to new array
      * this **operation is costly**&#x20;
    * **runtime complexity** ➜ **O(n)**



### Element removal

Runtime complexities of element removal

* Removing last element ➜ O(1) : Best Case
  * Lookup the element by last index and clear the memory
* Removing an item from the beginning of the array ➜ O(n): Worst Case
  * clear the first element
  * then shift every element on right one step to the left in the array to fill in the space of first element
  * the more elements we have, the more shifts we need to make

### Best for

* accessing elements by index
* if we know number of items to be stored, ahead of time

### Scenarios where Arrays do not perform well&#x20;

* if we don't know number of elements to be stored ahead of time
* if we have to remove and add lot of elements&#x20;

╰┈➤ **`Linked Lists`** are better fit in these scenarios



## Arrays in Java

{% content-ref url="arrays-in-java.md" %}
[arrays-in-java.md](arrays-in-java.md)
{% endcontent-ref %}



## Implementing Dynamic Integer Array From Scratch



