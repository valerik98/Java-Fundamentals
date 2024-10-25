package MethodsExercises;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String input = scanner.nextLine();
getMiddleCharacter(input);
    }
    public static void getMiddleCharacter(String input){
        int middleCharacter = input.length()/2;
        if (input.length()%2==0){
            System.out.print(input.charAt(middleCharacter-1));
            System.out.print(input.charAt(middleCharacter));
        }else {
            System.out.print(input.charAt(middleCharacter));
        }
    }
}
