// Operations of Hash Map:-  

// import java.util.*;
// public class Hash1 {
//     public static void main(String[] args){
//         HashMap<String, Integer > map = new HashMap<>();// Creation of HashMap
//         // Insertion of key-value pairs :) put() method
//         // T.C :) O(1) on average case and O(n) in worst case.
//         map.put("Ayush",1);
//         map.put("Anukriti",2);
//         map.put("Lakhan",3);
//         map.put("Anu",4);
//         System.out.println(map);

//         // get() - To retrieve the value associated with a specific key.
//         // T.C :) (1);
//         int data = map.get("Ayush");
//         System.out.println(data);

//         // containsKey() - To check if a specific key exists in the hash map.
//         // T.C :) O(1);
//         boolean check = map.containsKey("Anukriti");
//         System.out.println(check);

//         // remove() - To remove a key-value pair from the hash map.
//         // T.C :) O(1);
//         map.remove("Anu");
//         System.out.println(map);
//     }
// }


// Iterations on HashMap:)

// import java.util.*;
// public class Hash1{
//     public static void main(String[] args){
//         HashMap<String , Integer> map = new HashMap<>();
//         map.put("India",100);
//         map.put("USA",200);
//         map.put("China",300);
//         map.put("Nepal",400);
//         map.put("Bhutan",500);
//         System.out.println(map);
//         // Iterating on HashMap
//         // T.C :) O(n) in worst case
//      Set<String>keys = map.keySet();
//      System.out.println(keys);
//      for (String s : keys) {
//         System.out.println("key" + s + "value= "+ map.get(s));
//      }
//     }
// }


// HASHMAP IMPLEMENTATION CODE :)
// import java.util.*;
// public class Hash1{
//   static class HashMap<K,V>{
//     private class Node{
//         K key;
//         V value;

//         public Node(K key, V value){
//             this.key = key;
//             this.value = value;
//         }
//     }
//         private int size;//n 
//         private LinkedList<Node>buckets[]; //N
//         @SuppressWarnings("unchecked")
//         public HashMap(){
//             this.size = 0;
//             this.buckets = new LinkedList<>();
//             for(int i = 0; i<4; i++){
//                 this.buckets[i] = new LinkedList<>();
//             }
//             }
//             private int hashFunction(K key){
//               int hc = key.hashCode();
//               return Math.abs(hc) % size;
//             }
//             public void put(K key, V value){
//             int bi = hashFunction(key);
//             int di = SearchinLL(key);// vaild index / -1:
//             }
//             public boolean containsKey(K key){
//                 return false;
//             }
        
    
//   }
// }


// Linked HashMap Implementation :)
// import java.util.*;
// public class Hash1{
// public static void main(String[] args){
//     LinkedHashMap<String , Integer> map = new LinkedHashMap<>();
//     map.put("India",100);
//     map.put("USA",200);
//     map.put("China",300);
//     map.put("Russia",400);
//     map.put("UK",500);
//     System.out.println(map);
//     int check = map.get("India");
//     System.out.println(check);
//     System.out.println(map.containsKey("Nepal"));
//     System.out.println(map.size());;
// }
// }


// Tree Map Implementation :)
// import java.util.*;
// public class Hash1{
//     public static void main(String[] args){
//         TreeMap<String , Integer> map = new TreeMap<>();
//     map.put("Ayush",2);
//     map.put("Anukriti",1);
//     map.put("Lakhan",3);
//     map.put("Anu",4);
//     System.out.println(map); 
//     int find = map.get("Ayush");
//     System.out.println(find);
//     System.out.println(map.containsKey("Anukriti"));
//     System.out.println(map.size());   
// }
// }


//  HashSet Implementation :)
import java.util.*;
public class Hash1{
    public static void main(String[] args){
        HashSet<String> set = new HashSet<>();
        set.add("Ayush");
        set.add("Anukriti");
        set.add("Lakhan");
        set.add("Anu");
        System.out.println(set);
        System.out.println(set.contains("Ayush"));
        System.out.println(set.size());
        set.remove("Anukriti");
        System.out.println(set);

    }
}