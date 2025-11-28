package Task9;
import static java.lang.Math.*;
public class Task9 {
    public static int add(int a,int b){
        return addExact(a, b);
    }

    public static int subtract(int a, int b){
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b){
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b){
        return Math.floorDivExact(a, b);
    }
    public static void main(String[] args) {
        int num1=6;
        int num2 = 5;

        int sum=add(num1,num2);
        System.out.println(num1+" + "+num2+" = "+sum);

        int diff=subtract(num1, num2);
        System.out.println(num1+" - "+num2+" = "+diff);

        int prod=multiply(num1,num2);
        System.out.println(num1+" * "+num2+" = "+prod);

        float quo=divide(num1,num2);
        System.out.println(num1+" / "+num2+" = "+quo);
    }
}
