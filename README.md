# Rational Numbers Generator

This Java program generates a list of rational numbers within specified bounds, as described in the Extra Credit Project #1 of Math 263 - Discrete Mathematics, Fall 2023.

## Project Overview

The primary goal of this project is to create a versatile program capable of listing rational numbers at the intersections of vertical and horizontal lines, defined by the equations x = a and y = b, where a, b ∈ Z. The program prompts the user to specify an output file name, as well as lower and upper bounds for x and y.

## Getting Started

1. **Clone the repository:** `git clone https://github.com/Lightmean03/RationalNumberGen.git`

2. **Compile the Java source code:** `javac src/App.java -d bin`

3. **Run the program:** `java -cp bin App`

4. **Follow the on-screen instructions:**

   - Provide the output file name (e.g., RationalNumbersOutput.txt).
   - Enter the lower bound for x and y.
   - Enter the upper bound for x and y.
   - Enter the step size for x and y.

5. **View the generated output:**
   - The program will create a file containing the requested rational numbers.

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
