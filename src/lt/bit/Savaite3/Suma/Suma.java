package lt.bit.Savaite3.Suma;
import java.util.Arrays;

public class Suma {
    private int pirmasSkaicius;
    private int antrasSkaicius;

    public Suma(int pirmasSkaicius, int antrasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
        this.antrasSkaicius = antrasSkaicius;
    }

    public int getPirmasSkaicius() {
        return pirmasSkaicius;
    }

    public void setPirmasSkaicius(int pirmasSkaicius) {
        this.pirmasSkaicius = pirmasSkaicius;
    }

    public int getAntrasSkaicius() {
        return antrasSkaicius;
    }

    public void setAntrasSkaicius(int antrasSkaicius) {
        this.antrasSkaicius = antrasSkaicius;
    }

    @Override
    public String toString() {
        return "Suma = " + (pirmasSkaicius + antrasSkaicius);
    }
}
