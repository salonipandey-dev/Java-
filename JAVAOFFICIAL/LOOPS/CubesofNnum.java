package JAVAOFFICIAL.LOOPS;
import java.util.*;

public class CubesofNnum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number :");
        int num = sc.nextInt();
        System.out.print("[ ");
        for(int i =1; i <=num;i++){
            System.out.print(i*i*i);
            System.out.print(" ");
        }
        System.out.print("]");
        sc.close();
    }
    
}
