package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrayOfNumbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int evenSum = 0;
        for (int position = 0; position <= arrayOfNumbers.length - 1; position++) {
            if (arrayOfNumbers[position] % 2 == 0) {
                evenSum += arrayOfNumbers[position];
            }
        }
        System.out.println(evenSum);
    }
}
