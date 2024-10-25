package MidExamPreparation;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        double sum = 0;
        int count = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        double averageNumber = sum / numbers.size();
        List<Integer> newNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number > averageNumber) {
                newNumbers.add(number);
                count++;
            }
        }
        Collections.sort(newNumbers);
        Collections.reverse(newNumbers);
        if (count < 5) {
            for (int i = 0; i < count; i++) {
                System.out.print(newNumbers.get(i) + " ");
            }
        } else {
            for (int i = 0; i <= 4; i++) {
                System.out.print(newNumbers.get(i) + " ");
            }
        }
        if (newNumbers.isEmpty()){
            System.out.println("No");
        }

    }
}
