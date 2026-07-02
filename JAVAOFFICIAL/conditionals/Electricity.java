import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double billAmount;
        if (units <= 100) {
            billAmount = units * 5;
        } else if (units <= 200) {
            billAmount = 100 * 5 + (units - 100) * 7;
        } else {
            billAmount = 100 * 5 + 100 * 7 + (units - 200) * 10;
        }
        System.out.println("The electricity bill amount is: " + billAmount);
        sc.close();
    }
    
}
