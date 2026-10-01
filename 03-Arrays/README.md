# Arrays: Basics

> Part of my **DSA Series**. This note covers the fundamentals of arrays.

## Contents
1. [What Is an Array?](#1-what-is-an-array)
2. [Why Arrays Are Fast](#2-why-arrays-are-fast)
3. [Array Terminology](#3-array-terminology)
4. [Types of Arrays](#4-types-of-arrays)
5. [Basic Operations](#5-basic-operations)
6. [Time Complexity](#6-time-complexity)
7. [Advantages and Disadvantages](#7-advantages-and-disadvantages)
8. [Common Mistakes](#8-common-mistakes)
9. [Glossary](#9-glossary)

---

## 1. What Is an Array?

An **array** is a collection of elements of the same type, stored one after another in **contiguous memory** and accessed using an **index**.

```
Index:    0     1     2     3     4
        +-----+-----+-----+-----+-----+
Value:  | 10  | 20  | 30  | 40  | 50  |
        +-----+-----+-----+-----+-----+
```

- Indexing starts at **0**.
- For n elements, the last index is **n - 1**.
- All elements share the same data type.

---

## 2. Why Arrays Are Fast

Elements are stored next to each other and have equal size, so the address of any element is calculated directly:

```
address(arr[i]) = base_address + (i x element_size)
```

Example: base address = 1000, element size = 4 bytes

| Index | Address |
|-------|---------|
| 0     | 1000    |
| 1     | 1004    |
| 2     | 1008    |
| 3     | 1012    |

No searching is needed to reach an element, so **access by index takes O(1) time**.

---

## 3. Array Terminology

- **Element:** one value stored in the array.
- **Index:** the position of an element.
- **Length / Size:** total number of elements.
- **Base address:** address of the first element.

---

## 4. Types of Arrays

| Type | Description |
|------|-------------|
| One-dimensional (1D) | A single row of elements |
| Two-dimensional (2D) | Rows and columns, like a table or matrix |
| Multidimensional | Three or more dimensions |
| Static | Size is fixed when created |
| Dynamic | Size can grow or shrink (list, vector, ArrayList) |

### 1D example
```
[ 5, 8, 2, 9 ]
```

### 2D example
```
        col0 col1 col2
row 0 [  1    2    3  ]
row 1 [  4    5    6  ]
row 2 [  7    8    9  ]
```
An element is accessed with two indices: `[row][column]`.

---

## 5. Basic Operations

### Access
Go directly to an index using the address formula.

### Update
Access the index and replace the value.

### Traversal
Visit every element once, from index 0 to n - 1.

### Searching
- **Linear search:** check each element one by one. Works on any array.
- **Binary search:** works only on a **sorted** array. Compare with the middle element and discard half of the array each step.

### Insertion
- **At the end:** place the element in the next free slot.
- **At the beginning or middle:** shift all later elements one place **right**, then insert.

```
Insert 99 at index 1

Before:  [10, 20, 30, 40]
After:   [10, 99, 20, 30, 40]
```

### Deletion
- **At the end:** just reduce the size.
- **At the beginning or middle:** shift all later elements one place **left** to fill the gap.

```
Delete index 1

Before:  [10, 20, 30, 40]
After:   [10, 30, 40]
```

---

## 6. Time Complexity

| Operation | Time Complexity |
|-----------|-----------------|
| Access by index | O(1) |
| Update by index | O(1) |
| Linear search | O(n) |
| Binary search (sorted array) | O(log n) |
| Insert at end | O(1) |
| Insert at beginning or middle | O(n) |
| Delete at end | O(1) |
| Delete at beginning or middle | O(n) |
| Traversal | O(n) |

**Space complexity:** O(n)

---

## 7. Advantages and Disadvantages

### Advantages
- Fast access to any element using its index.
- Simple and easy to use.
- Memory efficient, with no extra pointers.
- Cache-friendly because of contiguous storage.

### Disadvantages
- Static arrays have a fixed size.
- Insertion and deletion in the middle or at the front are slow because of shifting.
- Needs a continuous block of memory.
- All elements must be of the same type (in typed languages).

---

## 8. Common Mistakes

1. **Off-by-one errors.** Valid indices are 0 to n - 1.
2. **Index out of bounds.** Accessing an index outside the array causes an error.
3. **Using binary search on an unsorted array.**
4. **Confusing length with last index.** Last index = length - 1.
5. **Forgetting edge cases:** empty array, single element, duplicates.

---

## 9. Glossary

| Term | Meaning |
|------|---------|
| Array | Ordered collection of elements in contiguous memory |
| Element | A single value in the array |
| Index | Position of an element, starting from 0 |
| Length | Number of elements |
| Contiguous | Stored back to back with no gaps |
| Random access | Reaching any element directly in O(1) |
| Static array | Fixed size |
| Dynamic array | Resizable array |
| Traversal | Visiting every element once |
| Linear search | Checking elements one by one |
| Binary search | Halving a sorted array each step |

---

