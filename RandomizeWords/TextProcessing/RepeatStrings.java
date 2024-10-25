package RandomizeWords.TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        for (String s : input) {
            int n = s.length();
            for (int i = 1; i <= n ; i++) {
                System.out.print(s);
            }
        }

    }
}
