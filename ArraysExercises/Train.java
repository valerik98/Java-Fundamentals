package ArraysExercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int countWagons = Integer.parseInt (scanner.nextLine());
        int[] wagon = new int[countWagons];
        int sum = 0;
        for (int i = 0; i <=countWagons-1; i++) {
            int countPeople = Integer.parseInt (scanner.nextLine());
            wagon[i]=countPeople;

        }
        for (int i : wagon) {
            sum+=i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
