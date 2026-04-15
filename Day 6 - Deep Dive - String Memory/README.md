# Day 6 - String Memory Management in Java

In Java, `String` is an object, and its memory allocation is handled differently than primitive data types to optimize performance and memory usage.

## 1. String Constant Pool (SCP)
The String Constant Pool is a special memory area within the Heap. When a String literal is created, the JVM checks the pool:
- If the string already exists, the reference to the existing string is returned.
- If it does not exist, a new string is created in the pool.

This process is known as **String Interning**.

## 2. Heap Memory Allocation
When the `new` keyword is used (e.g., `new String("Java")`), the JVM bypasses the pool and creates a unique object in the Heap memory, even if the same string already exists in the SCP.



## 3. Comparison Operators
To write bug-free Java code, it is essential to distinguish between these two comparison methods:

| Operator/Method | Purpose | Comparison Type |
| :--- | :--- | :--- |
| `==` | Compares memory addresses | **Reference** |
| `.equals()` | Compares the sequence of characters | **Content** |

### Key Rule
For logical comparisons (like checking a password or a username), **always use `.equals()`** to ensure you are comparing the text and not the memory location.
