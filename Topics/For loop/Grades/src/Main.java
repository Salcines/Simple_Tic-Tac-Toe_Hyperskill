import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGrades = scanner.nextInt();
        int totalA = 0;
        int totalB = 0;
        int totalC = 0;
        int totalD = 0;
        String grade;

        for (int i = 0; i <= numberOfGrades; i++) {
            grade = scanner.nextLine();
            if (grade.equals("A")) {
                totalA++;
            }
            if (grade.equals("B")) {
                totalB++;
            }
            if (grade.equals("C")) {
                totalC++;
            }
            if (grade.equals("D")) {
                totalD++;
            }
        }

        System.out.println(totalD + " " + totalC + " " + totalB + " " + totalA);
    }
}