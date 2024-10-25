package RandomizeWords.TextProcessing;

import java.util.Scanner;

public class ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        while (!input.equals("end")) {
            StringBuilder reverseWord = new StringBuilder();
            for (int position = input.length() - 1; position >= 0; position--) {
                reverseWord.append(input.charAt(position));

            }
            System.out.printf("%s = %s \n",input, reverseWord.toString());

            input = scanner.nextLine();
        }
    }
}
