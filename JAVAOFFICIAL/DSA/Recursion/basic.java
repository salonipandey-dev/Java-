package JAVAOFFICIAL.DSA.Recursion;
public class basic {
    public static void main(String[] args) {
        int n=5;
        System.out.println("The factorial of "+n+" is: "+factorial(n));
    }
    static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
}
