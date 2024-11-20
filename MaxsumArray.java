import java.util.*;

public class MaxsumArray {
    public static void maxSubarray(int numbers[]){
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i =0; i<numbers.length;i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end  = j;
                currsum = 0;
                for(int k=start; k<=end; k++){
                    currsum += numbers[k];
                }
                System.out.println("currsum : " + currsum);
                if(currsum > maxsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("Maximum sum subarray : " + maxsum);
    }
    public static void main(String[] args){
        int numbers[]  = {1,-2,6,-1,3};
        maxSubarray(numbers);
    }
    
}
