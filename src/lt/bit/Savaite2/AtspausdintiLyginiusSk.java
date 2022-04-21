package lt.bit.Savaite2;

import java.util.Scanner;

public class AtspausdintiLyginiusSk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int skaicius = 100;
        System.out.println(skaicius + " " + arLyginis(skaicius));
    }

    public static boolean arLyginis(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}