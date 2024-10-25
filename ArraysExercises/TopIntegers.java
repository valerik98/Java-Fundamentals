package ArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int position = 0; position < numbers.length-1; position++) {
            if (numbers[position]>numbers[position+1]){
                System.out.print(numbers[position] + " ");
            }

        }
        System.out.print(numbers[numbers.length-1]);
    }
}
