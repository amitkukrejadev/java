public class Pattern2 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;
        for (int i = 1; i <= rows; i++) { // Change to <= to include the last row
            for (int j = 1; j <= columns; j++) {
                // Check to print stars at the boundaries
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("* "); // Print star
                } else {
                    System.out.print(" "); // Print space
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
