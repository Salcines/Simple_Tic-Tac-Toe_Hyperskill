import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        boolean isAlphabeticalOrder = true;

        Scanner scanner = new Scanner(System.in);

        String[] inputArray = scanner.nextLine().toLowerCase().split("\\s+");

        for (int i = 0; i < inputArray.length - 1 && isAlphabeticalOrder; i++) {
            isAlphabeticalOrder = inputArray[i].compareTo(inputArray[i + 1]) <= 0;

        }

        System.out.println(isAlphabeticalOrder);

    }
}