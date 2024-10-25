package ListsExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        String[] data = scanner.nextLine().split("\\s+");
        String bombNumber = data[0];
        int power = Integer.parseInt(data[1]);

        while (elements.contains(bombNumber)) {
            int indexOfBombNumber = elements.indexOf(bombNumber);
            int start = indexOfBombNumber - power;
            if (start < 0) {
                start = 0;
            }
            int end = indexOfBombNumber + power;
            if (end > elements.size() - 1) {
                end = elements.size() - 1;
            }
            for (int i = end; i >= start ; i--) {
                elements.remove(i);
            }
        }
        int sum = 0;
        for (String element : elements) {
           int currentElement = Integer.parseInt(element);
           sum += currentElement;
        }
        System.out.println(sum);
    }
}
