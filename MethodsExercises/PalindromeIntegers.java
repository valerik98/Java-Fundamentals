package MethodsExercises;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        while (!input.equals("END")) {
            System.out.println(isPalindrome(input));
            input = scanner.nextLine();
        }
    }

    public static boolean isPalindrome(String input) {
        String number = input;
        String newNumber = "";
        for (int position = input.length() - 1; position >= 0; position--) {
            newNumber += "" + input.charAt(position);
        }
        if (input.equals(newNumber)){
            return true;
        }else {
            return false;
        }
    }
}
