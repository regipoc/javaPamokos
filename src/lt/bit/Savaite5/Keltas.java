package lt.bit.Savaite5;

import java.awt.*;
import java.awt.event.InputEvent;

public class Keltas {
   // Parašykite programą, kuri suskaičiuotų, kelis kartus keltui teks kelti per upę k automobilių,
    // jeigu vienu metu jis gali perkelti m automobilių. Keltas kelia tik tada, kai yra pilnas
    // (susidaro m automobilių.) Taip pat išveskite automobilių skaičių, kuriems persikelti per upę nepavyks
    // (jei buvo 11 automobilių, o į keltą telpa 10, tai 10 perkels, o vienas liks neperkeltas).

    public static void main(String[] args) throws AWTException {
        int k = 27;
        int m = 10;

        int kiekKartuPerkels = k / m;
        System.out.println("Perkels per kartu: " + kiekKartuPerkels);
        int likoNeperkelta = k % m;
//        int likoNeperkelta = k - kiekKartuPerkels * m;
        System.out.println("Liks neperkelta: " + likoNeperkelta);
    }

}
