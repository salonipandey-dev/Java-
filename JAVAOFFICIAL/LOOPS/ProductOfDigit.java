package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        int product=1;
        while(num!=0)
        {
            int digit = num %10;
            product=product*digit;
            num =num/10;
        }
        System.out.print("The product of the digits " +product);
        sc.close();
    
    }
    
}
