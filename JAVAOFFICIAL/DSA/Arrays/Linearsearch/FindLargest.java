public class FindLargest {
    public static void main(String[] args)
    {
    int[] arr=  {8, 3, 19, 4, 25, 7};
    int largest=findLargest(arr);
    System.out.println("Largest element in the array is : " + largest);
    }
    
    public static int findLargest(int[] arr)
    {
        int largest=arr[0];
        for(int i= 0; i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
}
