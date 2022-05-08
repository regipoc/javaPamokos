package lt.bit.Savaite5;

import java.util.Random;

public class Metodai {
    public static void main(String[] args) {
        // 1
        int savaitesDiena1 = 3;
        int savaitesDiena2 = 9;

//        int savaitesDiena1 = 3;
//        int savaitesDiena2 = 9;
//        savaitesDiena(savaitesDiena1);
//        savaitesDiena(savaitesDiena2);
        // 2
        int pazymys1 = 4;
        int pazymys2 = 8;

        System.out.println("ar pazymys " + pazymys1 + " teigiamas? " + arTeigiamas(pazymys1));
        System.out.println("ar pazymys " + pazymys2 + " teigiamas? " + arTeigiamas(pazymys2));
        // 3
        double kaina1 = 297.42;
        double kaina2 = 100;
        System.out.println("Kaina su PVM: " + gautiKainaSuPVM(kaina1));
        System.out.println("Kaina su PVM: " + gautiKainaSuPVM(kaina2));

        // 4
        int amzius1 = 18;
        int amzius2 = 13;
        System.out.println("Ar " + amzius1 + " pilnametis? " + arPilnametis(amzius1));
        System.out.println("Ar " + amzius2 + " pilnametis? " + arPilnametis(amzius2));

        // 5 ir 6
        String asmensKodas = "37702071899";

        System.out.println("Ar vyras? " + arVyras(asmensKodas));
        System.out.println("Ar moteris? " + arMoteris(asmensKodas));
        // 7

        System.out.println("Atsitiktinis skaicius = " + atsitiktinisSkaicius());
        // 8

        System.out.println("Atsitiktinis skaicius 0-9 = " + atsitiktinisTelelotoSkaicius());
        // 9
        String slaptazodis = generuotiSlaptazodi(10, false, false, false);
        System.out.println("Slaptazodis = " + slaptazodis);
    }

    // 1. Metodas kuriam perdavus skaiciu atspausdina savaite diena pvz. 1 = Pirmadienis
    // 1. Metodas kuriam perdavus skaiciu atspausdina savaites diena pvz. 1 = Pirmadienis
    public static void savaitesDiena(int skaicius) {
        switch(skaicius) {
            case 1: {
                System.out.println("Pirmadienis");
                break;
            }
            case 2: {
                System.out.println("Antradienis");
                break;
            }
            case 3: {
                System.out.println("Treciadienis");
                break;
            }
            case 4: {
                System.out.println("Ketvirtadienis");
                break;
            }
            case 5: {
                System.out.println("Penktadienis");
                break;
            }
            case 6: {
                System.out.println("Sestadienis");
                break;
            }
            case 7: {
                System.out.println("Sekmadienis");
                break;
            }
            default: {
                System.out.println("Nera tokios savaites dienos");
            }
        }
    }

    // 2. Funkcija kuri patikrina ar pazymys yra teigiamas 4 < x

    public static boolean arTeigiamas(int pazymys) {
//        if(pazymys > 4) {
//            return true;
//        }
//        return false;
        return pazymys > 4;
    }
    // 3. Funkcija kuriai perdavus kaina grazina kaina su PVM 21%
    public static double gautiKainaSuPVM(double kaina) {
        return kaina * 1.21;
    }

    // 4. Funkcija kuri patikrina ar zmogus yra pilnametis

    public static boolean arPilnametis(int amzius) {
        return amzius > 17;
    }
    // 5. Funkcija kuri pagal asmens koda patikrina ar zmogus yra vyras

    public static boolean arVyras(String asmensKodas) {
//        return asmensKodas.charAt(0) == '3';
        return asmensKodas.startsWith("3") || asmensKodas.startsWith("5");
    }
    // 6. Funkcija kuri pagal asmens koda patikrina ar zmogus yra moteris

    public static boolean arMoteris(String asmensKodas) {
        return asmensKodas.startsWith("4") || asmensKodas.startsWith("6");
    }
    // 7. Funkcija kuri grazina bet koki skaiciu
    public static int atsitiktinisSkaicius() {
        Random rand = new Random();
        return rand.nextInt();
    }

    // 8. Funkcija kuri grazina bet koki skaiciu tarp 0-9
    public static int atsitiktinisTelelotoSkaicius() {
        Random rand = new Random();
        return rand.nextInt(10);
    }

    // 9. Funkcija kuri sugeneruoja slaptazodi pagal nustatytus parametrus
    // kokius simbolius ideti i slaptazodi ir kokio ilgio jis turi buti
    // int ilgis, boolean skaiciai, boolean simboliai, boolean raides
    // Jeigu skaiciai = true ideti skaicius
    // Jeigu skaiciai ir simboliai = true ideti ir skaicius ir simboliai

    public static String generuotiSlaptazodi(
            int ilgis,
            boolean skaiciai, // 0123456789
            boolean simboliai, // !,*&^%$#@!
            boolean raides // abcdefghj...
    ) {
        String slaptazodis = "";
        String galimiSimboliai = "";

        if(!skaiciai && !simboliai && !raides) {
            return "";
        }

        if(skaiciai) {
            galimiSimboliai = galimiSimboliai + "0123456789";
        }

        if(simboliai) {
            galimiSimboliai = galimiSimboliai + "!@#$%^&*()_+";
        }

        if(raides) {
            galimiSimboliai = galimiSimboliai + "qwerty";
        }
        Random rand = new Random();
        for(int i = 0; i < ilgis; i++) {
            int atsitiktinisIndeksas = rand.nextInt(galimiSimboliai.length());
            String atsitiktinisSimbolis = String.valueOf(galimiSimboliai.charAt(atsitiktinisIndeksas));
            slaptazodis = slaptazodis + atsitiktinisSimbolis;
        }
        return slaptazodis;
    }

}