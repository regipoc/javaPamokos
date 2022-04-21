package lt.bit.Savaite3.Biblioteka;

import lt.bit.Savaite3.Biblioteka.Biblioteka;
import lt.bit.Savaite3.Biblioteka.Knyga;

import java.util.*;

import static java.util.Collections.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Knyga pirmaKnyga = new Knyga("S.Neris", "Ziedai", 1945, "123",
                "Vaga", 67);
        Knyga antraKnyga = new Knyga("V.Kudirka", "Pavasaris", 1954, "124",
                "Sviesa", 56);
        Knyga treciaKnyga = new Knyga("Maironis", "Vasara", 1936, "125",
                "Vaga", 123);
        Knyga ketvirtaKnyga = new Knyga("J.Marcinkevicius", "Ruduo", 1939, "125",
                "Sviesa", 46);


        ArrayList<Knyga> knyga = new ArrayList<>();

    }

    public class AutoriuRikiavimas implements Comparator<Knyga> {
        @Override
        public int compare(Knyga o1, Knyga o2) {
            return o1.getAutorius().compareTo(o2.getAutorius()); // ASC
            // iš Z į A -> o2.getAutorius().compareTo(o1.getAutorius()); DESC
        }
    }


    public int compare(Knyga o1, Knyga o2) {
                return Integer.compare(o1.getLeidimoMetai(), o2.getLeidimoMetai()); // ASC
                // return Integer.compare(o2.getLeidimoMetai(), o1.getLeidimoMetai()); // DESC, iš didėjančio į mažėjantį
            }


}






