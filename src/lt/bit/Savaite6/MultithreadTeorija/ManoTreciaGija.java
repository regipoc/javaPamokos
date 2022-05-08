package lt.bit.Savaite6.MultithreadTeorija;

public class ManoTreciaGija extends Thread {

    private Pasisveikinimas pasisveikinimas;

    public ManoTreciaGija(Pasisveikinimas pasisveikinimas){
        this.pasisveikinimas = pasisveikinimas;
    }

    @Override
    public void run() {
        try {
            pasisveikinimas.sayHello();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}