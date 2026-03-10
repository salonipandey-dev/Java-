package ARRAY;

public class Reserverarray {
    public static int ReserveA(int numbers[])
    {
        int first=0;
        int last=numbers.length-1;
        while(first<last)
        {
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;
            last--;
        }
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
    
    return 0;
    
 }
 public static void main(String args[])
 {
     int numbers[]={1,3,5,7};
     ReserveA(numbers);
 }

} 