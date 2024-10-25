package RegEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>\\d+)";
        String input = scanner.nextLine();

        double totalSum = 0;

        Pattern pattern = Pattern.compile(regex);


        List<String> furniture = new ArrayList<>();

        while(!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furnitureName = matcher.group("furnitureName");//мебел -> "Sofa"
                double price = Double.parseDouble(matcher.group("price"));//ед. цена -> "312.23" -> 312.23
                int quantity =  Integer.parseInt(matcher.group("quantity"));//количество -> "3" -> 3

                furniture.add(furnitureName);
                double pricePerFurniture = price * quantity; //сума за текуща мебел
                totalSum += pricePerFurniture;
            }


            input = scanner.nextLine();
        }
        //списък със закупени мебели
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);

        //обща сума за мебели
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
