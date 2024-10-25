package DataTypesAndVariablesLab;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt (scanner.nextLine());
        double kilometers = number*1.36;
        System.out.printf("%.2f",kilometers);
    }
}
