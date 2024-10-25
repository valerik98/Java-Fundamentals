package ArraysLab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine());
        int[] numbers = new int[n];
        for (int position = 0; position <=n-1 ; position++) {
            int currentNumber = Integer.parseInt (scanner.nextLine());
            numbers[position]=currentNumber;
        }
        for (int position = n-1; position >=0 ; position--) {
            System.out.print(numbers[position] + " ");
        }
    }
}
