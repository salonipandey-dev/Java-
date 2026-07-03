package JAVAOFFICIAL.Functions;

public class Isprime {
    static void IsPrime(int num){
        boolean prime=true;
        if(num<=1)
        {
            prime= false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not a prime");
        }
    }
    public static void main(String[] args) {
        IsPrime(332);
    }
    
}
