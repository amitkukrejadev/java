import java.util.*;

class First {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt(); // Read the number 'n'
        int sum = 0; // Initialize sum variable to 0

        // Loop from 1 to n to calculate the sum
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // Add i to sum in each iteration
        }

        // Print the final result after the loop ends
        System.out.println("The Sum of Natural Numbers from 1 to " + n + " is: " + sum);
    }
}
