import java.util.*;

public class Stack1 {
    static class Stack {
        ArrayList<Integer> list = new ArrayList<>(); // Removed static

        public boolean isEmpty() {
            return list.size() == 0;
        }

        // Push
        public void push(int data) {
            list.add(data);
            System.out.println(data + " pushed to stack");
        }

        // Pop
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1; // Return a default value to indicate an empty stack
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            System.out.println(top + " popped from stack");
            return top;
        }

        // Peek
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = list.get(list.size() - 1);
            System.out.println("Top element is " + top);
            return top;
        }
    }

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.peek();
    }
}


