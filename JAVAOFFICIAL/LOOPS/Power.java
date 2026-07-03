package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the base :");
        int a= sc.nextInt();
        System.out.print("enter the exponent :");
        int b= sc.nextInt();
        int power =1;
        for(int i=1;i<=b;i++)
        {
            power =power*a;
        }
        System.out.print("The value is " +power);
        sc.close();
    }
    
}
