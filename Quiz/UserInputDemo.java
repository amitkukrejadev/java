
import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        try (Scanner SC = new Scanner(System.in)) { // Using try-with-resources
            String Name;
            System.out.println("Enter your Name Here:");
            Name = SC.nextLine();
            System.out.println("Welcome, " + Name);

            // Taking only one word as input
            System.out.println("Enter your Name Here:");
            Name = SC.next();
            System.out.println("Welcome, " + Name);
        } // SC will automatically close here
    }
}
