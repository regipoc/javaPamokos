package lt.bit.Savaite1;

import java.util.Scanner;

public class SuskaiciuotimonetasTaupykleje {

    //Jonas turi kiaulę taupyklę, kurioje yra a monetų po 5 ct, b monetų po 20 ct ir c monetų po 2 Lt.
    // Kitokios vertės monetų taupyklėje nėra. Parašykite programą, kuri suskaičiuotų,
    // kiek pinigų kiaulėje taupyklėje iš viso turi Jonas. Atsakymą pateikite litais,
    // pvz.: kai taupyklėje yra 12 monetų po 5 ct, 5 monetos po 20 ct ir 6 monetos po 2 Lt,
    // tuomet ekrane turi būti rodoma: Taupyklėje yra 13.60 Lt.

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
