package BasicSyntaxConditionalStatementsAndLoopsExercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine(); ///145
        int sum = 0;

        for (int i = 0; i < number.length(); i++) {
            int current = Integer.parseInt(number.charAt(i) + "");
            int factoriel = 1;
            for (int j = 1; j <= current; j++) {
                factoriel *= j;


            }
            sum += factoriel;

        }
            int currentNumber = Integer.parseInt (number);
        if (currentNumber==sum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }
}
