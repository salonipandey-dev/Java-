package JAVAOFFICIAL.DSA.Arrays.Linearsearch;

public class LastOccurence {
    static int LastOccur(int[]arr, int target)
    {
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7, 1};
        int target=7;
        int result=LastOccur(arr,target);
        System.out.println("Index for key found at :" + result);
    }
}
