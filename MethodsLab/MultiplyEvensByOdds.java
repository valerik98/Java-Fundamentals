package MethodsLab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int result = getResult(number);
        System.out.println(result);
    }

    public static int getResult(int number) {
        int currentNumber = Math.abs(number);
        int evenSum = 0;
        int oddSum = 0;
        while (currentNumber > 0) {
            int lastDiggit = currentNumber % 10;
            if (lastDiggit % 2 == 0) {
                evenSum += lastDiggit;
            } else {
                oddSum += lastDiggit;
            }
            currentNumber/=10;
        }
        int result = evenSum * oddSum;
        return result;
    }

}
