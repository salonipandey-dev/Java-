package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class SpiltArray {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int m=2;
        System.out.println(splitArray(arr,m));
    }
    static int splitArray(int[] arr,int m)
    {
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=Math.max(start,arr[i]);//max element
            end+=arr[i];//sum of all elements
        }
        while(start<end)
        {
            int mid=start+(end-start)/2;
            //calculate how many pieces you can divide this in with this max sum
            int sum=0;
            int pieces=1;
            for(int num:arr)
            {
                if(sum+num>mid)
                {
                    //you cannot add this in this subarray, make new one
                    sum=num;
                    pieces++;
                }
                else
                {
                    sum+=num;
                }
            }
            if(pieces>m)
            {
                start=mid+1;
            }
            else
            {
                end=mid;
            }
        }
        return start;
    }

}