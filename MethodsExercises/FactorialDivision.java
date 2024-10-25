package MethodsExercises;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int firstNumber = Integer.parseInt (scanner.nextLine());
        int secondNumber = Integer.parseInt (scanner.nextLine());
        double result = factoriel(firstNumber)*1.0/factoriel(secondNumber);
        System.out.printf("%.2f",result);
    }
    public static long factoriel (int number){
        long factoriel = 1;
        for (int i = 2; i <=number ; i++) {
            factoriel*=i;
        }
        return factoriel;
    }
}
