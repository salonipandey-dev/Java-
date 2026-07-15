package JAVAOFFICIAL.DSA.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=5;
        System.out.println("The fibonacci of "+n+" is: "+fibonacci(n));
    }
    static int fibonacci(int n)
    {
        //base coindition
        if(n<2){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    
}
