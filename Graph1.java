// import java.util.*;
// public class Graph1 {
//  static class Edge{
//      int src;
//      int dest;
//      int wt;

//      public Edge(int s, int d, int w){
//         this.src = s;
//         this.dest = d;
//         this.wt = w;
//      }
//  }
//     public static void main(String[] args){
//       int v = 5;
//       ArrayList<Edge> graph[] = new ArrayList[v]; // null -> empty Arralist
//       for(int i = 0; i < v; i++){
//         graph[i] = new ArrayList<>(); // empty ArrayList
//       }
//       // 0 :-
//       graph[0].add(new Edge(0, 1, 5));

//       // 1:-
//       graph[1].add(new Edge(1, 0, 5));
//       graph[1].add(new Edge(1, 2, 1));
//       graph[1].add(new Edge(1, 3, 3));

//       // 2:-
//       graph[2].add(new Edge(2, 1, 1));
//       graph[2].add(new Edge(2, 3, 1));
//       graph[2].add(new Edge(2, 4, 2));

//      // 3:-
//         graph[3].add(new Edge(3, 1, 3));
//         graph[3].add(new Edge(3, 2, 1));

//     // 4:-
//         graph[4].add(new Edge(4, 2, 2));

//         // Neighbours of 1
//         for(int i = 0 ; i<graph[1].size(); i++){
//             Edge e= graph[1].get(i);
//             System.out.println("Source: " + e.src + " Destination: " + e.dest + " Weight: " + e.wt);
//  }

//     }
// } 

//   BFS

// import java.util.*;

// public class Graph1 {

//   static class Edge {
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w) {
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }
//   }

//   static void createGraph(ArrayList<Edge>[] graph) {
//     for (int i = 0; i < graph.length; i++) {
//       graph[i] = new ArrayList<>();
//     }

//     // 0 :-
//     graph[0].add(new Edge(0, 1, 5));

//     // 1:-
//     graph[1].add(new Edge(1, 0, 5));
//     graph[1].add(new Edge(1, 2, 1));
//     graph[1].add(new Edge(1, 3, 3));

//     // 2:-
//     graph[2].add(new Edge(2, 1, 1));
//     graph[2].add(new Edge(2, 3, 1));
//     graph[2].add(new Edge(2, 4, 2));

//     // 3:-
//     graph[3].add(new Edge(3, 1, 3));
//     graph[3].add(new Edge(3, 2, 1));

//     // 4:-
//     graph[4].add(new Edge(4, 2, 2));
//   }

//   public static void bfs(ArrayList<Edge>[] graph) {
//     Queue<Integer> q = new LinkedList<>();
//     boolean vis[] = new boolean[graph.length];
//     q.add(0);

//     while (!q.isEmpty()) {
//       int curr = q.remove();
//       if (!vis[curr]) {
//         System.out.println(curr);
//         vis[curr] = true;

//         for (Edge e : graph[curr]) {
//           q.add(e.dest);
//         }
//       }
//     }
//   }

//   public static void main(String[] args) {
//     int v = 5;
//     ArrayList<Edge>[] graph = new ArrayList[v]; // null -> empty ArrayList
//     createGraph(graph);
//     System.out.println("BFS Traversal:");
//     bfs(graph);
//   }
// }



// DFS:

// import java.util.*;

// public class Graph1 {

//   static class Edge {
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w) {
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }
//   }

//   static void createGraph(ArrayList<Edge>[] graph) {
//     for (int i = 0; i < graph.length; i++) {
//       graph[i] = new ArrayList<>();
//     }

//     // 0 :-
//     graph[0].add(new Edge(0, 1, 5));

//     // 1:-
//     graph[1].add(new Edge(1, 0, 5));
//     graph[1].add(new Edge(1, 2, 1));
//     graph[1].add(new Edge(1, 3, 3));

//     // 2:-
//     graph[2].add(new Edge(2, 1, 1));
//     graph[2].add(new Edge(2, 3, 1));
//     graph[2].add(new Edge(2, 4, 2));

//     // 3:-
//     graph[3].add(new Edge(3, 1, 3));
//     graph[3].add(new Edge(3, 2, 1));

//     // 4:-
//     graph[4].add(new Edge(4, 2, 2));
//   }

// public static void dfs(ArrayList<Edge>[] graph, int curr , boolean vis[]) {
//     System.out.println(curr);
//     vis[curr] = true;

//     for (Edge e : graph[curr]) {
//       if (!vis[e.dest]) {
//         dfs(graph, e.dest, vis);
//       }
//     }
//   }

//   public static void dfs(ArrayList<Edge>[] graph) {
//     boolean vis[] = new boolean[graph.length];
//     dfs(graph, 0, vis);

// }
//   public static void main(String[] args) {
//     int v = 5;
//     ArrayList<Edge>[] graph = new ArrayList[v]; // null -> empty ArrayList
//     createGraph(graph);
//     System.out.println("DFS Traversal:");
//     dfs(graph);
//   }
// }



// Question 1: HAS PATH OR NOT:)    //

// import java.util.*;

// public class Graph1 {
//   static class Edge {
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w) {
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }
//   }

//   public static void createGraph(ArrayList<Edge>[] graph) {
//     for (int i = 0; i < graph.length; i++) {
//       graph[i] = new ArrayList<>();
//     }

//     graph[0].add(new Edge(0, 1, 5));

//     graph[1].add(new Edge(1, 0, 5));
//     graph[1].add(new Edge(1, 2, 1));
//     graph[1].add(new Edge(1, 3, 3));

//     graph[2].add(new Edge(2, 1, 1));
//     graph[2].add(new Edge(2, 3, 1));
//     graph[2].add(new Edge(2, 4, 2));

//     graph[3].add(new Edge(3, 1, 3));
//     graph[3].add(new Edge(3, 2, 1));

//     graph[4].add(new Edge(4, 2, 2));
//   }

//   public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, List<Integer> path) {
//     path.add(src);
//     if (src == dest) {
//       return true;
//     }

//     vis[src] = true;

//     for (int i = 0; i < graph[src].size(); i++) {
//       Edge e = graph[src].get(i);
//       if (!vis[e.dest]) {
//         if (hasPath(graph, e.dest, dest, vis, path)) {
//           return true;
//         }
//       }
//     }

//     path.remove(path.size() - 1); // Backtrack
//     return false;
//   }

//   public static void main(String[] args) {
//     int v = 5;
//     ArrayList<Edge>[] graph = new ArrayList[v];
//     createGraph(graph);

//     boolean[] vis = new boolean[v];
//     List<Integer> path = new ArrayList<>();

//     if ((()hasPath(graph, 0, 4
//         ), vis, path)) {
//       System.out.println("Path exists from 0 to 4");
//       System.out.println("Path: " + path);
//     } else {
//       System.out.println("No path exists from 0 to 4");
//     }
//   }
// }




// Connected Components

// import java.util.*;

// public class Graph1 {

//   static class Edge {
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w) {
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }
//   }

//   static void createGraph(ArrayList<Edge>[] graph) {
//     for (int i = 0; i < graph.length; i++) {
//       graph[i] = new ArrayList<>();
//     }

//     // Component 1
//     graph[0].add(new Edge(0, 1, 5));
//     graph[1].add(new Edge(1, 0, 5));
//     graph[1].add(new Edge(1, 2, 1));
//     graph[2].add(new Edge(2, 1, 1));

//     // Component 2
//     graph[3].add(new Edge(3, 4, 1));
//     graph[4].add(new Edge(4, 3, 1));
//   }

//   public static void bfs(ArrayList<Edge>[] graph) {
//     boolean[] vis = new boolean[graph.length];
//     int count = 0;

//     for (int i = 0; i < graph.length; i++) {
//       if (!vis[i]) {
//         System.out.println("Connected Component " + (++count) + ":");
//         bfsutil(graph, vis, i); // ✅ FIXED: pass i
//         System.out.println();
//       }
//     }
//     System.out.println("Total Connected Components: " + count);
//   }

//   public static void bfsutil(ArrayList<Edge>[] graph, boolean[] vis, int start) {
//     Queue<Integer> q = new LinkedList<>();
//     q.add(start);
//     vis[start] = true;

//     while (!q.isEmpty()) {
//       int curr = q.poll();
//       System.out.print(curr + " ");

//       for (Edge e : graph[curr]) {
//         if (!vis[e.dest]) {
//           q.add(e.dest);
//           vis[e.dest] = true;
//         }
//       }
//     }
//   }

//   public static void main(String[] args) {
//     int v = 5;
//     ArrayList<Edge>[] graph = new ArrayList[v];
//     createGraph(graph);

//     System.out.println("BFS Traversal and Connected Components:");
//     bfs(graph);
//   }
// }



// Connected Components using DFS:-


// import java.util.*;

// public class Graph1 {

//   static class Edge {
//     int src;
//     int dest;
//     int wt;

//     public Edge(int s, int d, int w) {
//       this.src = s;
//       this.dest = d;
//       this.wt = w;
//     }
//   }

//   static void createGraph(ArrayList<Edge>[] graph) {
//     for (int i = 0; i < graph.length; i++) {
//       graph[i] = new ArrayList<>();
//     }

//     // 0 :-
//     graph[0].add(new Edge(0, 1, 5));

//     // 1:-
//     graph[1].add(new Edge(1, 0, 5));
//     graph[1].add(new Edge(1, 2, 1));
//     graph[1].add(new Edge(1, 3, 3));

//     // 2:-
//     graph[2].add(new Edge(2, 1, 1));
//     graph[2].add(new Edge(2, 3, 1));
//     graph[2].add(new Edge(2, 4, 2));

//     // 3:-
//     graph[3].add(new Edge(3, 1, 3));
//     graph[3].add(new Edge(3, 2, 1));

//     // 4:-
//     graph[4].add(new Edge(4, 2, 2));
//   }

// public static void dfsUtil(ArrayList<Edge>[] graph, int curr , boolean vis[] ) {
//     System.out.println(curr);
//     vis[curr] = true;
    
//     for (Edge e : graph[curr]) {
//       if (!vis[e.dest]) {
//         dfsUtil(graph, e.dest, vis);
//       }
//     }
//   }

//   public static void dfs(ArrayList<Edge>[] graph) {
//     boolean vis[] = new boolean[graph.length];
//     int count = 0;
//     for(int i =0 ; i<graph.length; i++){
//       if(!vis[i]){
//         System.out.println("Connected Component " + (++count) + ":");
//         dfsUtil(graph, i, vis);
//         System.out.println();
//       }
//     }
//     System.out.println("Total Connected Components: " + count);
// }
//   public static void main(String[] args) {
//     int v = 5;
//     ArrayList<Edge>[] graph = new ArrayList[v]; // null -> empty ArrayList
//     createGraph(graph);
//     System.out.println("DFS Traversal:");
//     dfs(graph);
//   }
// }


// Bipartite Graph :- Done By Using Graph Colouring Using BFS...
// import java.util.*;
// public class Graph1{
//     static class Edge{
//         int src;
//         int dest;
//         public Edge(int s, int d) {
//             this.src = s;
//             this.dest = d;
//         }
//     }

// public static void createGraph(ArrayList<Edge>[] graph){
//     for(int i = 0; i< graph.length; i++){
//         graph[i] = new ArrayList<>();
//     }
//     graph[0].add(new Edge(0,1));
//     graph[0].add(new Edge(0,2));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,4));

//     graph[3].add(new Edge(3,1));
//     graph[3].add(new Edge(3,4));

//     graph[4].add(new Edge(4,2));
//     graph[4].add(new Edge(4,3));
// }

// public static boolean isBipartite(ArrayList<Edge>[] graph){
//     boolean vis[] = new boolean[graph.length];
//     int col[] = new int[graph.length];
//     for(int i = 0; i<col.length; i++){
//         col[i] = -1;
//     }
//     Queue<Integer> q =new LinkedList<>();
//     for(int i = 0; i<graph.length; i++){
//         if(col[i] == -1){
//             q.add(i);
//             col[i] = 0;
//             vis[i] = true;
//             while(!q.isEmpty()){
//                 int curr = q.remove();
//                 for(int j = 0; j<graph[curr].size(); j++){
//                     Edge e = graph[curr].get(j);
//                     if(col[e.dest] == -1){
//                         col[e.dest] = 1 - col[curr];
//                         q.add(e.dest);
//                 }
//                 else if(col[e.dest] == col[curr]){
//                     return false;
//                 }

//             }
//         }
//     } 
// }
// return true;
// }

// public static void main(String[] args){
//     int V = 5;
//     ArrayList<Edge>[] graph = new ArrayList[V];
//     createGraph(graph);
//     System.out.println("Bipartite Graph: " + isBipartite(graph));
// }

// }




//   Topological Sort:-

// import java.util.*;
// public class Graph1{
//     static class Edge{
//         int src;
//         int dest;
//     public Edge(int s,int d){
//         this.src = s;
//         this.dest = d;
//     }
//     }
//     public static void CreateGraph(ArrayList<Edge>[] graph){
//         for(int i = 0; i< graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[2].add(new Edge(2,3));

//         graph[3].add(new Edge(3,1));

//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));

//         graph[5].add(new Edge(5,0));
//         graph[5].add(new Edge(5,2));
//     }
//     public static void TopologicalSort(ArrayList<Edge>[] graph){
//         boolean vis[] = new boolean[graph.length];
//         Stack<Integer> st = new Stack<>();
//         for(int i = 0 ; i< graph.length;i++){
//             if(!vis[i]){
//                 TopologicalSortUtil(graph, i, vis, st);
//             }
//         }
//         while(!st.isEmpty()){
//             System.out.print(st.pop() + " ");
//             }
//         }
// public static void  TopologicalSortUtil(ArrayList<Edge>[] graph, int curr, boolean vis[], Stack<Integer> st){
//     vis[curr] = true;
//     for(int i = 0; i < graph[curr].size(); i++){
//         Edge e = graph[curr].get(i);
//         if(!vis[e.dest]){
//             TopologicalSortUtil(graph, e.dest, vis, st);
//         }
//     }
//     st.push(curr);
// }
//     public static void main(String[] args){
//         int V= 6;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         CreateGraph(graph);
//         System.out.println("Topological Sort:");
//         TopologicalSort(graph);
//         System.out.println();
        
//     }
// }


// TopologicalSort Using BFS (Kahn's Algorithm): //

// import java.util.*;
// public class Graph1{
//     public static class Edge{
//         int src;
//         int dest;
//         public Edge(int s , int d){
//        this.src = s;
//        this.dest = d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> [] graph){
//         for(int i = 0 ; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[2].add(new Edge(2,3));

//         graph[3].add(new Edge(3,1));

//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));

//         graph[5].add(new Edge(5,0));
//         graph[5].add(new Edge(5,2));
//     }  
//    public static void calcIndeg(ArrayList<Edge>[] graph, int indeg[]){
//     for(int i = 0 ; i < graph.length; i++){
//         int v =i;
//         for(int j = 0 ; j<graph[v].size(); j++){
//             Edge e = graph[v].get(j);
//             indeg[e.dest]++;
//         }
//     }
//    }
//    public static void topSort(ArrayList<Edge>[] graph){
//     int indeg[] = new int[graph.length];
//     calcIndeg(graph, indeg);
//     Queue<Integer> q = new LinkedList<>();
//     for(int i = 0; i<indeg.length; i++){
//         if(indeg[i] == 0){
//             q.add(i);
//         }
//     }
//     while(!q.isEmpty()){
//         int curr = q.remove();
//         System.out.print(curr +" ");

//         for(int i = 0 ; i< graph[curr].size(); i++){
//             Edge e = graph[curr].get(i);
//             indeg[e.dest]--;
//             if(indeg[e.dest] == 0){
//                 q.add(e.dest);
//             }

//         }
//     }
//     System.out.println();
//    }
//     public static void main(String[] args){
//         int V = 6;
//      ArrayList<Edge> [] graph = new ArrayList[V];
//     createGraph(graph);
//     System.out.println("Topological Sort using BFS:");
//     topSort(graph);
//         }
// }



// All Paths From Source to Destination:  //

// import java.util.*;
// public class Graph1{
//     public static class Edge{
//         int src;
//         int dest;
//         public Edge(int s , int d){
//        this.src = s;
//        this.dest = d;
//         }
//     }
//     public static void createGraph(ArrayList<Edge> [] graph){
//         for(int i = 0 ; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[2].add(new Edge(2,3));

//         graph[3].add(new Edge(3,1));

//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));

//         graph[5].add(new Edge(5,0));
//         graph[5].add(new Edge(5,2));
//     }  
// public static void printallPath(ArrayList<Edge>[] graph , int curr, int dest , String path){
//     if(curr == dest){
//         System.out.println(path+dest);
//         return;
//     }
//     for(int i =0; i<graph[curr].size();i++){
//         Edge e = graph[curr].get(i);
//         printallPath(graph, e.dest, dest, path+curr);
//     }
// }
// public static void main(String[] args){
//     int V = 6;
//     ArrayList<Edge>[] graph = new ArrayList[V];
//     createGraph(graph);
//     int src = 5;
//     int dest =1;
//     System.out.println("All Paths from " + src + " to " + dest + ":");
//     printallPath(graph, src, dest, "");
// }
// }


// Dijkstra's Algorithm: Shortest Path in a Weighted Graph //

// import java.util.*;
// public class Graph1{
//     public static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph){
//         for(int i = 0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));
    
//         graph[1].add(new Edge(1, 3 , 7));
//         graph[1].add(new Edge(1, 2, 1));
        
//         graph[2].add(new Edge(2,4,3));

//         graph[3].add(new Edge(3,5,1));

//         graph[4].add(new Edge(4,3,2));
//         graph[4].add(new Edge(4,5,5));
//     }
//     static class Pair implements Comparable<Pair>{
//         int n;
//         int path;
//         public Pair(int n, int path){
//             this.n = n;
//             this.path =path;
//         }
//         @Override
//         public int compareTo(Pair p2){
//             return this.path - p2.path; // Ascending order
//         }
//     }
//     public static void dijkstra(ArrayList<Edge>[] graph, int src){
//    int dist[] =new int[graph.length];
//    for(int i = 0 ; i<graph.length; i++){
//     if(i != src){
//         dist[i] = Integer.MAX_VALUE;
//     }
//    } 
//     boolean vis[] = new boolean[graph.length];
//    PriorityQueue<Pair> pq =new PriorityQueue<>();
//    pq.add(new Pair(src,0));
//    while(!pq.isEmpty()){
//     Pair curr = pq.remove();
//     if(!vis[curr.n]){
//         vis[curr.n] = true;

//         for(int i =0 ; i<graph[curr.n].size(); i++){
//             Edge e = graph[curr.n].get(i);
//             int u = e.src;
//             int v= e.dest;
//             int wt = e.wt;
//             if(dist[u] + wt < dist[v]){
//                 dist[v] = dist[u]+wt;
//                 pq.add(new Pair(v, dist[v]));
//             }
//         }
//     }
//    }  
//     for(int i = 0; i<dist.length; i++){
//         System.out.println("Distance from " + src + " to " + i + " is: " + dist[i] + " ");
//     }
//     System.out.println();
//     }
//     public static void main(String[] args){
//         int V = 6;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         int src = 0;
//         int dest = 5;
//         dijkstra(graph, src);
//     }
// }



// Bellman-Ford Algorithm: Shortest Path in a Weighted Graph with Negative Weights //
// import java.util.*;
// public class Graph1{
//     public static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s , int d , int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph){
//         for(int i = 0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0, 1, 2));
//         graph[0].add(new Edge(0, 2, 4));
    
//         graph[1].add(new Edge(1, 2, -4));
        
//         graph[2].add(new Edge(2,3,2));

//         graph[3].add(new Edge(3,4,4));

//         graph[4].add(new Edge(4,1,-1));
      
//     }
//     public static void bellamnFord(ArrayList<Edge>[] graph,int src){
//         int dist[] = new int[graph.length];
//         for(int i = 0; i< dist.length; i++){
//             if(i != src){
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }
//         int V = graph.length;
//         for(int i = 0; i<V-1; i++){
//             for(int j =0 ; j<graph.length; j++){
//                 for(int k = 0;k<graph[j].size();k++){
//                     Edge e = graph[j].get(k);
//                     int u =e.src;
//                     int v = e.dest;
//                     int wt = e.wt;
//                     if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
//                         dist[v] = dist[u] + wt;
//                     }
//                 }
//             }
//         }
//         for(int i = 0; i< dist.length; i++){
//             System.out.println( dist[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int V = 5;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//         int src = 0;
//         bellamnFord(graph, src);
//     }
// }


// PRIM's Algorithm: Minimum Spanning Tree (MST) //

// import java.util.*;
// public class Graph1{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s,int d,int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void createGraph(ArrayList<Edge>[] graph){
//         for(int i=0; i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         graph[0].add(new Edge(0,1,10));
//         graph[0].add(new Edge(0,2,15));
//         graph[0].add(new Edge(0,3,30));

//         graph[1].add(new Edge(1,0,10));
//         graph[1].add(new Edge(1,3,40));

//         graph[2].add(new Edge(2,0,15));
//         graph[2].add(new Edge(2,3,50));

//         graph[3].add(new Edge(3,1,40));
//         graph[3].add(new Edge(3,2,50));
//     }
//     static class Pair implements Comparable<Pair>{
//         int n;
//         int cost;
//         public Pair(int n, int c){
//             this.n = n;
//             this.cost = c;
//         }
//         @Override
//         public int compareTo(Pair p2){
//             return this.cost - p2.cost; // Ascending order
//         }
//     }
//     public static void PrimsMST(ArrayList<Edge>[] graph){
//         boolean vis[] = new boolean[graph.length];
//         PriorityQueue<Pair> pq = new PriorityQueue<>();
//         pq.add(new Pair(0,0)); // Starting from node 0 with cost 0
//         int cost = 0;  
//         while(!pq.isEmpty()){
//             Pair curr = pq.remove();
//             if(vis[curr.n]){
//                 continue;
//             }
//             vis[curr.n] = true;
//             cost += curr.cost;
//             for(int i=0; i<graph[curr.n].size(); i++){
//                 Edge e = graph[curr.n].get(i);
//                 if(!vis[e.dest]){
//                     pq.add(new Pair(e.dest, e.wt));
//                 }
//             }
//         }
//         System.out.println(cost);
//     }
//     public static void main(String[] args){
//         int V = 4;
//         ArrayList<Edge>[] graph = new ArrayList[V];
//         createGraph(graph);
//        PrimsMST(graph);

//     }
// }



// Qusetion: Cheapest Flights Within K Stops //
// import java.util.*;
// public class Graph1{
//     static class Edge{
//         int src;
//         int dest;
//         int wt;
//         public Edge(int s, int d, int w){
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }
//     }
//     public static void createGraph(int flights[][],ArrayList<Edge> graph[]){
//         for(int i =0 ;i<graph.length; i++){
//             graph[i] = new ArrayList<>();
//         }
//         for(int i =0 ; i<flights.length; i++){
//             int src = flights[i][0];
//             int dest = flights[i][1];
//             int wt = flights[i][2];
//             graph[src].add(new Edge(src, dest, wt));
//         }

//     }
//     static class Info{
//         int v; 
//         int cost;
//         int stops;
//         public Info(int v, int c, int s){
//         this.v = v;
//         this.cost = c;
//         this.stops= s;
//         }
//     }
//     public static int cheapestFlight(int n , int flights[][], int src ,int dest, int k){
//         ArrayList<Edge> graph[] = new ArrayList[n];
//         createGraph(flights, graph);
//         int dist[] = new int[n];
//         for(int i = 0; i<dist.length; i++){
//             if(i != src){
//                 dist[i] = Integer.MAX_VALUE;
//             }
//         }
//        Queue<Info> q = new LinkedList<>();
//        q.add(new Info(src, 0, 0)); // Starting from source with cost 0 and 0 stops
//        while(!q.isEmpty()){
//         Info curr = q.remove();
//         if(curr.stops >k){
//             break;
//         }
//         for(int i =0 ; i<graph[curr.v].size(); i++){
//             Edge e = graph[curr.v].get(i);
//             int u =e.src;
//             int v= e.dest;
//             int wt = e.wt;
            
//             if(dist[u] != Integer.MAX_VALUE && curr.cost + wt < dist[v] && curr.stops <= k){
//                 dist[v] = curr.cost +wt;
//                 q.add(new Info(v, dist[v], curr.stops + 1));
//             }
//         }
//        }
//        if(dist[dest] == Integer.MAX_VALUE){
//            return -1; // No path found
//        }
//          return dist[dest]; // Return the minimum cost to reach destination
//     }
//     public static void main(String args[]){
//         int n = 4; // Number of cities
//         int flights[][] ={{0,1,100},
//                           {1,2,100},
//                           {2,0,100},
//                           {1,3,600},
//                           {2,3,200}};
//         int src =0, dest =3, k=1; // Source city, destination city, and maximum stops allowed
//         cheapestFlight(n, flights, src, dest, k);
//         System.out.println("Cheapest flight cost from " + src + " to " + dest + " with at most " + k + " stops is: " + cheapestFlight(n, flights, src, dest, k));
//     }
// }


// Question : Connecting Cities with Minimum Cost //

// import java.util.*;
// public class Graph1{
//     static class Edge implements Comparable<Edge>{
//         int dest;
//         int cost;
//         public Edge(int d, int c){
//             this.dest = d;
//             this.cost = c;
//         }
    
//         @Override
//         public int compareTo(Edge e2){
//             return this.cost - e2.cost; // Ascending order
//         }
//         }
//         public static int connectcities(int cities[][]){
//             PriorityQueue<Edge> pq = new PriorityQueue<>();
//             boolean vist[] = new boolean[cities.length];
//             int totalCost = 0;
//             pq.add(new Edge(0, 0)); // Start from city 0 with cost 0

//             while(!pq.isEmpty()){
//                 Edge curr = pq.remove();
//                 if(!vist[curr.dest]){
//                     vist[curr.dest] = true;
//                    totalCost += curr.cost;

//                    for(int i= 0; i<cities[curr.dest].length; i++){
//                     if(cities[curr.dest][i] != 0){
//                         pq.add(new Edge(i, cities[curr.dest][i]));
//                    }
//                 }
//             }
//         }
//         return totalCost;
//     }
//     public static void main(String args[]){
//         int cities[][] = {{0,1,2,3,4},
//                           {1,0,5,0,7},
//                           {2,5,0,6,0},
//                           {3,0,6,0,0},
//                           {4,7,0,0,0}};
//         int totalCost = connectcities(cities);
//         System.out.println("Total cost to connect all cities is: " + totalCost);
//     }
// }


// Kruskal's Algorithm: Minimum Spanning Tree (MST) //
// import java.util.*;

// public class Graph1 {
//     static class Edge implements Comparable<Edge> {
//         int src, dest, wt;
//         public Edge(int s, int d, int w) {
//             this.src = s;
//             this.dest = d;
//             this.wt = w;
//         }

//         @Override
//         public int compareTo(Edge e2) {
//             return this.wt - e2.wt; // Sort by weight
//         }
//     }

//     static int n = 4;
//     static int parent[] = new int[n];
//     static int rank[] = new int[n];

//     public static void init() {
//         for (int i = 0; i < n; i++) {
//             parent[i] = i;
//             rank[i] = 0;
//         }
//     }

//     public static int find(int u) {
//         if (parent[u] == u) return u;
//         return parent[u] = find(parent[u]); // Path compression
//     }

//     public static void union(int u, int v) {
//         int pu = find(u);
//         int pv = find(v);
//         if (pu != pv) {
//             if (rank[pu] < rank[pv]) {
//                 parent[pu] = pv;
//             } else if (rank[pu] > rank[pv]) {
//                 parent[pv] = pu;
//             } else {
//                 parent[pv] = pu;
//                 rank[pu]++;
//             }
//         }
//     }

//     public static void Kruskal(ArrayList<Edge> edgeList, int V) {
//         Collections.sort(edgeList); // Sort by weight
//         init(); // Initialize DSU
//         int ans = 0;
//         int count = 0;

//         for (int i = 0; count < V - 1 && i < edgeList.size(); i++) {
//             Edge e = edgeList.get(i);
//             int pu = find(e.src);
//             int pv = find(e.dest);
//             if (pu != pv) {
//                 union(e.src, e.dest);
//                 ans += e.wt;
//                 count++;
//                 System.out.println("Edge: " + e.src + " - " + e.dest + " with weight: " + e.wt);
//             }
//         }
//         System.out.println("Total cost of Minimum Spanning Tree: " + ans);
//     }

//     public static void main(String args[]) {
//         int V = 4;
//         // Step 1: Create a list of all edges (since Kruskal needs a global edge list)
//         ArrayList<Edge> edges = new ArrayList<>();

//         // Step 2: Add edges (undirected graph)
//         edges.add(new Edge(0, 1, 10));
//         edges.add(new Edge(0, 2, 15));
//         edges.add(new Edge(0, 3, 30));
//         edges.add(new Edge(1, 3, 40));
//         edges.add(new Edge(2, 3, 50));

//         // Step 3: Call Kruskal
//         Kruskal(edges, V);
//     }
// }


// Flood-Fill Algorithm: Finding Connected Components in a 2D Grid //
import java.util.*;
public class Graph1{
    public int[][] helper(int[][] image, int sr, int sc, int color, boolean[][] vis, int originalColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || vis[sr][sc] || image[sr][sc] != originalColor) {
            return image; // Out of bounds or already visited or not the original color
        }
      // left
      helper(image, sr, sc-1, color, vis, originalColor);
        // right
        helper(image, sr, sc+1, color, vis, originalColor);
        // up
        helper(image, sr-1, sc, color, vis, originalColor);
        // down
        helper(image, sr+1, sc, color, vis, originalColor);

}
    public int[][] floodfill(int[][] image, int sr, int sc, int color){
        boolean vis[][] = new boolean[image.length][image[0].length];
        helper(image, sr, sc, color, vis, image[sr][sc]);
        return image;
    }
  
    }
