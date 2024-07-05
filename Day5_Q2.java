import java.util.Scanner;

public class Day5_Q2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String str1 = sc.nextLine();
       String word[] = str1.split(" ");

       StringBuilder str2 = new StringBuilder("");
       for(int i=0; i<word.length; i++){
        if(word[i].length() % 2 == 0){
            str2.append(word[i]).append(" ");
        }
       }
       System.out.println(str2);
       sc.close();
    }
    
}
