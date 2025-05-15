package String;

public class CheckIfStringRotation {

    public static boolean areRotations(String s1, String s2){
        if(s1.length()!=s2.length()){
            return false;
        }
        return ((s1+s1).indexOf(s2)>=0);
    }
    public static void main(String[] args) {
        String s1= "ABCD";
        String s2 ="CDAB";
        System.out.println("roations are matching -> "+areRotations(s1,s2));
    }
}
