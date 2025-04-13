public class BST {
  static class Node{ // Node class
    int data;
    Node left;
    Node right;
Node(int data){    // Constructor
    this.data=data;
}
  }
  public static Node insert(Node root ,int val){  // Insert function
    if(root == null){
        root = new Node(val);
        return root;
    }

    if(root.data > val){
        root.left = insert(root.left, val);  // Recursive call to insert in left subtree
    }

    else{
        root.right = insert(root.right, val); // Recursive call to insert in right subtree
    }
    return root;
  }
  public static void inorder(Node root){
    if(root == null){
        return;
    }
    inorder(root.left); // Traverse left subtree
    System.out.print(root.data + " "); // Visit node
    inorder(root.right); // Traverse right subtree
  }
  public static void main(String[] args) {
    int values[] = {10, 5, 15, 3, 7, 12, 18};
    Node root = null;
    for(int i=0; i<values.length; i++){
        root = insert(root, values[i]);
    }
    
    inorder(root);
    System.out.println(); // Print a new line after inorder traversal
    System.out.println("Inorder traversal of the BST is complete.");    
    
   
  }

}
   