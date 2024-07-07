import java.util.Scanner;

public class Day7_Q4 {
   
    public static Boolean ifPowOfTwo(int num){
        return num != 0 && ((num & num - 1) == 0);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
   
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
  
        if (ifPowOfTwo(num)) {
            System.out.println("The number is a power of 2");
        } else {
            System.out.println("The number is not a power of 2");
        }
        
       
        sc.close();
    }
}


