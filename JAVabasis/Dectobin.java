public class Dectobin {
    
    public static int Decbin(int decnum)
    {
        int mynum=decnum;
        int pow=0;
        int bynum=0;

        while(decnum>00)
        {
            int rem=decnum%2;
            bynum=bynum+(rem*(int)Math.pow(10,pow));
            pow++;
            decnum=decnum/2;

        }
        System.out.println("binary form of " + mynum + " is " +bynum);
        return 0;
    }
    public static void main(String args[])
    {
        
        Decbin(4);
    }
}
