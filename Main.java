import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        /*int num;
        System.out.print("Enter a number: ");
        Scanner num2=new Scanner(System.in);        
        num=num2.nextInt();
        if(num%2==0){
            System.out.println(num + " is even number");
        }else{
            System.out.println(num + " is odd number");
        }*/
        /*for(short num=10; num>=0; num--){
            for(short x=10; x>=0; x--){
                System.out.print("*");
            }
            System.out.println();
        }*/
        Plant plant1=new Plant();
        plant1.name="papaya";
        System.out.println(plant1.name);
        System.out.println(plant1.getBranch());
    }
}

class Plant{
    int branch;
    String name;
    int leaves;
    void setBranch(int leaves){
        this.leaves=leaves;
    }
    /**
     * para sa getBranch to
     * @return
     */
    int getBranch(){
        branch = 2;
        return branch;
    }
}
