package String;
/*
In this type of problm you need to return the
index of char where two duplicate element occures
before it.
eg
geeksforgeeks
o/p 0
abbcc
o/p 0
 */
public class LeftMostOccurenceChar {

    public static void leftMost(String s1){
        boolean []visited = new boolean[256];
        int res =-1;
        for(int i=s1.length()-1; i>=0; i++){
            if(visited[s1.charAt(i)]){
                res=i;
            }else {
                visited[s1.charAt(i)]=true;
            }
        }
    }

    public static void main(String[] args) {

    }
}
