# Complexity Analysis

Complexity analysis is used to evaluate the efficiency of an algorithm based on the input size.

It mainly measures:

- Time Complexity
- Space Complexity

---

## 1. Time Complexity

Time complexity describes how the running time of an algorithm grows as the input size `n` increases.

Common time complexities:

| Complexity | Name |
|---|---|
| O(1) | Constant |
| O(log n) | Logarithmic |
| O(n) | Linear |
| O(n log n) | Linearithmic |
| O(n²) | Quadratic |
| O(n³) | Cubic |
| O(2ⁿ) | Exponential |
| O(n!) | Factorial |

---

## 2. Space Complexity

Space complexity describes how much additional memory an algorithm requires as input size grows.

Examples:

- O(1) → Constant space
- O(n) → Linear space
- O(n²) → Quadratic space

---

## 3. Asymptotic Notation

### Big-O — O()

Describes the upper bound of an algorithm's growth.

### Big-Omega — Ω()

Describes the lower bound.

### Big-Theta — Θ()

Describes the tight bound.

---

## 4. Case Analysis

Algorithms can be analyzed using:

- Best Case
- Average Case
- Worst Case

---

## 5. Loop Analysis

Learn to analyze:

- Single loops
- Nested loops
- Independent loops
- Dependent loops
- Halving loops
- Doubling loops

---

## 6. Recursion Complexity

Recursive algorithms require analysis of:

- Number of recursive calls
- Work performed at each call
- Recursion depth
- Recurrence relations

Examples:

- Factorial
- Fibonacci
- Binary Search

---

## 7. Important Rules

### Sequential statements
O(n) + O(n) = O(n)

### Nested operations

O(n) × O(n) = O(n²)

### Drop constants

O(2n) = O(n)

O(100n) = O(n)

### Drop lower-order terms

O(n² + n + 1) = O(n²)

### Independent inputs

O(n + m)

When n and m represent different input sizes, keep both variables.

---

## 8. Complexity Ranking

From generally more efficient to less efficient:

O(1)
O(log n)
O(n)
O(n log n)
O(n²)
O(n³)
O(2ⁿ)
O(n!)

---

## 9. What to Analyze

For every DSA algorithm, identify:

1. Time Complexity
2. Space Complexity
3. Best Case
4. Average Case
5. Worst Case
6. Auxiliary Space when relevant

---

## 10. Goal

The goal of complexity analysis is to understand how an algorithm's time and memory requirements grow as the input size increases.

Before moving to the next DSA topic, I should be able to analyze the time and space complexity of an algorithm.

