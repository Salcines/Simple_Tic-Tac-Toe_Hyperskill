import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int firstNumber = scanner.nextInt();
        int lastNumber = scanner.nextInt();
        int total = 0;
        
        //sum of integers through for loop => O(n)
        for (int i = firstNumber; i <= lastNumber; i++) {
            total += i;
        }
        
        /*
        // Sum of integers through gaussian sum => n((n-1) / 2)
        // In this case the formula will be: [(firstNumber + lastNumber) * termsNumber] / 2
        // O(1)

        int termsQuantity = (lastNumber - firstNumber) + 1;

        total = ((firstNumber + lastNumber) * termsQuantity) / 2;
        */
        System.out.println(total);
    }
}
