package lt.bit.Savaite6;

import java.util.Iterator;
import java.util.List;

public class PasisveikinimasVisiBudai {
    // atspausdinti visus pasisveikinimus keliais budais

    public static void main(String[] args) {
        List<String> pasisveikinimai = List.of("Labas", "Hello", "Zdrastvuite","Witan", "Bonjour");

        // 1 budas:
        pasisveikinimai.stream().forEach(pasisveikinimas -> System.out.println(pasisveikinimas));

        //2 budas:
        for(String pasisveikinimas : pasisveikinimai) {
            System.out.println(pasisveikinimas);
        }

        //3 budas:
        pasisveikinimai.forEach(pasisveikinimas -> System.out.println(pasisveikinimas));
        for(int i = 0; i < pasisveikinimai.size(); i++){
            System.out.println(pasisveikinimai.get(i));
        }

        //4 budas:
        Iterator<String> iterator = pasisveikinimai.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
