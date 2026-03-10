package loopspracticeset;

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 3;

        // Upper part including middle row
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
                if (j < (2 * i - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
                if (j < (2 * i - 1)) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
