package Lecture.Graph.Test;

public class WeightedGraph {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public WeightedGraph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyMatrix = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyMatrix[source][destination] = weight;
    }

    public boolean addUndirectedEdge(int vertex1, int vertex2, int weight) {
        if (vertex1 < 0 || vertex1 >= numVertices || vertex2 < 0 || vertex2 >= numVertices) {
            return false; // Invalid vertices
        }

        adjacencyMatrix[vertex1][vertex2] = weight;
        adjacencyMatrix[vertex2][vertex1] = weight;
        return true;
    }

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(4);

        graph.addEdge(0, 0, 3);
        graph.addEdge(3, 2, 5);
        graph.addUndirectedEdge(2, 1, 15);
        graph.addUndirectedEdge(3, 1, 7);

         // Printing the adjacency matrix
         System.out.println("Adjacency Matrix:");
         for (int i = 0; i < graph.numVertices; i++) {
             for (int j = 0; j < graph.numVertices; j++) {
                 System.out.print(graph.adjacencyMatrix[i][j] + " ");
             }
             System.out.println();
         }
    }

    
}
