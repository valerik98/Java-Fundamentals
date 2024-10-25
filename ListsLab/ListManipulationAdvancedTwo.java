package ListsLab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvancedTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();

        while (!command.equals("end")) {

            command = scanner.nextLine();
            if (command.startsWith("Contains")) {
                int number = Integer.parseInt(command.split(" ")[1]);
                ifContains(numbers, number);

            } else if (command.startsWith("Print even")) {
                printEven(numbers);
            } else if (command.startsWith("Print odd")) {
                printOdd(numbers);
            } else if (command.startsWith("Get sum")) {
                getSum(numbers);
            } else if (command.startsWith("Filter")) {
                String sign = command.split(" ")[1];
                int number = Integer.parseInt(command.split(" ")[2]);
                filter(numbers, sign, number);
            }
        }
    }

    private static void filter(List<Integer> numbers, String sign, int number) {
        if (sign.equals("<")) {
            for (Integer i : numbers) {
                if (i < number) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } else if (sign.equals("<=")) {
            for (Integer i : numbers) {
                if (i <= number) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } else if (sign.equals(">")) {
            for (Integer i : numbers) {
                if (i > number) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();

        } else if (sign.equals(">=")) {
            for (Integer i : numbers) {
                if (i >= number) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }

    private static void getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer i : numbers) {
            sum += i;
        }
        System.out.println(sum);
    }

    private static void printEven(List<Integer> numbers) {
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void printOdd(List<Integer> numbers) {
        for (Integer i : numbers) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void ifContains(List<Integer> numbers, int number) {
        if (numbers.contains(number)) {
            System.out.println("Yes");
        } else {
            System.out.println("No such number");
        }
    }

}
