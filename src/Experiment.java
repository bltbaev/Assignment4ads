import java.util.*;

public class Experiment {
    public void runMultipleTests() {
        int[] sizes = {10, 30, 100};
        for (int size : sizes) {
            System.out.println("Graph size: " + size);
            Graph graph = createGraph(size);
            if (size == 10) {
                System.out.println("|| BFS Traversal ||");
                graph.bfs(0);
                System.out.println("|| Traversal ||");
                graph.dfs(0);
            }
            long bfsStart = System.nanoTime();
            graph.bfs(0);
            long bfsEnd = System.nanoTime();

            long dfsStart = System.nanoTime();
            graph.dfs(0);
            long dfsEnd = System.nanoTime();

            long bfsTime=bfsEnd-bfsStart;
            long dfsTime=dfsEnd-dfsStart;

            System.out.println("\nRESULTS:");
            System.out.println("BFS Time: "+bfsTime+" ns");
            System.out.println("DFS Time: "+dfsTime+" ns");
        }
    }
    private Graph createGraph(int size) {
        Graph graph = new Graph();
        for (int i = 0; i < size; i++) {
            graph.addVertex(new Vertex(i));
        }
        Random random = new Random();
        for (int i = 0; i < size * 2; i++) {
            int from = random.nextInt(size);
            int to = random.nextInt(size);
            if (from != to) {
                graph.addEdge(from, to);
            }
        }
        return graph;
    }
}
