package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class CountZero{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        int count=0;
        while(num>0)
        {
            int digit = num%10;
            if(digit==0)
            {
                count++;
            
            }
            num =num/10;

        }
        System.out.print("the count of zero :" +count);
        sc.close();
    }
    
}
