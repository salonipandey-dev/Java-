public class Bintodec {
    public static int Binum(int bynum)
    {
        int mynum=bynum;
        int dec=0;
        int pow=0;
        while(bynum>0)
        {
            int lastdigit = bynum%10;
            dec =dec+(lastdigit* (int)Math.pow(2,pow));
            pow++;
            bynum = bynum/10;
        }
        System.out.println("decimal of " + mynum +" is " + dec);
        return bynum;

    }
    public static void main(String args[])
    {
      Binum(1010 );

    }
    
}
