import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int startPosition = scanner.nextInt();
        int endPosition = scanner.nextInt() + 1;

        System.out.println(input.substring(startPosition, endPosition));
    }
}