package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class BinarySearch {
    static int binarySearch(int[] arr, int target)
    {
        int start =0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]>target)
            {
                end=mid-1;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }
            else
            {
                return mid;
            }
            
            }
        return -1;
            
        }
        public static void main(String[] args) {
            int[] arr={-4,3,6,23,56,78,98,100,122,133,144};
            int target=98;
            int result=binarySearch(arr,target);
            if(result==-1)
            {
                System.out.println("Element not found");
            }
            else
            {
                System.out.println("Element found at index "+result);
            }
        }


    }

