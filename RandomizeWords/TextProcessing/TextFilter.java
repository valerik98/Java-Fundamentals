package RandomizeWords.TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> bannedWords = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String text = scanner.nextLine();

        for (String bannedWord : bannedWords) {
            String replaceWord = "*".repeat(bannedWord.length());
            text = text.replace(bannedWord,replaceWord);
        }
        System.out.println(text);


    }
}
