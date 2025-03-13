import java.util.*;

public class Queue1 {
    static class Queue {
        int[] arr;
        int size;
        int rear;

        // Constructor inside Queue class
        Queue(int n) {
            arr = new int[n];  // Correctly initialize the array
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        // ADD OPERATION
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        // REMOVE OPERATION
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
            // Shift elements to left
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3); // Create a queue of size 3
        q.add(10);
        q.add(20);
        q.add(30);
        q.remove();
        System.out.println(q.remove()); // Should print 20
    }
}
