import java.util.Scanner;

public class Day2_Q1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int num = sc.nextInt();

        sc.close();
        for(int i=1; i<=num/2; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=num-2*i; j>=1; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=num/2; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=num-2*i; j>=1; j--){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
