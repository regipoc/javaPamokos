package lt.bit.Savaite5;

public class Statybinkas {
    //Statybininkui reikia pastatyti sieną, kurios ilgis yra a metrų, o aukštis h metrų
    // (a ir h – sveikieji skaičiai). Kiek reikės plytų, kurių ilgis 20 cm, o aukštis 10 cm
    // ir kiek kainuos plytos, jeigu vienos plytos kaina k Lt. Pinigų sumą pateikti šimtųjų tikslumu.

    public static void main(String[] args) {
        // Plotis
        int a = 4;
        // Aukstis
        int h = 3;

        double plytosIlgis = 0.20;
        double plytosAukstis = 0.10;

        double k = 0.5;

        double sienosPlotas = a * h;
        double plytosPlotas = plytosIlgis * plytosAukstis;

        int plytuKiekis = (int) Math.ceil(sienosPlotas / plytosPlotas);
        System.out.println("Plytu kiekis: " + plytuKiekis);
        double plytuKaina = plytuKiekis * k;
        System.out.println("Plytos kainuos " + String.format("%.2f", plytuKaina) + " Lt");
    }
}

