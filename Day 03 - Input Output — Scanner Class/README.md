# Day 03: Standard Input and Output in Java with Scanner Class

Programs require a mechanism to interact with users by displaying data (Output) and capturing user entries (Input). Java handles these operations via the `System` class and the `Scanner` utility.

## 1. Standard Output
Java provides two primary methods for console output within the `System.out` package:
- `System.out.print()`: Outputs text directly to the console without moving to a new line.
- `System.out.println()`: Outputs text and automatically appends a newline character (`\n`) at the end.

## 2. Standard Input via `Scanner`
To read inputs from the keyboard, Java utilizes the `Scanner` class located in the `java.util` package. 

### Implementation Protocol:
1. **Import the class:** `import java.util.Scanner;`
2. **Instantiate the object:** `Scanner sc = new Scanner(System.in);` (Where `System.in` represents the standard keyboard input stream).
3. **Close the stream:** `sc.close();` must be executed at the end of the program to prevent resource memory leaks.

## 3. Data Parsing Methods

| Method | Target Data Type | Behavior |
| :--- | :--- | :--- |
| `nextInt()` | `int` | Parses the next token of input as an integer. |
| `nextFloat()` | `float` | Parses the next token of input as a decimal float. |
| `next()` | `String` | Reads the input until it encounters a space or whitespace. |
| `nextLine()` | `String` | Reads the complete line of text until it encounters a newline (`\n`). |

## ⚠️ Common Gotcha: Buffer Clearing
When using `nextInt()` or `nextFloat()` immediately followed by `nextLine()`, the trailing newline character `\n` left in the input buffer is instantly consumed by `nextLine()`, causing it to skip user input. 
- **Solution:** Insert an empty `sc.nextLine();` to flush the buffer before reading the actual string.