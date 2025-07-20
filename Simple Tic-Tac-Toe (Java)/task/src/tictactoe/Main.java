package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int ROWS = 3;
        final char FIRSTPLAYER = 'X';
        final char SECONDPLAYER = 'O';

        Scanner scanner = new Scanner(System.in);

        char player = FIRSTPLAYER;
//        String gamble = scanner.nextLine();
//
//        gamble = gamble.replace("_", " ");

        char[][] board = new char[ROWS][ROWS];

        // Initialize board
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < ROWS; j++) {
                board[i][j] = ' ';
                // board[i][j] = gamble.charAt(i * ROWS + j);
            }
        }

        boolean gameOver = false;
        printBoard(ROWS, board);

        do {
            makeMove(board, player);
            gameOver = analyzeBoard(board);

            player =  player == FIRSTPLAYER ? SECONDPLAYER : FIRSTPLAYER;
        } while (!gameOver);

         scanner.close();
    }

    private static void makeMove(char[][] board, char player) {
        int row = -1;
        int column = -1;

        boolean isInputInvalid = false;

        do {
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                row = scanner.nextInt() - 1;
                column = scanner.nextInt() - 1;
            } else {
                isInputInvalid = true;
                System.out.println("You should enter numbers!");
                continue;
            }

            if ((row < 0 || row > board.length - 1) || (column < 0 || column > board.length - 1)) {
                isInputInvalid = true;
                System.out.println("You should enter numbers from 1 to 3!");
                continue;
            }

            if (board[row][column] == ' ') {
                    board[row][column] = player;
                    isInputInvalid = false;
            } else {
                isInputInvalid = true;
                System.out.println("This cell is occupied! Choose another one...");
            }
        } while (isInputInvalid);
        
        printBoard(board.length, board);
    }

    private static void printBoard(int ROWS, char[][] board) {
        System.out.println("---------");

        // Print the board
        for (int i = 0; i < ROWS; i++) {
            System.out.print("| ");
            for (int j = 0; j < ROWS; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    private static boolean analyzeBoard(char[][] board) {

        GameAnalyzer analyzer = new GameAnalyzer(board);
        return analyzer.analyze();
    }
}

    class GameAnalyzer {
        private final char[][] board;

        public GameAnalyzer(char[][] board) {
            this.board = board;
        }

        public Boolean analyze() {
            boolean isXWinner = checkWinner('X');
            boolean isOWinner = checkWinner('O');
            boolean isDraw = isDraw();

            if (isXWinner){
                System.out.println("X wins");
                return true;
            }
            if (isOWinner){
                System.out.println("O wins");
                return true;
            }
            if (isDraw){
                System.out.println("Draw");
                return true;
            }
            return false;
        }

        private boolean isDraw() {
            for (char[] row : board) {
                for (char cell : row) {
                    char EMPTY_CELL = ' ';
                    if (cell == EMPTY_CELL) {
                        return false;
                    }
                }
            }
            return true;
        }

        private boolean checkWinner(char player) {
            return checkRows(player) || checkColumns(player) || checkDiagonals(player);
        }

        private boolean checkRows(char player) {
            for (char[] chars : board) {
                if (chars[0] == player && chars[1] == player && chars[2] == player) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkColumns(char player) {
            for (int i = 0; i < board.length; i++) {
                if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                    return true;
                }
            }
            return false;
        }

        private boolean checkDiagonals(char player) {
            return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                    (board[0][2] == player && board[1][1] == player && board[2][0] == player);
        }
    }
