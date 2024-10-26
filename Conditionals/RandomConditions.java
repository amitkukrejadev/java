import java.util.*;

public class RandomConditions {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();
        int b = SC.nextInt();
        if (a == b) {
            System.out.println("Equal");
        } else if (a > b) {
            System.out.println("A is Greater");
        } else
            System.out.println("A is Smaller");
        SC.close();

    }
}
