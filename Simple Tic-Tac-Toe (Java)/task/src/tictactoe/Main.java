package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int ROWS = 3;

        Scanner scanner = new Scanner(System.in);
        String gamble = scanner.nextLine();
        scanner.close();

        char[][] board = new char[ROWS][ROWS];

        // Fill the board with characters obtains by console
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < ROWS; j++) {
                board[i][j] = gamble.charAt(i * ROWS + j);
            }
        }

        printBoard(ROWS, board);

        analyzeBoard(board);
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

    private static void analyzeBoard(char[][] board) {

        GameAnalyzer analyzer = new GameAnalyzer(board);
        String result = analyzer.analyze();
        System.out.println(result);
    }
}

    class GameAnalyzer {
        private final char[][] board;

        public GameAnalyzer(char[][] board) {
            this.board = board;
        }

        public String analyze() {
            boolean emptyCells = hasEmptyCells();
            boolean isXWinner = checkWinner('X');
            boolean isOWinner = checkWinner('O');

            if (Math.abs(countOccurrences('X') - countOccurrences('O')) > 1 || (isXWinner && isOWinner)) {
                return "Impossible";
            }

            if (isXWinner){
                return "X wins";
            }
            if (isOWinner){
                return "O wins";
            }
            return emptyCells ? "Game not finished" : "Draw";
        }

        private boolean hasEmptyCells() {
            for (char[] row : board) {
                for (char cell : row) {
                    char EMPTY_CELL = '_';
                    if (cell == EMPTY_CELL) {
                        return true;
                    }
                }
            }
            return false;
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

        private int countOccurrences(char player) {
            int count = 0;
            for (char[] row : board) {
                for (char cell : row) {
                    if (cell == player) {
                        count++;
                    }
                }
            }
            return count;
        }
    }
