# Day 01: Foundations, Environment Setup & JVM Architecture (First Day of Coding Word)

This day focuses on getting the environment ready the classic first program, and understanding exactly what happens behind the scenes when Java code runs.

---

## 1. Environment setup & Hello World
 
* **Goal:** Set up the compiler and runtime environments to execute Java code.
* **Code = Implementation:** Written in `FristCode.java` using `System.out.println()` to output text to the console.

```java
public class FirstCode {
    public static void main(String[] args) {
        System.our.println("Welcome to the coding World!");
    }
}
```
## 2. Java Compilation & Execution Flow
Java utilizes a unique **two-step process** combining both compilation and interpretation to achieve plateform independence ("Write Once, Run Anywhere").

```Plaintext
  [Your Code]              [Bytecode]              [Machine code]
 FirstCode.java   --->   FristCode.class   --->    01011101001...
                 javac                     JVM
               (Compiler)           (Interpreter/JIT)
```
- **Compilation (`javac`):** The Java Compiler (`javac`) takes your human-readable source code (`.java`file) and compiles it into platform-indepentent **Bytecode**(`.class`file).
- **Execution (`java`):** The Java Virtual Machine (JVM) reads the bytecode, translates it line-by-line into local machine native code, and executes it on your hardware.

## 3. The Core Architecture: JDK vs JRE vs JVM
Understanding how the Java components nest inside one another is essential for backend engineering:
```
    +--------------------------------------------------------+
    | JDK (Java Development Kit)                             |
    |  - Development Tools (javac, jar, jdb, etc.)           |
    |                                                        |
    |  +--------------------------------------------------+  |
    |  | JRE (Java Runtime Environment)                   |  |
    |  |  - Deployment & Standard Libraries (util, lang)  |  |
    |  |                                                  |  |
    |  |  +--------------------------------------------+  |  |
    |  |  | JVM (Java Virtual Machine)                 |  |  |
    |  |  |  - Executes bytecode                       |  |  |
    |  |  |  - Handles Memory (Stack/Heap) & GC        |  |  |
    |  |  +--------------------------------------------+  |  |
    |  +--------------------------------------------------+  |
    +--------------------------------------------------------+
```
**JVM (Java Virtual Machine):** The core engine that actually executes Java bytecode. It is platform-dependent (different for Windows, Mac, Linux) because it must translate bytecode into specific hardware instructions.

**JRE (Java Runtime Environment):** Contains the JVM plus the standard class libraries and configuration files required to run a Java application. (JRE = JVM + Core Libraries).

**JDK (Java Development Kit):** The full software development bundle. It contains the JRE along with development tools like the compiler (`javac`), debugger, and documentation tools. (JDK = JRE + Development Tools).
