package MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resource = scanner.nextLine();

        Map<String, Integer> map = new LinkedHashMap<>();

        while (!resource.equals("stop")) {
            int quantity = Integer.parseInt(scanner.nextLine());
            if (!map.containsKey(resource)) {
                map.put(resource, 0);
            }
            int currentQuantity = map.get(resource);
            map.put(resource, currentQuantity + quantity);

            resource = scanner.nextLine();
        }

        map.entrySet().forEach(entry -> System.out.printf("%s -> %d\n", entry.getKey(),entry.getValue()));
    }
}
