package JAVAOFFICIAL.JavaBasics;

public class Typecon {
    public static void main(String args[])
    { //implicit type conversion    
        int x = 5;
        double y = x;
        System.out.println(y);
        //explicit type conversion
        double a = 3.14;
        int b = (int)a;
        System.out.println(b);
    }// 5.0 and then 3
} 
