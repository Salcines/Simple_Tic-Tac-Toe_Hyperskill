import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int[] elements = new int[numberOfElements];
        
        for (int i = 0; i < numberOfElements; i++) {
            elements[i] = scanner.nextInt();
            if (elements[i] > max) {
                max = elements[i];
                index = i;
            }
        }

        System.out.println(index);
    }
}
