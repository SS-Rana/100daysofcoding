public class Day4_Q2 {
    public static void main(String[] args) {
        int matrix[][] = {
            { 1, 2, 3, 4 },
            { 5, 6, 7, 8 },
            { 9, 10, 11, 12 },
            { 13, 14, 15, 16 } 
        };
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0, right = col-1;
        int top = 0, bottom = row-1;
        
        while(top<=bottom && left<=right){
            for(int i=left; i<=right; i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right]+" ");
            }
            right--;
            for(int i=right; i>=left; i--){
                System.out.print(matrix[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom; i>=top; i--){
                System.out.print(matrix[i][left]+" ");
            }
           left++;
         }

        
    }
    

}
