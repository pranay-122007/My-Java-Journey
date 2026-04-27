# Basic Conditional Logic in Java

Conditional statements allow a program to execute different blocks of code based on specific criteria. This "decision-making" is the core of algorithmic logic.

## 1. Syntax Architecture
Java evaluates a condition inside the parentheses. If the condition results in `true`, the corresponding block of code executes.

- **`if` block:** The starting point. It evaluates the primary condition.
- **`else if` ladder:** Used when there are multiple mutually exclusive conditions.
- **`else` block:** The "fallback" option. It executes only if all preceding `if` and `else if` conditions are `false`.


## 2. Key Tool: The Modulo Operator (%)
To perform many conditional checks (like finding even/odd numbers), we use the **Modulo Operator**.
- **Definition:** Unlike the division operator (`/`) which gives the quotient, the modulo operator (`%`) returns the **remainder**.
- **Application:** `number % 2 == 0` is the standard mathematical check for an even number.

## 3. Best Practices (Cleaner Code)
- **Indentation:** Always indent the code inside the curly braces `{ }` to make the branching logic visible.
- **Single-Line Efficiency:** If a block contains only one statement, curly braces are technically optional, but using them is recommended for clarity and preventing bugs during future updates.

| Operator | Meaning | Example |
| :--- | :--- | :--- |
| `==` | Equal to | `a == b` |
| `!=` | Not equal to | `a != b` |
| `>` | Greater than | `a > b` |
| `<` | Less than | `a < b` |
| `%` | Remainder | `10 % 3 = 1` |
