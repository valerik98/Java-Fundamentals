package MidExamPreparation;

import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int wins = 0;

        while (!input.equals("End of battle") && energy >= 0) {
            int distance = Integer.parseInt(input);
            if (energy >= distance) {
                energy -= distance;
                wins++;
                if (wins % 3 == 0) {
                    energy += wins;
                }
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", wins, energy);
                return;
            }



            input = scanner.nextLine();
        }
        System.out.printf("Won battles: %d. Energy left: %d", wins, energy);
    }
}
