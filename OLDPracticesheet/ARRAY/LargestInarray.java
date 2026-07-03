package ARRAY;

public class LargestInarray {
    public static int Largestarray(int numbers[]) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (Largest < numbers[i]) {
                Largest = numbers[i];
            }
        }
        System.out.println("Largest number is " + Largest);
        return Largest;

    }

    public static void main(String args[]) {
        int numbers[] = { 1, 4, 35, 0, 20, 5, 2, 6, 3, 5, 3, 5 };
        Largestarray(numbers);

    }
}
