package Graph;

import java.util.*;

public class ShortedPathInUniweightedGraph {

    public static void shortPath(ArrayList<ArrayList<Integer>> al, int v){
            int s=0;
            int dist[] = new int[v];
            Queue<Integer> q = new LinkedList<>();
            boolean visited[]= new boolean[v];
            q.add(s);
            visited[s]=true;
            while (!q.isEmpty()){
                int u = q.poll();
                for(int x : al.get(u)){
                    if(!visited[x]){
                        dist[v]= dist[u] +1;
                        visited[x]=true;
                        q.add(x);
                    }
                }
            }
        System.out.println(Arrays.toString(dist));
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        al.add(new ArrayList<>(Arrays.asList(0,1)));
        al.add(new ArrayList<>(Arrays.asList(1,2)));
        al.add(new ArrayList<>(Arrays.asList(2,3)));
        al.add(new ArrayList<>(Arrays.asList(0,2)));
        al.add(new ArrayList<>(Arrays.asList(1,3)));
        int v = al.size();
        shortPath(al,v);


    }
}
