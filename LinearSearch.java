// LINEAR SEARCH CODE//
import java.util.*; 
public class LinearSearch {
    public static int linearsearch(int number[], int key){
        for (int i = 0; i<number.length; i++){
            if (number[i] == key){
                return i;
            }  
        }
        return -1;   
    }
    public static void main(String[] args){
    int number[] ={1,3,4,6,7};
    int key = 6;
    int index = linearsearch(number, key);
    if (index == -1){ 
        System.out.println("Key Not Found");
    }
    else{
        System.out.println("Key Found at index: " + index);
    }
}
}

