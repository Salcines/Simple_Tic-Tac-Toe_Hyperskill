import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elements = scanner.nextInt();
        int number = 1;
        int sequence = 1;
        int total = 0;

        do {

            System.out.print(number + " ");
            sequence++;

            if (sequence > number) {
                number++;
                sequence = 1;
            }
            total++;

        } while (total < elements);
    }
}