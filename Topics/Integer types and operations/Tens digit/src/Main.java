import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tens = 0;
        int numero = scanner.nextInt();

        if (numero >= 0 && numero <=1_000_000) {    
            tens = (numero / 10) % 10;
        }

        System.out.println(tens);
    }
}
