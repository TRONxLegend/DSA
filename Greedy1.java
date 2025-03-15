import java.util.*;
public class Greedy1 {
    public static void main(String args[]){
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        // end time sort basis
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
       // 1st Activity 
       maxAct = 1;
       ans.add(0);
       int LASTEnd = end[0];
       for(int i = 1; i < end.length; i++){
      if(start[i] >= LASTEnd){
        maxAct++;
        ans.add(i);
        LASTEnd = end[i];
       }
    }  
   System.out.println("MAX ACTIVITY: " + maxAct);
}
}
