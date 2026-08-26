class ReverseArray 
{
    public static void reverseArray(int[] arr)
    {
        int left = 0;
        int right=arr.length-1;
        while(left<right)
        {
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args)
    {
        int[] arr = {4, 8, 15, 16, 23, 42};
        int result =reverseArray(arr);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println("Reversed Array " ,+result);
        }
    }
}