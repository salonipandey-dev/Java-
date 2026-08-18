package JAVAOFFICIAL.DSA.Arrays.Linearsearch;

public class CountOccurence {
    static int CountOccur(int[] arr, int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7, 1};
        int target=7;
        int result=CountOccur(arr,target);
        System.out.println("Count of key found :" + result);
    }
    
}
