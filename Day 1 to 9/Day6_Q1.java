import java.util.Scanner;

public class Day6_Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str1 = sc.nextLine();
        String str2;
        StringBuilder sb = new StringBuilder(str1);
        sb.reverse();
        str2 = sb.toString();
        if(str1.compareTo(str2)==0){
            System.err.println("The String is a palindrome");
        }
        else{
            System.out.println("The String is not a palindrome");
        }
        sc.close();
    }
}
