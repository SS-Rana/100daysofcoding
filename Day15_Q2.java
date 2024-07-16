import java.util.Scanner;

public class Day15_Q2 {
    public static void printNum(int i, int num){
        
        if(i==num){
            System.out.print(i+" ");
            return;
        }
        System.out.print(i+" ");
        printNum(i+1,num);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        printNum(1,num);
        sc.close();
    }
}
