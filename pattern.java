// import java.util.*;
// public class pattern {
//     public static void main(String[] args)  {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int n = sc.nextInt();
//         for (int i = 1; i <= n; i++) {
//             System.out.println("****");
//         }
//     }
// }

//  import java.util.*;
//  public class pattern {
//  public static void main(String[] args){
//     for(int i = 0; i<4 ; i++) {
//         for(int j = 0; j < 4; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//  }
//  }

// import java.util.*;

// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 0 ; i<5; i++){
//             for(int j = 0 ; j<=i ; j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
// }
// }

// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=5; i++){
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
// }
// }

// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=5; i++){
//             for(int j = 1 ; j<=i ; j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
// }
// }

// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=5; i++){
//             for(int j = 0 ; j<=5-i+1 ; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// }
// }

// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=5; i++){
//             for(int j = 1; j<=5-i+1 ; j++){
//                 System.out.print(j);
//             }
//             System.out.println();
//         }
// }
// }

// import java.util.*;
// public class pattern {
//     public static void main(String[] args) {
//         for(int i = 1 ; i<=5; i++){
//             for(int j = 1; j<=5-i-1 ; j++){
//                 System.out.print(" ");
//                 for(int j = 1; j<=2*i+1 ; j++){
//                     System.out.print("*");
//                     for(int j = 1; j<=5-i-1; j++){
//                         System.out.print(" ");
//                     }
//                 }
//             }
//             System.out.println();
//         }
// }
// }

// import java.util.*;

// public class pattern {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 5; i++) {
//             for (int j = 1; j <= 5-i-1; j++) {
//                 System.out.print(" ");
//             }
//             for (int j = 1; j <=2*i-1; j++) {
//                 System.out.print("*");
//             }

//             System.out.println();
//         }
//     }
// }

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        for (int i = 0; i <4; i++) {
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j<2 * 4 - (2 * i - 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
