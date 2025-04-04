// import java.util.*;
// class Node {
//     int data;
//     Node left, right;

//     public Node(int data) {
//         this.data = data;
//         this.left = this.right = null;
//     }
// }

// public class BinaryTree1 {
//     public static boolean isIdentical(Node node, Node subroot) {
//         if (node == null && subroot == null) {
//             return true; // both are null
//         }
//         if (node == null || subroot == null || node.data != subroot.data) {
//             return false; // one is null or data doesn't match
//         }
//         return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
//     }

//     public static boolean isSubtree(Node root, Node subroot) {
//         if (root == null) {
//             return false; // subtree -> false
//         }
//         if (isIdentical(root, subroot)) {
//             return true;
//         }
//         return isSubtree(root.left, subroot) || isSubtree(root.right, subroot); // subtree -> true
//     }

//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         Node subroot = new Node(2);
//         subroot.left = new Node(4);
//         subroot.right = new Node(5);

//         if (isSubtree(root, subroot)) {
//             System.out.println("Yes, it is a subtree");
//         } else {
//             System.out.println("No, it is not a subtree");
//         }

//         System.out.println("Is the tree identical? " + isIdentical(root, subroot));
      
//     }
// }



// kth level of binary tree:

// import java.util.*;
// class Node {
//     int data;
//     Node left, right;

//     public Node(int data) {
//         this.data = data;
//         this.left = this.right = null;
//     }
// }

// public class BinaryTree1 {
//     public static void klevel(Node root, int k, int level){
//         if(root == null){
//             return;
//         }
//         if(level  == k){
//             System.out.println(root.data);
//             return;
//         }
//         klevel(root.left , k, level+1);
//         klevel(root.right , k, level+1);
//         return;

//     }
//     public static void main(String[] args) {
//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//        int k = 3;
//        klevel(root, k, 1);

// }
// }


// Lowest common ancestor of binary tree:)

import java.util.*;
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class BinaryTree1 {
    public static Node lca(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
       if(root.data == n1 || root.data == n2){
        System.out.println(root.data);
        return root;
       }
         Node left = lca(root.left, n1, n2);
            Node right = lca(root.right, n1, n2);
        
        if(right == null){
            return left;
        }
        if(left == null){
            return right;
        }
        return root;


    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

       int n1 = 4;
       int n2 = 7;

       System.out.println(lca(root, n1, n2).data);
     

}
}
