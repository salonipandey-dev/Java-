package JAVAOFFICIAL.LOOPS;

public class Countdigit {
    public static void main(String args[])
    {
        int num = 89345678;
        int count =0 ;
        while(num!=0)
        {
            num =num/10;
            count++;
        }
        System.out.println("The number of digits in the number is: " + count);

    }
}
