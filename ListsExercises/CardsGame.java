package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {

            int firstPlayerCard = firstDeck.get(0);
            int secondPlayerCard = secondDeck.get(0);

            firstDeck.remove(0);
            secondDeck.remove(0);

                if (firstPlayerCard >secondPlayerCard) {
                    firstDeck.add(firstPlayerCard);
                    firstDeck.add(secondPlayerCard);

                } else if (firstPlayerCard < secondPlayerCard) {
                    secondDeck.add(secondPlayerCard);
                    secondDeck.add(firstPlayerCard);

                }

        }
        int sum = 0;
        if (firstDeck.isEmpty()) {

            for (Integer i : secondDeck) {
                sum += i;
            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }else {
            for (Integer i : firstDeck) {
                sum += i;
            }
            System.out.printf("First player wins! Sum: %d", sum);
        }
    }
}
