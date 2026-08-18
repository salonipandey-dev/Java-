package JAVAOFFICIAL.DSA.Arrays.Linearsearch;

public class FindIndex {
    static int LinearSearch(int[] arr, int tar)
    {
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i]==tar)
            {
                return i;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        int[] arr={5,8,2,10,3};
        int tar=10;
        int result=LinearSearch(arr,tar);
        System.out.println("Index for key found at :" + result);
    }
}


