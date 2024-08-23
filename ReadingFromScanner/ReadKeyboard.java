package ReadingFromScanner;

import java.util.Scanner; // Correct import statement

public class ReadKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your name:");
        String name = sc.next();
        
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        
        System.out.println("Enter your gender:");
        String gender = sc.next();
        
        // Output the collected information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        
        sc.close(); // Close the scanner
    }
}
