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

import java.util.*;

public class Graph1 {
  static class Edge {
    int src;
    int dest;
    int wt;

    public Edge(int s, int d, int w) {
      this.src = s;
      this.dest = d;
      this.wt = w;
    }
  }

  public static void createGraph(ArrayList<Edge>[] graph) {
    for (int i = 0; i < graph.length; i++) {
      graph[i] = new ArrayList<>();
    }

    graph[0].add(new Edge(0, 1, 5));

    graph[1].add(new Edge(1, 0, 5));
    graph[1].add(new Edge(1, 2, 1));
    graph[1].add(new Edge(1, 3, 3));

    graph[2].add(new Edge(2, 1, 1));
    graph[2].add(new Edge(2, 3, 1));
    graph[2].add(new Edge(2, 4, 2));

    graph[3].add(new Edge(3, 1, 3));
    graph[3].add(new Edge(3, 2, 1));

    graph[4].add(new Edge(4, 2, 2));
  }

  public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, List<Integer> path) {
    path.add(src);
    if (src == dest) {
      return true;
    }

    vis[src] = true;

    for (int i = 0; i < graph[src].size(); i++) {
      Edge e = graph[src].get(i);
      if (!vis[e.dest]) {
        if (hasPath(graph, e.dest, dest, vis, path)) {
          return true;
        }
      }
    }

    path.remove(path.size() - 1); // Backtrack
    return false;
  }

  public static void main(String[] args) {
    int v = 5;
    ArrayList<Edge>[] graph = new ArrayList[v];
    createGraph(graph);

    boolean[] vis = new boolean[v];
    List<Integer> path = new ArrayList<>();

    if ((()hasPath(graph, 0, 4
        ), vis, path)) {
      System.out.println("Path exists from 0 to 4");
      System.out.println("Path: " + path);
    } else {
      System.out.println("No path exists from 0 to 4");
    }
  }
}
