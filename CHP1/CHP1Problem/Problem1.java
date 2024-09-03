import java.lang.*;
import java.util.*;

class Problem1 {
    public static void main(String[] args) {
        String Name;
        int Age;
        Scanner sc = new Scanner(System.in);
        System.out.print("May I Know your Name:");
        Name = sc.nextLine();
        System.out.print("May I Know your Age:");
        Age = sc.nextInt();
        System.out.println("Thanks " + Name + " For Trying this Program & Here's Your Age As Entered " + Age);
    }

}