package lt.bit.Savaite6;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise14 {

//    Implement the following functionalities based on 100,000 element arrays with randomly selected values:
//            1.return a list of unique items,
//            2.return a list of elements that have been repeated at least once in the generated array,
//            3.return a list of the 25 most frequently recurring items.
//    Implement a method that deduplicates items in the list. If a duplicate is found, it replaces it with a new
//    random value that did not occur before. Check if the method worked correctly by calling method number 2.

    public static void main(String[] args) {
        Random random = new Random();

        int[] randomNumbers = new int[100000];

        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt();
        }

        ArrayList<Integer> uniqueNumbers = getUniqueItems(randomNumbers);
        uniqueNumbers.forEach(number -> System.out.println(number));
    }

    public static ArrayList<Integer> getUniqueItems(int[] randomNumbers) {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (Integer number : randomNumbers) {
            if (!uniqueNumbers.add(number)) {
                duplicates.add(number);
            }
        }

        uniqueNumbers.removeAll(duplicates);

        return new ArrayList<>(uniqueNumbers);
    }

    public static ArrayList<Integer> getNumbersWithoutDuplicate(int[] randomNumbers) {
        HashSet<Integer> numbersWithoutDuplicate = new HashSet<>();

        for (Integer number : randomNumbers) {
            numbersWithoutDuplicate.add(number);
        }

        return new ArrayList<>(numbersWithoutDuplicate);
    }


    public static ArrayList<Integer> getMostFrequentlyItems(int[] randomNumbers) {
        ArrayList<Integer> mostFrequentlyItems = new ArrayList<>();

        HashMap<Integer, Integer> numbers = new HashMap<>();

        int counter;
        for (int i = 0; i < randomNumbers.length - 1; i++) {
            counter = 0;
            for (int j = i + 1; j < randomNumbers.length; j++) {
                if (randomNumbers[i] == randomNumbers[j]) {
                    counter++;
                }
            }

            numbers.put(randomNumbers[i], counter);
        }

        List<Map.Entry<Integer, Integer>> sortedNumbers = numbers.entrySet().stream()
                .sorted(((o1, o2) -> Integer.compare(o2.getValue(), o1.getValue())))
                .limit(25)
                .collect(Collectors.toList());


        Iterator<Map.Entry<Integer, Integer>> iterator = sortedNumbers.iterator();

        while (iterator.hasNext()){
            mostFrequentlyItems.add(iterator.next().getKey());
        }

        return mostFrequentlyItems;
    }
}
