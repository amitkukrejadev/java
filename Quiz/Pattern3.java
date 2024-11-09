import java.util.*;

class Pattern3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        // i loop : iterating n times
        for (int i = 1; i <= n; i++) {
            /*
             * We are going from 1 to i
             * because the number of
             * stars is increasing
             * after each line and so
             * is i.
             */
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
