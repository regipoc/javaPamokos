package lt.bit.Savaite2;

import java.util.Scanner;

public class SudetiDuSkaicius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = sudetiDuSkaicius(9999.0,4.0);
        System.out.println(suma);
    }

    public static double sudetiDuSkaicius(double x, double y) {
        return x + y;
    }
}

