package JAVAOFFICIAL.DSA.Arrays.BinarySearch;

public class findfirstandlastpoistion {
    static int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findFirst(nums, target);
        result[1] = findLast(nums, target);
        return result;
    }
    static int findFirst(int[] nums, int target) {
        int start= 0;
        int  end = nums.length - 1;
        int first=-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                first = mid;
            
                end = mid - 1; // Continue searching in the left half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return first;
    }
    static int findLast(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int last = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                last = mid;
                start = mid + 1; // Continue searching in the right half
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int[] nums = {5, 8, 8, 8, 8, 10};
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("First position: " + result[0]);
        System.out.println("Last position: " + result[1]);
    }
}