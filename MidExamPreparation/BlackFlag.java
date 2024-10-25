package MidExamPreparation;

import java.util.Scanner;

public class BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfPlunder = Integer.parseInt(scanner.nextLine());
        double dailyPlunder = Double.parseDouble(scanner.nextLine());
        double targetPlunder = Double.parseDouble(scanner.nextLine());

        double plunder = 0;
        for (int i = 1; i <= daysOfPlunder; i++) {
            plunder += dailyPlunder;
            if (i % 3 == 0) {
                plunder += dailyPlunder * 0.5;
            }
            if (i % 5 == 0) {
                plunder *= 0.7;
            }




        }
        double percentage = plunder / targetPlunder * 100;
        if (plunder >= targetPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.", plunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
