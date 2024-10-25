package MethodsExercises;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt (scanner.nextLine());
        for (int i = 1; i <=n; i++) {
            boolean containsOddDigit = isHoldsOneOddDigit(i);
            boolean isSumOfDigitsIsDivisibleByEight = isSumOfDigitsIsDivisibleByEight(i);
            if (containsOddDigit && isSumOfDigitsIsDivisibleByEight){
                System.out.println(i);
            }
        }
    }
    public static boolean isSumOfDigitsIsDivisibleByEight (int n){
        int sumOfDigits = 0;
        while(n>0){
            int lastDigit = n%10;
            sumOfDigits +=lastDigit;
            n = n/10;
        }
        return sumOfDigits % 8 == 0;
    }
    public static  boolean isHoldsOneOddDigit (int n){
        while (n>0){
            int lastDigit = n%10;
            if (lastDigit%2!=0){
                return true;
            }
            n = n/10;
        }
        return false;

    }
}
