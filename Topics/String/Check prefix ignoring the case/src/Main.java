import java.sql.SQLOutput;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final char PREFIX_GIVEN = 'j';

        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toLowerCase();

        System.out.println((text.charAt(0) == PREFIX_GIVEN) ? "true" : "false");
    }
}