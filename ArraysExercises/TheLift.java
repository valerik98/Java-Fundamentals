package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] countPeopleInWagon = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean isLiftFull = true;
        for (int position = 0; position < countPeopleInWagon.length; position++) {
            int availableSpace = 4 - countPeopleInWagon[position];

            if (availableSpace > 0) {
                if (availableSpace > waitingPeople) {
                    countPeopleInWagon[position] += waitingPeople;
                    waitingPeople = 0;
                    isLiftFull = false;
                } else {
                    countPeopleInWagon[position] = 4;
                    waitingPeople -= availableSpace;
                }
            }
        }
        if (!isLiftFull){
            System.out.println("The lift has empty spots!");
        }else if (waitingPeople>0){
            System.out.printf("There isn't enough space! %d people in a queue!\n", waitingPeople);
        }
        for (int i : countPeopleInWagon) {
            System.out.print(i + " ");
        }
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
