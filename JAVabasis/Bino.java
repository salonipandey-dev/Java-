import java.util.*;
public class  Bino {
   public static int Factorialm(int n)
   {
    int fact=1;
    for(int i =1; i<=n;i++){
        fact=fact*i;

    }  return fact;
  }
 
public static int Binomico(int a,int r) {
 int  n_fact=Factorialm(a);
 int r_fact= Factorialm(r);
 int nr_fact=Factorialm(a-r);
 int binco= n_fact/(r_fact*nr_fact);
 
 return binco;
    
  }
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   System.out.println("enter");
   int t=sc.nextInt();
   System.out.println("enter");
   int y=sc.nextInt();
   System.out.println(Binomico(t,y));
   sc.close();
    
} 
}