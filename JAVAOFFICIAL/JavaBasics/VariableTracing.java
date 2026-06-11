package JAVAOFFICIAL.JavaBasics;

public class VariableTracing {
    public static void main(String args[])
    {
        int x = 10;
        x = x + 5;   
        x = x * 2;
        x = x - 8;
        System.out.println(x);
            
    }
    
}
//output : x = 10 then x = 15 then x = 30 and then x= 22