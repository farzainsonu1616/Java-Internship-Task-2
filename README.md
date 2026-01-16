# TASK 2: Variables, Data Types & Console Input Application

## Project Title
Variables, Data Types and Console Input Demonstration using Java

## Objective
The objective of this task is to understand and demonstrate:
- Java primitive data types
- Variable scope (local, instance, static)
- Console input using Scanner
- Arithmetic operations
- Type casting
- Input validation
- Formatted output using printf

## Tools Used
- IntelliJ IDEA Community Edition
- Java JDK 8+

## Project Structure
     Task2_Variables_DataTypes
     ├── src
     │ └── VariablesDemo.java
     ├── README.md
     ├── screenshots.txt
     └── screenshots

## Description of Implementation

### 1. Primitive Data Types
The program declares all Java primitive data types:
- byte (1 byte)
- short (2 bytes)
- int (4 bytes)
- long (8 bytes)
- float (4 bytes)
- double (8 bytes)
- char (2 bytes)
- boolean (logical)

These data types were chosen to demonstrate memory efficiency and usage.

### 2. Console Input
The Scanner class is used to take integer input from the user.
It reads values directly from the console at runtime.

### 3. Arithmetic Operations
The following operations are performed using user input:
- Addition
- Subtraction
- Multiplication
- Division

Division includes a conditional check to avoid division by zero.

### 4. Type Casting
- Widening Casting: int → double
- Narrowing Casting: double → int

This shows conversion between compatible data types.

### 5. Variable Scope
- Local Variable: Declared inside main method
- Instance Variable: Belongs to object
- Static Variable: Shared across the class

### 6. Formatted Output
System.out.printf() is used for formatted and readable output.

## How to Run the Program
1. Open the project in IntelliJ IDEA
2. Navigate to `VariablesDemo.java`
3. Right-click → Run
4. Enter values in the console when prompted

## Sample Output
    Enter first number: 10
    Enter second number: 5

    Sum: 15
    Difference: 5
    Product: 50
    Division: 2.00
    Rounded Price: 99
    Exact Marks: 85.0

    Local Variable: 25
    Instance Variable: 50
    Static Variable: 100


## Conclusion
This project demonstrates fundamental Java concepts required for backend and core Java development.
It improves understanding of data types, input handling, memory usage, and program structure.

