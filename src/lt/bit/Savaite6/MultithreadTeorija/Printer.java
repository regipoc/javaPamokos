package lt.bit.Savaite6.MultithreadTeorija;

public class Printer {

    synchronized public void print(int skaicius) {
        for (int i = 0; i < 100; i++) {
            System.out.println(skaicius * i);
        }
    }
}
