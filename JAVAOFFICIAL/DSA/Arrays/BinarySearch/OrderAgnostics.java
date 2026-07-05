package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class OrderAgnostics {
    static int orderAgnotics(int[] arr, int target)
    {
        int start =0;
        int end=arr.length-1;
    
    boolean isAsc=arr[start]<arr[end];
    
    while(start<=end)
    {
        int mid=start+(end-start)/2;
        if(arr[mid]==target)
        {
            return mid;
        }
        if(isAsc)
        {
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        else
        {
            if(arr[mid]>target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
    }
    return -1;
}
public static void main(String[] args) {
    
    int[] arr={99,88,77,66,55,44,33,22,11};
    int target=44;
    int result=orderAgnotics(arr,target);
    System.out.println("Index for key found at :" + result);
}
}
