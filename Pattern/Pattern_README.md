
# Pattern Generation Program in Java

This Java program generates various interesting patterns based on input size `n`. Each pattern is implemented as a separate method for clarity and modularity.

## Patterns Included

### 1. Symmetrical Number Pyramid
Generates a mirrored numerical pattern.

```
n = 4
1      1
12    21
123  321
12344321
```

**Method:** `gen_patt_1(int n)`

---

### 2. Reverse Alphabet Pyramid
Creates a reverse pyramid of alphabets.

```
n = 5
E D C B A
D C B A
C B A
B A
A
```

**Method:** `gen_patt_2(int n)`

---

### 3. Alternating Alphabet Case Pyramid
Generates a pyramid where letters alternate between lowercase and uppercase.

```
n = 5
a
B c
D e F
g H i J
k L m N o
```

**Method:** `gen_patt_3(int n)`

---

### 4. Incremental Alphabet Pyramid
Displays an incremental alphabet pyramid starting from the last letter.

```
n = 5
E
D E
C D E
B C D E
A B C D E
```

**Method:** `gen_patt_4(int n)`

---

### 5. Symmetrical Concentric Pattern
Generates a symmetric pattern with concentric numbers.

```
n = 4
4444444
4333334
4322234
4321234
4322234
4333334
4444444
```

**Method:** `gen_patt_5(int n)`

---

### 6. Pyramid with Numerical Palindrome
Displays numbers decreasing towards the center and increasing away from it.

```
n = 5
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
```

**Method:** `gen_patt_6(int n)`

---

### 7. Diamond Star Pattern
Generates a diamond shape filled with stars.

```
n = 5
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
```

**Method:** `gen_patt_7(int n)`

---

### 8. Symmetrical Star Pyramid
Creates a star pattern with symmetry along the vertical axis.

```
n = 5
    *
   * *
  * * *
 * * * *
* * * * *
 * * * *
  * * *
   * *
    *
```

**Method:** `gen_patt_8(int n)`

---

### 9. Dual Number Triangle
Displays two triangles with sequential numbers.

```
n = 4
1 2 3 4  17 18 19 20
  5 6 7    14 15 16
   8 9      12 13
    10 11
```

**Method:** `gen_patt_9(int n)`

---

### 10. Alternating Stars Diamond
Generates a diamond with alternating spaces and stars.

```
n = 5
*        *
**      **
* *    * *
*  *  *  *
*   **   *
*   **   *
*  *  *  *
* *    * *
**      **
*        *
```

**Method:** `gen_patt_10(int n)`

---

### 11. Double Diamond Stars
Creates a double-diamond pattern of stars.

```
n = 5
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
```

**Method:** `gen_patt_11(int n)`

---

## Usage

1. Clone or download the repository.
2. Compile and run the Java file using:
   ```bash
   javac Pattern.java
   java Pattern
   ```
3. Modify the `n` parameter in the main method to change the size of the patterns.

## Methods Breakdown

Each pattern is implemented as a method in the `Pattern` class:
- **Pattern Logic**: Each method builds the pattern row by row and stores it in a `String[]` array.
- **Reusable Printing Function**: The `print_pattern(String[] arr)` method prints the pattern line by line for simplicity.

## Contributing

Contributions are welcome! If you have ideas for additional patterns or improvements, please open an issue or submit a pull request.

## License

This project is open-source and available under the [MIT License](LICENSE).

---

Happy coding!
