package graph;
public class Main {

    public static void main(String[] args) {
        Graph g = new Graph(10);
        g.addEdge(1,2);
        g.addEdge(3,7);
        g.addEdge(2,4);
        g.addEdge(4,7);
        g.bfs(1,7);
    }

}
