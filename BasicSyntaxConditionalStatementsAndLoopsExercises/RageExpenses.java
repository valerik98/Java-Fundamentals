package BasicSyntaxConditionalStatementsAndLoopsExercises;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lostGamesCount = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;

        for (int currentGame = 1; currentGame <= lostGamesCount; currentGame++) {
            if (currentGame % 6 == 0) {
                headsetCount++;
                mouseCount++;
                keyboardCount++;
                if (keyboardCount % 2 == 0) {
                    displayCount++;
                }
            } else if (currentGame % 2 == 0) {
                headsetCount++;
            } else if (currentGame % 3 == 0) {
                mouseCount++;
            }
        }
        double sum = headsetCount * headsetPrice + mouseCount * mousePrice + displayCount * displayPrice + keyboardCount * keyboardPrice;
        System.out.printf("Rage expenses: %.2f lv.",sum);
    }
}
