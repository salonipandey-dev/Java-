package JAVAOFFICIAL.DSA.Arrays;
import java.util.*;

public class countpnandzero {
    static void CountPandNandZero(int[] arr)
    {
        int pcount=0;
        int ncount=0;
        int zcount=0;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
                pcount++;
            }
            else if(arr[i]<0)
            {
                ncount++;
            }
            else
            {
                zcount++;
            }
        }
        System.out.println("Positive numbers: " + pcount);
        System.out.println("Negative numbers: " + ncount);
        System.out.println("Zeros: " + zcount);
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
        sc.close();
    CountPandNandZero(arr);
    }
    
}
