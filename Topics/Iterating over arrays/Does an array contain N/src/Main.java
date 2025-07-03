import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] elements = new int[size];

        for (int i = 0; i < size; i++) {
            elements[i] = scanner.nextInt();
        }

        int elementToSearch = scanner.nextInt();

        boolean isFound = false;

        for (int element : elements) {
            if (element == elementToSearch) {
                isFound = true;
                break;
            }
        }

        System.out.println(isFound);
    }
}