package lt.bit;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Iveskite indeksa");
        int number = scanner.nextInt();
        int suma = 0;

        while(number>8) {
            int digit = number % 10;
            suma += digit;
            number /= 10;
        }
        System.out.println("Suma: " + suma);

    }
}
