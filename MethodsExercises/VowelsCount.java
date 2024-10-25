package MethodsExercises;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        getVowelsCount(text);
    }

    public static void getVowelsCount(String text) {
        text = text.toLowerCase();
        int countVowels = 0;
        for (int position = 0; position < text.length(); position++) {
            String currentLetter = "" + text.charAt(position);
            if (currentLetter.equals("a")||currentLetter.equals("e")||currentLetter.equals("o")||currentLetter.equals("u")||currentLetter.equals("i")){
                countVowels++;
            }

        }
        System.out.println(countVowels);

    }
}
