package JAVAOFFICIAL.Functions;

public class CountDig {
    static void CountDigits(int n)
    {
        int count=0;
        while(n!=0)
        {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        CountDigits(8999);
        
    }

    
}
