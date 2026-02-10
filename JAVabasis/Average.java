import java.util.*;

class Average {
    public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter the number :");
        int num =sc.nextInt();
      System.out.println("Enter the number :");
        int num2=sc.nextInt();
      System.out.println("Enter the number :");
         int num3=sc.nextInt();
         int sum = num+num2+num3;
         System.out.println("the sum is : " +sum);
         System.out.println("let's move on to the average");
          
         System.out.println("say y to continue");
          char response= sc.next().charAt(0);
         if(response =='y')
         {
            System.out.println("Calculating average...");

         } 
         else
         {
            System.out.println("bye bye");
         }
         
      int average = sum/3;
      System.out.println("The average is : "  +average);

       sc.close();
        
    }
}