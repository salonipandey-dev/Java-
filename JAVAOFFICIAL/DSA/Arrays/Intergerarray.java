package JAVAOFFICIAL.DSA.Arrays;
import java.util.*;

public class Intergerarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr =new int[5];
        System.out.print("Enter the array elements :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Array elements are :");
        System.out.print("[ ");
        for(int i=0;i<arr.length;i++)
        {
        System.out.print(arr[i]);
        System.out.print(" ");
        }
        System.out.print("]");
        sc.close();
    }
}
