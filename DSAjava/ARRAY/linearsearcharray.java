package ARRAY;

public class linearsearcharray {
    public static int LinearSearch(String menu[], int key)
    {
        for(int i=0; i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        
        return -1;
    }
    public static void main(String args[])
    {
        String menu[]={"pizza","samosa","burger","french fries","pasta"};
        String key="burger";
        int index=LinearSearch(menu,key);
        if(index==-1){
            System.out.println("key not found");
        }
        else{
            System.out.println("key found at index "+index);
        }

    }
    
    
}
