package JAVAOFFICIAL.Functions;

public class Printtable {
    static void PrintTable(int n)
    {
        for(int i=1;i<=10;i++)
        {
            int t=n*i;
            System.out.println(n+ " X " +i+ " = "  +t);
        }
        
    }
    public static void main(String[] args) {
        PrintTable(9);
    }
}
