package JAVAOFFICIAL.LOOPS;
import java.util.*;
public class PrintevenNum {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number :");
        int num =sc.nextInt();
        for(int i =1 ; i<=num;i++)
        {
            if(i%2==0)
            {
                System.out.print(" " + i);
            }
        }
        sc.close();
    }
    
}
