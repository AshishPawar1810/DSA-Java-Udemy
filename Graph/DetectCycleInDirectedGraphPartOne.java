package Graph;

import java.util.ArrayList;
import java.util.Arrays;

/*
Directed Graph : Only one directional traverse are there
Unidirectional Graph : Default bidirectional travels
 */
public class DetectCycleInDirectedGraphPartOne {

    public static boolean dfsRes(ArrayList<ArrayList<Integer>> al, int s, boolean visited[], boolean res[]){
        visited[s]=true;
        res[s]=true;
        for(int u : al.get(s)){
            if(visited[u]==false && dfsRes(al,u,visited,res)){
                return true;
            }else if(res[u]==true){
                return true;
            }
        }
        res[s]=false;
        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> al, int v){
        boolean visited[]= new boolean[v];
        boolean res[] = new boolean[v];
        for(int i=0; i<v; i++){
            if(visited[i]==false){
               if(dfsRes(al,i,visited,res)==true){
                   return true;
               }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(0,1)));
        al.add(new ArrayList<>(Arrays.asList(2,1)));
        al.add(new ArrayList<>(Arrays.asList(2,3)));
        al.add(new ArrayList<>(Arrays.asList(3,4)));
        al.add(new ArrayList<>(Arrays.asList(4,5)));
        al.add(new ArrayList<>(Arrays.asList(5,3)));
        int v=al.size();
        System.out.println("Directed graph cyclic -> "+dfs(al,v));

    }
}
