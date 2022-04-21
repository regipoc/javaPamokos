package lt.bit.Savaite1;

import java.util.Scanner;

public class RastiSkaicius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Teigiami skaiciai");
        int number = scanner.nextInt();
        for(int i = 1; 1 <= number; i++) {
            if (number % 3 == 0 && number % 7 == 0) {
                System.out.println("Fizzz Buzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 7 == 0) {
                System.out.println("Buzz");
            }
        }
        System.out.println("Skaicius nesidalina is 3 arba 7");



    }

}
