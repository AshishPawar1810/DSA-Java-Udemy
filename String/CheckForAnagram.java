package String;
/*
In this type of problem we check every charecter is present or not in other given string
eg 1  aaacb   2   cabaa

 */
public class CheckForAnagram {

    public static boolean isAnagram(String s1, String s2){
        int n=s1.length()-1;
        int m=s2.length()-1;
        if(m!=n){
            return false;
        }
         char[] count = new char[256];
        for(int i=0; i<n; i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i=0; i<256; i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1= "aabca";
        String s2="acaba";
        System.out.println("is anagram -> "+isAnagram(s1,s2));
    }

}
