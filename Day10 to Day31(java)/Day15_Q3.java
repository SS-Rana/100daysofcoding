import java.util.Scanner;

public class Day15_Q3 {
    public static void printSum(int n, int sum) {
        if(n == 0) {
        System.out.println(sum);
        return;
        }
        sum += n;
        printSum(n-1, sum);
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        printSum(num, 0);
        sc.close();

    }
}
