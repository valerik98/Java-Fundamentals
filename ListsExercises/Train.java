package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacityOfEachWagon = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("end")) {

            if (input.startsWith("Add")) {
                int passengers = Integer.parseInt(input.split(" ")[1]);
                wagons.add(passengers);

            } else {
                int passengers = Integer.parseInt(input);
                for (int i = 0; i < wagons.size(); i++) {
                    if ((wagons.get(i)+passengers) <= maxCapacityOfEachWagon) {
                        wagons.set(i,passengers+wagons.get(i));
                        break;
                    }
                }
            }
            input = scanner.nextLine();
        }
        for (Integer i : wagons) {
            System.out.print(i + " ");
        }
    }
}
