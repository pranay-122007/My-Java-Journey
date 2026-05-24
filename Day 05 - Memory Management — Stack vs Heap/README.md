# Java Memory Management: Stack vs. Heap

The Java Virtual Machine (JVM) divides runtime data memory into distinct regions to optimize execution speed and resource management. The two most critical regions for application data are the **Stack** and the **Heap**.


## 1. Stack Memory
Stack memory is responsible for thread execution tracking and short-term data storage.

- **Storage Target:** Stores primitive data types (like `int`, `double`, `boolean`) and reference variables (the memory addresses or "pointers" to objects).
- **Mechanism:** Operates on a **Last-In, First-Out (LIFO)** data structure.
- **Lifecycle:** Managed automatically via method calls. When a method is called, a new **Stack Frame** is pushed onto the stack. When the method finishes execution, its frame is popped off, and its local variables are instantly destroyed.

## 2. Heap Memory
Heap memory is a large, unstructured pool used for runtime dynamic allocation.

- **Storage Target:** Stores all actual objects, instances, arrays, and their metadata.
- **Lifecycle:** Allocated explicitly when the `new` keyword is used. Objects persist in the heap even after the method that created them has ended.
- **Management:** Automatically cleaned up by the **Garbage Collector (GC)** when an object no longer has any active references pointing to it in the Stack.

## 🔍 Structural Comparison

| Feature | Stack Memory | Heap Memory |
| :--- | :--- | :--- |
| **Structure** | Strictly ordered (LIFO) | Unstructured (Pool of memory) |
| **Data Stored** | Local variables, primitives, references | Objects, instance variables, arrays |
| **Access Speed** | Highly optimized and extremely fast | Slower due to pointer lookups |
| **Lifecycle** | Automatic (Tied to method execution) | Persistent (Managed by Garbage Collection) |
| **Error Types** | `java.lang.StackOverflowError` | `java.lang.OutOfMemoryError` |