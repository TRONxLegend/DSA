// Operations of Hash Map:-  

// 1. put() - To insert a key-value pair into the hash map.
import java.util.*;
public class Hash1 {
    public static void main(String[] args){
        HashMap<String, Integer > map = new HashMap<>();// Creation of HashMap
        // Insertion of key-value pairs :) put() method
        // T.C :) O(1) on average case and O(n) in worst case.
        map.put("Ayush",1);
        map.put("Anukriti",2);
        map.put("Lakhan",3);
        map.put("Anu",4);
        System.out.println(map);

        // get() - To retrieve the value associated with a specific key.
        // T.C :) (1);
        int data = map.get("Ayush");
        System.out.println(data);

        // containsKey() - To check if a specific key exists in the hash map.
        // T.C :) O(1);
        boolean check = map.containsKey("Anukriti");
        System.out.println(check);

        // remove() - To remove a key-value pair from the hash map.
        // T.C :) O(1);
        map.remove("Anu");
        System.out.println(map);
    }
}
