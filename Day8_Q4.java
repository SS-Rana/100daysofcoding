import java.util.Scanner;
public class Day8_Q4 {
    public static void ifOddOrEven(int num){
        int bitMask = 1<<0;
        if((num & bitMask)==0){
            System.out.println("The number is an even number");
        }
        else{
            System.out.println("The number is an odd number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number here : ");
        int num = sc.nextInt();
        ifOddOrEven(num);
        sc.close();
    }
}

