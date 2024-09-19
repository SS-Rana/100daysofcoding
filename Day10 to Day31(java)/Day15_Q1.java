import java.util.Scanner;

public class Day15_Q1 {
    public static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        printNum(num);
        sc.close();
    }
}
