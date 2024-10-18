import java.util.Scanner;
public class SudokuSolver {
    private static final int N = 9;
    private static int[][] grid = new int[N][N];
    private static int emptyRow, emptyCol; 
    
    public static void main(String[] args) {
        readInput();   //grid input
        System.out.println("Input Sudoku Puzzle:");
        printGrid();    //print grid

        if (solveSudoku()) {
            System.out.println("\nSolved Sudoku Puzzle:");
            printGrid();
        } else {
            System.out.println("\nNo solution exists.");
        }
    }

    private static void readInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sudoku Puzzle (Use '0' for empty cells):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
    }

    private static boolean solveSudoku() {
        int row, col;
        if (!findEmptyCell()) {
            return true; // Puzzle solved
        }
        row = emptyRow;
        col = emptyCol;

        for (int num = 1; num <= 9; num++) {
            if (isValid(row, col, num)) {
                grid[row][col] = num;

                if (solveSudoku()) {
                    return true;
                }

                grid[row][col] = 0; // Backtrack
            }
        }
        return false; // No solution found
    }

    private static boolean findEmptyCell() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (grid[i][j] == 0) {
                    emptyRow = i;
                    emptyCol = j;
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean isValid(int row, int col, int num) {
        return !usedInRow(row, num) && !usedInCol(col, num) && !usedInBox(row - row % 3, col - col % 3, num);
    }

    private static boolean usedInRow(int row, int num) {
        for (int j = 0; j < N; j++) {
            if (grid[row][j] == num) {
                return true;
            }
        }
        return false;
    }

    private static boolean usedInCol(int col, int num) {
        for (int i = 0; i < N; i++) {
            if (grid[i][col] == num) {
                return true;
            }
        }
        return false;
    }

        
    private static boolean usedInBox(int boxStartRow, int boxStartCol, int num) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (grid[i + boxStartRow][j + boxStartCol] == num) {
                    return true;
                }
            }
        }
        return false;
    }
    

    //display grid
    private static void printGrid() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
