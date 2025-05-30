import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        final int SIZE = numbers.length;

        for (int i = 0; i < SIZE; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println(numbers[0]);
    }
}