import java.util.*;

public class COuntnumber {
    
    public static void main(String args[])
    { 
        /*nt num = 183487;
        int count=0;
        if(num==0){
            count=1;

        }else{
            while(num!=0)
            {
                num=num/10;
                count++;
            }
        }
        System.out.println(count);*/
        // taking input from user

      Scanner sc=new Scanner(System.in);
      System.out.println("enter the digits :");
      int num=sc.nextInt();
      int count=0;
      if(num==0)
      {
        count = 1;

      }else{
        while(num!=0)
        {
            num=num/10;
            count++;

        }
        System.out.print(count);
        sc.close();
      }
       
    }
}
