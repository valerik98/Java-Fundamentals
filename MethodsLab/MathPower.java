package MethodsLab;

import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt (scanner.nextLine());
        int power = Integer.parseInt (scanner.nextLine());

        System.out.println(powerOfNumber(number,power));
    }
    public static int powerOfNumber(int a, int b){
        int number = 1;
        for (int i = 1; i <=b ; i++) {
            number*=a;
        }
        return number;
    }
}
