import java.util.Scanner;
public class NuminRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();
        if (num >= start && num <= end) {
            System.out.println(num + " is in the range.");
        } else {
            System.out.println(num + " is not in the range.");
        }
        sc.close();
    }
}
