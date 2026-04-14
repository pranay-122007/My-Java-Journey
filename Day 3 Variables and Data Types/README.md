**Day 3 — Variables and Data Types**

Explored how variables and data types work in Java. Learned how to define variables, assign values, and display outputs using different data types. 
Also practiced taking inputs using the Scanner class and understanding how data types determine the kind of values a variable can store.

# Data Types 
Java is a statically-typed language, which means all variables must first be declared before they can used. Data types in Java are categorized into two main groups:

**1. Primitive Data types**

Primitive types are predefined by the language and named by a reserved keyword. They serve as the basic building blocks of data.

| Data Type | Size (bits) | Default Value | Description |
|:--- |:--- |:--- |:--- |
| **byte** | 8-bit | `0` | Stores whole numbers from -128 to 127 |
| **short** | 16-bit | `0` | Stores whole numbers from -32,768 to 32,767 |
| **int** | 32-bit | `0` | Stores whole number from -2^31 to 2^31-1 |
| **long** | 64-bit | `0L` | Strores whole number from -2^63 to 2^63-1 |
| **float** | 32-bit | `0.0f` | Strores fractional numbers (6-7 decimal digits) |
| **double** | 64-bit | `0.0d` | Stores fractional numbers (15 decimal digits) | 
| **boolean** | 1-bit* | `false` | Stores true or false values |
| **char** | 16-bit | `'\u0000'` | Stores a single character/letter or ASCII values |

⚠️NOTE: The size of a boolean isn't precisely defined by the Java Virtual Machine (JVM) specification, but it's typically treaded as 1 byte in most environment.

**2. Non- Primitive Data Types**

Non-Primitive types refer to objects and are called Reference Types because they store the memory address (reference) of the variable, rather than the values itself.
 -String: A sequence of characters (e.g., String name = "I am the best";).
 -Arrays: Store multiple values of the same type in a single variable (e.g., int[] numbers = {1,2,3};).
 -Classes: User-defined blueprints for objects.
 -Interfaces: abstract types used to achieve abstraction and multiple inheritance.

 **🔁 Camparison Table**


 | Feature | Primitive Taupes | Non-Primitive Types |
 |:--- |:--- |:--- |
 | **Definition** | Predefined in Java | Created by the programmer (except String) |
 | **Value** | Always has a value (never null) | Can be null |
 | **Memory** | Stored in Stack memory | Stored in Heap memory |
 | **Methods** | Cannot be used to call methods | Can be used to call methods to preform operation |
 | **Nameing** | start with lowercase (e.g., int) | Start with uppercase (e.g., String) |
