package RandomizeWords.TextProcessing;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> input = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());


        for (String username : input) {
            if (isValid(username)) {
                System.out.println(username);
            }
        }
    }

    private static boolean isValid(String username) {


        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char symbol : username.toCharArray()){
            if (!Character.isLetterOrDigit(symbol) && symbol != '-' && symbol  != '_'){
                return false;
            }
        }
        return true;
    }
}
