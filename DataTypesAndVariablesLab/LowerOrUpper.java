package DataTypesAndVariablesLab;

import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);

        if (Character.isUpperCase(letter)) {
            //главна буква
            System.out.println("upper-case");
        } else {
            //малка буква
            System.out.println("lower-case");
        }
    }

}
