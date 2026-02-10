import java.util.*;

class Halfpyramidpattern
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number you want:");
      int num=sc.nextInt();
      
      for(int line=1; line<=num; line++){
        for(int number= 1;number<line; number++){   
                System.out.print(number); 
            
        }
        System.out.println();
      }
      
       sc.close();
    }
    
}