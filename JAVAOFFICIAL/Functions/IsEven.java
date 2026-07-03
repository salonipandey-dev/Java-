package JAVAOFFICIAL.Functions;

public class IsEven {
    static void isEven(int n)
    {
        if(n%2==0)
        {
            System.out.println("even number" +n);
        }
        else{
            System.out.println("odd number ");
        }
    }
    public static void main(String[] args) {
        isEven(99);
    }
    
}
