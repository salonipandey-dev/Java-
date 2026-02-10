package Pracitce;

public class Sumofdimethod {
    public static void Sumdd(int num){
        int mynum=num;
        int sum=0;
        while(mynum!=0)
        {   int digit=mynum%10;
            sum=sum+digit;
            mynum=mynum/10;
            
        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        Sumdd(22224);
    }
}
