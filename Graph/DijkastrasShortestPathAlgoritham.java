package Graph;

import java.util.Arrays;

/*
Dijkastr's shortest path algoritham :
to travel shortest path from node A to B
Relax(u,v)
where u=finalised current node
v=next adjacent node
Does not work for -ve edges vertex

 */
public class DijkastrasShortestPathAlgoritham {

    public static int dijShort(int graph[][], int src){
        int v = graph.length;
        int dist[] = new int[v];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src]=0;
        int di=0;
        boolean mset[]= new boolean[v];
        for(int count=0; count<v-1; count++){
            int u=-1;
            for(int i=0; i<v; i++){
                if(!mset[i] && (u==-1 || dist[i]<dist[u])){
                    u=i;
                }
            }
            mset[u]=true;
            for(int s=0; s<v; s++){
                if(!mset[s] && graph[u][s]!=0){
                    dist[s]= Math.min(dist[s],dist[u]+graph[u][s]);
                    di=dist[s];
                }
            }
        }
        return di;
    }

    public static void main(String[] args) {
        int graph[][] = {{0,50,100,0},
                         {50,0,30,200},
                         {100,3,0,20},
                         {0,200,20,0}};
        int src=0;
        System.out.println("Min dis is -> "+dijShort(graph,src));

    }
}
