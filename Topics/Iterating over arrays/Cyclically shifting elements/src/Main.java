import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output = "";
        int numberOfElements = scanner.nextInt();
        String[] array = new String[numberOfElements];

        for(int i = 0; i < numberOfElements; i++) {
            array[i] = scanner.next();
        }

        ShiftedElements(array);        

        for (String elementsShited : array) {
            output += elementsShited + " ";
        }

        System.out.println(output.trim());

    }

    public static void ShiftedElements(String[] elementsToShift) {
        int index = elementsToShift.length - 1;
        
        String temp = elementsToShift[index];
        
        for(int i = index; i > 0; i--) {
            elementsToShift[i] = elementsToShift[i -1]; 
        }
        elementsToShift[0] = temp;
    }
}
