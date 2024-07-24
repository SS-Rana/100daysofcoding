import java.util.ArrayList;
import java.util.List;

public class Day19 {

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        int[][] board = new int[n][n];
        solveNQueensUtil(board, 0, n, solutions);
        return solutions;
    }

    public static void solveNQueensUtil(int[][] board, int row, int n, List<List<String>> solutions) {
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < n; j++) {
                    sb.append(board[i][j] == 1 ? 'Q' : '.');
                }
                solution.add(sb.toString());
            }
            solutions.add(solution);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row][col] = 1;
                solveNQueensUtil(board, row + 1, n, solutions);
                board[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] board, int row, int col, int n) {
        // Check if there is a queen in the same column up to the current row
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 1) {
                return false;
            }
        }

        // Check upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        // Check upper right diagonal
        for (int i = row, j = col; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        System.out.println("Number of solutions for " + n + "-Queens problem: " + solutions.size());
        for (List<String> solution : solutions) {
            System.out.println("Solution:");
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
