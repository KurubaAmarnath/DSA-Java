# Space Complexity

Space complexity describes how much extra memory an algorithm
needs as the input size `n` increases.

---

## 1. What Is Space Complexity?

Total memory used by an algorithm, relative to input size `n`.
Includes:

- Input space
- Auxiliary (extra) space
- Recursion call stack space

---

## 2. Auxiliary Space vs Total Space

```
Total Space = Input Space + Auxiliary Space
```

- **Total Space** — everything, including the input itself
- **Auxiliary Space** — only the extra space used, excluding input

In interviews, "space complexity" usually means **auxiliary space**.

→ See: `AuxiliarySpace.java`, `InputVsAuxiliarySpace.java`

---

## 3. Common Space Complexities

| Complexity | Name | Meaning |
|---|---|---|
| O(1) | Constant | Extra memory independent of input size |
| O(log n) | Logarithmic | Recursion depth that halves each call |
| O(n) | Linear | Extra memory grows with input size |
| O(n²) | Quadratic | 2D structure of size n × n |

---

## 4. Constant Space — O(1)

Extra memory does not grow with `n`.
Only a fixed number of simple variables are used.

→ See: `ConstantSpace.java`

---

## 5. Multiple Variables — Still O(1)

Using several fixed variables instead of one does not
change the complexity — it is still constant space,
since the count does not depend on `n`.

→ See: `MultipleVariables.java`

---

## 6. Linear Space — O(n)

A new array, list, or map is created whose size
scales directly with `n`.

→ See: `LinearSpace.java`

---

## 7. Copying an Array — O(n)

Creating a copy of an input array of size `n` requires
new memory proportional to `n`.

→ See: `CopyArray.java`

---

## 8. Quadratic Space — O(n²)

Occurs when an `n × n` structure (e.g. a matrix) is created.

→ See: `QuadraticSpace.java`

---

## 9. Recursion Stack Space

Every recursive call adds a frame to the call stack.
Stack space = maximum depth of recursion.

→ See: `RecursiveFunction.java`

---

## 10. Recursive Factorial — O(n)

Recursion that reduces `n` by 1 on each call goes
`n` levels deep before returning.

→ See: `RecursiveFactorial.java`

Space Complexity: `O(n)`

---

## 11. Recursive Fibonacci — O(n)

Even though the naive recursive Fibonacci makes
two calls per level, the maximum depth of the call
stack at any one time is still `n`.

→ See: `RecursiveFibonacci.java`

Space Complexity: `O(n)`

---

## 12. How to Analyze Space Complexity

1. Identify fixed space (simple variables) → O(1)
2. Identify variable space (arrays, maps, strings created)
3. Check if recursive — find max recursion depth
4. Add fixed + variable + stack space
5. Keep only the dominant term
6. Remove constants
7. Write the final complexity

---

## 13. Common Mistakes

- Ignoring recursion stack space
- Counting input space as auxiliary space
- Confusing time complexity with space complexity
- Assuming more variables means higher complexity (still O(1) if fixed count)

---

For a pattern-by-pattern quick reference, see `SpaceComplexityPatterns.md`.