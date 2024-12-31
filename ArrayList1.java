// import java.util.ArrayList;
// public class ArrayList1 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         System.out.println(list);
//     }
// }

// import java.util.ArrayList;
// public class ArrayList1 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         System.out.println(list);

//         int element = list.get(2);
//         System.out.println("Element at index 2: " + element);

//         list.set(0,6);
//         System.out.println("Updated list: " + list);

//         list.remove(1);
//         System.out.println("Updated list after removing element at index 1: " + list);

//         System.out.println(list.contains(3));
//         System.out.println(list.contains(8));
//     }
// }

// import java.util.ArrayList;
// public  class ArrayList1{
//     public static void main(String[] args){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> subList = new ArrayList<>();
//         subList.add(1); subList.add(2);
//         mainList.add(subList);

//     ArrayList<Integer> subList2 = new ArrayList<>();
//     subList2.add(3); subList2.add(4);
//     mainList.add(subList2);

//     System.out.println(mainList);

//     }
// }

// import java.util.ArrayList;

// public class ArrayList1 {
//     public static void main(String[] args){
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         list1.add(1); list1.add(2); list1.add(3); list1.add(4); list1.add(5);

//         mainList.add(list1);

//         ArrayList<Integer> list2 = new ArrayList<>();
//         list2.add(2); list2.add(4); list2.add(8); list2.add(10); list2.add(12);

//         mainList.add(list2);

//         ArrayList<Integer> list3 = new ArrayList<>();
//         list3.add(3); list3.add(6); list3.add(9); list3.add(12); list3.add(15);

//         mainList.add(list3);

//         for(int i = 0; i<mainList.size(); i++){
//             ArrayList<Integer> currlist = mainList.get(i);
//             for(int j = 0 ;j<currlist.size(); j++){
//                 System.out.print(currlist.get(j) + " ");
//             }
//             System.out.println();
//         }
//         System.out.println(mainList);
//     }

// }

// CONTAINERS WITH MOST WATER...

// import java.util.ArrayList;

// public class ArrayList1 {
//     public static int storewater(ArrayList<Integer> height) {
//         int maxwater = 0;
//         for (int i = 0; i < height.size(); i++) {
//             for (int j = i + 1; j < height.size(); j++) {
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int width = j - i;
//                 int water = ht * width;
//                 maxwater = Math.max(maxwater, water);
//             }
//         }
//         return maxwater;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<Integer>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println("Maximum water that can be trapped is :" + storewater(height));
//     }
// }

// import java.util.ArrayList;
// public class ArrayList1{
//     public static Boolean pairsum(ArrayList<Integer> list, int target){
//     for(int i = 0 ; i<list.size(); i++){
//         for(int j = i+1 ;j<list.size() ; j++){
//             if(list.get(i) + list.get(j) == target){
//                 return true;
//             }
//         }
//     }
//     return false;
// }
// public static void main(String[] args) {
//     ArrayList<Integer> list = new ArrayList<>();
//     list.add(1); 
//     list.add(2);
//     list.add(3);
//     list.add(4);
//     list.add(5);

//     int target = 5;
//     System.out.println(pairsum(list, target)); 
// }
// }

// Two pointer Approach

// import java.util.ArrayList;
// public class ArrayList1 {
//     public static Boolean pairsum(ArrayList<Integer> list, int target) {
//         int lp = 0;
//         int rp = list.size()-1;
//         while (lp != rp) {
//             if (list.get(lp) + list.get(rp) == target) {
//                 return true;
//             }
//             if (list.get(lp) + list.get(rp) < target) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<Integer>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         int target = 6;
 
//         System.out.println(pairsum(list, target));
//     }
// }



// PAIR SUM 2

import java.util.ArrayList;
public class ArrayList1 {
        public static boolean pairsum2(ArrayList<Integer> list,  int target) {
            int bp = -1;
            int n = list.size();
    for(int i = 1; i<list.size(); i++){
        if(list.get(i) > list.get(i+1)){
            bp = i;
            break;
        }
    }
     int lp = bp+1;
     int rp = bp;

    while (lp!=rp){
        if(list.get(lp) + list.get(rp) == target){
            return true;
        }
        if(list.get(lp) + list.get(rp) < target){
            lp = (lp +1) % n;
        }else{
            rp = (n+rp-1) % n;
        }
        
    }
    return false;
}

    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(11);
    list.add(15);
    list.add(6);
    list.add(8);
    list.add(9);
    list.add(10);
    int target = 16;
 
    System.out.println(pairsum2(list, target));
    }
}