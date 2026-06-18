package JAVAOFFICIAL.LOOPS.PATTERNS;

public class DecreasingTriangle {
      public static void main(String args[]) {
        int num =1;
        for(int i=5;i>=num;i--){
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        } 
    
    }
}