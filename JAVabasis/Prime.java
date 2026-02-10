import java.util.*;
import java.lang.Math;
public class Prime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value :");
        int num=sc.nextInt();
        if(num<=1){
            System.out.println("it is not a prime ");
        }
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
        {
            System.out.println("it is prime number.");

        }
        else{
            System.out.println("it is not a prime number.");
        }
        sc.close();
  
}
}