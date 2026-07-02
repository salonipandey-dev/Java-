package JAVAOFFICIAL.LOOPS;
import java.util.*;


public class SumofEvenNum {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the num :");
        int num = sc.nextInt();
        int sum =0;
        System.out.print("[ ");
        for(int i =1 ;i <=num ;i++)
        {
            if (i%2==0)
            {
                sum = sum +i;
                System.out.print(sum);
                System.out.print(" ");
            }
        }
        System.out.println("]");
        sc.close();
    }
    
}
