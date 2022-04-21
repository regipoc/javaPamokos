package lt.bit.Savaite3;

public class MainMokinys {

    public static void main(String[] args) {

        Mokinys mok1 = sukurtiMokini("Tomas", "Jonaitis", "3c", new int[]{7, 8, 9, 10});
        Mokinys mok2 = sukurtiMokini("Jonas", "Kazlauskas", "3a", new int[]{6, 7, 8, 9});
        Mokinys mok3 = sukurtiMokini("Rimas", "Butkus", "3b", new int[]{5, 8, 9});
        Mokinys mok4 = sukurtiMokini("Simas", "Jonikas", "3e", new int[]{7, 8, 9});
        Mokinys mok5 = sukurtiMokini("Tadas", "Pocius", "3c", new int[]{6, 7, 8});

        Mokinys [] mokiniai = new Mokinys[]{mok1, mok2, mok3, mok4, mok5};
        Mokinys geriausias = geriausiaiBesimokantis(mokiniai);
        System.out.println(geriausias);

//        // pakeisti pavarde mok1
//        mok1.setPavarde("Petraitis");
//
//        // susideti i masyva

//
//    // atspausinti mokiniu sarasa
//        for(Mokinys mokinys: mokiniai){
//            System.out.println(mokinys);
//        }
    }

    public static Mokinys sukurtiMokini(String vardas, String pavarde, String klase, int[] pazymiai) {
        return new Mokinys(vardas, pavarde, klase, pazymiai);
    }

    public static Mokinys geriausiaiBesimokantis(Mokinys[] m){
        Mokinys geriausias;
        if (m.length >0) {
            geriausias = m[0];
        }else{
            return null;
        }
        for (int i = 1; i< m.length; i++){
            if (geriausias.pazymiuVidurkis() < m[i].pazymiuVidurkis()){
                geriausias = m[i];

            }
        }
        return geriausias;


    }

}
