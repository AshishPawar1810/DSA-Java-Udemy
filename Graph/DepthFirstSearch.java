package Graph;
/*
Application of DFS :
1. Cycle detection
2. Toplogical sorting
3. Strongly connected component : Kosaraju aloritham, Tarzan algoritham
4. to solve puzzle
5. Path finding
 */
import java.util.ArrayList;
import java.util.Arrays;

public class DepthFirstSearch {

    public static void dfsRev(ArrayList<ArrayList<Integer>> al, int s, boolean visited[]){
        visited[s]=true;
        System.out.print(s+" ");
        for(int u : al.get(s)){
            if(visited[u]==false) {
                dfsRev(al, u, visited);
            }
        }
    }

    public static void dfs(ArrayList<ArrayList<Integer>> al, int v){
        boolean visited[]= new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[i]==false){
                dfsRev(al, i, visited);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(1,2)));
        al.add(new ArrayList<>(Arrays.asList(1,0)));
        al.add(new ArrayList<>(Arrays.asList(2,0)));
        al.add(new ArrayList<>(Arrays.asList(2,3)));
        al.add(new ArrayList<>(Arrays.asList(2,4)));
        int v=al.size();
        dfs(al,v);
    }
}
