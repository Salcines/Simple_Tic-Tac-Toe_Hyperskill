package tictactoe;

public class Main {
    public static void main(String[] args) {
        final char FIRST_PLAYER = 'X';
        final char SECOND_PLAYER = 'O';
        final char EMPTY_CELL = ' ';

        char currentPlayer = FIRST_PLAYER;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(currentPlayer);
                System.out.print(EMPTY_CELL);
                currentPlayer = (currentPlayer == FIRST_PLAYER) ? SECOND_PLAYER : FIRST_PLAYER;
            }
            System.out.println();
        }




    }
}
