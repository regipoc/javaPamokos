package lt.bit;

import java.util.Scanner;

public class Task11 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean arVykdyti = true;
            int ilgis = 0;
            String ilgiausiasZodis = null;

            while (arVykdyti) {
                System.out.println("Iveskite indeksa");
                String zodis = scanner.next();

                if (zodis.equals("Enough")) {
                    arVykdyti = false;
                } else {
                    if (zodis.length() > ilgis) {
                        ilgis = zodis.length();
                        ilgiausiasZodis = zodis;
                    }
                }
            }
            System.out.println(ilgiausiasZodis);
        }
    }


