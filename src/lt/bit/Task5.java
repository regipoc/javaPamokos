package lt.bit;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Teigiami skaiciai");
        int number = scanner.nextInt();
        for (int i = 2; i <= number; i++){
            int counter = 0;
            for (int j = 1; j >= 2; j++) {
                if (i % j == 0) {
                    counter++;
                }
            }
            if(counter == 1){
                System.out.println("Pirminis skaicius: " +1);

            }
        }

    }
}
