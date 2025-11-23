---
icon: binary
---

# Assembly Languages

## Assembly Languages

> — use **simple symbols** to represent **0s and 1s of machine code —**&#x20;
>
> * closely **tied to** **CPU(processor) architecture from hardware manufacturers**
>   * each CPU type has its own assembly language
> * translated using an **`assembler`** instead of a compiler or interpreter

{% hint style="info" %}
There is large amount of assembly languages use today that varies among hardware manufacturers.
{% endhint %}



```armasm
; assembly language format -- code in curly brackets are optional
{label} mnemonic {operand list} {;comment}

; example code 
; statement has 2 parts -- instruction/mnemonic & parameters/operands
mov TOTAL, 212 ; transfer the value 212 in the memoory variable TOTAL
```



## Assemblers

Translate Assembly language into machine code using **`mnemonics`**&#x20;

* `INP` — input
* `OUT` — output
* `LDA` — load
* `STA` — store
* `ADD` — add

Statements consist of

* **`Opcodes`** that tell the processor (CPU) what to do with data
* **`Operands`** that  tell the processor (CPU) where to find the data



