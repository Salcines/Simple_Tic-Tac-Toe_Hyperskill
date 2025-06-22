import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] elements = new int[size];
        for (int i = 0; i < size; i++) {
            elements[i] = input.nextInt();
        }
        int elementToSearch = input.nextInt();
        int frecuency = 0;

        for (int element : elements) {
            if (element == elementToSearch) {
                frecuency++;
            }

        }

        System.out.println(frecuency);
    }
}