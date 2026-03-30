package ARRAY;

public class SmallestNarr {
    public static int SmallestArray(int numbers[])
    {
        int Smallest=Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++)
        {
            if(Smallest>numbers[i])
            {
                Smallest=numbers[i];
            }
        } return Smallest;
    }
    

public static void main(String args[])
{
    int numbers[]={1,2,3,4,5,6,72,1,3,1,3,10,};
    int Smallest=SmallestArray(numbers);
    System.out.println("Smallest number is "+Smallest); 
}
}
