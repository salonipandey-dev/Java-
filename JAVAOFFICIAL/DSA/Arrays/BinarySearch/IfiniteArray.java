package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class IfiniteArray {
    public static void main(String[] args) {
        int[] arr={3,4,7,9,10,90,100,130,140,160,170};
        int target=10;
        int ans=FindingRange(arr,target);
        System.out.println(ans);
        
        
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
        return Search(arr,target,start,end);
    }
 
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
    
    
}
