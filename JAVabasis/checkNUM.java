import java.util.*;
public class checkNUM {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num>0)
        {
            System.out.println("the number is positive");
        }
        else
        {
            System.out.println("the number is negative");
        }
        sc.close();
    }

    
}
