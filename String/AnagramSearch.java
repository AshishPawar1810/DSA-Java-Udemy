package String;

public class AnagramSearch {

    public static boolean isPresent(String s1, String s2){
        int n=s1.length()-1;
        int m=s2.length()-1;
        int [] ct = new int[n];
        int [] cp = new int[m];
        for(int i=0; i<n; i++){
            ct[s1.charAt(i)]++;
            cp[s2.charAt(i)]++;
        }
        for(int i=m; i<n; i++){
            if(cp==ct){
                return true;
            }
            ct[s1.charAt(i)]++;
            ct[s1.charAt(i-m)]--;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1="geeksforgeeks";
        String s2="frog";
        System.out.println("is patrn present -> "+isPresent(s1,s2));
    }
}
