package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt (scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char firstChar = (char) ('a'+i);
            for (int j = 0; j < n; j++) {
                char secChar = (char) ('a'+j);
                for (int k = 0; k <n ; k++) {
                    char trdChar = (char) ('a'+k);
                    System.out.printf("%c%c%c\n",firstChar,secChar,trdChar);
                }
            }
        }
    }
}
