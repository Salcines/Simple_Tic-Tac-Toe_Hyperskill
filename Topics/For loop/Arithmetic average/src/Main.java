import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // In this solution, we take advantage of the methods ceil
        //and floor. The problem is that this only work with
        //natural number, so we need to check if the initial number
        //is a integer number
        final int factor = 3;
        Scanner scanner = new Scanner(System.in);
        int signedStatus = 1;
        int total = 0;
        int length = 0;

        double initial = scanner.nextDouble();

        //Check if the number initial is natural and in the case
        //not we obtain the absolute number (without sign) and
        //create a variable to change the sign.
        if (initial < 0) {
            initial = Math.abs(initial);
            signedStatus = -1;
        }

        int starter = (int) Math.ceil(
                (initial * signedStatus) / factor) * factor;
        int ending = (int) Math.floor(
                scanner.nextDouble() / factor) * factor;

        for (int i = starter; i <= ending; i += factor) {
            total += i;
            length++;
        }
        System.out.println((double) total / (double) length);
    }
}