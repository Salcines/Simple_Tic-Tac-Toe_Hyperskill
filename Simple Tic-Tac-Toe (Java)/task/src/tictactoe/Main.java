package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        final int ROWS = 3;

        Scanner scanner = new Scanner(System.in);
        String gamble = scanner.nextLine();
        String output = "";
        int row = gamble.length() / ROWS;

        System.out.println("---------");

        for (int i = 0; i < gamble.length(); i += row) {
            output = String.format("|%s|", gamble.substring(i, i + row));

            System.out.println(String.join(" ", output.split("")));
        }
        System.out.println("---------");
    }

}
