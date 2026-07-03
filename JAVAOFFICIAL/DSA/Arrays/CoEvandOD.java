package JAVAOFFICIAL.DSA.Arrays;

public class CoEvandOD {
    static void EvenAndOdd(int[] arr)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2==0)
            {
                System.out.println("it is even number." +arr[i]);
                count++;
                System.out.println("the total number of even numbers "+count);


            }
            else{
                System.out.println("it is odd number " +arr[i]);
                count++;
                System.out.println("the total numbers of odd. "+count);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,4,5,2,6,7,8,9,3,10};
        EvenAndOdd(arr1);
        }
    
}
