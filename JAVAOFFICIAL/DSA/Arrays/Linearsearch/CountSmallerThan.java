public class CountSmallerThan
{
    public static void main(String[] args)
    {
        int[]  arr={4,12,7,19,3,15};
        int target = 10;
        int count = countSmallerThan(arr,target);
        System.out.println("count of elements smaller than " + target+  " is "  + count);
        
    }
    public static int countSmallerThan(int[] arr , int target)
    {
        int count=0;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]<target)
            {
                count++;
            }
        }
        return count;
    }
}