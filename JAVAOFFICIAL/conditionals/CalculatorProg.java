import java.util.Scanner;


public class CalculatorProg {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //take input from user till user does not press X or x
        while(true)
        {
            System.out.println("Enter the operator: +, -, *, / or X to exit");
            char op = sc.next().charAt(0);
            if(op == 'X' || op == 'x')
            {
                System.out.println("Exiting the calculator...");
                break;
            }
            System.out.println("Enter the first number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second number:");
            double num2 = sc.nextDouble();
            double result;
            switch(op)
            {
                case '+':
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case '/':
                    if(num2 != 0)
                    {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                    else
                    {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please try again.");
            }

        }
        sc.close();

    }

    
}
