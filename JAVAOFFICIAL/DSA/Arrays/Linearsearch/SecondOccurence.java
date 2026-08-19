public class SecondOccurence {
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7, 1};
        int target=7;
        int result=secondOccurence(arr,target);
        System.out.println("Second Occurrence of the key is at index :" + result);
    }
    public static int secondOccurence(int[] arr, int target)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                count++;
                if(count==2)
                {
                    return i;
                }
            }
        }
        return -1;
    }
    
}
