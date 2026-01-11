---
icon: recycle
---

# Recursion

## Recursion

> **— A recursive function calls itself directly or indirectly to solve a problem —**&#x20;
>
> * Each recursive call works on a **smaller or simpler version of the original problem**, and&#x20;
> * the process continues **until a base case —** a condition where no further recursive calls are made — **is reached**.

#### Key Points

* The problem is divided into smaller, similar subproblems.
* Each recursive step brings the computation closer to the base case.
* The **base case** is a condition under which the function does not make further recursive calls and returns a result directly.
* **Without a base case**, recursion can lead to
  * **infinite loops** and&#x20;
  * **stack overflow errors**.



#### Format

```python
def recursive_function(parameters):
    if base_case_condition(parameters):
        return base_case_value
    recursive_function(modified_parameters)
```

#### Use cases

* sum of all previous numbers
* a tool that goes through bunch of directories in your computer and counts how many files are contained in each folder; when listing the files inside a directory, there might be subdirectories inside them; and you'd want to count the files in those sub directories as well
  * base case — directory with no sub directories
    * in this case, the function would just return the amount of files&#x20;
  * recursive case — calling the recursive function for each of the contained sub directories
    * the return value of a given function call would be the sum of all the files in that directory + all the files in the contained sub directories

#### Recursive structure&#x20;

E.g:&#x20;

* a directory of files that can can contain other directories &#x20;
* group management software: a groups of users that can contain other groups
  * encounter this situation when using administrative tools like `Active Directory` or `LDAP`

{% hint style="success" %}
It's easier to use **recursive functions** when working with a **recursive structure**.
{% endhint %}

#### Recursion Limits

{% hint style="warning" %}
In some languages, there is a **maximum amount of recursive calls** you can use.

* Python ➜ 1000 times
{% endhint %}

```bash
Python 3.9.13 (main, Aug 25 2022, 18:29:29)
[Clang 12.0.0 ] :: Anaconda, Inc. on darwin
Type "help", "copyright", "credits" or "license" for more information.
>>> def factorial(n):
...   if n < 2:
...     return 1
...   return n * factorial(n-1)
...
>>> factorial(4)
24
>>> factorial(1000)
Traceback (most recent call last):
  File "<stdin>", line 1, in <module>
  File "<stdin>", line 4, in factorial
  File "<stdin>", line 4, in factorial
  File "<stdin>", line 4, in factorial
  [Previous line repeated 995 more times]
  File "<stdin>", line 2, in factorial
RecursionError: maximum recursion depth exceeded in comparison
```



## Factorial

```python
def factorial(n):
  if n < 2:
    return 1
  return n * factorial(n-1)
```



```python
def factorial(n):
  print("Factorial called with " + str(n))
  if n < 2:
    print("Returning 1")
    return 1
  result = n * factorial(n-1)
  print("Returning " + str(result) + " for factorial of " + str(n))
  return result

factorial(4)

## Output
Factorial called with 4
Factorial called with 3
Factorial called with 2
Factorial called with 1
Returning 1
Returning 2 for factorial of 2
Returning 6 for factorial of 3
Returning 24 for factorial of 4
24

```
