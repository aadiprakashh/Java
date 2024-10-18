import java.util.Scanner;

public class tic {

    public static void main(String[] args) {
        // Game board represented as a 3x3 character array
        char[][] board = new char[3][3];
        initializeBoard(board);

        // Player turn indicator (`X` or `O`)
        char currentPlayer = 'X';

        // Game loop continues until a winner is found or board is full
        while (true) {
            // Display the current game board
            printBoard(board);

            // Get player's move (row and column)
            int row = getPlayerMove(currentPlayer, "row");
            int col = getPlayerMove(currentPlayer, "column");

            // Validate move and place the mark
            if (isValidMove(board, row, col)) {
                board[row][col] = currentPlayer;
                // Check for winner or draw after each move
                if (checkWinner(board) != ' ') {
                    printBoard(board);
                    System.out.println("Player " + checkWinner(board) + " wins!");
                    break;
                } else if (isBoardFull(board)) {
                    printBoard(board);
                    System.out.println("It's a draw!");
                    break;
                }
            } else {
                System.out.println("Invalid move. Please try again.");
                continue;
            }

            // Switch player turn
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }
    }

    // Function to initialize the board with empty spaces
    private static void initializeBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    // Function to display the current state of the board
    private static void printBoard(char[][] board) {
        // System.out.println("  |  | ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            // System.out.println("  |  | ");
        }
    }

    // Function to get player's move (row and column)
    private static int getPlayerMove(char player, String type) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Player " + player + ", enter the " + type + " number (1-3): ");
        int move;
        try {
            move = scanner.nextInt() - 1; // Adjust for 0-based indexing
            if (move < 0 || move > 2) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            return getPlayerMove(player, type); // Recursive call to get valid input
        }
        return move;
    }

    // Function to check if a move is valid (empty space)
    private static boolean isValidMove(char[][] board, int row, int col) {
        return board[row][col] == ' ';
    }

    // Function to check if there's a winner (X, O, or none)
    private static char checkWinner(char[][] board) {
        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return board[i][0];
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return board[0][i];
            }
        }

                // Check diagonals
                if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
                    return board[0][0];
                }
                if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
                    return board[0][2];
                }
        
                // If no winner, return space character to indicate draw or continue playing
                return ' ';
            }
        
            // Function to check if the board is full (no more moves possible)
            private static boolean isBoardFull(char[][] board) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (board[i][j] == ' ') {
                            return false;
                        }
                    }
                }
                return true;
            }
        }