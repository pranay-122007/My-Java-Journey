# String Immutability and StringBuilder in Java

A critical aspect of Java development is understanding how the JVM handles character sequences. This documentation explores the performance limitations of the `String` class and the advantages of using `StringBuilder`.

## 1. The Concept of Immutability
In Java, `String` objects are **immutable**. Once a String is created in memory, it cannot be changed.
- **Modification Process:** When you perform an operation like `str = str + "!"`, Java does not modify the existing string. Instead, it creates a brand new String object in the Heap and points the reference variable to it.
- **Memory Overhead:** In heavy operations (like loops), this creates thousands of temporary objects, putting pressure on the **Garbage Collector**.


## 2. StringBuilder: The Mutable Alternative
`StringBuilder` is a class used to create a mutable sequence of characters. It is significantly more efficient than `String` for frequent modifications

### Key Performance Differences:
| Feature | String | StringBuilder |
| :--- | :--- | :--- |
| **Mutability** | Immutable (Unchangeable) | Mutable (Changeable) |
| **Performance** | Slower (Creates new objects) | Faster (Modifies existing object) |
| **Memory** | High consumption in loops | Low consumption (In-place updates) |


## 3. Core API Reference

| Method | Return Type | Functionality |
| :--- | :--- | :--- |
| `.append(data)` | `StringBuilder` | Adds data to the end of the sequence. |
| `.insert(offset, data)` | `StringBuilder` | Inserts data at a specific index. |
| `.setCharAt(index, char)` | `StringBuilder` | Replaces a single character.
| `.delete(start, end)` | `StringBuilder` | Removes characters in the specified range. |
| `.reverse()` | `StringBuilder` | Flips the sequence of characters. |
| `.toString()` | `String` | Converts the sequence back to an immutable String. |

## 🚀 Technical Exercise: Performance Demonstration
The following implementation demonstrates the core API and how to manipulate character sequences without generating multiple heap objects.
