package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class SumOfDigit {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the number : ");
        int num = sc.nextInt();
        int sum =0;

        while(num != 0)
        {
            int digit = num %10;
            sum = sum +digit ;
            num =num /10;
        }
        System.out.println("The sum of digits are " +sum);
        sc.close();
    }
}
