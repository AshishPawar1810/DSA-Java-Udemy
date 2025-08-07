package Graph;

import java.util.*;

public class TopologicalSortingUsingDfs {

    static void topoSort(ArrayList<ArrayList<Integer>> adj,int v)
    {
        Stack<Integer> st = new Stack<>();
        boolean visited[] = new boolean[v];
        int s =0;
        for(int u: adj.get(s)){
            if(!visited[u]){
                dfs(u,visited,adj,st);
            }
        }
        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
    public static void dfs(int u, boolean visited[],ArrayList<ArrayList<Integer>> al,Stack<Integer> st){
        visited[u] = true;
        for(Integer v: al.get(u)){
            if(visited[v] ==false){
                dfs(v,visited,al,st);

            }
        }
        st.push(u);
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(0,1)));
        al.add(new ArrayList<>(Arrays.asList(1,3)));
        al.add(new ArrayList<>(Arrays.asList(2,3)));
        al.add(new ArrayList<>(Arrays.asList(3,4)));
        al.add(new ArrayList<>(Arrays.asList(2,4)));
        int v= al.size();
        topoSort(al, v);

    }
}
