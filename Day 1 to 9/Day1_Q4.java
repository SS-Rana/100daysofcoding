import java.util.Scanner;

public class Day1_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();
        for (int line = 1; line <= n; line++) {
            int coef = 1;
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= line; i++) {
                System.out.print(coef + " ");
                coef = coef * (line - i) / i; 
            }
            System.out.println();
        }
    }
}


