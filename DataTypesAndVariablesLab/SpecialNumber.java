package DataTypesAndVariablesLab;

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= number; i++) {
            int sum = 0;
            int currentNumber = number;
            while (currentNumber!=0){
                int lastDigit = currentNumber%10;
                sum +=lastDigit;
                currentNumber/=10;
            }
            if (sum == 5 || sum == 7 || sum == 11) {
                System.out.println(number + " -> True");
            } else {
                System.out.println(number + " -> False");
            }

        }

    }
}
