import java.util.*;
public class Graph1 {
 static class Edge{
     int src;
     int dest;
     int wt;

     public Edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.wt = w;
     }
 }
    public static void main(String[] args){
      int v = 5;
      ArrayList<Edge> graph[] = new ArrayList[v]; // null -> empty Arralist
      for(int i = 0; i < v; i++){
        graph[i] = new ArrayList<>(); // empty ArrayList
      }
      // 0 :-
      graph[0].add(new Edge(0, 1, 5));
    
      // 1:-
      graph[1].add(new Edge(1, 0, 5));
      graph[1].add(new Edge(1, 2, 1));
      graph[1].add(new Edge(1, 3, 3));

      // 2:-
      graph[2].add(new Edge(2, 1, 1));
      graph[2].add(new Edge(2, 3, 1));
      graph[2].add(new Edge(2, 4, 2));

     // 3:-
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

    // 4:-
        graph[4].add(new Edge(4, 2, 2));


        // Neighbours of 1
        for(int i = 0 ; i<graph[1].size(); i++){
            Edge e= graph[1].get(i);
            System.out.println("Source: " + e.src + " Destination: " + e.dest + " Weight: " + e.wt);
 }

 

    }
}