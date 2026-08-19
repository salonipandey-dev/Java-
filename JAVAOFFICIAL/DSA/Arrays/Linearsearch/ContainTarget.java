

public class ContainTarget {
    static boolean Contain(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={4, 7, 2, 7, 9, 7, 1};
        int target=7;
        boolean result=Contain(arr,target);
        System.out.println("Key found :" + result);
    }
    
}
