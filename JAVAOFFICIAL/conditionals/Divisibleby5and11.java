import java.util.*;

public class Divisibleby5and11 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0)
        {
            System.out.println("The number is divisible by both 5 and 11.");
        }
        else if(num%5==0)
        {
            System.out.println("The number is divisible by 5 but not by 11.");
        }
        else if(num%11==0)
        {
            System.out.println("The number is divisible by 11 but not by 5.");
        }
        else
        {
            System.out.println("The number is not divisible by both 5 and 11.");
    
        }
        sc.close();
    }
    
}
