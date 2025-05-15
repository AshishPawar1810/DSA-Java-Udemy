package String;

public class NaivePatternSearchingForDistinct {

    public static void pattSer(String txt, String pat){
        int n= txt.length();
        int m = pat.length();
        for(int i=0; i<=n-m; i++){
            for(int j=0; j<m; j++){
                if(pat.charAt(j)!=txt.charAt(i+j)){
                    break;
                }
                if(j==m){
                    System.out.print(i+" ");
                }
                if(j==0){
                    i++;
                }else{
                    i=i+j;
                }
            }
        }
    }

    public static void main(String[] args) {
        String s1= "ABCEABEFABCD";
        String S2 = "ABCD";
        pattSer(s1,S2);
    }
}
