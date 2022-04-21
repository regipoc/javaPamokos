package lt.bit.Savaite2;

import java.util.Scanner;

public class Staciakampis {

    // Sukurti metoda apskaiciuotiPerimetra(x, y)
// Sukurti metoda apskaiciuotiPlota(x, y)
// Iskviesti is main ir atspausdinti rezultata kai krastine x = 4, o krastine y = 3.6

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rezultatasPerimetras = apskaiciuotiPerimetra(4.0, 3.6);
        double rezultatasPlotas = apskaiciuotiPlota(4.0, 3.6);
        System.out.println("Rezultatas: perimetras " + rezultatasPerimetras + ", plotas " + rezultatasPlotas);
    }

    public static double apskaiciuotiPerimetra(double x, double y) {
        return 2 * (x + y);
    }
    public static double apskaiciuotiPlota(double x, double y) {
        return x * y;
    }
}



