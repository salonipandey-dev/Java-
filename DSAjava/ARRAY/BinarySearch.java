package ARRAY;

public class BinarySearch {
    public static int BinaryS(int numbers[],int key)
    {
        int start=0;
        int end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;

            //comparsion
            if(numbers[mid]==key){
                return mid;
            }
            else if(numbers[mid]<key){  //right
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1; //key not found
    }

    public static void main(String args[])
    {
        int numbers[]={1,2,93,6,3,52,42,32,5,8};
        int key=32;
        int result=BinaryS(numbers, key);
        System.out.println("Index for key found at :" + result);

    }
}
