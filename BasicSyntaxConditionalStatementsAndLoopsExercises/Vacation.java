package BasicSyntaxConditionalStatementsAndLoopsExercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String groupOfPeople = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;
        double sum = 0;

        switch (dayOfWeek) {
            case "Friday":
                if (groupOfPeople.equals("Students")) {
                    price = 8.45;
                } else if (groupOfPeople.equals("Business")) {
                    price = 10.90;
                } else if (groupOfPeople.equals("Regular")) {
                    price = 15;
                }
                break;
            case "Saturday":
                if (groupOfPeople.equals("Students")) {
                    price = 9.80;
                } else if (groupOfPeople.equals("Business")) {
                    price = 15.60;
                } else if (groupOfPeople.equals("Regular")) {
                    price = 20;
                }
                break;
            case "Sunday":
                if (groupOfPeople.equals("Students")) {
                    price = 10.46;
                } else if (groupOfPeople.equals("Business")) {
                    price = 16;
                } else if (groupOfPeople.equals("Regular")) {
                    price = 22.50;
                }
                break;
        }
        switch (groupOfPeople) {
            case "Students":
                if (countOfPeople >= 30) {
                    price *= 0.85;
                }
                break;
            case "Business":
                if (countOfPeople >= 100) {
                    countOfPeople -= 10;
                }
                break;
            case "Regular":
                if (countOfPeople >= 10 && countOfPeople <= 20) {
                    price *= 0.95;
                }
                break;


        }
        sum = countOfPeople * price;

        System.out.printf("Total price: %.2f", sum);

    }
}
