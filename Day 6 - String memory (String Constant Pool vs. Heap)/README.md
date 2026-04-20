# Java Memory: String Constant Pool vs. Heap

In Java, memory management for Strings is unique to optimize performance and reduce memory consumption. Understanding the difference between the **String Constant Pool (SCP)** and the **Heap Memory** is essential for writing efficient code.

## 🧠 Core Architecture
Java stores objects in the **Heap Memory**, but within that heap, there is a special designated area called the **String Constant Pool (SCP)**.

### 1. String Constant Pool (SCP)
- When a String is created as a **literal** (e.g., `String s = "Java";`), the JVM checks the SCP first.
- If the value exists, the reference to the existing string is returned.
- If it does not exist, a new string is created in the pool.
- **Goal:** Memory Efficiency through "String Interning."

### 2. Heap Memory
- When the `new` keyword is used (e.g., `new String("Java");`), the JVM is forced to create a **new object** in the general Heap area.
- Even if "Java" already exists in the SCP, a `new` object will always have a unique memory address.

## 🔍 Key Comparison: `==` vs `.equals()`
- `==` compares the **Reference** (Memory Address).
- `.equals()` compares the **Content** (Actual Text).

| Storage Method | Created In | Reuse Mechanism? |
| :--- | :--- | :--- |
| `String s = "..."` | String Constant Pool | Yes (Interning) |
| `new String("...")`| Heap Memory | No (New Object) |
