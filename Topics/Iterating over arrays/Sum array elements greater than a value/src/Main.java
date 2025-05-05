import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        int value = scanner.nextInt();

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > value) {
                sum += numbers[i];
            }
        }

        System.out.println(sum);
    }
}