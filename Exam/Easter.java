package Exam;

import java.util.Scanner;

public class Easter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String inputCommand = scanner.nextLine();

        while (!inputCommand.equals("Easter")) {
            String[] parts = inputCommand.split(" ");
            String command = parts[0];

            if (command.equals("Replace")) {
                char currentChar = parts[1].charAt(0);
                char newChar = parts[2].charAt(0);
                inputString = inputString.replace(currentChar, newChar);
                System.out.println(inputString);

            } else if (command.equals("Remove")) {
                String inputSubstring = parts[1];
                inputString = inputString.replace(inputSubstring, "");
                System.out.println(inputString);
            } else if (command.equals("Includes")) {
                String stringche = parts[1];
                if (inputString.contains(stringche)) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }
            } else if (command.equals("Change")) {
                String upperOrLower = parts[1];
                if (upperOrLower.equals("Lower")) {
                    inputString = inputString.toLowerCase();
                } else if (upperOrLower.equals("Upper")) {
                    inputString = inputString.toUpperCase();
                }
                System.out.println(inputString);
            } else if (command.equals("Reverse")) {
                int startIndex = Integer.parseInt(parts[1]);
                int endIndex = Integer.parseInt(parts[2]);
                if (startIndex >= 0 && endIndex < inputString.length() && startIndex <= endIndex) {
                    String substringToReverse = inputString.substring(startIndex,endIndex+1);
                    String reversedSubstring = new StringBuilder(substringToReverse).reverse().toString();
                    System.out.println(reversedSubstring);
                }
            }
            inputCommand = scanner.nextLine();
        }
    }
}
