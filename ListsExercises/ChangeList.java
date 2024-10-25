package ListsExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            if (command.startsWith("Delete")){
                int element = Integer.parseInt(command.split(" ")[1]);
                List<Integer> elementsToRemove = new ArrayList<>();
                elementsToRemove.add(element);
                numbers.removeAll(elementsToRemove);
            } else if (command.startsWith("Insert")) {
                int element = Integer.parseInt(command.split(" ")[1]);
                int position = Integer.parseInt(command.split(" ")[2]);
                numbers.add(position,element);
            }

            command= scanner.nextLine();
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
