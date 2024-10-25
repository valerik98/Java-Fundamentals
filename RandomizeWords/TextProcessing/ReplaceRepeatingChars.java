package RandomizeWords.TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder(scanner.nextLine());

        // aaaaabbbbbcdddeeeedssaa

        for (int position = 0; position < input.length()-1; position++) {

            char currentSymbol = input.charAt(position);
            char nextSymbol = input.charAt(position + 1);

            if (currentSymbol == nextSymbol) {
                input.deleteCharAt(position + 1);
                position--;
            }
        }
        System.out.println(input);
    }
}
