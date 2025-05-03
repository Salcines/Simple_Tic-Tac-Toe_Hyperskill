import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];
        int numbersIndex = numbers.length - 1;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int first = scanner.nextInt();
        int second = scanner.nextInt();

        boolean straight = false;

        for (int i = 0; i < numbersIndex; i++) {
            if (first == numbers[i]  && second == numbers[i + 1]
            || second == numbers[i] && first == numbers[i + 1]) {
                straight = true;
                break;
            }
        }

        System.out.println(straight);
    }
}