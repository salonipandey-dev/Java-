package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class PrintODDnum {
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        System.out.print("Enter the number :");
        int num= sc.nextInt();
        System.out.print("[ ");
        for(int i=1;i<=num;i++)
        {
            if(i%2!=0)
            {
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println("]");
        sc.close();

    }
    
}
