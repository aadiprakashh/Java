import java.util.Scanner;

public class ChessGame {
    public static void main(String[] args) {
        char[][] board = {
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.'},
                {'p', 'p', 'p', 'p', 'p', 'p', 'p', 'p'},
                {'r', 'n', 'b', 'q', 'k', 'b', 'n', 'r'}
        };

        // Display initial board
        printBoard(board);

        // Get user input for pawn move
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current position (row column) of the pawn:");
        int startRow = scanner.nextInt();
        int startCol = scanner.nextInt();
        System.out.println("Enter the target position (row column) for the pawn:");
        int targetRow = scanner.nextInt();
        int targetCol = scanner.nextInt();

        // Check the validity of the move and update the board
        if (isValidMove(board, startRow, startCol, targetRow, targetCol)) {
            movePawn(board, startRow, startCol, targetRow, targetCol);
            System.out.println("Pawn moved successfully!");
            // Display the updated chessboard
            printBoard(board);
        } else {
            System.out.println("Invalid move for the pawn!");
        }
    }

    // Function to move the pawn on the chessboard
    public static void movePawn(char[][] board, int startRow, int startCol, int targetRow, int targetCol) {
        char pawn = board[startRow][startCol];
        board[startRow][startCol] = '.'; // Clear the starting position
        board[targetRow][targetCol] = pawn; // Move the pawn to the target position
    }

    // Function to check if the pawn move is valid
    public static boolean isValidMove(char[][] board, int startRow, int startCol, int targetRow, int targetCol) {
        // Check if the target position is within the bounds of the board
        if (targetRow < 0 || targetRow >= board.length || targetCol < 0 || targetCol >= board[0].length) {
            return false;
        }
        // Check if the target position is empty
        if (board[targetRow][targetCol] != '.') {
            return false;
        }
        // Check if the pawn is moving forward
        if (startRow - targetRow != 1) {
            return false;
        }
        // Check if the pawn is moving diagonally to capture
        if (Math.abs(startCol - targetCol) != 1) {
            return false;
        }
        // All conditions passed, move is valid
        return true;
    }

    // Function to print the chessboard
    public static void printBoard(char[][] board) {
        System.out.println("   a b c d e f g h");
        System.out.println("   - - - - - - - -");
        for (int i = 0; i < 8; i++) {
            System.out.print((8 - i) + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
