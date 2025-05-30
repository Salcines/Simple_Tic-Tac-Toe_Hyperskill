import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int size = arr.length - 1;
        int temp = 0;
        for (int i = 0; i < steps; i++) {
            temp = arr[size];
            
            for (int j = size; j > 0 ; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
