import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int dividend = scanner.nextInt();
        int counter = 0;

        // I'm propuse two solutions. One with the for loop because is the actual lesson
        // the other more efficenly and without use loop. Only pure mathematical
        // Complexity O(B)
        for (int i = start; i <= end; i++) {
            if (i % dividend == 0) {
                counter++;
            }
        }
        System.out.println(counter);        

        /*
        //Complexity O(1)
        System.out.println(start % dividend == 0 ? 
                          (end / dividend) - (start / dividend) + 1 :
                           (end / dividend) - (start / dividend));
        */
    }
}
