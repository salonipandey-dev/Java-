package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class Prime {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number :");
        int num =sc.nextInt();
        boolean prime = true;
        if(num<=1)
        {
            prime= false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
        sc.close();
    }

    
}
