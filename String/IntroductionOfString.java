package String;
/*
Sequence of charecters
c/c++ uses ASCI 8 bit encoding
8 bit in length

IN java support UTf-16 encoding
first 128 charecters are same in java as ASCI
16 byte in length
Char x = 'a';
sout((int) x)
will get 96 as o/p as ASCI value


 */
public class IntroductionOfString {

    public static void strCount(String str){
        int[] count = new int[27];
        for(int i=0; i<str.length(); i++){
            count[str.charAt(i)-'a']++;
        }

        for(int i=0; i<26; i++){
            if(count[i]>0) {
                System.out.println((char) (i+'a')+ " - "+count[i]);
            }
        }
    }

    public static void main(String[] args) {
        String str="geeksforgeeks";
        strCount(str);
    }
}
