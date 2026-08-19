public class FindLastIndex 
{
    public static void main(String[] args)
    {
        int[] arr ={12, 5, 8, 12, 20, 5, 12};
        int target = 12;
        int lastIndex = findLastIndex(arr, target);
       System.out.println("Last index of " + target + " is: " + lastIndex);
        
    }
    public static int findLastIndex(int[] arr, int target)
    {
        int lastIndex = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                lastIndex = i;
            }

        } 
        return lastIndex;
    }
}