package lt.bit.Savaite6.MultithreadTeorija;

public class ManoGija extends Thread {

    private Printer printer;

    public ManoGija(Printer printer){
        this.printer = printer;
    }

    @Override
    public void run() {
//        System.out.println("Veikia...");
        printer.print(10);
    }
}
