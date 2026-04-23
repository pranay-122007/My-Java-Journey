# Comprehensive String Comparison in Java

In Java, strings are objects. Comparing them requires different approaches depending on whether the goal is to check for identity, equality, or lexicographical (dictionary) order.

## 1. Identity Comparison (`==`)
The `==` operator performs a **Reference Comparison**. It checks if two variables point to the exact same memory location.
- **Result:** `true` if they share a memory address, `false` otherwise.

## 2. Content Equality (`.equals()`)
The `.equals()` method performs a **Value Comparison**. It checks if the sequence of characters inside the objects is identical.
- **Result:** `true` if the text matches exactly, `false` otherwise.
- **Case Sensitivity:** This method is case-sensitive.

## 3. Lexicographical Comparison (`.compareTo()`)
The `.compareTo()` method calculates the Unicode difference between characters to determine "dictionary order."
- **Result 0:** The strings are identical.
- **Positive Result:** The string is "greater" than the argument.
- **Negative Result:** The string is "less" than the argument.


## 🔍 Operation Summary Table

| Method / Operator | Target | Return Type |
| :--- | :--- | :--- |
| `==` | Memory Address | `boolean` |
| `.equals()` | Text Content | `boolean` |
| `.equalsIgnoreCase()` | Text (Case-Insensitive) | `boolean` |
| `.compareTo()` | Dictionary Order | `int` |
