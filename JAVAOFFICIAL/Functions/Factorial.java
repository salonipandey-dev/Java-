package JAVAOFFICIAL.Functions;

public class Factorial {
    static void Fact(int a)
    {
        int factt=1;
        for(int i=1;i<=a;i++)
        {
            factt =factt*i;
            System.out.println(factt);
        }
    }
    public static void main(String[] args) {
        Fact(6);
    }

    
}
