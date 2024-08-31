package input; // This should match the folder structure

import java.util.Scanner; // Import the Scanner class for taking input

public class input { // The class name is 'Main', so the file must be 'Main.java'

    public static void main(String[] args) {
        // Print a greeting message to the console
        System.out.println("Hello There");
        
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter their name
        System.out.println("Enter your name (first and last):");
        String name = sc.nextShort(); // Read the full line of input, including spaces
        
        // Prompt the user to enter their age
        System.out.println("Enter your age:");
        int age = sc.nextInt(); // Read the user's age
        
        // Display the user's name
        System.out.println("Your Name is " + name);
        
        // Display the user's age
        System.out.println("You have entered age as " + age);
        
        sc.close(); // Close the Scanner to free up resources
    }
}
