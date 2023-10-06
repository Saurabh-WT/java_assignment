import java.util.*;

public class ExerciseTen {
    //    Exercise 10: Word Frequency Counter
//    Create a Java program that takes a text document as input and uses a HashMap to count the frequency of each
//    word. Display the word frequencies in descending order of occurrence.
    public static void main(String[] args) {
        try {
            System.out.print("Type your String: ");
            Map<String, Integer> hashMap = getStringIntegerMap();

            List<Map.Entry<String, Integer>> list = new ArrayList<>(hashMap.entrySet());
            list.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
            System.out.println(" Word : Frequency ");
            for (Map.Entry<String, Integer> entry : list) {
                System.out.println(" "+entry.getKey() + ": " + entry.getValue()+" ");
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static Map<String, Integer> getStringIntegerMap() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Map<String, Integer> hashMap = new HashMap<>();

        String[] words = str.split(" ");
        int count = 1;

        for (String word : words) {
            // containsKey(key) will return a boolean value
            // i.e. true if it contains the key and false if
            // it doesn't.
            if (hashMap.containsKey(word)) hashMap.put(word, hashMap.get(word) + 1);
            else hashMap.put(word, 1);
        }
        return hashMap;
    }
}
