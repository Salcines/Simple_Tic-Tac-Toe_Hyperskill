import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfParts = scanner.nextInt();
        int partsFixed = 0;
        int partsRejected = 0;
        int partsReady = 0;
        int detector;

        for (int partNumber = 1; partNumber <= numberOfParts; partNumber++) {
            detector = scanner.nextInt();

            if (detector == 1) {
                partsFixed++;
            }

            if (detector == -1) {
                partsRejected++;
            }

            if (detector == 0) {
                partsReady++;
            }
        }

        System.out.println(partsReady + " " + partsFixed + " " + partsRejected);
    }
}