

public class ContainTarget {
    static boolean Contain(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
    ppackage JAVAOFFICIAL.DSA.Arrays;

public class Minof {
    static void MinOfArray(int[] arr)
    {
        int Min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(Min>arr[i])
            {
                Min =arr[i];
            }
        }System.out.println("The minimum :" +Min);

    }
    public static void main(String[] args) {
        int[] arr1= {1,2,4,7,8,3};
        MinOfArray(arr1);
        
    }
    
}
package JAVAOFFICIAL.DSA.Arrays;

public class Minof {
    static void MinOfArray(int[] arr)
    {
        int Min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(Min>arr[i])
            {
                Min =arr[i];
            }
        }System.out.println("The minimum :" +Min);
