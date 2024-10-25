package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer>numbers = Arrays.stream(scanner.nextLine().split(" "))
                                                 .map(Integer::parseInt)
                                                 .collect(Collectors.toList());

        for (int position = 0; position < numbers.size()/2; position++) {
            numbers.set(position, numbers.get(position)+numbers.get(numbers.size()-1));
            numbers.remove(numbers.size()-1);
        }
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
