package JAVAOFFICIAL.conditionals;
import java.util.Scanner;


public class MenuDrivenATM {
    public static void main(String args[])
    {
        int balance = 100000; 
        double withdraw ;
        System.out.println("Welcome to the ATM");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");  
        System.out.println("3. Exit");
        while(true)
        {
            System.out.print("choose an option :");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Balance : " + balance);
                    break;
                case 2:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = sc.nextDouble();
                    if(balance >= withdraw)
                    {
                        balance = (int)(balance - withdraw);
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
                
            }
        }
    }

}
