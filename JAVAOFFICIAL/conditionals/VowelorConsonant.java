import java.util.Scanner;
public class VowelorConsonant {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if(ch == 'a'|| ch=='e'|| ch =='i'||ch =='o'|| ch=='u')
        {
            System.out.println("It is a vowel ");

        }
        else{
            System.out.println("consonant");
        }
        sc.close();
    }
}
