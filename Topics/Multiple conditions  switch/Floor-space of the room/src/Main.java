import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape =  scanner.nextLine().toLowerCase();
        double area = 0.0f;

        switch (shape) {
            case "circle":
                double radius = scanner.nextDouble();
                area = 3.14 * radius * radius;
                break;

            case "rectangle":
                double length = scanner.nextInt();
                double width = scanner.nextInt();

                area = length * width;
                break;

                case "triangle":
                    double sideFirst = scanner.nextInt();
                    double sideSecond = scanner.nextInt();
                    double sideThird = scanner.nextInt();

                    //Using Heron's formula
                    double semiperimeter = (sideFirst + sideSecond + sideThird) / 2;

                    area = Math.sqrt(semiperimeter * ((semiperimeter - sideFirst) *
                            (semiperimeter - sideSecond) * (semiperimeter - sideThird)));
                    break;
        }

        System.out.println(area);
    }
}