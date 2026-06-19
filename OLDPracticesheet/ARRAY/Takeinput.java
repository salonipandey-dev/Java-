package ARRAY;
import java.util.*;

class ArrayP{

    public static void InputArr() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");

        // Input
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        // Output
        System.out.println("Array elements are:");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    } 

    public static void main(String args[]){
        InputArr();
    }
}  
	          
	      
	      
	      