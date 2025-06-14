import java.util.Scanner;

//using break and continue
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalElements = scanner.nextInt();
        int currentNumber = 1;
        int repetitionCount = 1;
        int printedElements = 0;

        while (true) {
            if (printedElements >= totalElements) {
                break;
            }

            if (repetitionCount > currentNumber) {
                currentNumber++;
                repetitionCount = 1;
                continue;
            }

            System.out.print(currentNumber + " ");
            repetitionCount++;
            printedElements++;
        }
    }
}