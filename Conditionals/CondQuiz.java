import java.util.*;

class CondQuiz {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int n = SC.nextInt();
        if (n == 1) {
            System.out.println("Hello");
        } else if (n == 2) {
            System.out.println("Namaste");
        } else if (n == 3) {
            System.out.println("Bonjour");
        }
        else {
            System.out.println("Invalid input");
        }
        SC.close();
    }
}
