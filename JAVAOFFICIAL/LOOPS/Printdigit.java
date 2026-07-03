package JAVAOFFICIAL.LOOPS;
import java.util.Scanner;

public class Printdigit {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.print("enter the Number :");
        int num = sc.nextInt();
        while(num!=0)
        {
            int digit =num%10;
            System.out.print(digit);
            System.out.print(" ");
            num=num/10;

        }

        sc.close();
    }
    
}
