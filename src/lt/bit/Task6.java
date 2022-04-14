package lt.bit;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Suma nuo 1 iki n");
        int number = scanner.nextInt();
        double hn = 0;
        for (int i = 1; i <= number; i++) {
            hn += 1.0 / i;
            System.out.println("Skaiciai nuo n");
        }
    }
}