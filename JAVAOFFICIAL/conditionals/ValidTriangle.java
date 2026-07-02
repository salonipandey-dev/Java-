import java.util.*;

public class ValidTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  side  a :");
        int a = sc.nextInt();

        System.out.println("enter the  side  b :");
        
        int b = sc.nextInt();
        System.out.println("enter the  side  c :");
        
        int c = sc.nextInt();
        if (a + b >c && b+c >a && c+a >b)
        {
            System.out.println("Triangle is valid");

        }
        else{
            System.out.println("Not a valid triangle ");

        }
        sc.close();



    }
    
}
