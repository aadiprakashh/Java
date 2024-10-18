import java.util.Scanner;

public class trytic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // initalize board
        char[][] board = new char[3][3];

        // initilize player
        char player = 'X';

        // flow of game
        boolean play = true;

        while (play) {
            System.out.println("Select 1.Continue & 2.Exit: ");
            int val = sc.nextInt();
            switch (val) {
                case 1:
                    System.out.println("Player " + player + " turn ");
                    System.out.println("Enter row & col: ");
                    int row = sc.nextInt();
                    int col = sc.nextInt();
                    board[row][col] = player;
                    System.out.println();
                    printboard(board);
                    if(check(board, player)== true){
                        play=false;
                    }
                    player = switchplayer(player);
                    System.out.println("Player " + player + " turn ");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Exiting....");
                    play = false;
                    break;
                default:
                    System.out.println("Invalid move");
                    break;
            }
        }

    }

    // Declare printboard as static to allow calling from main method
    public static void printboard(char[][] board) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }

    // player switch
    public static char switchplayer(char player) {
        return player = (player == 'X') ? 'O' : 'X';

    }
    // checks the winning condition
    public static boolean check(char[][] board, char player){
        if (Winner(board, player) == true) {
            System.out.println("Player " + player + " wins");
            return true;
        } else {
            return false;
        }
    }
    //winning conditions
    public static boolean Winner(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
        }
        return false;
    }
}
