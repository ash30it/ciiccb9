package Task8;

public class Task8 {
    public static int calculateSums(int... num){
        int overAllSum=0;
        System.out.println("Cumulative Sums: ");

        for(int param: num){
            int curCumSum=0;
            System.out.println("For parameter: " + param + ": ");
            for(int i=1;i<=param;i++){
                curCumSum+=i;
                    if(i>1)
                        System.out.print(" + ");
                    System.out.print(i);
            }
            System.out.println(" = "+curCumSum);
            overAllSum+=curCumSum;
        }
        return overAllSum;
    }
    public static void main(String[] args) {
        int overallTotal1=calculateSums(4,5,10);
        System.out.println("Overall total sum for (4, 5, 10): "+overallTotal1);
    }
}
