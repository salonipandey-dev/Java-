package JAVAOFFICIAL.DSA.Arrays;

public class Maxof {
    static void MaxOfArray(int[] arr)
    {
        int Maxx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(Maxx<arr[i])
            {
                Maxx =arr[i];
            }
        }System.out.println("The maximum :" +Maxx);

    }
    public static void main(String[] args) {
        int[] arr1= {1,2,4,7,8,3};
        MaxOfArray(arr1);
        
    }
    
}
