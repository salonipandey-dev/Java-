package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class PrintNto1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("enter the number :");
        int num =sc.nextInt();
        System.out.print("[ ");
        for(int i =num ; i>=1; i--)
        {
            System.out.print(i);
            System.out.print( " ");

        }
        System.out.print("]");
        sc.close();
    }
    
}
