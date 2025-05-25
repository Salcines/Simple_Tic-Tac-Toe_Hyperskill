import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final float PI  = 0.000001f;
        Scanner scanner = new Scanner(System.in);

        double firstNumber = scanner.nextDouble();
        double secondNumber = scanner.nextDouble();

        System.out.println(secondNumber - firstNumber);
    }
}