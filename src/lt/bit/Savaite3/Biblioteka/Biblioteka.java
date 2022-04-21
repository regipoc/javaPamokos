package lt.bit.Savaite3.Biblioteka;

import java.util.ArrayList;

public class Biblioteka {

    private ArrayList<Knyga> knygos;

    public Biblioteka(ArrayList<Knyga> knygos) {
        this.knygos = knygos;
    }

    // 1 punktas
    public void getKnyguKiekisIrVidPuslapiuSkaicius(String autorius) {
        int knyguCounteris = 0;
        int puslapiuSkaicius = 0;

        for (Knyga knyga : knygos) {
            if (knyga.getAutorius().equals(autorius)) {
                knyguCounteris++;
                puslapiuSkaicius += knyga.getPuslapiuSkaicius();
            }
        }

        System.out.println("Knygų skaičius autoriaus :" + autorius + " yra : " + knyguCounteris);
        int vidPuslapiuSkaicius = puslapiuSkaicius / knyguCounteris;
        System.out.println("Vidutinis puslapių skaičius knygoje yra: " + vidPuslapiuSkaicius);
    }

    // 2 punktas
    public void paieskaPagalAutoriuIrKnygosKoda(String autorius, String knygosKodas) {
        for (Knyga knyga : knygos) {
            if (paieska(knyga, autorius, knygosKodas)) {
                System.out.println("Knygos informacija: " + knyga);
            }
        }
    }

    private boolean paieska(Knyga knyga, String autorius, String knygosKodas) {
        return knyga.getAutorius().equals(autorius) && knyga.getKnygosKodas().equals(knygosKodas);
    }

    // 3 punktas
    public void paieska(String autorius, String knygosKodas, String leidykla, int leidimoMetai) {
        knygos.forEach(knyga -> {
            if (paieska(knyga, autorius, knygosKodas) && knyga.getLeidykla().equals(leidykla)
                    && knyga.getLeidimoMetai() == leidimoMetai) {
                System.out.println(knyga);
            }
        });

//        for (Knyga knyga : knygos) {
//            if (paieska(knyga, autorius, knygosKodas) && knyga.getLeidykla().equals(leidykla)
//                    && knyga.getLeidimoMetai() == leidimoMetai) {
//                System.out.println(knyga);
//            }
//        }
    }
}

