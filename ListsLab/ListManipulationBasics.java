package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandName = commandParts[0];
            switch (commandName) {


                case ("Add"):

                    int numberToAdd = Integer.parseInt(commandParts[1]);
                    numbers.add(numberToAdd);
                    break;

                case ("Remove"):

                    int numberToRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(Integer.valueOf(numberToRemove));
                    break;

                case "RemoveAt":

                    int indexRemove = Integer.parseInt(commandParts[1]);
                    numbers.remove(indexRemove);
                    break;

                case "Insert":
                    int number = Integer.parseInt(commandParts[1]);
                    int index = Integer.parseInt(commandParts[2]);
                    numbers.add(index, number);
                    break;

            }
            command = scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

    }
}
