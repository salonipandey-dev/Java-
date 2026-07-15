package JAVAOFFICIAL.DSA.Recursion;

public class BinarySearchrec {
    public static void main(String[] args) {
        int[] arr = {1, 2,3,4,55,66,78};
        int target = 0;
        int result = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println("The target " + target + " is found at index: " + result);
    
    }
    static int binarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Target not found
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        }
        if (arr[mid] < target) {
            return binarySearch(arr, target, mid + 1, right); // Search in the right half
        }
            return binarySearch(arr, target, left, mid - 1); // Search in the left half
        
    }
    
}
