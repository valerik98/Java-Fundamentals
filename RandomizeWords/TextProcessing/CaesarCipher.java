package RandomizeWords.TextProcessing;

import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for (int position = 0; position < input.length(); position++) {
            char currentSymbol = input.charAt(position);
            result.append((char) (currentSymbol+3));
        }
        System.out.println(result);
    }
}
