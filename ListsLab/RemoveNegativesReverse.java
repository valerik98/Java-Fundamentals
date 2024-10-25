package ListsLab;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNegativesReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                                                 .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> reverseNumbers = new ArrayList<>();
        for (Integer i : numbers) {
            if (i<0){
                negativeNumbers.add(i);
            }
        }
        numbers.removeAll(negativeNumbers);

        if (numbers.isEmpty()){
            System.out.println("empty");
        }else {
           Collections.reverse(numbers);
            for (Integer i : numbers) {
                System.out.print(i + " ");
            }
        }

    }
}
