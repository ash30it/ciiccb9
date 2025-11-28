
package Task7;
import java.util.Scanner;
public class Task7 {
    static int sum(int a, int b){
        int sagot=a+b;
        return sagot;
    }
    static int diff(int a, int b){
        int sagot=a-b;
        return sagot;
    }
    static int prod(int a, int b){
        int sagot=a*b;
        return sagot;
    }
    static int quo(int a, int b){
        int sagot=a/b;
        return sagot;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int num1,num2;
    System.out.print("Enter two numbers separated by space:");
    
    num1=scan.nextInt(); num2=scan.nextInt();

    System.out.println(sum(num1,num2));
    System.out.println(diff(num1,num2));
    System.out.println(prod(num1,num2));
    System.out.println(quo(num1,num2));
    scan.close();
    }
}
