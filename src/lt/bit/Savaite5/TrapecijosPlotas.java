package lt.bit.Savaite5;

public class TrapecijosPlotas {
    //Parašykite programą, kuri, įvedus trapecijos pagrindų a ir b bei aukštinės h ilgius,
    // apskaičiuotų trapecijos plotą.
    public static void main(String[] args) {
        double a = 5;
        double b = 3;
        double h = 4;

        double plotas = (a+b) / 2 * h;

        System.out.println("Trapecijos plotas: " + String.format("%.0f",plotas));
    }
}