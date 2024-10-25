package DataTypesAndVariablesLab;

import java.util.Scanner;

public class CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries = Integer.parseInt (scanner.nextLine());
        double years = 100*centuries;
        double days = 365.2422*years;
        double hours = 24*days;
        double minutes = 60*hours;
    }
}
