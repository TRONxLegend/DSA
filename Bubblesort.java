import java.util.*;

public class Bubblesort {
    public static void bubbleSort(int arr[]) {
        for(int i = 0;i<arr.length-1; i++){     // Outer loop 
            for(int j = 0; j<arr.length-1-1;j++){  // Innner Loop Which compares the two arrays
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;  // Swap elements
                }
            }
            
        }
    }
    public static void printarr(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();  // Print array elements separated by space
    }
 public static void main(String[] args) {
    int arr[] = {1,3,5,7,4,2,6,8};
    bubbleSort(arr);
    printarr(arr);
 }    
}
