import java.util.Scanner;
public class Day4_Q1 {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner (System.in);
     System.out.println("Enter your String: ");
     String string = sc.next();
     String result = "";


     for(int i=0; i<string.length(); i++) {
       if(string.charAt(i) == 'e') {
         result += 'i';
       } else {
         result += string.charAt(i);
       }
     }


     System.out.println("The e in the string is replaced with i : \n"+ result);
     sc.close();
   }
}

    


