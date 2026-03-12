package ARRAY;

public class UniqueNum {
    public static int Unique(int numbers[])
    {
        int uniquee=0;
        for(int i=0;i<numbers.length;i++)
        {
            uniquee=uniquee^numbers[i];
        }
        return uniquee;
    }
    public static void main(String args[])
    {
        int numbers[]={1,1,3,2,2,4,4};
        System.out.println(Unique(numbers));
    }}