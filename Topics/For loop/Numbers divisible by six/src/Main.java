import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int numberInSequence = 0;
        int counter = scanner.nextInt();

        for(int i = 0; i < counter; i++) {
            numberInSequence = scanner.nextInt();

            if (numberInSequence % 6 == 0) {
                total+=numberInSequence;
            }
        }

        System.out.println(total);
    }
}