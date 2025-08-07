package Graph;

import java.util.Arrays;

/*
Belman ford shortest path :
dijkshtras alggorhm don't work on -ve edges
belman ford works while -ve edges are present
// for digram you can check with url
https://www.geeksforgeeks.org/dsa/bellman-ford-algorithm-dp-23/
 */
public class BelmanFordShortestPath {

    public static int[] bellmanFord(int[][] edges, int src) {

        int V= edges.length;;
        int[] dist = new int[V];
        Arrays.fill(dist, (int)1e8);
        dist[src] = 0;
        for (int i = 0; i < V; i++) {
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int wt = edge[2];
                if (dist[u] != 1e8 && dist[u] + wt < dist[v]) {
                    if (i == V - 1)
                        return new int[]{-1};
                    dist[v] = dist[u] + wt;
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        int V = 5;
        int[][] edges = new int[][] {
                {1, 3, 2},
                {4, 3, -1},
                {2, 4, 1},
                {1, 2, 1},
                {0, 1, 5}
        };
        int src = 0;
        int[] ans = bellmanFord(edges, src);
        for (int dist : ans)
            System.out.print(dist + " ");
    }
}
