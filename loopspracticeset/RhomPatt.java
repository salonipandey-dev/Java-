package loopspracticeset;

public class RhomPatt {  
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i += 2){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        for(int i = 3; i >= 1; i -= 2){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}