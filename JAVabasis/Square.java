import java.util.*;

public class Square {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find its square:");
        int num=sc.nextInt();
        int square=num*num;
        System.out.println("The square of " + num + " is: " + square);  
        sc.close();
    }
    
}
