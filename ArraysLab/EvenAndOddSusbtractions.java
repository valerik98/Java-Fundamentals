package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSusbtractions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        int oddSum = 0;

        for (int position = 0; position <= numbers.length - 1; position++) {

            if (numbers[position] % 2 == 0) {
                evenSum += numbers[position];
            } else {
                oddSum += numbers[position];
            }
        }
        System.out.printf("%d",evenSum-oddSum);
    }
}
