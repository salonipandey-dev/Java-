package JAVAOFFICIAL.DSA.String;

public class Methodstring {
    public static void main(String[] args) {
        String name="kunal";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.substring(2));
        System.out.println(name.substring(1,4));
        System.out.println(name.replace('k','p'));
        System.out.println(name.replace("kunal","saloni"));
        System.out.println(name.startsWith("ku"));
        System.out.println(name.endsWith("al"));
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("n"));
        System.out.println(name.lastIndexOf("n"));
    }
    
}
