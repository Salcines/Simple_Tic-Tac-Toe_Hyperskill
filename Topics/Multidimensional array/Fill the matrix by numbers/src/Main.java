import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        if (size >= 100) {
            return;
        }
        int[][] matrix = new int[size][size];

        // Calculate the values of the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int distance = i - j;
                // if distance is negative, convert it to positive
                if (distance < 0) {
                    distance = -distance;
                }

                System.out.print(distance + " ");
            }
            System.out.println();
        }
    }
}

