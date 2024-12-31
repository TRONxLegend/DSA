##############// # REVERSE OF A NUMBER 

import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number you want to reverse :");
        int reverse = sc.nextInt();
    while (reverse > 0 ) {
         int lastnumber  =  reverse%10;
         System.out.print(lastnumber);
           reverse = reverse/10;
        }
    }
}


###############// # Do While Loop:-

import java.util.*;
public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        do{
            System.out.println("Do While loop");
            counter++;
        } while (counter<=10);
    }
}



################// Break Statement in Loops:-

import java.util.*;
public class loops{
    public static void main(String[] args) {
        int i;
        for(i=1;i<=5;i++) {
            if(i==3){
                break;
            }
            System.out.println(i);
    }
}
}
 


###############//Keep Entering Numbers until the User Enters A Number which is a multipe of 10 :-)

import java.util.*;
public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number :");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("Given Number is Multipe of 10");
                break;
            }
            System.out.println("Given Number is Not Multipe of 10");
        }while(true);
    }
}




################// Continue Statements #################################//


import java.util.*;
public class loops{
    public static void main(String[] args) {
        int i;
        for(i=1;i<=5;i++) {
            if(i==3){
                continue;
            }
            System.out.println(i);
    }
}
}




###############//Keep Entering Numbers Except the User Enters A Number which is a multipe of 10 :-)

import java.util.*;
public class loops{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter a number :");
            int n = sc.nextInt();
            if(n%10==0){
                System.out.println("Given Number is Multipe of 10");
                continue;
            }
            System.out.println("Given Number is Not Multipe of 10");
        }while(true);
    }
}