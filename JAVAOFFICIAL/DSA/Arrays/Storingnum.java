package JAVAOFFICIAL.DSA.Arrays;

public class Storingnum {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=5;
        arr[1]=6;
        arr[4]=9;
        arr[3]=5;
        arr[2]=20;
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        arr[2]=4;
        System.out.println(arr[2]);
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        System.out.println(arr[1]);
        System.out.println(arr[3]);
    
    }
    
}
