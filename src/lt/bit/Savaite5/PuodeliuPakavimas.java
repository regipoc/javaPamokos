package lt.bit.Savaite5;

public class PuodeliuPakavimas {
    //Į vieną kartoninę dėžutę telpa trys puodeliai. Pakuotojas užklijuoja dėžutę ir
    // išsiunčia ją į parduotuvę, jei ji pilna. Iš viso reikia supakuoti m puodelių.
    // Parašykite programą, kuri apskaičiuotų, kelios bus pilnos dėžutės ir kiek puodelių liks nesupakuota.
    public static void main(String[] args) {
        int m = 7;
        int telpa = 3;

        int dezutes = m / telpa;
        System.out.println("Pilnu dezuciu skaicius: " + dezutes);

        int likePuodeliai = m % 3;
        System.out.println("Nesupakuotu puodeliu skaicius: " + likePuodeliai);
    }
}
