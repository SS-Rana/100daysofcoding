import java.util.Scanner;
public class Day1_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();
        sc.close();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num - i; j++) {
                if(i==0 || i==num-1 || j==0 || j== num-i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= num - i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if(i==1 || i==num || j==1 || j==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
