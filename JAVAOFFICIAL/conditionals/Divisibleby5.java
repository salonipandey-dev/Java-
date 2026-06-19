import java.util.*;

public class Divisibleby5 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if(num%5==0)
        {
            System.out.println(num + " is divisible by 5.");
            double result = num/5;
            System.out.println("The result of " + num + " divided by 5 is: " + result);
        }
        else
        {
            System.out.println(num + " is not divisible by 5.");
    
        }
        sc.close();
    }
    
}
