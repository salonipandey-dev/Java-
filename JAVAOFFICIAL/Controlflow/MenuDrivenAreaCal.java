package JAVAOFFICIAL.Controlflow;
import java.util.Scanner;

public class MenuDrivenAreaCal {
    public static void main(String args[])
    {
        double area;
        System.out.println("Welcome to the Area Calculator");
        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Rectangle");
        System.out.println("3. Area of Triangle");
        System.out.println("4. Exit");
        while(true)
        {
            System.out.print("Choose an option: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.print("Enter radius of the circle: ");
                    double radius = sc.nextDouble();
                    area = Math.PI * radius * radius;
                    System.out.println("Area of Circle: " + area);
                    break;
                case 2:
                    System.out.print("Enter length of the rectangle: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter width of the rectangle: ");
                    double width = sc.nextDouble();
                    area = length * width;
                    System.out.println("Area of Rectangle: " + area);
                    break;
                case 3:
                    System.out.print("Enter base of the triangle: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height of the triangle: ");
                    double height = sc.nextDouble();
                    area = 0.5 * base * height;
                    System.out.println("Area of Triangle: " + area);
                    break;
                case 4:
                    System.out.println("Thank you for using Area Calculator. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                
            }
        }

    }
    
}
