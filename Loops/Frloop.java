import java.util.*;

public class Frloop {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the starting number (a): ");
        int a = SC.nextInt();
        System.out.print("Enter the ending number (b): ");
        int b = SC.nextInt();

        // New For Loop With User Input
        System.out.println("Numbers from " + a + " to " + b + ":");
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }

        SC.close();
    }
}
