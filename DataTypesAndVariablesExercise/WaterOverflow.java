package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int lines = Integer.parseInt (scanner.nextLine());
        int waterTank = 0;

        for (int i = 1; i <=lines ; i++) {
            int litersOfWater = Integer.parseInt (scanner.nextLine());
            waterTank+=litersOfWater;
            if (waterTank>255){
                System.out.println("Insufficient capacity!");
                waterTank-=litersOfWater;
            }

        }
        System.out.println(waterTank);
    }
}
