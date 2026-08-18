package JAVAOFFICIAL.Functions;

public class FindIbit {
    public static void main(String[] args) {

    }

    public static int Bit(int[] arr) {
        for (int num : arr) {
            return (num ^ 1);
        }
        return 0;
    }
}
