package DataTypesAndVariablesLab;

import java.util.Scanner;

public class RealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int n = Integer.parseInt (scanner.nextLine());
        double sum = 0;
        for (int i = 1; i <=n ; i++) {
            double number = Double.parseDouble (scanner.nextLine());
            sum+=number;
        }
        System.out.println(sum);
    }
}
