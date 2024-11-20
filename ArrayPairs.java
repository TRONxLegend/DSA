import java.util.*;

public class ArrayPair {
    public static void printPair(int numbers[]) {
        int tp = 0;
        for (int i = 0; i < numbers.length; i++) { //outer loop
            int current = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + current + "," + numbers[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("Total pairs: " + tp);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        printPair(numbers);
    }
}
