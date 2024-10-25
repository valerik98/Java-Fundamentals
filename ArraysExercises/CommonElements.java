package ArraysExercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");


        for (String el1 : firstArray) {
            for (String el2 : secondArray) {
                if (el1.equals(el2))
                    System.out.print(el2 + " ");
            }
        }

    }
}
