package lt.bit.Savaite5.NestedInnerPavyzdis;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        // Ne garantuoja eiliskumo
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Labas");
        hashMap.put(5, "Hello");
        hashMap.put(9, "Bonjour");

        hashMap.keySet().forEach(k -> System.out.println(k));

        // Garantuoja eiliskuma 100%, bet TreeMap yra lietas.
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Labas");
        treeMap.put(5, "Hello");
        treeMap.put(9, "Bonjour");

        treeMap.keySet().forEach(k -> System.out.println(k));
    }
}
