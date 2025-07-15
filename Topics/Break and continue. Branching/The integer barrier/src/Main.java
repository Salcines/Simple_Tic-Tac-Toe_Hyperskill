import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            int input = scanner.nextInt();
            if (input == 0 || sum >= 1000) {
                break;
            }
            sum += input;
        }

        System.out.println(sum < 1000 ? sum : (sum - 1000));
    }
}