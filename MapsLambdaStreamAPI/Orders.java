package MapsLambdaStreamAPI;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Double> priceMap = new LinkedHashMap<>();
        Map<String, Integer> quantityMap = new LinkedHashMap<>();


        while (!input.equals("buy")) {
            String name = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (quantityMap.containsKey(name)) {
                int existingQuantity = quantityMap.get(name);
                quantityMap.put(name, quantity + existingQuantity);
            } else {
                quantityMap.put(name, quantity);
            }

            priceMap.put(name, price);


            input = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : quantityMap.entrySet()) {

            String name = entry.getKey();
            int quantity = entry.getValue();
            double price = priceMap.get(name);

            System.out.printf("%s -> %.2f\n",name, quantity * price);

        }

    }
}
