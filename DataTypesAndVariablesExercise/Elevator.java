package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countPeople = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        double courses = Math.ceil(countPeople*1.0 / capacityOfElevator);
        System.out.printf("%.0f",courses);
    }
}
