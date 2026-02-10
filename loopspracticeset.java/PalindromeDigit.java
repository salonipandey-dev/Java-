import java.util.*;


public class PalindromeDigit {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number to check palindrome:");
        int num = sc.nextInt();
        int ori=num;
        int rev=0;
        while(num>0){
            int digit = num%10;
            rev = rev*10+ digit;
            num = num/10;

        }
        if(ori==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    sc.close();
    }
}
