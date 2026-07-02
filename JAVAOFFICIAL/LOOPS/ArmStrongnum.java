package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class ArmStrongnum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
      //  System.out.println("enter the number to check :");
        // int num= sc.nextInt();
        for(int i =100; i<=1000;i++)
        {
            if (IsArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    static boolean IsArmstrong(int n){
        int ori =n;
        int sum=0;
        while(n>0)
        {
            int rem =n%10;
            n =n/10;
            sum = sum+ rem * rem*rem;
        }
    
        return sum == ori;
    }
    
}
