import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean partySuccess = false;
        int reeses = scanner.nextInt();
        boolean isWeekend  = scanner.nextBoolean();

        if ((reeses >= 10 && reeses <= 20) && !isWeekend)
        {
            partySuccess = true;
        }

        if ((reeses >= 15 && reeses <= 25) && isWeekend)
        {
            partySuccess = true;
        }

        System.out.println(partySuccess);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
    }
}
