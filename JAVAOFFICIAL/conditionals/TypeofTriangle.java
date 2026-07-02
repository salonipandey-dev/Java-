import java.util.*;
public class TypeofTriangle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a :");
        int a =sc.nextInt();
        System.out.println("enter b :");
        int b =sc.nextInt();
        System.out.println("enter c :");
        int c =sc.nextInt();
        if(a ==b && b==c && a==c )
        {
            System.out.println("Equilateral Triangle");
        }
        else if((a == b && b !=c ) ||(b ==c && c!=a)|| (c==a && a!=b))
        {
            System.out.println("Isosceles Triangle");

        }
        else  {
            System.out.println("Scalene Triangle");
        }
    
        sc.close();
    }
    
}
