import java.util.*;

public class Second {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        System.out.println("Let's Build a Multiplication Table!");
        System.out.print("Enter a number: ");
        int number = SC.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            // Using String.format for better formatting
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        SC.close();
    }
}
