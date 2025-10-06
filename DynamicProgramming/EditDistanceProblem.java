package DynamicProgramming;
/*
two strings are given
need to convert first string into second string
s1=cat  s2=cut
 */
public class EditDistanceProblem {

    public static int ed(String s1, String s2, int m, int n){
        if(m==0)
            return n;
        if(n==0)
            return m;
        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return ed(s1, s2, m-1, n-1);
        }
        return 1 + Integer.min(Integer.min(ed(s1,s2,m,n-1),
                            ed(s1, s2, m-1, n)),
                            ed(s1, s2, m-1, n-1));
    }

    public static void main(String[] args) {
        String s1 ="SATURDAY";
        String s2 ="SUNDAY";
        int m = s1.length();
        int n= s2.length();
        System.out.println("Min char Req -> "+ed(s1,s2,m,n));
    }
}
