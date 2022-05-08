package lt.bit.Savaite6;

import java.util.ArrayList;

public class IlgiausiasZodis {

    public static void main(String[] args) {
        // Grazinti ilgiausia zodi (jeigu yra zodziai tokio paties ilgio - grazinti zodzius
        String [] zodziai = {"Labas", "Hello", "Witam", "As", "Ne", "Taip", "Vytas", "Aiste", "Ieva"};

        int maxLength = 0;
        ArrayList<String> ilgiausiZodziai1 = new ArrayList<>();
        for(int i = 0; i < zodziai.length; i++){
            if(maxLength <= zodziai[i].length()){
                maxLength = zodziai[i].length();
                ilgiausiZodziai1.add(zodziai[i]);
            }
        }

        ilgiausiZodziai1.forEach(zodis -> System.out.println(zodis));
    }
}
