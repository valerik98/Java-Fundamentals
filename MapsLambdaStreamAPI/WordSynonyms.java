package MapsLambdaStreamAPI;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine());

        Map<String, List<String>> stringMap = new LinkedHashMap<>();

        for (int i = 1; i <= n ; i++) {
            String key = scanner.nextLine();
            String value = scanner.nextLine();

            if (!stringMap.containsKey(key)){
                stringMap.put(key,new ArrayList<>());
            }
                stringMap.get(key).add(value);


        }

        for (Map.Entry<String, List<String>> entry : stringMap.entrySet()) {

            System.out.println(entry.getKey() + " - " + String.join(", ",entry.getValue()));
        }

    }
}
