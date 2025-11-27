
package Task4;
import java.util.*;
public class Task4 {
    public static boolean isPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String reverseStr=sb.toString();
        return str.equals(reverseStr);
    }   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String test1;
        //boolean check;
        System.out.println("Enter word to check:");
        test1=scan.nextLine();
        if (isPalindrome(test1)==true)
                System.out.println("The input string is a Palindrome;");
        else
                System.out.println("The input string is Not Palindrome");
    }
}
