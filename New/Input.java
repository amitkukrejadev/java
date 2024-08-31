import java.lang.*;
import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner N = New Scanner(System.in);
        System.out.println("Enter your name:");
        String Name = N.nextLine();
        System.out.println("Enter your age:");
        int Age = N.nextInt();
        System.out.println("Enter your grade:");
        double Grade = N.nextDouble();
        System.out.println("Thanks " + Name + " & Your Age is" + Age + "Grade is" + Grade);
    }
}
