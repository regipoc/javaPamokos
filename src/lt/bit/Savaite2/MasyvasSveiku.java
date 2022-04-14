package lt.bit.Savaite2;

import java.util.Scanner;

public class MasyvasSveiku {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] sveikiSkaiciai = new int[10];
        sveikiSkaiciai[0] = 1;
        sveikiSkaiciai[4] = 99;
        sveikiSkaiciai[sveikiSkaiciai.length -1] = 100;

        spaudsdintiSveikuosiusSkaicius(sveikiSkaiciai);
    }
    public static void spaudsdintiSveikuosiusSkaicius(int[] x){
        for(int i = 0; i<x.length; i++){
            System.out.println(x[i]);
        }
    }
}
