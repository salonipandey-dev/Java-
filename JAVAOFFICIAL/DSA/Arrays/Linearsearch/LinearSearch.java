

public class LinearSearch {
    static int linearSearch(int[] arr, int target)
    {
        for(int index=0;index<arr.length;index++)
            {
            if(arr[index]==target)
            {
                return index;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={99,88,77,66,55,44,33,22,11};
        int target=44;
        int result=linearSearch(arr,target);
        System.out.println("Index for key found at :" + result);
    }
    
}
