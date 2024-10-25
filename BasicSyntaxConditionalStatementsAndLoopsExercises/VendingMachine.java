package BasicSyntaxConditionalStatementsAndLoopsExercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double totalMoneyInserted = 0;
        double cost = 0;

        while (!input.equals("Start")) {
            double coins = Double.parseDouble(input);
            if ((coins != 0.1) && (coins != 0.2) && (coins != 0.5) && (coins != 1) && (coins != 2)) {
                System.out.printf("Cannot accept %.2f\n", coins);
                totalMoneyInserted -= coins;
            }
            totalMoneyInserted += coins;

            input = scanner.nextLine();
        }
        String product = scanner.nextLine();
        while (!product.equals("End")) {
            switch (product) {
                case "Nuts":
                    cost = 2.0;
                    if (totalMoneyInserted < cost) {
                        System.out.println("Sorry, not enough money");
                        return;

                    } else {
                        System.out.printf("Purchased %s\n", product);
                        totalMoneyInserted -= cost;
                    }
                    break;
                case "Water":
                    cost = 0.7;
                    if (totalMoneyInserted < cost) {
                        System.out.println("Sorry, not enough money");
                        return;

                    } else {
                        System.out.printf("Purchased %s\n", product);
                        totalMoneyInserted -= cost;
                    }
                    break;
                case "Crisps":
                    cost = 1.5;
                    if (totalMoneyInserted < cost) {
                        System.out.println("Sorry, not enough money");
                        return;

                    } else {
                        System.out.printf("Purchased %s\n", product);
                        totalMoneyInserted -= cost;
                    }
                    break;
                case "Soda":
                    cost = 0.8;
                    if (totalMoneyInserted < cost) {
                        System.out.println("Sorry, not enough money");
                        return;

                    } else {
                        System.out.printf("Purchased %s\n", product);
                        totalMoneyInserted -= cost;
                    }
                    break;
                case "Coke":
                    cost = 1.0;
                    if (totalMoneyInserted < cost) {
                        System.out.println("Sorry, not enough money");
                        return;

                    } else {
                        System.out.printf("Purchased %s\n", product);
                        totalMoneyInserted -= cost;
                    }
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            product = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", totalMoneyInserted);
    }
}
