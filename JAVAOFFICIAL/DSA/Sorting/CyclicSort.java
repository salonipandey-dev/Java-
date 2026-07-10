package JAVAOFFICIAL.DSA.Sorting;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        Cyclicsort(arr);
        System.out.println("Sorted array is :");
    
}
        static void Cyclicsort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correctindex=arr[i]-1;
            if(arr[i]!=arr[correctindex])
            {
                swap(arr,i,correctindex);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
