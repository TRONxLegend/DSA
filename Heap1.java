// import java.util.*;
// public class Heap1 {
//     public static void main(String args[]){
//         PriorityQueue<Integer> pg = new PriorityQueue<>();
       
//         pg.add(4);
//         pg.add(5);
//         pg.add(1);
//         pg.add(2);
//         pg.add(3);

//         // System.out.println("Priority Queue: " + pg);
//         // System.out.println("After removing 3: " + pg);

//         while(!pg.isEmpty()){
//             System.out.println(pg.peek());
//             pg.remove();
//         }
//     }
// }


             // PQ For Objects

import java.util.*;
public class Heap1{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
     @Override
        public int compareTo(Student s){
            return this.rank - s.rank;
        }
    }
    public static void main(String args[]){
        PriorityQueue<Student> pq = new PriorityQueue<>();
       pq.add(new Student("Ayush",34));
       pq.add(new Student("Anukriti",23));
         pq.add(new Student("Lakhan",12));
         pq.add(new Student("Anu",45));


        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " " + pq.peek().rank);
            pq.remove();
        }
    }
}