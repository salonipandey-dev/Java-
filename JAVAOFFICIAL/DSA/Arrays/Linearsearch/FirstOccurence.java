package JAVAOFFICIAL.DSA.Arrays.Linearsearch;

public class FirstOccurence {
    static int FirstOccur(int[] arr, int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                return i;
                break ;
            }
        }
        return -1;
    }

}
