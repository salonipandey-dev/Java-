import java.util.Scanner;

public class Characterpattern {
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of lines:");
        int num=sc.nextInt();
        System.out.println("enter the character:");
        char ch=sc.next().charAt(0);
        
        //outer loop 
        for(int line=1;line<=num;line++){
            for(int chara=1; chara<=line;chara++){
                System.out.print(ch);
                ch++;

            }
            System.out.println();

        }sc.close();
    }


}
