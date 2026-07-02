import java.util.*;
public class Mulitpleof3and7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 7 == 0) {
            System.out.println(num + " is a multiple of both 3 and 7.");
        } else {
            System.out.println(num + " is not a multiple of both 3 and 7.");

            
        }
        sc.close();
    }

    
}