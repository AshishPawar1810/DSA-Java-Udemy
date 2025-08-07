package Graph;

import java.util.ArrayList;

public class GraphAdjancyListRepresentation {

    public static void addAdjency(ArrayList<ArrayList<Integer>> aj, int u, int v){
        aj.get(u).add(v);
        aj.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> ad){
        for (int i=0; i<ad.size(); i++){
            for(int j=0; j<ad.get(i).size(); j++){
                System.out.print(ad.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int v =5;
        ArrayList<ArrayList<Integer>> ad = new ArrayList<>(v);
        for(int i=0; i<v; i++){
            ad.add(new ArrayList<Integer>());
        }
        addAdjency(ad,0,1);
        addAdjency(ad,0,2);
        addAdjency(ad, 1,2);
        addAdjency(ad,1,3);
        printGraph(ad);

    }
}
