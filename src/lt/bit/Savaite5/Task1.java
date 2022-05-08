package lt.bit.Savaite5;

import java.util.*;

public class Task1 {
// susrusiuoti masyva nuo z iki a
    public static void main(String[] args) {
        sort(new ArrayList(List.of("a", "b", "c", "d", "e")));
    }

    public static void sort(ArrayList<String> elements){
        // Bubble sort (pasižiūrėti pvz), Burbolo rūšiavimas (metodas).
        for(int i = 0; i < elements.size(); i++){
            for(int j = i +1; j < elements.size(); j++){
                if(elements.get(i).charAt(0) < elements.get(j).charAt(0)){
                    String pirmasZodis = elements.get(i);
                    String antrasZodis = elements.get(j);
                    elements.remove(i);
                    elements.add(i, antrasZodis);
                    elements.remove(j);
                    elements.add(j, pirmasZodis);
                }
            }
        }

        System.out.println(Arrays.toString(elements.toArray()));
    }
}
