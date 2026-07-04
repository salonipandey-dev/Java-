package JAVAOFFICIAL.DSA.Arrays;
import java.util.*;

public class Average {
    static void AverageOfArray(int[] arr )
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        double average=(double)sum/arr.length;
        System.out.println("Average of the array is: "+average);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        AverageOfArray(arr);
        sc.close();
    }
}
