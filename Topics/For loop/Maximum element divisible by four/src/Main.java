import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int maximumElement = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfElements; i++) {
            int currentElement = scanner.nextInt();
            if (currentElement % 4 == 0 && currentElement > maximumElement) {
                maximumElement = currentElement;
            }
        }

        System.out.println(maximumElement);
    }
}