package lt.bit.Savaite2;

import java.util.Scanner;

public class MasyvElementVidurkisSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] masyvas = new int[]{2, 3, 999, 6};
        double vid = masyvoElemtuvidurkis(masyvas);
        System.out.println(vid);
    }

    public static int masyvoElementoSuma(int[] x) {

        int suma = 0;
        for (int i = 0; i < x.length; i++) {
            suma = suma + x[i];

        }
        return suma;
    }

    public static double masyvoElemtuvidurkis(int[] x) {
        int suma = masyvoElementoSuma(x);
        return 1.0 * suma / x.length;

    }
}
