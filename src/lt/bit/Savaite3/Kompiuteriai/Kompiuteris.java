package lt.bit.Savaite3.Kompiuteriai;

public class Kompiuteris {

    private int prekesKodas;
    private String gamintojas;
    private double kaina;
    private double svoris;
    private int garantija;

    public Kompiuteris(int prekesKodas, String gamintojas, double kaina, double svoris, int garantija) {
        this.prekesKodas = prekesKodas;
        this.gamintojas = gamintojas;
        this.kaina = kaina;
        this.svoris = svoris;
        this.garantija = garantija;
    }

    public int getPrekesKodas() {
        return prekesKodas;
    }

    public String getGamintojas() {
        return gamintojas;
    }

    public double getKaina() {
        return kaina;
    }

    public double getSvoris() {
        return svoris;
    }

    public int getGarantija() {
        return garantija;
    }
}
