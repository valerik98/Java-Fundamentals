package MethodsExercises;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol = scanner.nextLine().charAt(0);
        char secondSymbol = scanner.nextLine().charAt(0);
        getCharactersInRange(firstSymbol, secondSymbol);

    }

    public static void getCharactersInRange(char firstSymbol, char secondSymbol) {
        if (firstSymbol < secondSymbol) {


            for (int i = firstSymbol+1; i < secondSymbol; i++) {
                char currentSymbol = (char) i;
                System.out.print(currentSymbol + " ");
            }

        }else {
            for (int i = secondSymbol+1; i < firstSymbol; i++) {
                char currentSymbol = (char) i;
                System.out.print(currentSymbol + " ");
            }
        }
    }
}
