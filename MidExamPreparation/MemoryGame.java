package MidExamPreparation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String input = scanner.nextLine();
        int countMoves = 0;

        while (!input.equals("end")) {

            int firstIndex = Integer.parseInt(input.split(" ")[0]);
            int secondIndex = Integer.parseInt(input.split(" ")[1]);
            countMoves++;

            boolean isValid = isValid(firstIndex, secondIndex, elements.size() - 1);
            if (!isValid) {
                String newElement = String.format("-%da", countMoves);
                elements.add((elements.size()) / 2, newElement);
                elements.add((elements.size()) / 2, newElement);
                System.out.println("Invalid input! Adding additional elements to the board");
            } else {
                String firstElement = elements.get(firstIndex);
                String secondElement = elements.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    elements.remove(firstElement);
                    elements.remove(secondElement);
                    System.out.printf("Congrats! You have found matching elements - %s!\n", firstElement);


                } else {
                    System.out.println("Try again!");
                }
            }
            if (elements.isEmpty()) {
                System.out.printf("You have won in %d turns!", countMoves);
                return;
            }
            input = scanner.nextLine();
        }
        System.out.println("Sorry you lose :(");
        System.out.println(String.join(" ", elements));
    }

    public static boolean isValid(int firstIndex, int secondIndex, int lastIndex) {

        boolean indexesAreNotTheSame = firstIndex != secondIndex;
        boolean firstIndexInBounds = firstIndex >= 0 && firstIndex <= lastIndex;
        boolean secondIndexInBounds = secondIndex >= 0 && secondIndex <= lastIndex;

        return indexesAreNotTheSame && firstIndexInBounds && secondIndexInBounds;
    }
}
