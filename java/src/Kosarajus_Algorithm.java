package src;
import java.util.*;
public class Kosarajus_Algorithm {

    static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Example graph creation
        graph[0].add(new Edge(0, 1));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 0));
        graph[1].add(new Edge(1, 3));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 1));

    }
    public static void topSort(ArrayList<Edge> graph[], int curr, boolean visited[], Stack<Integer> stack) {
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topSort(graph, e.dest, visited, stack);
            }
        }
        stack.push(curr);
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.print(curr + " ");
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void Kosaraju(ArrayList<Edge> graph[], int V) {
        // Step 1: Perform DFS and fill the stack        boolean visited[] = new boolean[V];
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topSort(graph, i, visited, stack);
            }
        }

        // Step 2: Reverse the graph
        ArrayList<Edge> reverseGraph[] = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            reverseGraph[i] = new ArrayList<>();
        }
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                reverseGraph[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // Step 3: Perform DFS on the reversed graph
        Arrays.fill(visited, false);
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (!visited[curr]) {
                dfs(reverseGraph, curr, visited);
                System.out.println();
            }
        }
    }

        public static void main(String[] args) {
            // Implementation of Kosaraju's Algorithm for Strongly Connected Components
            // This is a placeholder for the actual implementation.
            System.out.println("Kosaraju's Algorithm for Strongly Connected Components");
            int V = 5; // Number of vertices
            ArrayList<Edge> graph[] = new ArrayList[V];
            createGraph(graph);
            Kosaraju(graph, V);
        }
}
