package ARRAY;

public class BinarySearch {
    public static int BinaryS(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;

    
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        int numbers[]={-4,3,6,23,56,78,98,100,122,133,144};
        int key=98;
        int result=BinaryS(numbers, key);
        System.out.println("Index for key found at :" + result);

    }
}
