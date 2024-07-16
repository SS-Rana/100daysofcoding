import java.util.Scanner;

public class Day15_Q5 {
    public static void printFactorial(int a, int b, int n) {
        if(n == 0) {
        return;
        }
        System.out.print(a+" ");
        printFactorial(b, a+b, n-1);
        }
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        sc.close();
        printFactorial(0, 1, num);
        }
}
