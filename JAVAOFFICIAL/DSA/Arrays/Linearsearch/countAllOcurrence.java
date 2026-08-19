import java.util.Scanner;
public class countAllOcurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {12,5,8,12,20,5,12};
        System.out.print("Enter the target number: ");
        int target = scanner.nextInt();
        int count = countOccurrences(arr, target);
        System.out.println("The number " + target + " occurs " + count + " times in the array.");
        scanner.close();
    }
    

    public static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int num : arr) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }
}