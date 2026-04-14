###Day 5 - Type Casting (Converting double to int and vice versa)

Typecasting is the process of converting a value from one primitive data type to another. 
In Java, this is essential because it is a **statically-typed language**, meaning the type of a variable must be known at compike time.

**1. Widening Casting (Automatically)**

Widening casting happens when you pass a smaller type to a larger type size.
Scince there is no risk of losing data, Java handles this automatically.

**Hierarchy:**

'byte' -> 'short' -> 'char' -> 'int' -> 'long' -> 'floot' -> 'double'

**Example:**
            
    java
    int myInt = 10
    double myDouble = myInt //Automatic casting

**2. Narrowing Casting (Manually)**

Narrowing casting must be done manually by placing the type in parentheses () in front of the value.
This is used when converting a large type to a smaller size.
    
⚠️Note: Data loss can occur here (e.g., decimals are removed when converting double to int).

**Hierarchy:**

'double' -> 'float' -> 'long' -> 'int' -> 'char' -> 'short' -> 'byte'

**Example**
    
    java
    double myDouble = 10.85;
    int myInt = (int) myDouble; // Manual casting: myInt bacomes 10
