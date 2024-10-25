package MapsLambdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        Map<String, Integer> map = new LinkedHashMap<>();

        for (String word : input) {
            word = word.toLowerCase();
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                int count = map.get(word);
                map.put(word, count + 1);
            }

        }
        List <String> result = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 != 0){
                result.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ",result));
    }
}
