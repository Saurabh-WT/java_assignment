package Day9_10;

import java.util.*;
import java.util.stream.Collectors;
import java.util.function.Function;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

//Exercise 10: Word Frequency Counter
//Create a Java program that takes a text document as
// input and uses a HashMap to count the frequency of each word. Display the word frequencies in descending order of occurrence.
public class Exercise_10 {
    public static void main(String[] args) {

        String str = "The apartment was on the top floor—a small living-room, a small dining-room, a small bedroom, and a bath";

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");
        int count=1;

        for (String word : words) {
            // containsKey(key) will return a boolean value
            // i.e. true if it contains the key and false if
            // it doesn't.
            if (hashMap.containsKey(word))

                hashMap.put(word, hashMap.get(word) + 1);


            else
                hashMap.put(word, 1);
        }

//        Map<String, Integer> sorted = hashMap.entrySet() .stream()
//                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                .collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
//
//        System.out.println("map after sorting by values: " + sorted);

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println(list);

    }
}

