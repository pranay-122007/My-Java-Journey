### Day 4 - Arithmetic Operators & Expressions

Arithmetic opeerators are used to perform basic mathematical operators
- including addition, subtraction, multiplication, division, and modulo-on primitive numeric types.

## 1. Core Arithmetic Operators & Precedence Rules

**ADDITION OPERATOR -**

An operator to add teo or more values - Using `+`

**SUBTRACTION OPERATOR -**

An operator to subtract two or more values - Using `-`

**MULTIPLICATION OPERATOR -**

An operator to multiply teo or more values - Using `*`

**DIVISION OPERATOR -**

An operator to divide two or more values - Using `/`

⚠️NOTE:- 

- The result of the division of two integers is an *integer*. (We can use casting to get a double result)
- The result of the division of two doubles is a *double*.
- The result of the division of an integer and a double is a *double*(implicit casting)

**MODULO OPERATOR -**

The modulo operator (%) returns the remainder of a division between two numbers - Using `%`

## 2. integer Division vs. Floating-Point Division

This is a critical behavior that frequently shows up in debugging loops and expessions. 

**Integer Division**
When dividing an integer by another interger, Java completely discards the fractional remainder to return a strict integer value. It does *not* round up or down

```
int return = 5 / 2; // Returns 2, not 2.5!
```

**Floating-Point Division**
To get a precise decimal outcome, at least one of your operands must be a floating-point type (`double` or `float`). This forces Java to perform a floating-point calculation instead.

```
double result1 = 5.0 / 2; // returns 2.5
double result2 = (double) 5 / 2; // Returns 2.5 (via explicit casting)
```

**Compound Assignment Operators**
Compound assignment operators combine an arithmetic operation with an assignment step into a single shortcut expression.

```
◦ a += b is equivalent to a = a + b
◦ a -= b is equivalent to a = a - b
◦ a *= b is equivalent to a = a * b
◦ a /= b is equivalent to a = a / b
```