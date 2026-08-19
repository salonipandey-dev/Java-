public class CountGreaterThan {
    public static void main(String[] args)
    {
        int[] arr ={4,12,7,19,3,15};
        int target=10;
        int result=countGreaterthan(arr,target);
        System.out.println("Count of elements greater than the target is : " + result);

    }
    public static int  countGreaterthan(int[] arr , int target)
    {
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>target)
            {
                count++;
            }
        
        }
        
        return count;
    
    }

    
}
