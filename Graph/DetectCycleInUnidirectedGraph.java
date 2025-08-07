package Graph;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycleInUnidirectedGraph {

    public static boolean dfsRev(ArrayList<ArrayList<Integer>> al, int s, boolean visited[], int parent){
        visited[s]=true;
        for(int u : al.get(s)){
            if(visited[u]==false){
                if(dfsRev(al, u, visited, s)==true){
                    return true;
                }else if(u!=parent){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> al, int v){
        boolean visited[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[i]==false){
                if(dfsRev(al, i, visited, -1)==true){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(0,1)));
        al.add(new ArrayList<>(Arrays.asList(1,2)));
        al.add(new ArrayList<>(Arrays.asList(1,3)));
        al.add(new ArrayList<>(Arrays.asList(3,2)));
        al.add(new ArrayList<>(Arrays.asList(2,4)));
        al.add(new ArrayList<>(Arrays.asList(4,5)));
        int v= al.size();
        System.out.println("Is cyclic graph -> "+dfs(al,v));
    }
}
