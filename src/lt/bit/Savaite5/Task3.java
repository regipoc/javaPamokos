package lt.bit.Savaite5;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task3 {
//sukurti metoda su map parametru, kur key yra strigas, o value int, ir paskui atspausdinti
    //kiekviena map elementa formatu key <k> ir value <v>

    public static void main(String[] args) {
        print(Map.of("Java", 18, "Python", 1, "PHP", 0));
    }

    public static void print(Map<String, Integer> map) {
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        int i = 1;
        for (Map.Entry<String, Integer> entry : entries) {
            String tekstas = "Key:%s,Value:%d%s";
            System.out.println(String.format(tekstas, entry.getKey(), entry.getValue(), i == map.size() ? "." : ","));
            i++;
        }
    }
}
