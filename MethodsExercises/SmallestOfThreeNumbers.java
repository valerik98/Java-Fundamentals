package MethodsExercises;

import java.util.Scanner;

public class SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int a = Integer.parseInt (scanner.nextLine());
        int b = Integer.parseInt (scanner.nextLine());
        int c = Integer.parseInt (scanner.nextLine());

        getSmallestNumber(a,b,c);
    }
    public static void getSmallestNumber(int a, int b, int c){
        System.out.println(Math.min(Math.min(a,b),c));
    }
}
