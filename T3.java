import java.util.Scanner;

public class T3 {

    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        char player = 'X';
        int moves = 0;

        System.out.println("===== TIC-TAC-TOE =====");
        System.out.println("Player 1 = X");
        System.out.println("Player 2 = O");

        while (true) {

            printBoard();

            System.out.print("Player " + player + ", choose a position (1-9): ");
            int position = sc.nextInt();

            if (position < 1 || position > 9) {
                System.out.println("Invalid position! Choose 1-9.");
                continue;
            }

            int row = (position - 1) / 3;
            int col = (position - 1) % 3;

            if (board[row][col] == 'X' || board[row][col] == 'O') {
                System.out.println("That position is already taken!");
                continue;
            }

            board[row][col] = player;
            moves++;

            if (checkWinner(player)) {
                printBoard();
                System.out.println("🎉 Player " + player + " wins!");
                break;
            }

            if (moves == 9) {
                printBoard();
                System.out.println("🤝 It's a draw!");
                break;
            }

            if (player == 'X') {
                player = 'O';
            } else {
                player = 'X';
            }
        }

        sc.close();
    }

    // Display the board
    static void printBoard() {

        System.out.println();
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }

    // Check whether the player has won
    static boolean checkWinner(char player) {

        // Check rows
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player &&
                board[i][1] == player &&
                board[i][2] == player) {
                return true;
            }
        }

        // Check columns
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == player &&
                board[1][i] == player &&
                board[2][i] == player) {
                return true;
            }
        }

        // Check diagonals
        if (board[0][0] == player &&
            board[1][1] == player &&
            board[2][2] == player) {
            return true;
        }

        if (board[0][2] == player &&
            board[1][1] == player &&
            board[2][0] == player) {
            return true;
        }

        return false;
    }
} 
