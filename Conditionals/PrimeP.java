import java.util.*;
class PrimeP {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a;
        System.out.print("Enter a Number Here: ");
        a = SC.nextInt();
        if( a%2 == 0) {
            System.out.println("The Number you Entered " + a + " is a Even Number");
        }
        else {
            System.out.println("The Number you Entered " + a + " is a Odd Number");
        }
        SC.close();
    }
}