package MethodsExercises;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());
        int sum = getSum(firstNumber, secondNumber);
        getDiff(sum, thirdNumber);
    }

    public static int getSum(int a, int b) {
        return a+b;
    }

    public static void getDiff(int a, int b) {
        System.out.println(a-b);
    }
}
