package Graph;

import java.util.Arrays;

/*

 */
public class ImplOfPrimsAlgorithamMinimumSpaningTree {

    public static int primsMst(int graph[][]){
        int v=graph.length;
        int key[]= new int[v];
        int res=0;
        Arrays.fill(key,Integer.MAX_VALUE);
        key[0]=0;
        boolean mset[]= new boolean[v];
        for(int count=0; count<v; count++){
            int u=-1;
            for(int i=0; i<v; i++){
                if(!mset[i] && (u==-1 || key[i]<key[u])){
                    u=i;
                }
            }
            mset[u]=true;
            res= res+key[u];
            for(int s=0; s<v; s++){
                if(!mset[s] && graph[u][s] !=0 && graph[u][s] <key[s]){
                    key[s]= graph[u][s];
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int graph[][] = new int [][]   { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        System.out.println("Min dis is -> "+primsMst(graph));
    }
}
