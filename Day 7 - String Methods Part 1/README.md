# String Analysis and Indexing in Java

In Java, the `String` class provides a set of built-in methods to analyze and extract data from text. Because Strings are index-based, we can access individual characters or sections of text with high precision.

## 1. The concept of Indexing
Java uses **Zero-based indexing**. This means the count starts at `0` rather than `1`.
- **First Character:** Index `0`
- **Last Character:** Index `string.length() - 1`



## 2. Core Methods for Analysis

### `.length()`
Returns the total number of characters (including spaces and symbols).
- **Return Type:** `int`
- **Complexity:** O(1) in Java (as length is stored internally).

### `.charAt(int index)`
Returns the character located at the specified index.
- **Exception:** If an index is provided that is less than `0` or greater than/equal to the length, Java throws a `StringIndexOutOfBoundsException`.


## 3. Practical Usage Table
| Method | Input | Result for "Java" |
| :--- | :--- | :--- |
| `length()` | None | `4` |
| `charAt(2)` | `int` | `'v'` |
