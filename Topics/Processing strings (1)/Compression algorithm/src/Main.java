import java.util.Scanner;

class Main {
    public static void main(String[] args) {
            Scanner input  = new Scanner(System.in);
            String decompressed = input.nextLine();
            StringBuilder output = new StringBuilder();
            char characterToCount = decompressed.charAt(0);
            int counter = 1;

            for (int i = 1; i < decompressed.length(); i++) {
                if (decompressed.charAt(i) == characterToCount) {
                    counter++;
                } else {
                    output.append(characterToCount).append(counter);
                    characterToCount = decompressed.charAt(i);
                    counter = 1;
                }
            }

            System.out.println(
                    output.append(
                            characterToCount
                    ).append(counter));
    }
}