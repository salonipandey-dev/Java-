
import java.util.*;

public class PassFail {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the marks: ");
        int marks = sc.nextInt();
        if(marks>=40)
        {
            System.out.println("You have passed the exam.");
        }
        else
        {
            System.out.println("You have failed the exam.");
        }
        sc.close();
    }
    
}
