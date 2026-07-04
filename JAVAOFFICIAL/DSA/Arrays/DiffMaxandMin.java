package JAVAOFFICIAL.DSA.Arrays;

public class DiffMaxandMin {
    static void DiffernceMaxandMin(int[] arr)
    {
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        int diff=max-min;
        System.out.println("Difference between max and min is: "+diff);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        DiffernceMaxandMin(arr);
    }
}
