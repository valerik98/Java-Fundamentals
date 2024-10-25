package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();//12345
        int sum = 0;

        for (int position = 0; position < number.length() ; position++) {
            int currentNumber = Integer.parseInt (number.charAt(position)+"");
            sum += currentNumber;
        }
        System.out.println(sum);

    }
}
