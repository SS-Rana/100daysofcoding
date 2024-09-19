import java.util.Scanner;

public class Day15_Q6 {
public static int power(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(n % 2 == 0){
            return power(x, n/2) * power(x, n/2);
        }
        else{
            return power(x,n/2) * power(x, n/2) * x;
        }
    }
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();
        sc.close();
        int result = power(x, num);
        System.out.println(result);
    } 
}