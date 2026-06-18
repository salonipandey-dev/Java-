package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class Palindrome
{
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the number to check its palindrome or not :");
    int num =sc.nextInt();
    int original = num;
    int rev =0;

    while(num!=0){
        int digit = num%10;
        rev =rev*10 + digit ;
        num =num/10;
    }
    System.out.println("the reverse of the number is " +rev );
    if(original ==rev){
        System.out.println("it is palindrome.");
    }
    else{
        System.out.println("it is not a palindrome.");
    }
    sc.close();

    }

}
