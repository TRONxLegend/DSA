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

// import java.util.*;
// public class Heap1{
//     static class Student implements Comparable<Student>{
//         String name;
//         int rank;
//         public Student(String name, int rank){
//             this.name = name;
//             this.rank = rank;
//         }
//      @Override
//         public int compareTo(Student s){
//             return this.rank - s.rank;
//         }
//     }
//     public static void main(String args[]){
//         PriorityQueue<Student> pq = new PriorityQueue<>();
//        pq.add(new Student("Ayush",34));
//        pq.add(new Student("Anukriti",23));
//          pq.add(new Student("Lakhan",12));
//          pq.add(new Student("Anu",45));


//         while(!pq.isEmpty()){
//             System.out.println(pq.peek().name + " " + pq.peek().rank);
//             pq.remove();
//         }
//     }
// }


//             HEAP:-
        // import java.util.*;
        //   public class Heap1{
        //     static class Heap{
        //         ArrayList<Integer> arr= new ArrayList<>();
        //         public void add(int data){
        //             arr.add(data);
        //             int x =arr.size()-1;  // child index 
        //             int parent =(x-1)/2; // parent index
        //             while(arr.get(x) > arr.get(parent)){
        //                 int temp = arr.get(x);
        //                 arr.set(x, arr.get(parent));
        //                 arr.set(parent,temp);
        //                 x = parent; // move to parent index
        //                 parent = (x-1)/2; // update parent index

        //             }


        //         }
        //         public int peek(int data){
        //             return arr.get(0);
        //         }
        //         private void heapify(int i){
        //             int left =2*i+1;
        //             int right =2*i+2;
        //             int min = i;
        //             if(left < arr.size() && arr.get(left) < arr.get(min)){
        //                 min = left;
        //             }
        //             if(right < arr.size() && arr.get(min) <arr.get(right)){
        //                 min = right;
        //             }
        //             if(min != i){
        //                 int temp = arr.get(i);
        //                 arr.set(i,arr.get(min));
        //                 arr.set(min,temp);
        //                 heapify(min); // recursive call
        //             }
        //         }
        //        public int remove(){
        //         int data = arr.get(0);

        //         int temp = arr.get(0);
        //         arr.set(0,arr.get(arr.size()-1));
        //         arr.set(arr.size()-1,temp);

        //         arr.remove(arr.size()-1); // remove last element

        //         // step 3: heapify down
        //         heapify(0); // heapify from index 0
        //         return data;
        //        } 
        //         public boolean isEmpty(){
        //          return arr.size() == 0;
        //         }

        //     }
        //     public static void main(String args[]){
        //         Heap h = new Heap();
        //         h.add(5);
        //         h.add(3);
        //         h.add(4);
        //         h.add(1);
             

        //         while(!h.isEmpty()){
        //             System.out.println(h.peek(0));
        //             h.remove();
        //         }
        //     }
        //   }





        //               Heap Sort:-           //       

        import java.util.*;
        public class Heap1{
                public static void heapify(int arr[], int i,int n){
                        int left =2*i+1;
                        int right =2*i+2;
                        int max = i;
                        if(left < n && arr[left] > arr[max]){
                                max =left;
                        }
                        if(right < n && arr[right] > arr[max]){
                                max = right;
                        }
                        if(max !=i){
                                int temp = arr[i];
                                arr[i] = arr[max];
                                arr[max] = temp;
                                heapify(arr,max,n); // recursive call
                        }
                }
                public static void heapSort(int arr[]){
                        int n = arr.length;

                        // step 1: build heap: 
                        for(int i =n/2; i>=0; i--){
                                heapify(arr,i,n);
                        }
                       // step-2 : - Push largest element to end of array//
                       for(int i = n-1;i>0;i--){
                        int temp = arr[0];
                        arr[0]= arr[i];
                        arr[i] = temp;
                        heapify(arr,0,i);
                       }
                }
                public static void main(String arg[]){
                        int arr[] = {1,2,4,5,3};
                        heapSort(arr);
                        System.out.println("Sorted array is: ");
                        for(int i =0;i<arr.length;i++){
                                System.out.print(arr[i] + " ");
                        }
                        System.out.println();

                }
        }