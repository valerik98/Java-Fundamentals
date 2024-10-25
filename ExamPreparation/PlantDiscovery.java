package ExamPreparation;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> plantsRarity = new LinkedHashMap<>();
        Map<String, List<Double>> plantsRating = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine(); //"{plant}<->{rarity}"

            String plant = input.split("<->")[0];
            int rarity = Integer.parseInt(input.split("<->")[1]);
            plantsRarity.put(plant, rarity);
            plantsRating.put(plant, new ArrayList<>());
        }

        String command = scanner.nextLine();
        while (!command.equals("Exhibition")) {
            String commandName = command.split("[: -]+")[0];
            String plant = command.split("[: -]+")[1];

            if (!plantsRarity.containsKey(plant)) {
                System.out.println("error");
            } else {
                switch (commandName) {
                    //· "Rate: {plant} - {rating}" – add the given rating to the plant (store all ratings)
                    case "Rate":
                        double rating = Double.parseDouble(command.split("[: -]+")[2]);
                        plantsRating.get(plant).add(rating);
                        break;
                    //· "Update: {plant} - {new_rarity}" – update the rarity of the plant with the new one
                    case "Update":
                        int newRarity = Integer.parseInt(command.split("[: -]+")[2]);
                        plantsRarity.put(plant, newRarity);
                        break;
                    //· "Reset: {plant}" – remove all the ratings of the given plant
                    case "Reset":
                        plantsRating.get(plant).clear();
                        break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        for (Map.Entry<String, Integer> entry : plantsRarity.entrySet()) {
            String plantName = entry.getKey();
            int rarity = entry.getValue();
            List<Double> ratings = plantsRating.get(plantName);
            double averageRating;
            if (ratings.isEmpty()) {
                averageRating = 0.00;
            } else {
                averageRating = ratings.stream().mapToDouble(Double::doubleValue).sum() / ratings.size();
            }


            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", plantName, rarity, averageRating);
        }
    }
}
