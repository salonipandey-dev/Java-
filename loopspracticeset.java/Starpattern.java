import java.util.*;

class Starpattern
{   
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of lines:");
        int num  =sc.nextInt();
    

       for(int line=1; line<=num;line++){
           for(int star=1; star<=line; star++)
           {
            System.out.print("x");
           }
           System.out.println();
        }
       
       
       sc.close();
    } 

}