package JAVAOFFICIAL.DSA.String;

public class Palinedrome {
    public static void main(String[] args) {
        String str="ma";
        boolean ans=isPalinedrome(str);
        System.out.println(ans);
    }
    static boolean isPalinedrome(String str){
        if(str.length()==0 || str == null )
        {
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++)
        {
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end)
            {
                return false;
            }

    
        }
        return true;
    }
}