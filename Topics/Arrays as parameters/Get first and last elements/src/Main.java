import java.util.*;
import java.util.stream.IntStream;

public class Main {

    // write a method here
    public static int[] getFirstAndLast(int[] arr) {
        IntStream stream = Arrays.stream(arr);

        OptionalInt streamFirst = stream.findFirst();

        int[] result = new int[]
                { streamFirst.isPresent() ? streamFirst.getAsInt() : -1 , arr[arr.length - 1]};
        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}