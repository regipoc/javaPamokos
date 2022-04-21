package lt.bit.Savaite2;

public class RastiIlgiausiaZodi {
    public static void main(String[] args) {
        String[] zodziai = new String[]{"labas", "abc", "langas", "kompiuteris"};
        String ilgiausias = rastiIlgiausiaZodi(zodziai);
        System.out.println(ilgiausias);
    }

    public static String rastiIlgiausiaZodi(String[] masyvas) {
        int maxLength = 0;
        String longestString = null;

        for (int i = 0; i < masyvas.length; i++) {
            if(maxLength < masyvas[i].length()) {
                maxLength = masyvas[i].length();
                longestString = masyvas[i];
            }
        }
        return longestString;

    }
}

