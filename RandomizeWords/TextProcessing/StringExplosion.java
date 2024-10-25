package RandomizeWords.TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder textBuilder = new StringBuilder(scanner.nextLine());

        //abv>1>1>2>2asdasd
        int totalStrength = 0;

        for (int position = 0; position < textBuilder.length(); position++) {

            char currentSymbol = textBuilder.charAt(position);

            if (currentSymbol == '>') {

                int powerOfExplosion = Integer.parseInt(textBuilder.charAt(position + 1) + "");
                totalStrength += powerOfExplosion;
            } else if (totalStrength > 0) {
                textBuilder.deleteCharAt(position);
                totalStrength--;
                position--;
            }

        }
        System.out.println(textBuilder);

    }
}
