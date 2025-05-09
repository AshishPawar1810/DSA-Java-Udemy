package Hashing;

import java.util.HashSet;

/*
Print common element in two array
 */
public class IntersectionOfTwoArray {

  public static void printCommont(int first[], int sec[]){
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0; i<sec.length; i++)   {
          hs.add(sec[i]);
      }

      for(int j=0; j<first.length; j++){
          if(hs.contains(first[j])){
              System.out.println(first[j]);
          }
      }
  }

    public static void main(String[] args) {
        int first[]={10,20,30};
        int sec[]={10,30};
        printCommont(first,sec);
    }
}
