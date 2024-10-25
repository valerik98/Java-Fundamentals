package RandomizeWords.TextProcessing;

import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int totalSum = 0;

        String firstWord = input.split(" ")[0];
        String secondWord = input.split(" ")[1];

        int minLength = Math.min(firstWord.length(), secondWord.length());
        int maxLength = Math.max(firstWord.length(), secondWord.length());

        for (int position = 0; position < minLength; position++) {
            totalSum += (firstWord.charAt(position) * secondWord.charAt(position));
        }
        if (maxLength == minLength) {
            System.out.println(totalSum);
            return;
        } else {
            totalSum += getRemainingSymbolSum(firstWord, secondWord, minLength, maxLength);
        }
        System.out.println(totalSum);
    }

    private static int getRemainingSymbolSum(String firstWord, String secondWord, int minLength, int maxLength) {
        int remainingSum = 0;

        if (maxLength == firstWord.length()) {
            for (int index = minLength; index < firstWord.length(); index++) {
                remainingSum += firstWord.charAt(index);
            }
        } else {
            for (int index = minLength; index < secondWord.length(); index++) {
                remainingSum += secondWord.charAt(index);
            }
        }

        return remainingSum;
    }
}

