// public class Recursion {
//     public static void printDec(int n){
//         if(n==0){
//             return;
//         }
//         System.out.println(n);
//         printDec(n-1);
//     }
//     public static void main(String[] args) {
//         int n =10;
//         printDec(n);
//     }

// }

// INCREMENT THE NUMBERS IN ASCENDING ORDER:

// public class Recursion {
//     public static void printInc(int n) {
//         if (n == 1) {
//             return;
//         }
//         printInc(n - 1);
//         System.out.println(n + "");
//     }

//     public static void main(String[] args) {
//         int n = 10;
//         printInc(n);
//     }
// }

// FACTORIAL OF A NUMBER:

//   public class Recursion{
//     public static int fact(int n){
//         if(n==0 || n==1){
//             return 1;
//         }
//         int fnm1 =fact(n-1);
//         int fn = n * fact(n-1);
//         return fn;

//     }
//     public static void main(String [] args) {
//         int n = 5;
//         System.out.println("Factorial of " + n + " is: " + fact(n));
//     }
//   }      

// SUM OF FIRST N NATURAL NUMBERS:

// public class Recursion{
//     public static int nsum(int n){
//         if(n==1){
//             return 1;
//         }
//         int snm1 = nsum(n-1);
//         int sn = n+ snm1;
//         return sn;
//     }
//     public static void main(String[] args){
//         int n = 5;
//         System.out.println("Sum of first " + n + " natural numbers is: " + nsum(n));
//     }
// }

//  GIVEN ARRAY IS SORTED OR NOT:  

//     public class Recursion {
//     public static boolean isSorted(int arr[],int i){
//         if(i==arr.length-1){
//             return true;
//         }
//         if(arr[i]<=arr[i+1]){
//             return isSorted(arr,i+1);
//         }
//         return false;
//     }
//     public static void main(String[] args){
//         int arr[] = {1,2,3,8,4,5};
//         System.out.println(isSorted(arr,0));
//     }
// }

// FIRST OCCURANCE OF AN ELEMENT IN AN ARRAY:

//       public class Recursion{
//         public static int firstOccurrence(int arr[], int key, int i){
//                 if(i==arr.length){
//                     return -1;
//                 }
//        if(arr[i]==key){
//         return i;
//        }
//         return firstOccurrence(arr, key, i+1);
//         }
//         public static void main(String[] args){
//                 int arr[] = {1,2,3,4,5,6,7,8,9,10};
//                 int key = 5;
//                 System.out.println(firstOccurrence(arr, key, 0));
//         }
//       }

// LAST OCCURANCE OF AN ELEMENT IN AN ARRAY:

//       public class Recursion {
//         public static int lastOccurrence(int[] arr, int key,int i){
//                 if(i==arr.length){
//                 return -1;
//                 }
//          int isfound = lastOccurrence(arr, key, i+1);
//          if(isfound != -1){
//            return isfound;
//          }

//            if(arr[i]==key){
//              return i;
//            }
//                   return isfound;
//         }
//       public static void main(String[] args){
//         int arr[] = {8,3,6,9,5,10,2,5,3};
//         int key = 5;
//         System.out.println(lastOccurrence(arr, key, 0));
//       }
//     }

// PRINT X TO THE POWERT N:

// public class Recursion {

//   public static int x(int x,int n){
//   if(n==0){
//         return 1;
//   }
//   int xnm1 = x(x,n-1);
//   int xn = x* xnm1;
//   return xn;
//   }   
//   public static void main(String[] args){
//         int x = 2;
//         int n = 5;
//         System.out.println(x(x, n));
//   }   

// }

// TILING PROBLEM :

//  public class Recursion {
// public static int tiling(int n){
//          if(n==0 || n==1){
//              return 1;
//          }
//    int verticaltile = tiling(n-1);
//    int horizontaltile = tiling(n-2);

//    int totalways = verticaltile + horizontaltile;
//    return totalways;
// }
//         public static void main(String[] args) {
//              int n = 4;
//              System.out.println("Number of ways to tile a 2x" + n + " floor = " + tiling(n)); 
//         }
//  }

// BINARY STRINGS WITHOUT CONSECUTIVE 1'S:

// public class Recursion {
//         public static int binaryString(int n, int lastPlace, String str) {
//             if (n == 0) {
//                 System.out.println(str);
//                 return 1;
//             }
//             // Recursive calls without modifying the original string
//             int count = binaryString(n - 1, 0, str + "0");
//             if (lastPlace == 0) {
//                 count += binaryString(n - 1, 1, str + "1");
//             }
//             return count; // Return total count
//         }
//         public static void main(String[] args) {
//             int n = 4;
//             int total = binaryString(n, 0, "");
//             System.out.println("Total valid binary strings: " + total);
//         }
//     }

// REMOVE DUPLICATES FROM A STRING:

public class Recursion {
        public static void removeduplicate(String str, int idx,StringBuilder newstr, boolean map[]){
                if(idx==str.length()){
                 System.out.println(newstr);
                return;
                }
              char currchar = str.charAt(idx);
              if(map[currchar-'a']==true){
                removeduplicate(str, idx+1, newstr, map);
        }
        else{
                map[currchar-'a'] = true;
                removeduplicate(str, idx+1, newstr.append(currchar), map);
        }
}
   public static void main(String[] args){
    String str = "aabcccccaaa";
        
        removeduplicate(str, 0, new StringBuilder(), new boolean[26]);
   }      

}
