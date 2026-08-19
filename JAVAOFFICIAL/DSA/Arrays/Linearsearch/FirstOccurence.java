

public class FirstOccurence {
    static int FirstOccur(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7, 1};
        int target=7;
        int result=FirstOccur(arr,target);
        System.out.println("Index for key found at :" + result);
    }

}
