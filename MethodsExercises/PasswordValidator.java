package MethodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        boolean isLengthValid = isLengthValid(password);
        if (!isLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isContentValid = isContentValid(password);
        if (!isContentValid) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean hasAtleastTwoDigits = hasAtleastTwoDigits(password);
        if (!hasAtleastTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isLengthValid && isContentValid && hasAtleastTwoDigits) {
            System.out.println("Password is valid");
        }
    }

    public static boolean isLengthValid(String password) {
        return password.length() >= 6 && password.length() <= 10;
    }

    public static boolean isContentValid(String password) {
        boolean containsDigitOrDigit = false;

        for (int position = 0; position < password.length(); position++) {
            char currentSymbol = password.charAt(position);
            if (Character.isLetterOrDigit(currentSymbol)) {
                containsDigitOrDigit = true;
            } else {
                return false;
            }
        }
        if (containsDigitOrDigit) {
            return true;
        }else return false;
    }

    public static boolean hasAtleastTwoDigits(String password) {
        int countDigits = 0;
        for (int position = 0; position < password.length(); position++) {
            char currentSymbol = password.charAt(position);

            if (Character.isDigit(currentSymbol)) {
                countDigits++;
            }
        }
        if (countDigits >= 2) {
            return true;
        } else {
            return false;
        }
    }
}
