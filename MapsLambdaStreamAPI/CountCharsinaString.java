package MapsLambdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CountCharsinaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String text : input) {
            for (int position = 0; position < text.length(); position++) {
                char currentSymbol = text.charAt(position);
                if (!map.containsKey(currentSymbol)){
                    map.put(currentSymbol,0);
                }
                int count = map.get(currentSymbol);
                map.put(currentSymbol,count+1);
            }

        }
        map.entrySet().forEach(entry -> System.out.printf("%s -> %d\n",entry.getKey(),entry.getValue()));
    }
}
