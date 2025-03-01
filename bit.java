import java.util.*;

public class bit {
    public static void oddoreven(int n) {
        int bitmask = 1;
        if ((n & bitmask) == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        oddoreven(n);
    }
}