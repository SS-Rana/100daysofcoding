import java.util.Scanner;

public class Day4_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Row and Col in the matrix: ");
        
        int rows = sc.nextInt();
        int cols = sc.nextInt();


       int matrix[][] = new int[rows][cols];

        System.out.println("Enter the data in the matrix");
       for(int i=0; i<rows; i++) {
         
           for(int j=0; j<cols; j++) {
               matrix[i][j] = sc.nextInt();
           }
       }
       System.out.println("The matrix: ");
       for(int i=0; i<rows; i++) {
         
        for(int j=0; j<cols; j++) {
           System.out.print(matrix[i][j]+" ");
        }
        System.err.println();
    }


    System.out.println("Enter the number you want to search in matrix");
       int x = sc.nextInt();


       for(int i=0; i<rows; i++) {
           for(int j=0; j<cols; j++) {
             
               if(matrix[i][j] == x) {
                   System.out.println("x found at location (" + i + ", " + j + ")");
               }
           }
       }
       sc.close();

    }
}
