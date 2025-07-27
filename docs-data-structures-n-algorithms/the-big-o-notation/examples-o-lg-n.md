---
icon: '4'
---

# Examples: O(lg n)

## O(lg n)

#### Example: we have an array of sorted numbers and want to find number 10 there

<kbd>array: | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 |</kbd>



* **`Linear Search`**:&#x20;
  * _method of search_: iterate over the array using a `for` loop, until number `10` is found
  * _worst case_: number we are searching for is at the end of the array
    * we have to inspect every cell in the array to find the target number
    * the more items we have, the longer this operation takes to find the target number
    * thus, runtime of this algorithm increases linearly in directly in proportion to size of the array
  * **runtime complexity** **➜ O(n)**&#x20;
* **`Binary Search`**:&#x20;
  * _assumption_: array is sorted
  * _method of search_:&#x20;
    * we start at looking at the middle item; check whether the target item is smaller or greater than the middle item;&#x20;
      * if target is larger, we get the right partition of the array; and do not inspect left partition anymore
      * if target is smaller, take the left partition; drop the right partition
      * now we have narrowed down our search by half
    * again in the selected partition, we look for the middle item and check whether it is smaller or greater to the target item
      * again depending on the result, we take the necessary partition to look further and continue this process..
    * thus, in every step we narrow down the search by half
  * with this algorithm if we have 1M items, we can find the target item with maximum of  19 comparisons
  * this algorithm runs in logarithmic time
  * **runtime complexity** **➜ O(log**<sub>**2**</sub>**&#x20;n)** **➜ O(lg n)**&#x20;



