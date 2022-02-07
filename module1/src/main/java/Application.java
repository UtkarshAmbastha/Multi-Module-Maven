import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Press 1 for Addition ");
        System.out.println("Press 2 for Subtraction ");
        System.out.println("Press 3 for Multiplication ");
        System.out.println("Press 4 for Division ");

        int option = sc.nextInt();

        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        final int multi = 3;
        final int max = 4;

        MyCalculator myCalculator = new MyCalculator();

        if (option == 1) {
            myCalculator.add(a,b);

        } else if (option == 2) {
            myCalculator.subtract(a, b);

        } else if (option == multi) {
            myCalculator.multiplication(a, b);

        } else if (option == max) {
            myCalculator.division(a, b);

        } else {
            System.out.println("Incorrect Option");
        }

    }
}
