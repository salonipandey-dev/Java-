import java.util.*;

   public static int Factorialm()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number:");
    int n=sc.nextInt();
    int fact=1;
    for(int i =1; i<=n;i++){
        fact=fact*i;

    } System.out.println(fact); 
    sc.close();
    return 0;
  }
    

public static void main(String args[]){
   Factorialm();
   
}
