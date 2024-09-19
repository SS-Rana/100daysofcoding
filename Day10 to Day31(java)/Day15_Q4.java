import java.util.Scanner;

public class Day15_Q4 {
    public static void printFactorial(int n, int x) {
        if(n == 0) {
        System.out.println(x);
        return;
        }
        x *= n;
        printFactorial(n-1, x);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        sc.close();
        printFactorial(num, 1);

    }
}
