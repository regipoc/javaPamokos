package lt.bit.Savaite3;

import java.util.Arrays;

public class Mokinys {
    private String vardas;
    private String pavarde;
    private String klase;
    private int[] pazymiai;

    public Mokinys(String vardas, String pavarde, String klase, int[] pazymiai) {
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.klase = klase;
        this.pazymiai = pazymiai;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getKlase() {
        return klase;
    }

    public int[] getPazymiai() {
        return pazymiai;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setKlase(String klase) {
        this.klase = klase;
    }

    public void setPazymiai(int[] pazymiai) {
        this.pazymiai = pazymiai;
    }

    public double pazymiuVidurkis(){
        double suma = 0;
        for(int i = 0; i < pazymiai.length; i++){
            suma = suma + pazymiai[i];

        }
        return suma/pazymiai.length;
    }

    @Override
    public String toString() {
        return "Mokinys{" +
                "vardas='" + vardas + '\'' +
                ", pavarde='" + pavarde + '\'' +
                ", klase='" + klase + '\'' +
                ", pazymiai=" + Arrays.toString(pazymiai) +
                '}';
    }
}

