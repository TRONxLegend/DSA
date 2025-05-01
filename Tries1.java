// //  Insert in Tries;

// public class Tries1{
//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;
   
//     Node(){
//         for(int i=0;i<26;i++){
//             children[i] = null;
//         }
//     }
// }
// public static Node root = new Node();
// public static void insert(String words){// TC -> O(L) where L is the length of the word:)
//     Node curr = root;
//     for(int level= 0; level<words.length(); level++){
//         int idx= words.charAt(level)-'a';
//         if(curr.children[idx]== null){
//             curr.children[idx] = new Node();
//         }
//         curr = curr.children[words.charAt(level)-'a'];
//     }
//     curr.eow = true;
//     }

// public static void main(String[] args){
//  String words[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
//  for(int i=0;i<words.length;i++){
//     insert(words[i]);
//  }

// }
// }





// Search in Tries:)



// public class Tries1{
//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;
//         Node(){
//             for(int i =0; i<26;i++){
//                 children[i] = null;

//             }

//         }
//     }
//     public static Node root = new Node();
//     public static void insert(String words){// TC -> O(L) where L is the length of the word:)
//         Node curr = root;
//         for(int level=0; level<words.length();level++){
//             int idx = words.charAt(level)-'a';
//             if(curr.children[idx]==null){
//                 curr.children[idx]=new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }
//     public static boolean search(String key){
//         Node curr = root;
//         for(int level=0;level<key.length();level++){
//             int idx = key.charAt(level)-'a';
//             if(curr.children[idx]==null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;

//         }
    
//     public static void main(String[] args){
//         String words[] = {"the", "a", "there", "answer", "any", "by", "bye", "their"};
       
//         for(int i=0;i<words.length;i++){
//             insert(words[i]);
//         }
        
//         System.out.println(search("any"));
//         System.out.println(search("hello"));
//     }
// }




//    WORD BREApublic class Tries1{


// public class Tries1{
//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;
//        public Node(){
//             for(int i =0; i<26;i++){
//                 children[i] = null;

//             }

//         }
//     }
//     public static Node root = new Node();
//     public static void insert(String words){// TC -> O(L) where L is the length of the word:)
//         Node curr = root;
//         for(int level=0; level<words.length();level++){
//             int idx = words.charAt(level)-'a';
//             if(curr.children[idx]==null){
//                 curr.children[idx]=new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }
//     public static boolean search(String key){
//         Node curr = root;
//         for(int level=0;level<key.length();level++){
//             int idx = key.charAt(level)-'a';
//             if(curr.children[idx]==null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;

//         }
    
//         public static boolean wordBreak(String key){
//             if(key.length() == 0){
//                 return true;
//             }
         
//             for(int i=1;i<=key.length();i++){
//                 /// substring(0,i) -> i is the length of the string
//                if(search( key.substring(0, i)) && wordBreak(key.substring(i))){
//                 return true;
//                }
                
//             }
//             return false;
//         }
//     public static void main(String[] args){
//         String words[] = {"i","like","sam","samsung","moblie","ice","cream"};
       
//         for(int i=0;i<words.length;i++){
//             insert(words[i]);
//         }

//         String key = "ilikesamsung";
        
//        System.out.println(wordBreak(key));
        
// }
// }  



//     Prefix Problem:)      //

// public class Tries1{
//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;
//         int freq;

//         public Node(){
//             for(int i=0; i<26;i++){
//                 children[i] = null;
            
//             }
//            freq = 1;
//         }
//     }
//     public static Node root = new Node();
//     public static void insert(String words){
//         Node curr = root;
//         for(int level = 0; level<words.length();level++){
//             int idx = words.charAt(level)-'a';
//             if(curr.children[idx] == null){
//                 curr.children[idx]= new Node();

//             }
//             else{
//                 curr.children[idx].freq++;
//             }
            
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }
//     public static boolean search(String key){
//         Node curr = root;
//         for(int level =0;level<key.length();level++){
//             int idx = key.charAt(level)-'a';
//             if(curr.children[idx] == null){
//                 return false;
//             }
//             else{
//                 if(curr.children[idx].freq == 1){
//                     return false;
//                 }
//             }
//             curr = curr.children[idx];
//         }
//         return curr.eow == true;
//     }
//     public static void main(String[] args){
//         String words[]={"zebra","dog","dove","duck","dove"};
//         for(int i=0;i<words.length ;i++){
//             insert(words[i]);
//         }
        
//     }
// }




//   Starts With Problem:)

// public class Tries1{
//     static class Node{
//         Node children[] = new Node[26];
//         boolean eow = false;
//         public Node(){
//             for(int i=0;i<26;i++){
//                 children[i] = null;
//             }
//         }
//     }
//     public static Node root = new Node();
//     public static void insert(String words){
//         Node curr = root;
//         for(int level =0 ;level<words.length();level++){
//             int idx = words.charAt(level)-'a';
//             if(curr.children[idx]==null){
//                 curr.children[idx] = new Node();
//             }
//             curr = curr.children[idx];
//         }
//         curr.eow = true;
//     }
//     public static boolean startwith(String Prefix){
//         Node curr = root;
//         for(int level = 0; level<Prefix.length();level++){
//             int idx = Prefix.charAt(level)-'a';
//             if(curr.children[idx]==null){
//                 return false;
//             }
//             curr = curr.children[idx];
//         }
//         return true;
//     }
//     public static void main(String[] args){
//         String words[] = {"apple","app","mango","man","woman"};
//         for(int i = 0; i<words.length;i++){
//             insert(words[i]);
//         }
//         String prefix = "man";
//         if(startwith(prefix)){
//             System.out.println("Yes, the prefix exists in the trie.");
//         }
//         else{
//             System.out.println("No, the prefix does not exist in the trie.");
//         }
//     }
// }


//  Unique SubStrings:)


