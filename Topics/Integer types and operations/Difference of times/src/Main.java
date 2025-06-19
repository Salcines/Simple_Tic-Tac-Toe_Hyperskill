import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        final int secondsInAHour = 3600;
        final int secondsInAMinute = 60;

        Scanner scanner = new Scanner(System.in);
        int firstHoursTime = scanner.nextInt();
        int firstMinutesTime = scanner.nextInt();
        int firstSecondsTime = scanner.nextInt();

        int secondHoursTime = scanner.nextInt();
        int secondMinutesTime = scanner.nextInt();
        int secondSecondsTime = scanner.nextInt();

        int differenceInSeconds = 
            secondHoursTime * secondsInAHour + secondMinutesTime * secondsInAMinute + secondSecondsTime - 
             (firstHoursTime * secondsInAHour + firstMinutesTime * secondsInAMinute + firstSecondsTime);

        System.out.println(differenceInSeconds);
        
    }
}
