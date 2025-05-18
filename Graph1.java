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
import java.util.*;
public class Graph1{
    public static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s , int d , int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
    
        graph[1].add(new Edge(1, 2, -4));
        
        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));
      
    }
    public static void bellamnFord(ArrayList<Edge>[] graph,int src){
        int dist[] = new int[graph.length];
        for(int i = 0; i< dist.length; i++){
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        int V = graph.length;
        for(int i = 0; i<V-1; i++){
            for(int j =0 ; j<graph.length; j++){
                for(int k = 0;k<graph[j].size();k++){
                    Edge e = graph[j].get(k);
                    int u =e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }
        for(int i = 0; i< dist.length; i++){
            System.out.println( dist[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        int src = 0;
        bellamnFord(graph, src);
    }
}