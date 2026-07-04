package JAVAOFFICIAL.DSA.Arrays;
import java.util.Scanner;

public class CountEvandOD {
    static void EvenAndOdd(int[] arr)
    {
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }
        }
        System.out.println("Even count is: "+evencount);
        System.out.println("Odd count is: "+oddcount);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the elements of the array: ");
        int[] arr1 = new  int[5];
            for(int i=0;i<5;i++)
            {
                arr1[i] = sc.nextInt();
            }
        EvenAndOdd(arr1);
        sc.close();
        }
    
}
