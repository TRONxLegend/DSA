// Activity Selection Problem:-

// import java.util.*;
// public class Greedy1 {
//     public static void main(String args[]){
//         int start[] = {1,3,0,5,8,5};
//         int end[] = {2,4,6,7,9,9};

//         // end time sort basis
//         int maxAct = 0;
//         ArrayList<Integer> ans = new ArrayList<>();
//        // 1st Activity 
//        maxAct = 1;
//        ans.add(0);
//        int LASTEnd = end[0];
//        for(int i = 1; i < end.length; i++){
//       if(start[i] >= LASTEnd){
//         maxAct++;
//         ans.add(i);
//         LASTEnd = end[i];
//        }
//     }  
//    System.out.println("MAX ACTIVITY: " + maxAct);
// }
// }


// Fractional Knapsack Problem:-

import java.util.*;
public class Greedy1 {
public static void main(String args[]){
  int val[] = {60,100,120};
  int weight[] = {10,20,30};
  int W = 50;

  double ratio[][] =new double[val.length][2];
  
  for(int i = 0; i<val.length; i++){
    ratio[i][0] = i;
    ratio[i][1] = val[i]/(double)weight[i];
  }

  Arrays.sort(ratio, Comparator.comparingDouble(a -> a[1]));

  int capacity = W;
  int finalVal = 0;

  for(int i = ratio.length-1; i>=0; i--){
    int idx = (int)ratio[i][0];
    if(capacity >= weight[idx]){
      finalVal += val[idx];
      capacity -= weight[idx];
    }
    else{
      finalVal += (ratio[i][1] * capacity);
      capacity = 0;
      break;
    }
  }
  System.out.println("MAX VALUE: " + finalVal);
}
}