# String Extraction and Sequence Validation

In Java, managing text data often requires two distinct operations: retrieving a specific portion of a string or checking for the existence of a character sequence.

## 1. The `.substring(int beginIndex, int endIndex)` Method
This method is used to extract a subset of characters from the original string.

- **Parameters:**
    - `beginIndex`: The starting point (inclusive).
    - `endIndex`: The ending point (exclusive).
- **Mechanism:** It creates a new string object containing the specified range.
- **Key Note:** If only one parameter is provided, it extracts from that index to the very end of the string.



## 2. The `.contains(CharSequence s)` Method
This method is used to perform a search operation within the string.

- **Function:** It returns a `boolean` value (`true` or `false`).
- **Mechanism:** It checks if the exact sequence of characters exists anywhere within the target string.
- **Case Sensitivity:** This method is **case-sensitive**. "Java" and "java" will result in different outcomes.

## 🔍 Comparative Analysis

| Feature | .substring() | .contains() |
| :--- | :--- | :--- |
| **Primary Purpose** | Data Extraction | Data Validation |
| **Return Type** | `String` | `boolean` |
| **Logic** | "Give me the text from X to Y" | "Does this text exist here?" |
| **Memory** | Creates a new object | Returns a primitive result |
