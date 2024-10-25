package Exam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MonthlyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Double> clients = new LinkedHashMap<>();
        Map<String, Double> distributors = new LinkedHashMap<>();
        double totalIncome = 0.0;

        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String[] parts = command.split(" ");
            String action = parts[0];
            String name = parts[1];
            double money = Double.parseDouble(parts[2]);

            switch (action) {
                case "Deliver":
                    distributors.put(name, distributors.getOrDefault(name, 0.0) + money);
                    break;

                case "Return":
                    if (distributors.containsKey(name) && distributors.get(name) >= money) {
                        distributors.put(name, distributors.get(name) - money);
                        if (distributors.get(name) == 0.0) {
                            distributors.remove(name);
                        }
                    }
                    break;

                case "Sell":
                    clients.put(name, clients.getOrDefault(name, 0.0) + money);
                    totalIncome += money;
                    break;

                default:
                    System.out.println("Invalid command!");
                    break;
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Double> entry : clients.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.println("-----------");

        for (Map.Entry<String, Double> entry : distributors.entrySet()) {
            System.out.printf("%s: %.2f%n", entry.getKey(), entry.getValue());
        }
        System.out.println("-----------");

        System.out.printf("Total Income: %.2f%n", totalIncome);

    }
}
