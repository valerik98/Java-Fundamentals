package MethodsExercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = Integer.parseInt (scanner.nextLine());
getMatrix(number);
    }
    public static void getMatrix (int number){
        for (int column = 1; column <=number; column++) {
            for (int row = 1; row <=number; row++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
