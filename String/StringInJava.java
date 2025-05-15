package String;
/*
4 ways to create string
1   by using array
    char[] = ['g','e','e','s'];
2   by using String class
    String str= "abcd";
    String class is immutable . once declare can not be modified
3 String buffer
    A thread safe class. Muttable class

4 String builder
    Not thread safe class

 */
public class StringInJava {

    public static void main(String[] args) {
        String str = "geeks";
        System.out.println(str.length()  );
        System.out.println(str.charAt(3));
        System.out.println(str.substring(2));
        System.out.println(str.substring(2,5));

        String s1 = "geeksforgeeks";
        String s2  = "geeks";
        String s3 = "for";
        if(s1.contains(s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println(s1.equals(s2));

        System.out.println(s1.indexOf(s3));
    }
}
