import java.util.*;

public class Switch {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Let's Start Our Calculator.......");

        // Input numbers
        System.out.print("Enter First Number Here: ");
        int a = SC.nextInt();
        System.out.print("Enter Second Number Here: ");
        int b = SC.nextInt();

        // Display menu options with additional operations
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulo (Remainder)");
        System.out.println("6. Exponentiation (Power)");
        System.out.println("7. Absolute Difference");
        System.out.println("8. Maximum");
        System.out.println("9. Minimum");

        System.out.print("Enter your Choice Here: ");
        int choice = SC.nextInt();

        // Initialize result variable
        int result = 0;

        switch (choice) {
            case 1: // Addition
                result = a + b;
                System.out.println("The result of Addition is: " + result);
                break;

            case 2: // Subtraction
                result = a - b;
                System.out.println("The result of Subtraction is: " + result);
                break;

            case 3: // Division
                if (b != 0) {
                    double divisionResult = (double) a / b; // cast to double for decimal division
                    System.out.println("The result of Division is: " + divisionResult);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            case 4: // Multiplication
                result = a * b;
                System.out.println("The result of Multiplication is: " + result);
                break;

            case 5: // Modulo (Remainder)
                result = a % b;
                System.out.println("The result of Modulo is: " + result);
                break;

            case 6: // Exponentiation (Power)
                double powerResult = Math.pow(a, b);
                System.out.println("The result of " + a + " raised to the power of " + b + " is: " + powerResult);
                break;

            case 7: // Absolute Difference
                result = Math.abs(a - b);
                System.out.println("The result of Absolute Difference is: " + result);
                break;

            case 8: // Maximum
                result = Math.max(a, b);
                System.out.println("The Maximum value is: " + result);
                break;

            case 9: // Minimum
                result = Math.min(a, b);
                System.out.println("The Minimum value is: " + result);
                break;

            default: // Invalid choice
                System.out.println("Invalid Choice. Please select a valid option.");
        }

        SC.close();
    }
}
