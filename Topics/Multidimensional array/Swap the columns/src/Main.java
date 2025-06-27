import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] elements = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                elements[i][j] = scanner.nextInt();
            }
        }

        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();

        for (int [] row : elements) {
            int temp = row[indexOne];
            row[indexOne] = row[indexTwo];
            row[indexTwo] = temp;

            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}