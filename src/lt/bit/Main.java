package lt.bit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i < 100; i++){
            if(i == 0){
                // Peršokti į kitą iteraciją
                continue;

                // break - > visiškai išeina iš ciklo.
            }

            System.out.println("Kvadratas yra: " + Math.pow(i, 2));
        }

        // iseina is ciklų, kur apačioje
        ciklas:
        for (int i =0; i < 100; i++){
            for (int j = 0; j < 100; j++){

                System.out.println("Labas");
                break ciklas;
            }
        }
    }
}


