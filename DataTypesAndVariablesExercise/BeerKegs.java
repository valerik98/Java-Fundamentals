package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBeerKegs = Integer.parseInt(scanner.nextLine());
        int maxValue = Integer.MIN_VALUE;
        double maxVolume = 1.0*maxValue;
        String bestModel = "";
        for (int i = 1; i <= countBeerKegs; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            double height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * radius * radius * height;
            if (volume>=maxVolume){
                maxVolume = volume;
                bestModel = model;
            }

        }
        System.out.println(bestModel);
    }
}
