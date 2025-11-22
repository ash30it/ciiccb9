package Task5;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter three numbers: ");
        a=scan.nextInt(); b=scan.nextInt(); c=scan.nextInt();
        String result;
        result=(a>b&&a>c)? a + " is the higest number":
               (b>a&&b>c)? b + " is the highest number":
               (c>a&&c>b)? c + " is the highest number":
               (a==b&&a>c)?a + " is the highest number":
               (a==c&&a>b)?a + " is the higest number" :
               (b==c&&b>a)?b + " is the highest number": "All numbers are equal";
        System.out.println(result);
        scan.close();
    }
}
