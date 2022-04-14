package lt.bit;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Iveskite a");
        int a = scanner.nextInt();
        System.out.println("Iveskite b");
        int b = scanner.nextInt();
        System.out.println("Iveskite c");
        int c = scanner.nextInt();
        double delta = Math.pow(b, 2) - (4 * a * c);
        if (delta < 0) {
            System.out.println("Delta negative");
            } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + "x2 = " + x2);
            }
        }
}
