package Mathematics;
/*
Palindrome number is number which is number read from left to right same as read from right to left
eg    123321, 8668
single digit no is always palindrome number

 */
public class PalindromeNumber {

    public static boolean reverseNumber(int n){
      int rev = 0;
      int temp = n;
      while(temp != 0){
          int ld = temp % 10;
          rev = rev * 10 + ld;
          temp = temp / 10;
      }
      return n == rev;
    }

    public static void main(String[] args) {
        System.out.println("Number is palindrome  "+reverseNumber(333353333));

    }
}
