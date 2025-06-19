import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = scanner.nextLong();
        String operator = scanner.next();
        long second = scanner.nextLong();

        switch (operator) {
            case "+":
                System.out.println(first + second);
                break;
            case "-":
                System.out.println(first - second);
                break;
            case "*":
                System.out.println(first * second);
                break;
            case "/":
                String result = (second == 0) ? "Division by 0!" : String.valueOf(first / second);
                System.out.println(result);
            break;
            default:
                System.out.println("Unknown operator");
    }
    }
}