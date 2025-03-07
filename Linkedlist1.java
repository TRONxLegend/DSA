// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(1);
//         list.print();
//         list.addFirst(2);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//     }
// }



// Add in the Middle of Linkedlist:-

// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//     }
// }


// SIZE OF THE LINKEDLIST:-

// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//         System.out.println("Size of the Linkedlist is:- "+size);
//     }
// }


// DELETE FIRST ELEMENT OF THE LINKEDLIST:-
// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

// public int removefirst(){
//     int val = head.data;
//     head =head.next;
//     size--;
//     return val;
// }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//         System.out.println("Size of the Linkedlist is:- "+size);
//         System.out.println("Deleted Element is:- "+list.removefirst());
//         list.print();
//         System.out.println("Size of the Linkedlist after deletion is:- "+size);
//     }
// }



// DELETE LAST ELEMENT OF THE LINKEDLIST:-

// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

// public int removefirst(){
//     int val = head.data;
//     head =head.next;
//     size--;
//     return val;
// }

// public int removelast(){
//     Node prev = head;
//     for(int i = 0; i < size-2; i++){
//         prev = prev.next;
//     }
//     int val = prev.next.data;
//     prev.next = null;
//     tail = prev;
//     size--;
//     return val;
// }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//         System.out.println("Size of the Linkedlist is:- "+size);
//         System.out.println("Deleted Element is:- "+list.removefirst());
//         list.print();
//         System.out.println("Size of the Linkedlist after deletion is:- "+size);
//         System.out.println("Deleted Element is:- "+list.removelast());
//         list.print();
//         System.out.println("Size of the Linkedlist after deletion is:- "+size);

//     }
// }

// ITERATIVE SEARCH TO FIND THE KEY IN LINKEDLIST :-)

// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

// public int removefirst(){
//     int val = head.data;
//     head =head.next;
//     size--;
//     return val;
// }

// public int search(int key){
//     int i= 0;
//     Node temp = head;
//     while(temp != null){
//         if(temp.data == key){
//             return i;
//         }
//         temp = temp.next;
//         i++;
//     }
//     return -1;
// }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//         // System.out.println("Size of the Linkedlist is:- "+size);
//         // System.out.println("Deleted Element is:- "+list.removefirst());
//         // list.print();
//         // System.out.println("Size of the Linkedlist after deletion is:- "+size);
//         // System.out.println("Deleted Element is:- "+list.removelast());
//         // list.print();
//         // System.out.println("Size of the Linkedlist after deletion is:- "+size);
//         System.out.println("Element is present at index:- "+list.search(3));
//         System.out.println("Element is present at index:- "+list.search(6));

//     }
// }

// RECURSIVE SEARCH TO FIND THE KEY IN LINKEDLIST :-)

// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

// public int removefirst(){
//     int val = head.data;
//     head =head.next;
//     size--;
//     return val;
// }
// public int helper(Node head,int key){
//  if(head == null){
//         return -1;
//  }
//  if(head.data == key){
//      return 0;
//  }
//  int idx = helper(head.next,key);
//     if(idx == -1){
//         return -1;
//     }
//     return idx+1;
// }
// public int rsearch(int key){
//  return helper(head,key);
// }

//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//         System.out.println("Size of the Linkedlist is:- "+size);
//         System.out.println("Deleted Element is:- "+list.removefirst());
//         list.print();
//         System.out.println("Size of the Linkedlist after deletion is:- "+size);
//         System.out.println("Element is present at index:- "+list.rsearch(3));
//         System.out.println("Element is present at index:- "+list.rsearch(6));
//     }
// }


// REVERSE A LINKEDLIST :-)

// import java.util.*;

// public class Linkedlist1 {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if (head == null) {
//             head = tail = newNode;  // Fixed: Use newNode instead of creating a new Node instance
//             return;
//         }
//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null"); // Indicate end of the list
//     }

// public void addmiddle(int idx,int data){
//     Node newNode = new Node(data);
//     size++;
//     Node temp = head;
//     int i = 0;
//     while(i<idx-1){
//         temp = temp.next;
//         i++;
//     }
//     newNode.next = temp.next;
//     temp.next = newNode;
// }

// public int removefirst(){
//     int val = head.data;
//     head =head.next;
//     size--;
//     return val;
// }
// public int helper(Node head,int key){
//  if(head == null){
//         return -1;
//  }
//  if(head.data == key){
//      return 0;
//  }
//  int idx = helper(head.next,key);
//     if(idx == -1){
//         return -1;
//     }
//     return idx+1;
// }
// public int rsearch(int key){
//  return helper(head,key);
// }


//     public void reverse(){
//       Node prev = null;
//       Node curr =tail = head;
//       Node next;

//       while(curr != null){
//         next =curr.next;
//         curr.next = prev;
//         prev = curr;
//         curr = next;

//       }
//         head = prev;
        

//     }


//     public static void main(String args[]) {
//         Linkedlist1 list = new Linkedlist1();
//         list.addFirst(2);
//         list.print();
//         list.addFirst(1);
//         list.print();
//         list.addLast(3);
//         list.print();
//         list.addLast(4);
//         list.print();
//         list.addmiddle(2,5);
//         list.print();
//         System.out.println("Size of the Linkedlist is:- "+size);
//         // System.out.println("Deleted Element is:- "+list.removefirst());
//         // list.print();
//         // System.out.println("Size of the Linkedlist after deletion is:- "+size);
//         // System.out.println("Element is present at index:- "+list.rsearch(3));
//         // System.out.println("Element is present at index:- "+list.rsearch(6));
//         list.reverse();
//         list.print();

//     }
// }



// FIND AND REMOVE NTH NODE FROM END OF LINKEDLIST :-)

