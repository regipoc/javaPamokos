package lt.bit;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite indeksa");
        int indexNumber = scanner.nextInt();

        int[] fibonachiNumbers = new int[indexNumber + 1];
        fibonachiNumbers[0] = 0;
        fibonachiNumbers[1] = 1;

        for (int i = 0; i < indexNumber; i++) {
            int j = i + 1;
            int k = j + 1;
            if (k > indexNumber) {
                break;

            }
            fibonachiNumbers[k] = fibonachiNumbers[i] + fibonachiNumbers[j];
        }

        System.out.println(fibonachiNumbers[indexNumber]);


    }
}


