public class Day8_Q1 {
   
    public static void main(String[] args) {
        int a =4;
        int b =7;

        System.out.println("The value of a and b before swap is "+a+" and "+b+" respectively");
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("The value of a and b after swap is "+a+" and "+b+" respectively");

    }
}
