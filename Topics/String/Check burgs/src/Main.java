import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final String NAME_ENDS = "burg";

        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();

        System.out.println(city.endsWith(NAME_ENDS) ? "true" : "false");

    }
}