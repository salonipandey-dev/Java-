package JAVAOFFICIAL.DSA.Arrays;

public class BestTimetosell {
    public static void main(String[] args)
    {

    }
    static int Maxprofit(int[] arr)
    {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<minprice)
            {
                minprice=arr[i];
            }
            else if(arr[i]-minprice>maxprofit)
            {
                maxprofit=arr[i]-minprice;
            }
    }

        return maxprofit;
    }

}
