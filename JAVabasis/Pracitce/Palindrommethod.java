package Pracitce;

public class Palindrommethod {
    public static void Palin(int num)
    {
        int mynum=num;
        int rev=0;
        int original=mynum;
        while(mynum!=0){
            int digit=mynum%10;
            rev =rev*10 + digit;
            mynum=mynum/10;
        }
        System.out.println(rev);
        if(original==rev){
            System.out.println("Palindrome");

        }
        else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String args[]){
        Palin(12121);
    }
    
}
