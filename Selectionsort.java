import java.util.*;

public class Selectionsort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {  // outer loop for sorting
            int midindex = i;  // mid index of the first element
            for (int j = i+1 ; j < arr.length; j++) { // inner loop for sorting
                if (arr[j] > arr[midindex]) {
                    midindex = j;
                }
            }

            int temp = arr[i]; // swaping the array
            arr[i] = arr[midindex];
            arr[midindex] = temp;
        }

    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 3, 2, 4};
        selectionSort(arr);
        printArray(arr);
    }
}
