package Pracitce;
public class PrintPattern{
    public static void main(String[] args) {

        int n = 5;

        for(int i = 1; i <= n; i++) {

            if(i % 2 != 0) { // odd row
                for(int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            } 
            else { // even row
                char ch = 'a';
                for(int j = 0; j < i; j++) {
                    System.out.print((char)(ch + j) + " ");
                }
            }

            System.out.println();
        }
    }
}
    
