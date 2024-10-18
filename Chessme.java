import java.util.Scanner;

public class Chessme {
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

        Scanner scanner = new Scanner(System.in);
        boolean play = true;

        while (play) {
            displayBoard(board);

            // Player's turn (White pieces)
            System.out.println("Player's Turn (White pieces):");
            System.out.print("Choose Piece (row column): ");
            int ir = scanner.nextInt();
            int ic = scanner.nextInt();

            System.out.print("Select position to move (row column): ");
            int fr = scanner.nextInt();
            int fc = scanner.nextInt();

            movePiece(board, ir, ic, fr, fc);

            displayBoard(board);

            // Check if there are any valid moves left for black pieces
            if (!hasValidMoves(board, 'p') && !hasValidMoves(board, 'r')
                && !hasValidMoves(board, 'n') && !hasValidMoves(board, 'b')
                && !hasValidMoves(board, 'q') && !hasValidMoves(board, 'k')) {
                System.out.println("No valid moves left for black pieces. Player wins!");
                break;
            }

            // Computer's turn (Black pieces)
            System.out.println("Computer's Turn (Black pieces):");
            makeComputerMove(board);

            // Check if there are any valid moves left for white pieces
            if (!hasValidMoves(board, 'P') && !hasValidMoves(board, 'R')
                && !hasValidMoves(board, 'N') && !hasValidMoves(board, 'B')
                && !hasValidMoves(board, 'Q') && !hasValidMoves(board, 'K')) {
                System.out.println("No valid moves left for white pieces. Computer wins!");
                break;
            }

            // Ask if the player wants to continue playing
            System.out.print("Continue playing? (yes/no): ");
            String response = scanner.next().toLowerCase();
            if (response.equals("no")) {
                play = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }

    public static void displayBoard(char[][] board) {
        System.out.println("\n   0 1 2 3 4 5 6 7");
        System.out.println("   - - - - - - - -");
        for (int i = 0; i < 8; i++) {
            System.out.print((i) + " | ");
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void movePiece(char[][] board, int ir, int ic, int fr, int fc) {
        char piece = board[ir][ic];
        board[ir][ic] = '.';
        board[fr][fc] = piece;
    }

    public static boolean hasValidMoves(char[][] board, char piece) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == piece) {
                    // Check if there's at least one valid move for this piece
                    // Implement your logic here to check valid moves for each piece type
                    return true;
                }
            }
        }
        return false;
    }

    public static void makeComputerMove(char[][] board) {
        // Implement logic to make a move for black pieces (computer)
        // For demonstration, we can simply move the first black piece found to a random valid position
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] == 'p' || board[i][j] == 'r'
                    || board[i][j] == 'n' || board[i][j] == 'b'
                    || board[i][j] == 'q' || board[i][j] == 'k') {
                    // Move this piece to a random valid position
                    int newRowIndex = (int) (Math.random() * 8);
                    int newColIndex = (int) (Math.random() * 8);
                    if (board[newRowIndex][newColIndex] == '.') {
                        movePiece(board, i, j, newRowIndex, newColIndex);
                        return; // Exit after making one move
                    }
                }
            }
        }
    }

    public static void findBlackMove(char[][] board) {
        // Loop through each black piece
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[i][j] >= 'a' && board[i][j] <= 'z') {
                    // Check if the piece can make a valid move
                    if (canMove(board, i, j, i + 1, j, board[i][j]) ||
                        canMove(board, i, j, i - 1, j, board[i][j]) ||
                        canMove(board, i, j, i, j + 1, board[i][j]) ||
                        canMove(board, i, j, i, j - 1, board[i][j]) ||
                        (board[i][j] == 'n' && canMove(board, i, j, i + 1, j + 2, board[i][j])) ||
                        (board[i][j] == 'n' && canMove(board, i, j, i + 1, j - 2, board[i][j])) ||
                        (board[i][j] == 'n' && canMove(board, i, j, i - 1, j + 2, board[i][j])) ||
                        (board[i][j] == 'n' && canMove(board, i, j, i - 1, j - 2, board[i][j]))) {
                        // If the piece can move, make the move and return
                        board[i][j] = board[i + 1][j];
                        board[i + 1][j] = (char) (board[i][j] - 32);
                        return;
                    }
                }
            }
        }
    }
    
    // Helper function to check if a piece can move to a given position
    public static boolean canMove(char[][] board, int ci, int cj, int fi, int fj, char piece) {
        if (fi < 0 || fi >= 8 || fj < 0 || fj >= 8) {
            return false;
        }
        if (board[fi][fj] == '.' || board[fi][fj] >= 'A' && board[fi][fj] <= 'Z') {
            return true;
        }
        if (piece == 'p' && Math.abs(fi - ci) == 1 && fj == cj && board[fi][fj] >= 'a' && board[fi][fj] <= 'z') {
            return true;
        }
        if (piece == 'n' && Math.abs(fi - ci) == 2 && Math.abs(fj - cj) == 2) {
            return true;
        }
        return false;
    }
}
