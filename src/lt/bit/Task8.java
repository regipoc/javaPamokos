package lt.bit;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = 0;
        float b = 0;

        try {
            System.out.println("Enter a");
            a = scanner.nextFloat();

            System.out.println("Enter operation (+-/*)");
            String operacija = scanner.next();

            System.out.println("Enter b");
            b = scanner.nextFloat();

            calculate(a, operacija, b);
        } catch (ClassCastException e) {
            System.out.println("Illegal format, please provide numbers. Provided values: " + a + ", and " + b);
        }
    }

    private static void calculate(float a, String operacija, float b) {
        switch (operacija) {
            case "+":
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case "-":
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Cannot calculate. Division by zero prohibited.");
                } else {
                    System.out.println(a + " / " + b + " = " + (a / b));
                }
                break;
            case "*":
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            default:
                System.out.println("Invalid simbol");
        }
    }
}
