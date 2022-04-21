package lt.bit.Savaite1;

import java.util.Scanner;

public class SuskaiciuotimonetasTaupykleje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiek yra monetu po 5 ct?");
        double monetosPoPenkis = sc.nextDouble();
        System.out.println("Kiek yra monetu po 20 ct?");
        double monetosPoDvidesimt = sc.nextDouble();
        System.out.println("Kiek yra monetu po 2 lt?");
        int monetosPoDu = sc.nextInt();

        double res = monetosPoPenkis * 0.05 + monetosPoDvidesimt * 0.2 + monetosPoDu * 2;
        System.out.println("Taupykleje yra" + res + "Lt");


    }
}
