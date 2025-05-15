package String;

public class PalindromeCheck {

    public static boolean isPali(String st){
        int low=0;
        int high= st.length()-1;
        while(low<high){
            if(st.charAt(low)==st.charAt(high)){
                return true;
            }
            low++;
            high--;
        }
        return false;
    }

    public static void main(String[] args) {
        String str="ABBA";
        System.out.println("String is palindrome -> "+isPali(str));

    }
}
