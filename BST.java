// public class BST {
//   static class Node{ // Node class
//     int data;
//     Node left;
//     Node right;
// Node(int data){    // Constructor
//     this.data=data;
// }
//   }
//   public static Node insert(Node root ,int val){  // Insert function
//     if(root == null){
//         root = new Node(val);
//         return root;
//     }

//     if(root.data > val){
//         root.left = insert(root.left, val);  // Recursive call to insert in left subtree
//     }

//     else{
//         root.right = insert(root.right, val); // Recursive call to insert in right subtree
//     }
//     return root;
//   }
//   public static void inorder(Node root){
//     if(root == null){
//         return;
//     }
//     inorder(root.left); // Traverse left subtree
//     System.out.print(root.data + " "); // Visit node
//     inorder(root.right); // Traverse right subtree
//   }
//   public static void main(String[] args) {
//     int values[] = {10, 5, 15, 3, 7, 12, 18};
//     Node root = null;
//     for(int i=0; i<values.length; i++){
//         root = insert(root, values[i]);
//     }
    
//     inorder(root);
//     System.out.println(); // Print a new line after inorder traversal
//     System.out.println("Inorder traversal of the BST is complete.");    

   
//   }

// }
   


          //  SEARCHING IN BST:-

// public class BST{
//     static class Node{ // Node class
//     int data;
//     Node left;
//     Node right;
   
//     Node(int data){
//         this.data = data;

//     }
//     }
//     public static Node insert(Node root , int val){
//         if(root == null){
//             root = new Node(val);
//             return root;
//         }
//         if(root.data > val ){
//             root.left = insert(root.left, val);
//         }
//         else{
//             root.right = insert(root.right, val);
//         }
//         return root;
//     }
//     public static void inorder(Node root){
//         if(root == null){
//             return;
//         }
//         inorder(root.left); // Traverse left subtree
//         System.out.print(root.data + " "); // Visit node
//         inorder(root.right); // Traverse right subtree
//     }

//     public static boolean search(Node root, int key){
//         if(root == null){
//             return false; // Base case: key not found
//         }
//         if(root.data == key){
//             return true; // Key found
//         }
//         if(root.data > key){
//             return search(root.left, key);
//         }
//         else{
//             return search(root.right, key);
//         }

//     }
    
//   public static void main (String[] args){
//     int values[] = {10, 5, 15, 3, 7, 12, 18};
//     Node root = null;
//     for(int i=0; i<values.length; i++){
//         root = insert(root, values[i]);
//     }
    
//     inorder(root);
//     System.out.println(); // Print a new line after inorder traversal
//     System.out.println("Inorder traversal of the BST is complete.");    

//     // Searching in BST
//     int searchValue = 20;
//     boolean found = search(root, searchValue);
//     if(found){
//         System.out.println("Value " + searchValue + " found in the BST.");
//     } else {
//         System.out.println("Value " + searchValue + " not found in the BST.");
//     }
//     System.out.println(); // Print a new line after searching
//   }
// }          



            //  PRINT IN RANGE:-

            // public class BST{
            //     static class Node{ // Node class
            //     int data;
            //     Node left;
            //     Node right;
               
            //     Node(int data){
            //         this.data = data;
            
            //     }
            //     }
            //     public static Node insert(Node root , int val){
            //         if(root == null){
            //             root = new Node(val);
            //             return root;
            //         }
            //         if(root.data > val ){
            //             root.left = insert(root.left, val);
            //         }
            //         else{
            //             root.right = insert(root.right, val);
            //         }
            //         return root;
            //     }
            //     public static void inorder(Node root){
            //         if(root == null){
            //             return;
            //         }
            //         inorder(root.left); // Traverse left subtree
            //         System.out.print(root.data + " "); // Visit node
            //         inorder(root.right); // Traverse right subtree
            //     }
            
            //     public static boolean search(Node root, int key){
            //         if(root == null){
            //             return false; // Base case: key not found
            //         }
            //         if(root.data == key){
            //             return true; // Key found
            //         }
            //         if(root.data > key){
            //             return search(root.left, key);
            //         }
            //         else{
            //             return search(root.right, key);
            //         }
            
            //     }

            //     public static void printInRange(Node root, int low, int high) {
            //         if (root == null) {
            //             return; // Base case: empty subtree
            //         }
            
            //         // Traverse left subtree if the current node's value is greater than low
            //         if (root.data > low) {
            //             printInRange(root.left, low, high);
            //         }
            
            //         // Print the current node's value if it is within the range [low, high]
            //         if (root.data >= low && root.data <= high) {
            //             System.out.print(root.data + " ");
            //         }
            
            //         // Traverse right subtree if the current node's value is less than high
            //         if (root.data < high) {
            //             printInRange(root.right, low, high);
            //         }
            //     }
                
            //   public static void main (String[] args){
            //     int values[] = {10, 5, 15, 3, 7, 12, 18};
            //     Node root = null;
            //     for(int i=0; i<values.length; i++){
            //         root = insert(root, values[i]);
            //     }
                
            //     inorder(root);
            //     System.out.println(); // Print a new line after inorder traversal
            //     System.out.println("Inorder traversal of the BST is complete.");    
            
            //     // Searching in BST
            //     int searchValue = 20;
            //     boolean found = search(root, searchValue);
            //     if(found){
            //         System.out.println("Value " + searchValue + " found in the BST.");
            //     } else {
            //         System.out.println("Value " + searchValue + " not found in the BST.");
            //     }
            //     System.out.println(); // Print a new line after searching

            //     // Print nodes in the range [4, 15]

            //     System.out.println("Nodes in the range [4, 10]:");
            //     printInRange(root, 4, 10);
            //     System.out.println(); // Print a new line after printing range
            //   }
            // }    

//               DELETE A NODE IN BST:-

            // public class BST{
            //     static class Node{ // Node class
            //     int data;
            //     Node left;
            //     Node right;
               
            //     Node(int data){
            //         this.data = data;
            
            //     }
            //     }
            //     public static Node insert(Node root , int val){
            //         if(root == null){
            //             root = new Node(val);
            //             return root;
            //         }
            //         if(root.data > val ){
            //             root.left = insert(root.left, val);
            //         }
            //         else{
            //             root.right = insert(root.right, val);
            //         }
            //         return root;
            //     }
            //     public static void inorder(Node root){
            //         if(root == null){
            //             return;
            //         }
            //         inorder(root.left); // Traverse left subtree
            //         System.out.print(root.data + " "); // Visit node
            //         inorder(root.right); // Traverse right subtree
            //     }
            
            //     public static boolean search(Node root, int key){
            //         if(root == null){
            //             return false; // Base case: key not found
            //         }
            //         if(root.data == key){
            //             return true; // Key found
            //         }
            //         if(root.data > key){
            //             return search(root.left, key);
            //         }
            //         else{
            //             return search(root.right, key);
            //         }
            
            //     }

            //     public static void printInRange(Node root, int low, int high) {
            //         if (root == null) {
            //             return; // Base case: empty subtree
            //         }
            
            //         // Traverse left subtree if the current node's value is greater than low
            //         if (root.data > low) {
            //             printInRange(root.left, low, high);
            //         }
            
            //         // Print the current node's value if it is within the range [low, high]
            //         if (root.data >= low && root.data <= high) {
            //             System.out.print(root.data + " ");
            //         }
            
            //         // Traverse right subtree if the current node's value is less than high
            //         if (root.data < high) {
            //             printInRange(root.right, low, high);
            //         }
            //     }

            //     public static Node delete(Node root, int val){
            //         if(root.data < val){
            //             root.data = delete(root.right, val);
            //         }
            //     else if(root.data > val){
            //         root.data = delete(root.left, val);
            //     }
            //     else{
            //         // CASE 1: Leaf Node

            //     }
            //     }

                
            //   public static void main (String[] args){
            //     int values[] = {10, 5, 15, 3, 7, 12, 18};
            //     Node root = null;
            //     for(int i=0; i<values.length; i++){
            //         root = insert(root, values[i]);
            //     }
                
            //     inorder(root);
            //     System.out.println(); // Print a new line after inorder traversal
            //     System.out.println("Inorder traversal of the BST is complete.");    
            
            //     // Searching in BST
            //     int searchValue = 20;
            //     boolean found = search(root, searchValue);
            //     if(found){
            //         System.out.println("Value " + searchValue + " found in the BST.");
            //     } else {
            //         System.out.println("Value " + searchValue + " not found in the BST.");
            //     }
            //     System.out.println(); // Print a new line after searching

            //     // Print nodes in the range [4, 15]

            //     System.out.println("Nodes in the range [4, 10]:");
            //     printInRange(root, 4, 10);
            //     System.out.println(); // Print a new line after printing range
            //   }
            // }    


        // PRINT ROOT TO LEAF PATHS:-
//         import java.nio.file.Path;
// import java.util.*;
//         public class BST{
//             static class Node{ // Node class
//             int data;
//             Node left;
//             Node right;
           
//             Node(int data){
//                 this.data = data;
        
//             }
//             }
//             public static Node insert(Node root , int val){
//                 if(root == null){
//                     root = new Node(val);
//                     return root;
//                 }
//                 if(root.data > val ){
//                     root.left = insert(root.left, val);
//                 }
//                 else{
//                     root.right = insert(root.right, val);
//                 }
//                 return root;
//             }
//             public static void inorder(Node root){
//                 if(root == null){
//                     return;
//                 }
//                 inorder(root.left); // Traverse left subtree
//                 System.out.print(root.data + " "); // Visit node
//                 inorder(root.right); // Traverse right subtree
//             }
        
//             public static boolean search(Node root, int key){
//                 if(root == null){
//                     return false; // Base case: key not found
//                 }
//                 if(root.data == key){
//                     return true; // Key found
//                 }
//                 if(root.data > key){
//                     return search(root.left, key);
//                 }
//                 else{
//                     return search(root.right, key);
//                 }
        
//             }

//             public static void printInRange(Node root, int low, int high) {
//                 if (root == null) {
//                     return; // Base case: empty subtree
//                 }
        
//                 // Traverse left subtree if the current node's value is greater than low
//                 if (root.data > low) {
//                     printInRange(root.left, low, high);
//                 }
        
//                 // Print the current node's value if it is within the range [low, high]
//                 if (root.data >= low && root.data <= high) {
//                     System.out.print(root.data + " ");
//                 }
        
//                 // Traverse right subtree if the current node's value is less than high
//                 if (root.data < high) {
//                     printInRange(root.right, low, high);
//                 }
//             }
//             public static void printpath(ArrayList<Integer> path){
//                 for(int i = 0 ; i<path.size(); i++){
//                     System.out.print(path.get(i) + "->");
//                 }
//                 System.out.println("null");
//             }

//             public static void printroot2lead(Node root , ArrayList<Integer> path){
//                 if(root == null){
//                     return;
//                 }
//                 path.add(root.data);
//                 if(root.left == null && root.right == null){
//                     printpath(path);
//                 }
//                 else{ printroot2lead( root.left, path);
//                     printroot2lead( root.right, path);}
               
//                 path.remove(path.size()-1);
//             }


            
//           public static void main (String[] args){
//             int values[] = {10, 5, 15, 3, 7, 12, 18};
//             Node root = null;
//             for(int i=0; i<values.length; i++){
//                 root = insert(root, values[i]);
//             }
            
//             inorder(root);
//             System.out.println(); // Print a new line after inorder traversal
//             System.out.println("Inorder traversal of the BST is complete.");    
        
//             // Searching in BST
//             int searchValue = 20;
//             boolean found = search(root, searchValue);
//             if(found){
//                 System.out.println("Value " + searchValue + " found in the BST.");
//             } else {
//                 System.out.println("Value " + searchValue + " not found in the BST.");
//             }
//             System.out.println(); // Print a new line after searching

//             // Print nodes in the range [4, 15]

//             System.out.println("Nodes in the range [4, 10]:");
//             printInRange(root, 4, 10);
//             System.out.println(); // Print a new line after printing range

//             printroot2lead(root, new ArrayList<>());
//             System.out.println("Root to leaf paths printed successfully.");

//           }

//         }    



            //  Validate BST:-

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

                public static boolean isValidBST(Node root , Node min, Node max){
                    if(root == null){
                        return true;
                    }
                    if(min != null && root.data <= min.data){
                        return false;
                    }
                    if(max != null && root.data >= max.data){
                        return false;
                    }
                    return isValidBST(root.left, min, root) &&
                            isValidBST(root.right, root, max);
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
              
                  if(isValidBST(root, null, null)){
                        System.out.println("The tree is not a valid BST.");
                    }
                    else{
                        System.out.println("The tree is a valid BST.");
                  }
                }
              
              }
                 