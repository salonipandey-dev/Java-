
import java.util.*;

public class GradeCalculator {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        int TotalMarks = 500;
        double percentage =(marks*100)/TotalMarks;
        System.out.println("Your percentage is: " + percentage + "%");
        if(percentage>=95)
        {
            System.out.println("Your grade is A+.");
        }
        else if(percentage>=90)
        {
            System.out.println("Your grade is A.");
        }
        else if(percentage>=80)
        {
            System.out.println("Your grade is B.");
        }
        else if(percentage>=70)
        {
            System.out.println("Your grade is C.");
        }
        else if(percentage>=60)
        {
            System.out.println("Your grade is D.");
        }
        else
        {
            System.out.println("You have failed the exam.");
        }

       
        sc.close();
    }
}
