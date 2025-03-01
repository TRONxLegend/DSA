
   // MERGE SORT //
// Time Complexity: O(nlogn) //
// Space Complexity: O(n) // 

// public class DividenConquer{
//    public static void printArr(int arr[]){
//     for(int i=0;i<arr.length; i++){
//         System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//    } 
   
//    public static void mergeSort(int arr[],int si,int ei){
//     if(si>=ei){
//         return;
//     }
//      int mid = si+(ei-si)/2;
//         mergeSort(arr,si,mid);//left part
//         mergeSort(arr,mid+1,ei);//right part
//         merge(arr,si,mid,ei);

//    }

//    public static void merge(int arr[],int si,int mid ,int ei){
//     int temp[] = new int[ei-si+1];// +1 issliye kyuki array ke index zero based hote hai...
//     int i = si;//left part
//     int j = mid+1;//right part
//     int k = 0;//iterator for temp arr

//     while(i<= mid && j<=ei){
//          if(arr[i]<arr[j]){
//             temp[k] = arr[i];
//             i++;
//         }
//          else{
//             temp[k] = arr[j];
//             j++; 
//         }
//         k++;
//     }
//     //left part me agar kuch elements bach gaye hai toh 
//     while(i<=mid){
//         temp[k++] = arr[i++];
//     }
//     // right part me agar kuch elements bach gaye hai toh
//     while(j<=ei){
//         temp[k++] = arr[j++];
//     }
//     //temp array ko original array me copy karna hai
//     for(k = 0, i=si; k<temp.length; k++, i++){
//         arr[i] = temp[k];
//     }
//    }
   
//    public static void main(String args[]){
//     int arr[] = {6,3,9,5,2,8};
//     mergeSort(arr,0,arr.length-1);
//     printArr(arr);
//    }
// }


// QUICK SORT //
// Time Complexity: O(nlogn) //
// Space Complexity: O(n) //

public class DividenConquer{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quicksort(int arr[] , int si , int ei){
    if(si>=ei){
        return;
    }
     int pidx = partition(arr,si,ei);
     quicksort(arr,si,pidx-1);//left part
     quicksort(arr,pidx+1,ei);//right part
    }
    public static int partition(int arr[], int si, int ei){
     int pivot = arr[ei];
     int i = si-1; //to make place for element smaller than pivot

     for(int j=si; j<ei; j++){
        if(arr[j]<pivot){
            i++;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
     }
      i++;
      int temp = pivot;
        arr[ei] = arr[i];// pivot ko sahi jagah pe rakhne ke liye
        arr[i] = temp;
        return i;
    }

    public static void main(String arg[]){
        int arr[] = {6,3,9,8,5,2};
        quicksort(arr,0,arr.length-1);
        printArr(arr);
    }
}
   


// Sorted and Rotated Array:

