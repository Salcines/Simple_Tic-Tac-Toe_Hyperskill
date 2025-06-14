import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberToCheck = 0;
        
        while (true) {
            numberToCheck = scanner.nextInt();

            if (numberToCheck == 0) break;

            System.out.println(numberToCheck % 2 == 0 ? "even" : "odd");
        }
    }
}
