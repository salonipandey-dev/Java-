package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class Roatationcount {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        System.out.println(count(arr));
    }
    static int Findpivot(int[] arr)
    {
        int start =0;
        int endd=arr.length-1;
        while(start<=endd)
        {
            int mid=start+(endd-start)/2;
            if(mid<endd &&arr[mid]>arr[mid+1])
            {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            if(arr[mid]<=arr[start])
            {
                endd=mid-1;
            }
            else
            {
                start=mid+1;
            }
    }
        return -1;
    }
    static int count(int[] arr)
    {
        int pivot=Findpivot(arr);
        return pivot+1;
        
    }
    
}
