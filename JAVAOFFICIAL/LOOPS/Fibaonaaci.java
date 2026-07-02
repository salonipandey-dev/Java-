package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class Fibaonaaci {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.print("Fibonaaci series :");
        System.out.print("[ ");
        for(int i =1 ; i <=num; i++){
            System.out.print(a + " ");
            int next = a+b;
            a = b;
            b = next;

        }
        System.out.print("]");
        sc.close();

    }

    
}
