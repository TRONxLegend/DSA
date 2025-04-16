import java.util.*;
public class Heap1 {
    public static void main(String args[]){
        PriorityQueue<Integer> pg = new PriorityQueue<>();
        pg.add(1);
        pg.add(2);
        pg.add(3);
        pg.add(4);
        pg.add(5);
        pg.remove(3);

        System.out.println("Priority Queue: " + pg);
        System.out.println("After removing 3: " + pg);
    }
}
