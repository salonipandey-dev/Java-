package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class CountEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num =sc.nextInt();
        int count=0;
        while(num>0)
        {
            int digit=num%10;
            if(digit%2==0)
            {
                count++;
            }
            num =num/10;
        }
        System.out.print("The counting of even digits :" +count);
        sc.close();
        }
    
}
