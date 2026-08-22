# Time Complexity

Time complexity describes how the running time of an algorithm
grows as the input size `n` increases.

It helps us compare algorithms and understand how efficiently
they handle large inputs.

---

## Common Time Complexities

| Complexity | Name | Meaning |
|---|---|---|
| `O(1)` | Constant | Work does not depend on input size |
| `O(log n)` | Logarithmic | Input is reduced by a factor each step |
| `O(n)` | Linear | Work grows directly with input size |
| `O(n + m)` | Multiple Inputs | Work depends on two input sizes |
| `O(n log n)` | Linearithmic | Linear work across logarithmic levels |
| `O(n²)` | Quadratic | Two levels of linear work |
| `O(n³)` | Cubic | Three levels of linear work |
| `O(log² n)` | Logarithmic Squared | Two logarithmic loops |

---

## Programs

### 1. O(1) — Constant Time

**Program:** `ConstantTime.java`

A constant-time algorithm performs a fixed amount of work,
regardless of the input size.

---

### 2. O(n) — Linear Time

**Program:** `LinearTime.java`

A linear-time algorithm performs work proportional to
the input size.

---

### 3. O(n²) — Quadratic Time

**Program:** `QuadraticTime.java`

A quadratic-time algorithm commonly occurs when one linear
loop is nested inside another linear loop.

---

### 4. O(log n) — Logarithmic Time

**Program:** `LogarithmicTime.java`

A logarithmic-time algorithm reduces the problem size
by a constant factor, such as dividing by 2.

---

### 5. O(n log n) — Linearithmic Time

**Program:** `LinearithmicTime.java`

A linearithmic algorithm performs linear work across
logarithmic levels.

---

### 6. O(n + m) — Independent Inputs

**Program:** `MultipleIndependentLoops.java`

When two independent loops process different input sizes,
the complexity is `O(n + m)`.

---

### 7. O(n²) — Dependent Loops

**Program:** `DependentLoops.java`

When the number of iterations of an inner loop depends
on an outer loop, the total work can still be quadratic.

---

### 8. O(log n) — Doubling Loop

**Program:** `DoublingLoop.java`

When a value doubles on every iteration, the number of
iterations grows logarithmically.

---

### 9. O(n³) — Cubic Time

**Program:** `TripleNestedLoop.java`

Three nested linear loops produce cubic time complexity.

---

### 10. O(n + m) — Two Different Inputs

**Program:** `TwoDifferentInputs.java`

When two different input sizes are processed independently,
the complexity is `O(n + m)`.

---

### 11. O(n) — Constant Work Inside Loop

**Program:** `ConstantWorkInsideLoop.java`

If a loop runs `n` times and performs constant work
during each iteration, the complexity is `O(n)`.

---

### 12. O(log² n) — Logarithmic Nested Loop

**Program:** `LogarithmicNestedLoop.java`

Two nested loops that each run logarithmically produce
`O(log² n)` time complexity.

---

### 13. O(n²) — Linear Plus Quadratic

**Program:** `LinearPlusQuadratic.java`

When an algorithm performs both linear and quadratic work:

`O(n) + O(n²)`

The dominant term is `O(n²)`.

Therefore:

`O(n²)`

---

### 14. Multiple Loops

**Program:** `MultipleLoops.java`

Multiple loops are analyzed based on whether they are
sequential or nested.

For sequential loops:

`O(n) + O(n) = O(n)`

For nested loops:

`O(n) × O(n) = O(n²)`

The final complexity depends on the structure of the loops.

---

