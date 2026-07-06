package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class IfiniteArray {
    static int Search(int[] arr, int target,int start,int end)
    {
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;

    }
    static int FindingRange(int[] arr, int target)
    {
        //first findthe range
        int start =0;
        int end=1;
        while(target>arr[end])
        {
            int newstart=end+1;
            end=end+(end-start+1)*2;
            start=newstart;
        }
        return -1;
    }
    public static void main(String[] args) {
        
        
    }
    
}
