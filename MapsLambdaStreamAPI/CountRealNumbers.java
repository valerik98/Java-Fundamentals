package MapsLambdaStreamAPI;

import java.util.*;
import java.util.stream.Collectors;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        Map<Integer, Integer> numbersMap = new TreeMap<>();

        for (Integer number : numbers) {

            if (!numbersMap.containsKey(number)) {
                numbersMap.put(number, 0);
            }

                numbersMap.put(number, numbersMap.get(number) + 1);

        }
        for (Map.Entry<Integer, Integer> entry : numbersMap.entrySet()) {
            System.out.printf("%d -> %d%n",entry.getKey(),entry.getValue());
        }
    }
}
