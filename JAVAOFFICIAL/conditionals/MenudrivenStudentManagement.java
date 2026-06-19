
import java.util.Scanner;

public class MenudrivenStudentManagement {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        int choice;
        
            System.out.println("1. ADD student ");
            System.out.println("2. DELETE student ");
            System.out.println("3. UPDATE student ");
            System.out.println("4. DISPLAY student ");
            System.out.println("5. EXIT ");
           
        
        System.out.println("enter your choice :");
        while((choice=sc.nextInt())!=5);
        {     
            
            switch(choice)
            { 
                case 1:
                    System.out.println("enter student name to add :");
                    String name =sc.nextLine();
                    System.out.println("student name added successfully" + name);
                    break;
                case 2:
                    System.out.println("enter student name to delete :");
                    String name1 =sc.nextLine();
                    System.out.println("student name deleted successfully" + name1);
                    break;
                case 3:
                    System.out.println("enter student name to update :");
                    String name2 =sc.nextLine();
                    System.out.println("student name updated successfully" + name2);
                    break;
                case 4:
                    System.out.println("enter student name to display :");  
                    String name3 =sc.nextLine();
                    System.out.println("student name displayed successfully" + name3);
                    break;
                case 5: 
                    System.out.println("exit successfully");
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
        sc.close();
    
}
}