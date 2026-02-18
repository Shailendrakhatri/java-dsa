package src;
import java.util.*;
public class All_paths_from_source_to_Target {
    static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }


        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 4, 10));

        graph[3].add(new Edge(3, 5, -1));
        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 4, -1));

        graph[4].add(new Edge(4, 2, 2));
        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 2));

        graph[5].add(new Edge(5, 6, 2));

        graph[6].add(new Edge(6, 5, 2));
    }

    public static void bsf(ArrayList<Edge> graph[], int V, boolean visited[], int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);

        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[], boolean visited[], int curr) {
        System.out.print(curr + " ");
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, visited, e.dest);
            }
        }
    }
    public static void  printAllParths(ArrayList<Edge> graph[], boolean visited[] ,  int curr, String  path , int tar ){
        if(curr == tar){
            System.out.println(path);
            return ;
        }
        for(int i =0 ; i< graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                visited[curr] = true;
                printAllParths(graph, visited, e.dest, path+e.dest, tar);
                visited[curr] = false;
            }
        }
    }

    public static void main(String args[]) {

        int V = 7;
        ArrayList<Edge> graph[] = new ArrayList[V];

        boolean visited[] = new boolean[graph.length];
        System.out.println("Graph created successfully");
        createGraph(graph);


        System.out.println();
        int src= 0;
        int tar = 5;
        printAllParths(graph, visited, 0, "0", 5);
    }
}
