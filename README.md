# Rational Numbers Generator

This Java program generates a list of rational numbers within specified bounds, as described in the Extra Credit Project #1 of Math 263 - Discrete Mathematics, Fall 2023.

## Project Overview

The goal of this project is to create a program that enumerates (lists) the rational numbers that appear at the intersections of vertical and horizontal lines of the form x = a and y = b, where a, b ∈ Z. The generated output includes the first rational number, every 50th rational number thereafter, and the last rational number within the given boundaries. The code is designed to be adaptable to different boundary values.

## Example Inputs and Outputs

### Example 1:

- **Output File:** `RationalNumbersOutput.txt`
- **Lower Bound:** -10
- **Upper Bound:** 10
- **Step Size:** 5

```plaintext
lowerBound: -10, upperBound: 10, step: 5
-10/10
-10/5
-5/10
-5/5
0/1
0/5
0/10
```

### Example 2:

- **Output File:** `AnotherOutput.pdf`
- **Lower Bound:** -5
- **Upper Bound:** 5
- **Step Size:** 2

```plaintext
lowerBound: -5, upperBound: 5, step: 2
-5/5
-5/4
-4/4
-4/2
-2/4
-2/2
0/1
0/2
0/4
```
