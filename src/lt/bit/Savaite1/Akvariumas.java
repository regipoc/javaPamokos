package lt.bit.Savaite1;

import java.util.Scanner;

public class Akvariumas {

    // Akvariume gyvena a žuvų. Kiekvieną dieną Petriukas į akvariumą įdeda b žuvų.
   // Parašykite programą, kuri suskaičiuotų kiek iš viso bus žuvų po n dienų.
   // Rezultatą reikia išvesti su paaiškinamaisiais žodžiais.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek zuvu gyvena akvariume");
        int zuvuKiekis = sc.nextInt();
        System.out.println("Kiek zuvu i akvariuma idedama kiekveina diena");
        int kiekIdedama = sc.nextInt();
        System.out.println("Kiek dienu praejo");
        int kiekDienuPraejo = sc.nextInt();

        int kiekBusPoTrijuDienu = zuvuKiekis + kiekIdedama * kiekDienuPraejo;
        System.out.println("Po" + kiekDienuPraejo + "dienu akvariume gyvens" + kiekBusPoTrijuDienu + "zuvu");

    }
}
