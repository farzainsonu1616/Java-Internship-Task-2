import java.util.Scanner;

public class VariablesDemo {

    // Static variable (shared among all objects)
    static int staticVar = 100;

    // Instance variable (belongs to object)
    int instanceVar = 50;

    public static void main(String[] args) {

        // Local variable (exists only inside method)
        int localVar = 25;

        // ------------------------------
        // 1. Primitive Data Types
        // ------------------------------

        byte b = 10;           // 1 byte
        short s = 100;         // 2 bytes
        int i = 1000;          // 4 bytes
        long l = 100000L;      // 8 bytes

        float f = 10.5f;       // 4 bytes
        double d = 20.99;      // 8 bytes

        char c = 'A';          // 2 bytes
        boolean isJavaFun = true; // 1 bit (logical)

        // ------------------------------
        // 2. Scanner for User Input
        // ------------------------------

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // ------------------------------
        // 3. Arithmetic Operations
        // ------------------------------

        int sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;

        double division = 0;
        if (num2 != 0) {
            division = (double) num1 / num2; // Type casting
        } else {
            System.out.println("Division by zero is not allowed");
        }

        // ------------------------------
        // 4. Type Casting
        // ------------------------------

        double price = 99.99;
        int roundedPrice = (int) price; // Narrowing casting

        int marks = 85;
        double exactMarks = marks; // Widening casting

        // ------------------------------
        // 5. Formatted Output
        // ------------------------------

        System.out.printf("\nSum: %d", sum);
        System.out.printf("\nDifference: %d", diff);
        System.out.printf("\nProduct: %d", product);
        System.out.printf("\nDivision: %.2f", division);

        System.out.printf("\nRounded Price: %d", roundedPrice);
        System.out.printf("\nExact Marks: %.1f\n", exactMarks);

        // ------------------------------
        // 6. Variable Scope Demo
        // ------------------------------

        VariablesDemo obj = new VariablesDemo();

        System.out.println("\nLocal Variable: " + localVar);
        System.out.println("Instance Variable: " + obj.instanceVar);
        System.out.println("Static Variable: " + staticVar);

        sc.close();
    }
}