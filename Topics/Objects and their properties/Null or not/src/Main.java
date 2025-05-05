import java.util.Objects;
import java.util.Scanner;

class Solution {

    public void printIsNull(Object o) {

        String message = (Objects.nonNull(o)) ? "It's an object" : "It's null";

        System.out.println(message);
    }
}

// Do not change the code below
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}