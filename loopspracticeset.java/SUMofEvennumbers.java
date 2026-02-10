import java.util.*;

public class SUMofEvennumbers {
    public static void main(String args[])
    {
       /*  for(int i=1;i<100;i++)
        {
            if(i%2==0)
            {
                System.out.println("even " +  i);
            }
            
        }*/ 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the range  :");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if(i%2==0)

        {
                System.out.println("even " +i);
                sum = sum+ n;
                System.out.println(sum);

        }
        else{
            System.out.println("odd");
        }
        
           
    }
    System.out.println("final sum of all the even numbers: " +sum);
    sc.close();
    
}
 
}