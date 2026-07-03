package JAVAOFFICIAL.DSA.Arrays;
import java.util.*;

public class Sumof{
    static void SumofArray(int[] arr)
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arrn= new int[6];
        System.out.print("Enter the elements :");
        for(int i=0;i<arrn.length;i++)
        {
            arrn[i]=sc.nextInt();
        }
        SumofArray(arrn);
        sc.close();
    }

    
}
